package cn.studyjams.s2.sj0175.findingnankai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;


public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void startBtn_OnClick(View v)
    {
        Toast.makeText(this, R.string.start_button_pressed_toast, Toast.LENGTH_LONG).show();

        //显式Intent的使用  (√)可以正常在活动之间跳转
        Intent wandering_intent = new Intent(MainActivity.this, WanderingActivity.class);
        startActivity(wandering_intent);

        //The following code logs a SELECT_CONTENT Event when a user clicks on a specific element in your app.
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "ID_StartButton");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "开始按钮");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    public void exitBtn_OnClick(View v)
    {
        //The following code logs a SELECT_CONTENT Event when a user clicks on a specific element in your app.
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "ID_ExitButton");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "退出按钮");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        //结束Main Activity，与Back导航按键一样
        finish();
    }

}
