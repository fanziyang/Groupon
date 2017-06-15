package com.example.zy.groupon.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zy.groupon.R;
import com.example.zy.groupon.util.SPUtil;

import static com.example.zy.groupon.config.Constant.FIRST;

public class SplashActivity extends Activity {


    private SPUtil spUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spUtil = new SPUtil(this);
        //页面模拟加载停留


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //偏好设置存放标志

                //根据是否是第一次使用进行相应的界面的跳转
                Intent intent;

                if (true){
                    //向新手指导页跳转
                    intent=new Intent(SplashActivity.this,GuideActivity.class);
//                    //创建笔
//                    SharedPreferences.Editor edit = sp.edit();
//                    //存数据
//                    edit.putBoolean(FIRST,false);
//                    //保存
//                    edit.commit();
                    spUtil.setFirst(false);
                }else {
                    //向主界面添转
                    intent=new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        },1500);
    }
}
