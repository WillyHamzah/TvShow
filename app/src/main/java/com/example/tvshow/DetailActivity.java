package com.example.tvshow;

import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.tvshow.data.adapter.ReviewAdapter;
import com.example.tvshow.data.model.ReviewResponse;
import com.example.tvshow.data.remote.Constants;
import com.example.tvshow.data.adapter.TrailerAdapter;
import com.example.tvshow.data.model.TrailerResponse;
import com.example.tvshow.data.model.TvResponse;
import com.example.tvshow.data.remote.TvService;
import com.example.tvshow.databinding.ActivityDetailBinding;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding activityDetailBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TvResponse.ResultsTvOnTheAir resultsTvShow = getIntent().getParcelableExtra("tv_intent");
        activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        ReviewResponse.ResultsTvOnTheAir resultsTvOnTheAir = getIntent().getParcelableExtra("review_intent");
        activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        initRecyclerViewReview();
        initRecyclerView();
        displayDetail(resultsTvShow);
        displayTrailers(resultsTvShow.getId());
        displayReview(resultsTvOnTheAir.getId());

    }


    void displayDetail(TvResponse.ResultsTvOnTheAir resultsTvShow) {
        activityDetailBinding.detailTop.sectionTitle.tvTitle.setText(resultsTvShow.getName());
        activityDetailBinding.detailBottom.synopsis.setText(resultsTvShow.getOverview());


        Glide.with(this)
                .load(Constants.POSTER_BASE_URL + resultsTvShow.getPosterPath())
                .into(activityDetailBinding.detailTop.posterImage);

        Glide.with(this)
                .load(Constants.BACKDROP_BASE_URL + resultsTvShow.getBackdropPath())
                .into(activityDetailBinding.detailTop.backropImage);
    }


    void initRecyclerViewReview() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(DetailActivity.this, LinearLayoutManager.HORIZONTAL, false);
        activityDetailBinding.detailBottom.rvReview.setLayoutManager(layoutManager);
    }

    void displayReview(int i) {
        TvService.getAPI().reviewAiringTodayCall(i, "119377682a1e98f078b0484aa494acb1").enqueue(new Callback<ReviewResponse>() {
            @Override
            public void onResponse(Call<ReviewResponse> call, Response<ReviewResponse> response) {
                if (response.isSuccessful()) {
                    List<ReviewResponse.ResultsTvOnTheAir> resultsTvOnTheAirs = response.body().getResults();
                    ReviewAdapter adapter = new ReviewAdapter(resultsTvOnTheAirs);
                    activityDetailBinding.detailBottom.rvReview.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ReviewResponse> call, Throwable t) {

            }
        });
    }

    void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(DetailActivity.this, LinearLayoutManager.HORIZONTAL, false);
        activityDetailBinding.detailBottom.rvTrailers.setLayoutManager(layoutManager);
    }

    void displayTrailers(int i) {
        TvService.getAPI().trailerOnTheAir(i, "119377682a1e98f078b0484aa494acb1").enqueue(new Callback<TrailerResponse>() {
            @Override
            public void onResponse(Call<TrailerResponse> call, Response<TrailerResponse> response) {
                if (response.isSuccessful()) {
                    List<TrailerResponse.ResultsTvOnTheAir> trailers = response.body().getResults();
                    TrailerAdapter adapter = new TrailerAdapter(trailers);
                    activityDetailBinding.detailBottom.rvTrailers.setAdapter(adapter);

                }
            }


            @Override
            public void onFailure(Call<TrailerResponse> call, Throwable t) {


            }
        });
    }

}
