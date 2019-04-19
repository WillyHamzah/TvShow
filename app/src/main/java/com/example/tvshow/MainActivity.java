package com.example.tvshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.tvshow.data.adapter.TvAdapter;
import com.example.tvshow.data.model.TvAiringToday;
import com.example.tvshow.data.remote.TvService;
import com.example.tvshow.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private TvAdapter adapter;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        progressBar = findViewById(R.id.prograss);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        activityMainBinding.rvTv.setLayoutManager(gridLayoutManager);

        TvService.getAPI().tvAiringTodayCall("119377682a1e98f078b0484aa494acb1").enqueue(new Callback<TvAiringToday>() {
            @Override
            public void onResponse(Call<TvAiringToday> call, Response<TvAiringToday> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful()){
                    List<TvAiringToday.ResultsTvshow> resultsTvshows = response.body().getResults();
                    adapter = new TvAdapter(resultsTvshows, MainActivity.this);
                    activityMainBinding.rvTv.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<TvAiringToday> call, Throwable t) {
                progressBar.setVisibility(View.GONE);

            }
        });
    }
}
