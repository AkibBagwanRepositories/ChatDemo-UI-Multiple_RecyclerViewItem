package com.example.multipalrecyclerviewitem.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.multipalrecyclerviewitem.R;
import com.example.multipalrecyclerviewitem.model.ParentModel;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class ReceiverChatBoxItem extends BaseViewHolder {
    private View itemView;

    public ReceiverChatBoxItem(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
    }

    @Override
    public void setData(ParentModel model) {
        TextView tvMessage = itemView.findViewById(R.id.tv_text);
        tvMessage.setText(model.getReceiverChatModel().getText());

        TextView tvTime = itemView.findViewById(R.id.tv_time);
        tvTime.setText(model.getReceiverChatModel().getTime());
    }
}
