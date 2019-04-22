package com.example.tvshow.data.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.example.tvshow.DetailActivity;
import com.example.tvshow.R;
import com.example.tvshow.data.remote.Constants;
import com.example.tvshow.data.model.TvResponse;
import com.example.tvshow.databinding.ListTvItemBinding;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

public class TvAdapter extends RecyclerView.Adapter<TvAdapter.ViewHolder> {

    private List<TvResponse.ResultsTvShow> tvAiringTodays;
    private Context context;

    public TvAdapter(List<TvResponse.ResultsTvShow> tvAiringTodays, Context context) {
        this.tvAiringTodays = tvAiringTodays;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_tv_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final TvResponse.ResultsTvShow resultsTvshow = tvAiringTodays.get(position);

        holder.viewDataBinding.tvTitle.setText(resultsTvshow.getName());

        Glide.with(context)
                .asBitmap()
                .load(Constants.POSTER_BASE_URL + resultsTvshow.getPosterPath())
                .into(new BitmapImageViewTarget(holder.viewDataBinding.imgTvPoster) {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        super.onResourceReady(resource, transition);


                    }
                });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("tv_intent", resultsTvshow );

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvAiringTodays.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ListTvItemBinding viewDataBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewDataBinding = DataBindingUtil.bind(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}