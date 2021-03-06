package io.github.luizgrp.sectionedrecyclerviewadapter.demo.example8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import io.github.luizgrp.sectionedrecyclerviewadapter.demo.R;

class ItemViewHolder extends RecyclerView.ViewHolder {

    final View rootView;
    final ImageView imgItem;
    final TextView tvItem;
    final TextView tvSubItem;

    ItemViewHolder(@NonNull final View view) {
        super(view);

        rootView = view;
        imgItem = view.findViewById(R.id.imgItem);
        tvItem = view.findViewById(R.id.tvItem);
        tvSubItem = view.findViewById(R.id.tvSubItem);
    }
}
