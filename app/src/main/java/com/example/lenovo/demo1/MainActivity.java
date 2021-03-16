package com.example.lenovo.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        this.IntentActivityTest();//Intent测试
//        this.IntentAndResultActivityTest();//Intent带返回结果测试
//        this.LifeCycleActivityTest();//生命周期测试
//        this.StandardActivityTest();//测试活动的启动模式
//        this.SimpleChatActivityTest();//简单的实现手机与Linux服务器的通讯聊天
//        this.LinearLayoutActivityTest();//LinearLayout测试
//        this.RelativeLayoutActivityTest();//RelativeLayout测试
//        this.PercentLayoutActivityTest();//百分比布局测试
        this.DialogActivity();//微信气泡对话框测试



//        this.IntentAndImgResultActivityTest();//使用Intent从图库获取图片并显示，未完成。
    }

    public void DialogActivity(){
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        this.startActivity(intent);
        this.finish();
    }

    public void PercentLayoutActivityTest(){
        Intent intent = new Intent(MainActivity.this, PercentLayoutActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void RelativeLayoutActivityTest(){
        Intent intent = new Intent(MainActivity.this, RelativeLayoutActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void LinearLayoutActivityTest(){
        Intent intent = new Intent(MainActivity.this, LinearLayoutActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void SimpleChatActivityTest(){
        Intent intent = new Intent(MainActivity.this, SimpleChatActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void StandardActivityTest(){
        Intent intent = new Intent(MainActivity.this, StandardActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void LifeCycleActivityTest(){
        Intent intent = new Intent(MainActivity.this, LifeCycleActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void IntentAndImgResultActivityTest(){
        Intent intent = new Intent(MainActivity.this, IntentAndImgResultActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void IntentAndResultActivityTest(){
        Intent intent = new Intent(MainActivity.this, IntentAndResultActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void IntentActivityTest(){
        Intent intent = new Intent(MainActivity.this, IntentActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
