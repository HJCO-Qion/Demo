package com.example.lenovo.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2018/9/18.
 */
public class ChatScreenActivity extends Activity {
    private List<Msg> msgList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView msgRecyclerView;
    private MsgAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chat_screen);
//        this.setContentView(R.layout.msg_item);

        initMsgs();//初始化消息数据

        inputText = findViewById(R.id.input_text);
        send = findViewById(R.id.send);
        msgRecyclerView = findViewById(R.id.msg_recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter(msgList);
        msgRecyclerView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    Msg msg = new Msg(content, Msg.TYPE_SEND);
                    msgList.add(msg);//增加消息到集合中。
                    adapter.notifyItemInserted(msgList.size() - 1);//当有新消息时，刷新RecyclerView中的显示。本质就是此位置和后续的消息直接往下移动，刷新此位置。
//                    adapter.notifyItemRangeChanged(msgList.size() - 1, 1);//只刷新最后一个信息。与上面的一行代码有类似作用。
//                    adapter.notifyItemRangeChanged(0, msgList.size());//刷新所有信息组件，也可以指定位置刷新
                    msgRecyclerView.scrollToPosition(msgList.size() - 1);//将RecyclerView定位到最后一行。即滑动到能显示最后一条消息的位置。
                    inputText.setText("");//清空输入框中的内容
                }
            }
        });
    }
    private void initMsgs() {
        Msg msg1 = new Msg("Hello guy.", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("Hello. Who is that?", Msg.TYPE_SEND);
        msgList.add(msg2);
        Msg msg3 = new Msg("This is Tom. Nice talking to you.", Msg.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
