package com.satman.satya.fontforcompleteproject;

import android.app.Application;
import android.content.Context;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by satya on 31-05-2017.
 */

public class App extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/UbuntuB.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }



}
