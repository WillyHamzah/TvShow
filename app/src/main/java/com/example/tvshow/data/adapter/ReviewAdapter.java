package com.example.tvshow.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tvshow.R;
import com.example.tvshow.data.model.ReviewResponse;
import com.example.tvshow.databinding.ReviewTvItemBinding;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private List<ReviewResponse.ResultsTvOnTheAir> resultsTvOnTheAirs;
    private Context context;

    public ReviewAdapter(List<ReviewResponse.ResultsTvOnTheAir> review){
        this.resultsTvOnTheAirs = review ;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.review_tv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ReviewResponse.ResultsTvOnTheAir review = resultsTvOnTheAirs.get(position);

    }

    @Override
    public int getItemCount() {
        return resultsTvOnTheAirs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ReviewTvItemBinding reviewTvItemBinding;
        public ViewHolder(View itemView) {
            super(itemView);
            reviewTvItemBinding = DataBindingUtil.bind(itemView);

        }
    }
}
