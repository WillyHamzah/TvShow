package com.example.tvshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tvshow.data.adapter.TvAdapter;
import com.example.tvshow.data.model.TvResponse;
import com.example.tvshow.data.remote.TvService;
import com.example.tvshow.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private TvAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.prograss.setVisibility(View.VISIBLE);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        activityMainBinding.rvTv.setLayoutManager(gridLayoutManager);

        TvService.getAPI().tvAiringTodayCall("119377682a1e98f078b0484aa494acb1").enqueue(new Callback<TvResponse>() {
            @Override
            public void onResponse(Call<TvResponse> call, Response<TvResponse> response) {
                Log.d("response", response.body().toString());

                if (response.isSuccessful()){
                    activityMainBinding.prograss.setVisibility(View.INVISIBLE);
                    List<TvResponse.ResultsTvShow> resultsTvshows = response.body().getResults();
                    adapter = new TvAdapter(resultsTvshows, MainActivity.this);
                    activityMainBinding.rvTv.setAdapter(adapter);


//                        for (TvResponse.ResultsTvShow resultsTvshow: resultsTvshows ){
//                            resultsTvshow.getName();
//                            Log.d("Judul tv",  resultsTvshow.getName());
//                    }
                }
            }

            @Override
            public void onFailure(Call<TvResponse> call, Throwable t) {
//                Log.d("failure", t.getLocalizedMessage());
            }
        });
    }
}
