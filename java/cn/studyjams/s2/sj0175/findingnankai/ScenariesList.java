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
        setContentView(R.layout.activity_xin_kai_lake);
    }

    public void on_back_btn_click(View v)
    {
        setContentView(R.layout.activity_scenaries_list);
    }

    public void on_memorial_btn_click(View v)
    {
        setContentView(R.layout.memorial);
    }

    public void on_zhulou_button_click(View v)
    {
        setContentView(R.layout.zhulou);
    }

    public void on_matihu_button_click(View v)
    {
        setContentView(R.layout.ma_ti_lake);
    }

}
