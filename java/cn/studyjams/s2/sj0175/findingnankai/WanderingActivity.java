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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void schoolGate_OnClick(View v)
    {
        Intent intent = new Intent(WanderingActivity.this, ScenariesList.class);
        startActivity(intent);
    }
}
