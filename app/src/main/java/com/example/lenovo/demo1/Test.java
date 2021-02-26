/*package com.example.lenovo.androidtcp;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainActivity extends Activity {

    public Socket mSocket;
    public TextView tvReply;
    public EditText etRequest;

    public Handler mHander = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if(msg.what == 1) {
                tvReply.setText((String)msg.obj);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvReply = (TextView) findViewById(R.id.textView);
        etRequest = (EditText) findViewById(R.id.editText);

        Button btnSend = (Button) findViewById(R.id.button);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OutputStream outputStream = mSocket.getOutputStream();
                    byte[] sendPacket = etRequest.getText().toString().getBytes();
                    outputStream.write(sendPacket);
                }catch(IOException e) {
                    e.printStackTrace();
                }

            }
        });
        new Thread(mSocketRunnable).start();
    }
    public Runnable mSocketRunnable = new Runnable() {
        public void run() {
            try {
                mSocket = new Socket("47.106.110.142", 9999);
                InputStream inputStream = mSocket.getInputStream();
                byte[] buffer = new byte[1024];
                while(true) {
                    int readLength = inputStream.read(buffer);
                    Message msg = new Message();
                    msg.what = 1;
                    String content = new String(buffer, 0, readLength);
                    msg.obj = content;
                    mHander.sendMessage(msg);
                    if(content.equals("bye"))
                        break;

                }
                mSocket.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
}
*/
//private BufferedReader bufferedReader;//BufferedWriter 用于推送消息
//private BufferedWriter bufferedWriter;//BufferedReader 用于接收消息


//            try {
//                socket = new Socket("172.16.63.132", 9999);
//                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                tv_acceptedMsg.setText("");
//                while (true) {
//                    String content = bufferedReader.readLine();
//                    tv_acceptedMsg.setText(content);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


//                String msg = et_msg.getText().toString();
//                tv_acceptedMsg.setText(socket.isConnected() + "123");
//                try {
//                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
//                    bufferedWriter.write(msg);
//                    bufferedWriter.flush();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }