package com.example.tvshow.data.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.example.tvshow.R;
import com.example.tvshow.data.Constants;
import com.example.tvshow.data.model.TvAiringToday;
import com.example.tvshow.databinding.ListTvItemBinding;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

public class TvAdapter extends RecyclerView.Adapter<TvAdapter.ViewHolder> {

    private List<TvAiringToday.ResultsTvshow> tvAiringTodays;
    private Context context;

    public TvAdapter(List<TvAiringToday.ResultsTvshow> tvAiringTodays, Context context) {
        this.tvAiringTodays = tvAiringTodays;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tv_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final TvAiringToday.ResultsTvshow tvAiringToday = tvAiringTodays.get(position);
        holder.itemView.setOnClickListener(holder);
        holder.viewDataBinding.setTvairingtoday(tvAiringToday);


        Glide.with(context)
                .asBitmap()
                .load(Constants.POSTER_BASE_URL + tvAiringToday.getPosterPath())
                .into(new BitmapImageViewTarget(holder.viewDataBinding.imgTvPoster) {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        super.onResourceReady(resource, transition);

                        Palette.from(resource).generate(new Palette.PaletteAsyncListener() {
                            @Override
                            public void onGenerated(@Nullable Palette palette) {
                                holder.viewDataBinding.titleBackground.setBackgroundColor(
                                        palette.getDarkVibrantColor(context.getResources().getColor(android.R.color.darker_gray)));
                            }
                        });
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