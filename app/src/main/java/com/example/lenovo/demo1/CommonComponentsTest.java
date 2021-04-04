package com.example.lenovo.demo1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class CommonComponentsTest extends Activity implements View.OnClickListener {
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private ProgressBar progressBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_components_test);

        editText = this.findViewById(R.id.editText);
        imageView = this.findViewById(R.id.imageView);
        progressBar = this.findViewById(R.id.progressBar);
        progressBar1 = this.findViewById(R.id.progressBar1);

        //匿名方式添加为按钮增加监听器。
//        Button button = this.findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //在此处添加逻辑
//            }
//        });

        //实现接口的方式为按钮增加监听器。
        Button button = this.findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button1 = this.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = this.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = this.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = this.findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = this.findViewById(R.id.button5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                //在此处添加逻辑
                String inputText = editText.getText().toString();
                Toast.makeText(CommonComponentsTest.this, inputText,
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.button1:
                imageView.setImageResource(R.drawable.message_left);
                break;
            case R.id.button2:
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
                break;
            case R.id.button3:
                int progress = progressBar1.getProgress();
                progress += 10;
                progressBar1.setProgress(progress);
                break;
            case R.id.button4:
                //3.2.6：AlertDialog对话框。
                AlertDialog.Builder dialog = new AlertDialog.Builder(CommonComponentsTest.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(CommonComponentsTest.this, "OK",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(CommonComponentsTest.this, "Cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
                break;
            case R.id.button5:
                //3.2.7：ProgressDialog对话框。
                ProgressDialog progressDialog = new ProgressDialog(CommonComponentsTest.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
