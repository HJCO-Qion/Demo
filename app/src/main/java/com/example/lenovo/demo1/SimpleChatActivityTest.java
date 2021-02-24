package com.example.lenovo.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by 陈亚东 on 2018/9/28.
 */
public class SimpleChatActivityTest extends Activity {
    private TextView tv_acceptedMsg;
    private EditText et_msg;
    private Button btn_sendMsg;

    private Socket socket;
    private BufferedReader bufferedReader;//BufferedWriter 用于推送消息
    private BufferedWriter bufferedWriter;//BufferedReader 用于接收消息
    private String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.simple_chat_activity_test);

        tv_acceptedMsg = (TextView) findViewById(R.id.tv_acceptedMsg);
        et_msg = (EditText) findViewById(R.id.et_msg);
        btn_sendMsg = (Button) findViewById(R.id.btn_sendMsg);

        btn_sendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = et_msg.getText().toString();
                try {
                    socket = new Socket("39.108.190.151", 9999);
                    bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

                    if (bufferedReader.ready()) {
                        String txt = "";
                        while ((content = bufferedReader.readLine()) != null) {

                        }
                    }
                    bufferedReader.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
