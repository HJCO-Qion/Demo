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

        //10��
//        this.IntentActivityTest();//2.3.1��2.3.2��2.3.3��2.3.4��Intent����
//        this.IntentAndResultActivityTest();//2.3.5��Intent�����ؽ������

        //10��
//        this.LifeCycleActivityTest();//2.4.4���������ڲ���
//        this.ActivityRecovery();//2.4.5���������ʱ�������ݡ�

        //10��
//        this.ActivityStartModeTest();//2.5.1��2.5.2��2.5.3��2.5.4�����Ի������ģʽ

        //10��
//        this.ActivityCollectorTest();//2.6.1��2.6.2��2.6.3��������ʵ����BaseActivity��ActivityCollector��ActivityCollectorTest��

        //10��
//        this.CommonComponentsTest();//3.2.1��3.2.2��3.2.3��3.2.4��3.2.5��3.2.6��3.2.7�����ÿؼ���ʹ�÷�����

        //10��
        //3.3.1��LinearLayout���Բ��֣�
//        this.LinearLayoutTest1();//��һ��LinearLayout���ַ�ʽ��
//        this.LinearLayoutTest2();//�ڶ���LinearLayout���ַ�ʽ��
//        this.LinearLayoutTest3();//������LinearLayout���ַ�ʽ��
//        this.LinearLayoutTest4();//������LinearLayout���ַ�ʽ��
        //3.3.2��RelativeLayout��Բ��֣�
//        this.RelativeLayoutTest1();//��һ��RelativeLayout���ַ�ʽ��
//        this.RelativeLayoutTest2();//�ڶ���RelativeLayout���ַ�ʽ��
        //3.3.3��FrameLayout֡���֣�
//        this.FrameLayoutTest1();
        //3.3.4��PercentLayout�ٷֱȲ��֣�
//        this.PercentLayoutActivityTest();//�ٷֱȲ��ֲ���

        //3.7.2����д������������档
//        this.ChatScreenActivity();//΢�����ݶԻ�����ԡ�

        //4.2.1����Ƭ�ļ��÷�����̬�����Ƭ��ʹ��fragment��
//        this.StaticFragmentActivityTest();//��Ƭ�ļ��÷����ԡ�
        //4.2.2����̬�����Ƭ��ʹ��FrameLayout��
        this.DynamicFragmentLayout();


//        this.SimpleChatActivityTest();//�򵥵�ʵ���ֻ���Linux��������ͨѶ����
//        this.LinearLayoutActivityTest();//LinearLayout����
//        this.RelativeLayoutActivityTest();//RelativeLayout����




//        this.IntentAndImgResultActivityTest();//ʹ��Intent��ͼ���ȡͼƬ����ʾ��δ��ɡ�
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
