package com.example.lenovo.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import android.os.Handler;

/**
 * Created by ³ÂÑÇ¶« on 2018/9/28.
 */
public class SimpleChatActivityTest extends Activity {

    class MyHander extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                tv_acceptedMsg.setText(msg.obj.toString());
            }
        }
    }
    class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
//                socket = new Socket("172.16.63.132", 9999);
//                socket = new Socket("39.108.190.151", 9999);
                socket = new Socket("47.106.110.142", 9999);

                InputStream inputStream = socket.getInputStream();
                byte[] bytes = new byte[1024];
                while (true) {
                    int readLength = inputStream.read(bytes);
                    String content = new String(bytes, 0, readLength);

                    Message message = new Message();
                    message.what = 1;
                    message.obj = content;

                    myHander.sendMessage(message);

                    if (content.equals("bye")) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private TextView tv_acceptedMsg;
    private EditText et_msg;
    private Button btn_sendMsg;

    private Socket socket;
    private MyHander myHander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.simple_chat_activity_test);

        tv_acceptedMsg = (TextView) findViewById(R.id.tv_acceptedMsg);
        et_msg = (EditText) findViewById(R.id.et_msg);
        btn_sendMsg = (Button) findViewById(R.id.btn_sendMsg);

        myHander = new MyHander();

        new Thread(new MyRunnable()).start();

        btn_sendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OutputStream outputStream = socket.getOutputStream();
                    byte[] bytes = et_msg.getText().toString().getBytes();
                    outputStream.write(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
