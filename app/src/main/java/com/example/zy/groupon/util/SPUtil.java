package com.example.zy.groupon.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.zy.groupon.config.Constant;

/**
 * Created by tarena on 2017/6/15.
 */

public class SPUtil {
    SharedPreferences sp;
    /**
     * 通过构造器重载，以不同的方式获得偏好设置文件的操作
     * **存个性化
     * 1）Context的getSharedPreferences（文件名，模式）；模式例：Context.MODE_PRIVATE
     * **存界面
     * 2）Activity的this.getPreferences(模式)；获取以preferences_
     * **存全局
     * 3)preferenceManager的getDefultSharedPreferences(Context)
     *   获取preference_包名 偏好设置文件 模式Context_MODE_PRIVATE
     */


    public  SPUtil(Context context,String name){
        sp=context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }
    public  SPUtil(Context context){

        sp=PreferenceManager.getDefaultSharedPreferences(context);

    }
    public boolean isFirst(){

        //TODO getSharedPreferences
        return sp.getBoolean(Constant.FIRST,true);
    }
    public void setFirst(Boolean flag){
        SharedPreferences.Editor editor=sp.edit();
        editor.putBoolean(Constant.FIRST,flag);
        editor.commit();

    }
}
