package com.example.multipalrecyclerviewitem.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.multipalrecyclerviewitem.R;
import com.example.multipalrecyclerviewitem.model.ParentModel;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class SenderChatBoxItem extends BaseViewHolder {

    private View view;
    public SenderChatBoxItem(@NonNull View itemView) {
        super(itemView);
        view = itemView;
    }

    @Override
    public void setData(ParentModel model) {
        TextView tvMessage = view.findViewById(R.id.tv_text);
        tvMessage.setText(model.getSenderChatModel().getText());
        TextView tvTime = view.findViewById(R.id.tv_time);
        tvTime.setText(model.getSenderChatModel().getTime());
    }
}
