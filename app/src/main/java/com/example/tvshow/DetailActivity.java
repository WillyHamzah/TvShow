package com.example.tvshow;

import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.Glide;
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

        TvResponse.ResultsTvShow resultsTvShow = getIntent().getParcelableExtra("tv_intent");
        activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        displayDetail(resultsTvShow);
        initRecyclerView();
        displayTrailers(resultsTvShow.getId());


    }

    void displayDetail(TvResponse.ResultsTvShow resultsTvShow) {
        activityDetailBinding.detailTop.sectionTitle.tvTitle.setText(resultsTvShow.getName());
//        activityDetailBinding.detailTop.sectionTitle.tvOriginCountry.setText(resultsTvShow.getOriginCountry());

        activityDetailBinding.detailBottom.synopsis.setText(resultsTvShow.getOverview());
//        activityDetailBinding.detailBottom.reviewText.setText(resultsTvShow.get());


        Glide.with(this)
                .load(Constants.POSTER_BASE_URL + resultsTvShow.getPosterPath())
                .into(activityDetailBinding.detailTop.posterImage);

        Glide.with(this)
                .load(Constants.BACKDROP_BASE_URL + resultsTvShow.getBackdropPath())
                .into(activityDetailBinding.detailTop.backropImage);
    }


    void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(DetailActivity.this, LinearLayoutManager.HORIZONTAL, false);
        activityDetailBinding.detailBottom.rvTrailers.setLayoutManager(layoutManager);
    }

    void displayTrailers(int i) {
        TvService.getAPI().trailerAiringTodayCall(i, "119377682a1e98f078b0484aa494acb1").enqueue(new Callback<TrailerResponse>() {
            @Override
            public void onResponse(Call<TrailerResponse> call, Response<TrailerResponse> response) {
                if (response.isSuccessful()) {
                    List<TrailerResponse.ResultsTvTrailer> trailers = response.body().getResults();
                    TrailerAdapter adapter = new TrailerAdapter(trailers);
                    activityDetailBinding.detailBottom.rvTrailers.setAdapter(adapter);

                }
            }


            @Override
            public void onFailure(Call<TrailerResponse> call, Throwable t) {
                Toast.makeText(DetailActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();


            }
        });
    }

}
