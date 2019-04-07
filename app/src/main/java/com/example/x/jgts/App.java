package com.example.x.jgts;

import android.app.Application;
import cn.jpush.android.api.JPushInterface;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);

    }
}
