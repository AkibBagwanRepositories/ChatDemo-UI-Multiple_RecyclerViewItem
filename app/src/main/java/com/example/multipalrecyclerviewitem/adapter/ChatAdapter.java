package com.example.multipalrecyclerviewitem.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipalrecyclerviewitem.R;
import com.example.multipalrecyclerviewitem.model.ParentModel;
import com.example.multipalrecyclerviewitem.utils.Const;
import com.example.multipalrecyclerviewitem.viewholder.BaseViewHolder;
import com.example.multipalrecyclerviewitem.viewholder.HeadingBoxItem;
import com.example.multipalrecyclerviewitem.viewholder.ReceiverChatBoxItem;
import com.example.multipalrecyclerviewitem.viewholder.SenderChatBoxItem;

import java.util.ArrayList;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class ChatAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    ArrayList<ParentModel> chatList;
    Context context;

    public ChatAdapter(ArrayList<ParentModel> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Const.HEADING_CHAT_MESSAGE:
                view = LayoutInflater.from(context).inflate(R.layout.heading_item, parent, false);
                return new HeadingBoxItem(view);

            case Const.RECEIVER_CHAT_MESSAGE:
                view = LayoutInflater.from(context).inflate(R.layout.reciver_chat_item, parent, false);
                return new ReceiverChatBoxItem(view);

            case Const.SENDER_CHAT_MESSAGE:
                view = LayoutInflater.from(context).inflate(R.layout.sender_chat_item, parent, false);
                return new SenderChatBoxItem(view);
            default:
                throw new RuntimeException("No View Attached.");
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.setData(chatList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return chatList.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }
}
