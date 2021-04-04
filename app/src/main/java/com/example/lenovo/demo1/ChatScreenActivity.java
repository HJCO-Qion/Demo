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

        initMsgs();//��ʼ����Ϣ����

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
                    msgList.add(msg);//������Ϣ�������С�
                    adapter.notifyItemInserted(msgList.size() - 1);//��������Ϣʱ��ˢ��RecyclerView�е���ʾ�����ʾ��Ǵ�λ�úͺ�������Ϣֱ�������ƶ���ˢ�´�λ�á�
//                    adapter.notifyItemRangeChanged(msgList.size() - 1, 1);//ֻˢ�����һ����Ϣ���������һ�д������������á�
//                    adapter.notifyItemRangeChanged(0, msgList.size());//ˢ��������Ϣ�����Ҳ����ָ��λ��ˢ��
                    msgRecyclerView.scrollToPosition(msgList.size() - 1);//��RecyclerView��λ�����һ�С�������������ʾ���һ����Ϣ��λ�á�
                    inputText.setText("");//���������е�����
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
