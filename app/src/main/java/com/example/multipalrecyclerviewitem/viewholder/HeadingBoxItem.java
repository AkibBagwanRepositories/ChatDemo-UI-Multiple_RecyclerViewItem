package com.example.multipalrecyclerviewitem.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.multipalrecyclerviewitem.R;
import com.example.multipalrecyclerviewitem.model.ParentModel;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class HeadingBoxItem extends BaseViewHolder {

    private View itemView;

    public HeadingBoxItem(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
    }

    @Override
    public void setData(ParentModel model) {
        ((TextView) itemView.findViewById(R.id.tv_heading)).setText(model.getHeadingModel().getHeadingText());
    }
}
