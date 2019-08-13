package com.example.meatit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> mData;


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textItem = itemView.findViewById(R.id.textView33);
        }
    }

    public MyAdapter(List<String> data) {
        mData = data;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textItem.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
