package com.example.multipalrecyclerviewitem.model;

import com.example.multipalrecyclerviewitem.utils.Const;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class ParentModel {
    private HeadingModel headingModel;
    private SenderChatModel senderChatModel;
    private ReceiverChatModel receiverChatModel;
    private int viewType;

    public ParentModel() {
    }

    public ParentModel(HeadingModel headingModel) {
        this.headingModel = headingModel;
        this.viewType = Const.HEADING_CHAT_MESSAGE;
    }

    public ParentModel(SenderChatModel senderChatModel) {
        this.senderChatModel = senderChatModel;
        this.viewType = Const.SENDER_CHAT_MESSAGE;
    }

    public ParentModel(ReceiverChatModel receiverChatModel) {
        this.receiverChatModel = receiverChatModel;
        this.viewType = Const.RECEIVER_CHAT_MESSAGE;
    }

    public HeadingModel getHeadingModel() {
        return headingModel;
    }

    public void setHeadingModel(HeadingModel headingModel) {
        this.headingModel = headingModel;
    }

    public SenderChatModel getSenderChatModel() {
        return senderChatModel;
    }

    public void setSenderChatModel(SenderChatModel senderChatModel) {
        this.senderChatModel = senderChatModel;
    }

    public ReceiverChatModel getReceiverChatModel() {
        return receiverChatModel;
    }

    public void setReceiverChatModel(ReceiverChatModel receiverChatModel) {
        this.receiverChatModel = receiverChatModel;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
