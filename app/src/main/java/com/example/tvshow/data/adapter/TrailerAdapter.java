package com.example.tvshow.data.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.tvshow.R;
import com.example.tvshow.data.model.TrailerResponse;
import com.example.tvshow.databinding.TrailerListItemBinding;

import java.util.List;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class TrailerAdapter extends RecyclerView.Adapter<TrailerAdapter.ViewHolder> {

    private List<TrailerResponse.ResultsTvTrailer> resultsTvTrailerList;
    private Context context;

    public TrailerAdapter(List<TrailerResponse.ResultsTvTrailer> trailers) {
        this.resultsTvTrailerList = trailers;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.trailer_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TrailerAdapter.ViewHolder holder, int position) {
        final TrailerResponse.ResultsTvTrailer trailer = resultsTvTrailerList.get(position);

        Glide.with(context)
                .load("https://i1.ytimg.com/vi/" + trailer.getKey() + "/0.jpg")
                .into(holder.viewDataBinding.trailerThumbnail);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http:/www.youtube.com/wactch?v=" + trailer.getKey()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsTvTrailerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TrailerListItemBinding viewDataBinding;
        public ViewHolder(View itemView) {
            super(itemView);
            viewDataBinding = DataBindingUtil.bind(itemView);
        }
    }
}
