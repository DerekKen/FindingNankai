package cn.studyjams.s2.sj0175.findingnankai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startBtn_OnClick(View v)
    {
        Toast.makeText(this, R.string.start_button_pressed_toast, Toast.LENGTH_LONG).show();
//        setContentView(R.layout.activity_wandering);


        //显式Intent的使用  (√)可以正常在活动之间跳转
//        Intent wandering_intent = new Intent(MainActivity.this, WanderingActivity.class);
//        startActivity(wandering_intent);


        //隐式Intent的使用 (√) 成功
        Intent implicit_wandering_intent = new Intent("android.intent.action.WANDERING_ACTION");
        implicit_wandering_intent.addCategory("android.intent.category.CAT_WANDERING");
        startActivity(implicit_wandering_intent);
    }

    public void exitBtn_OnClick(View v)
    {
        //结束Main Activity，与Back导航按键一样
        finish();
    }


}
