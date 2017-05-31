package cn.studyjams.s2.sj0175.findingnankai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ScenariesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenaries_list);
    }



    public void on_xinkai_lake_btn_click(View v)
    {
//        Intent intent = new Intent(this, ScenariesList.class);
//        startActivity(intent);

        setContentView(R.layout.activity_xin_kai_lake);
    }

    public void on_back_btn_click(View v)
    {
        setContentView(R.layout.activity_scenaries_list);
    }
}
