package com.example.multipalrecyclerviewitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.multipalrecyclerviewitem.adapter.ChatAdapter;
import com.example.multipalrecyclerviewitem.model.HeadingModel;
import com.example.multipalrecyclerviewitem.model.ParentModel;
import com.example.multipalrecyclerviewitem.model.ReceiverChatModel;
import com.example.multipalrecyclerviewitem.model.SenderChatModel;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Bagwan Akib on 11/24/2019.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvChat;
    ChatAdapter adapter;
    ArrayList<ParentModel> itemArray;
    ImageView ivSender, ivReceiver;
    EditText etMessage;
    Button btnHeading;
    ArrayList<String> AM_PM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        demoData();
    }

    private void demoData() {
        itemArray = new ArrayList<>();
        itemArray.add(new ParentModel(new HeadingModel("Today")));
        itemArray.add(new ParentModel(new SenderChatModel("hi", "10:20 AM")));
        itemArray.add(new ParentModel(new ReceiverChatModel("hi", "10:20 AM")));
        adapter = new ChatAdapter(itemArray, this);
        rvChat.setAdapter(adapter);
    }

    private void init() {
        getSupportActionBar().hide();
        rvChat = findViewById(R.id.rv_chat);
        rvChat.setLayoutManager(new LinearLayoutManager(this));
        ivReceiver = findViewById(R.id.iv_receiver);
        ivReceiver.setOnClickListener(this);
        ivSender = findViewById(R.id.iv_sender);
        ivSender.setOnClickListener(this);
        btnHeading = findViewById(R.id.btn_heading);
        btnHeading.setOnClickListener(this);
        etMessage = findViewById(R.id.et_message);

        AM_PM = new ArrayList<>();
        AM_PM.add("AM");
        AM_PM.add("PM");
    }

    @Override
    public void onClick(View v) {
        Calendar calendar = Calendar.getInstance();
        String time = calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + " " + AM_PM.get(calendar.get(Calendar.AM_PM));
        if (etMessage.getText().toString().length() == 0)
            Toast.makeText(this, "Please enter some text.", Toast.LENGTH_LONG).show();
        else {
            switch (v.getId()) {
                case R.id.btn_heading:
                    itemArray.add(new ParentModel(new HeadingModel(etMessage.getText().toString())));
                    break;

                case R.id.iv_receiver:
                    itemArray.add(new ParentModel(new ReceiverChatModel(etMessage.getText().toString(), time)));
                    break;

                case R.id.iv_sender:
                    itemArray.add(new ParentModel(new SenderChatModel(etMessage.getText().toString(), time)));
                    break;
            }
            adapter.notifyItemChanged(itemArray.size() - 1);
            rvChat.scrollToPosition(itemArray.size() - 1);
            etMessage.setText("");
        }
    }
}
