package com.example.multipalrecyclerviewitem.model;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class SenderChatModel extends ParentModel {
    public String text;
    public String time;

    public SenderChatModel(String text, String time) {
        super();
        this.text = text;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
