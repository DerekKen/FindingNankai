package cn.studyjams.s2.sj0175.findingnankai;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WanderingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wandering);

//        ImageView imageView = (ImageView) findViewById(R.id.schoolgate_NKU);
//        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void schoolGate_OnClick(View v)
    {
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //继续"发现南开"，在校园中游玩：新开湖
//        setContentView(R.layout.activity_wandering_02);

        Intent intent = new Intent(WanderingActivity.this, ScenariesList.class);
        startActivity(intent);
    }
}
