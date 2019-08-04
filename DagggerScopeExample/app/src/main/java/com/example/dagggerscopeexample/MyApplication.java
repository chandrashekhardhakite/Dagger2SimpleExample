/*
 * @Chandra Dhakite
 */

/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample;

import android.app.Application;
import android.util.Log;

import com.example.dagggerscopeexample.app.AppComponent;
import com.example.dagggerscopeexample.app.AppModule;
import com.example.dagggerscopeexample.app.DaggerAppComponent;
import com.example.dagggerscopeexample.auth.AuthComponent;

public class MyApplication extends Application {

    static private AppComponent sAppComponent;
    static private AuthComponent sAuthComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Chandta Before","chandra");
//        sAppComponent = DaggerAppComponent.create();
        sAppComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
//        sAppComponent =DaggerAppComponent.builder().myModule(new MyModule()).build();
        Log.d("Chandta","chandra");

    }

    static public AuthComponent plusAuthComponent() {
        if (sAuthComponent == null) {
            sAuthComponent = sAppComponent.plusAuthComponent();
        }
        return sAuthComponent;
    }

    static public void clearAuthComponent() {
        sAuthComponent = null;
    }

    static public AppComponent getAppComponent() {
        return sAppComponent;
    }

    static public AuthComponent getAuthComponent() { return sAuthComponent; }
}
