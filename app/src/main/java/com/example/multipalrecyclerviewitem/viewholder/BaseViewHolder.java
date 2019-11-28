package com.example.multipalrecyclerviewitem.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipalrecyclerviewitem.model.ParentModel;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    public abstract void setData(ParentModel model);

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
