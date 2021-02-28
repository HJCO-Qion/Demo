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
 * 总结：
 * 一共三个线程：
 * Linux服务器：负责接收、处理、转发。
 * main：负责初始化、发送信息。
 * main子线程：负责接收信息并显示。（Linux服务器-->main子线程-->Hander-->main的TextView）
 * 整个过程涉及到的知识：网络编程、线程通信。
 *
 * Created by 陈亚东 on 2018/9/28.
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
            InputStream inputStream = null;
            try {
                socket = new Socket("39.108.190.151", 9999);

                inputStream = socket.getInputStream();
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
            }finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    private TextView tv_acceptedMsg;
    private EditText et_msg;
    private Button btn_sendMsg;

    private OutputStream outputStream;

    private Socket socket;
    private MyHander myHander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置页面布局
        setContentView(R.layout.simple_chat_activity_test);

        //初始化布局组件
        tv_acceptedMsg = (TextView) findViewById(R.id.tv_acceptedMsg);
        et_msg = (EditText) findViewById(R.id.et_msg);
        btn_sendMsg = (Button) findViewById(R.id.btn_sendMsg);

        //初始化Hander
        myHander = new MyHander();

        //启动一个线程
        new Thread(new MyRunnable()).start();

        //为发送按钮初始化监听事件
        btn_sendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    outputStream = socket.getOutputStream();
                    byte[] bytes = et_msg.getText().toString().getBytes();
                    outputStream.write(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
