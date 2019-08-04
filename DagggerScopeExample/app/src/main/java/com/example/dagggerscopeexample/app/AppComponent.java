/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample.app;

import com.example.dagggerscopeexample.MainActivity;
import com.example.dagggerscopeexample.auth.AuthComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    AuthComponent plusAuthComponent();
    void inject (MainActivity mainActivity);
}
