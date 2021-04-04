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

        //10分
//        this.IntentActivityTest();//2.3.1、2.3.2、2.3.3、2.3.4：Intent测试
//        this.IntentAndResultActivityTest();//2.3.5：Intent带返回结果测试

        //10分
//        this.LifeCycleActivityTest();//2.4.4：生命周期测试
//        this.ActivityRecovery();//2.4.5：活动被回收时保存数据。

        //10分
//        this.ActivityStartModeTest();//2.5.1、2.5.2、2.5.3、2.5.4：测试活动的启动模式

        //10分
//        this.ActivityCollectorTest();//2.6.1、2.6.2、2.6.3：活动的最佳实践（BaseActivity、ActivityCollector、ActivityCollectorTest）

        //10分
//        this.CommonComponentsTest();//3.2.1、3.2.2、3.2.3、3.2.4、3.2.5、3.2.6、3.2.7：常用控件的使用方法。

        //10分
        //3.3.1：LinearLayout线性布局：
//        this.LinearLayoutTest1();//第一种LinearLayout布局方式。
//        this.LinearLayoutTest2();//第二种LinearLayout布局方式。
//        this.LinearLayoutTest3();//第三种LinearLayout布局方式。
//        this.LinearLayoutTest4();//第四种LinearLayout布局方式。
        //3.3.2：RelativeLayout相对布局：
//        this.RelativeLayoutTest1();//第一种RelativeLayout布局方式。
//        this.RelativeLayoutTest2();//第二种RelativeLayout布局方式。
        //3.3.3：FrameLayout帧布局：
//        this.FrameLayoutTest1();
        //3.3.4：PercentLayout百分比布局：
//        this.PercentLayoutActivityTest();//百分比布局测试

        //3.7.2：编写精美的聊天界面。
//        this.ChatScreenActivity();//微信气泡对话框测试。

        //4.2.1：碎片的简单用法，静态添加碎片，使用fragment。
//        this.StaticFragmentActivityTest();//碎片的简单用法测试。
        //4.2.2：动态添加碎片，使用FrameLayout。
        this.DynamicFragmentLayout();


//        this.SimpleChatActivityTest();//简单的实现手机与Linux服务器的通讯聊天
//        this.LinearLayoutActivityTest();//LinearLayout测试
//        this.RelativeLayoutActivityTest();//RelativeLayout测试




//        this.IntentAndImgResultActivityTest();//使用Intent从图库获取图片并显示，未完成。
    }

    public void DynamicFragmentLayout(){
        Intent intent = new Intent(MainActivity.this, DynamicFragmentLayout.class);
        this.startActivity(intent);
        this.finish();
    }

    public void FrameLayoutTest1(){
        Intent intent = new Intent(MainActivity.this, FrameLayoutTest1.class);
        this.startActivity(intent);
        this.finish();
    }

    public void RelativeLayoutTest2(){
        Intent intent = new Intent(MainActivity.this, RelativeLayoutTest2.class);
        this.startActivity(intent);
        this.finish();
    }

    public void RelativeLayoutTest1(){
        Intent intent = new Intent(MainActivity.this, RelativeLayoutTest1.class);
        this.startActivity(intent);
        this.finish();
    }

    public void LinearLayoutTest4(){
        Intent intent = new Intent(MainActivity.this, LinearLayoutTest4.class);
        this.startActivity(intent);
        this.finish();
    }

    public void LinearLayoutTest3(){
        Intent intent = new Intent(MainActivity.this, LinearLayoutTest3.class);
        this.startActivity(intent);
        this.finish();
    }

    public void LinearLayoutTest2(){
        Intent intent = new Intent(MainActivity.this, LinearLayoutTest2.class);
        this.startActivity(intent);
        this.finish();
    }

    public void LinearLayoutTest1(){
        Intent intent = new Intent(MainActivity.this, LinearLayoutTest1.class);
        this.startActivity(intent);
        this.finish();
    }

    public void CommonComponentsTest(){
        Intent intent = new Intent(MainActivity.this, CommonComponentsTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void ActivityCollectorTest(){
        Intent intent = new Intent(MainActivity.this, ActivityCollectorTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void ActivityRecovery(){
        Intent intent = new Intent(MainActivity.this, ActivityRecovery.class);
        this.startActivity(intent);
        this.finish();
    }

    public void StaticFragmentActivityTest(){
        Intent intent = new Intent(MainActivity.this, StaticFragmentActivityTest.class);
        this.startActivity(intent);
        this.finish();
    }

    public void ChatScreenActivity(){
        Intent intent = new Intent(MainActivity.this, ChatScreenActivity.class);
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

    public void ActivityStartModeTest(){
        Intent intent = new Intent(MainActivity.this, ActivityStartModeTest.class);
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
