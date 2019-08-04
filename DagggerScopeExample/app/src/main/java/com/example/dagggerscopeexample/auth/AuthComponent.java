/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample.auth;

import com.example.dagggerscopeexample.Main2Activity;
import com.example.dagggerscopeexample.Main3Activity;

import dagger.Component;
import dagger.Subcomponent;

@AuthScope
@Subcomponent (modules = AuthModule.class)
public interface AuthComponent {

    void inject(Main2Activity main2Activity);

    void inject(Main3Activity main3Activity);

    Credentials getCredentials();
}
