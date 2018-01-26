package com.sugarormtest.sugarormtest;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by david.benito on 25/01/2018.
 */

public class AppConfig extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
    }

    @Override
    public void onTerminate(){
        super.onTerminate();
        SugarContext.terminate();
    }
}
