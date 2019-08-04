/*
 * @Chandra Dhakite
 * As soon as you added empty Application file and components and Module and and required dependencies classes and interface
 * rebuild the project so it will genrate the classes as pre3fix DaggerMyComponent
 * In Application file will instantiate the these class store them  to use them throught the application
 */

package com.example.simpledagger2example;

import android.app.Application;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.myComponent = createMyComponent();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
    public void setMyComponent(MyComponent myComponent) {
        this.myComponent = myComponent;
    }


    private MyComponent createMyComponent() {
        return DaggerMyComponent.builder().myModule(new MyModule()).build();
    }
}
