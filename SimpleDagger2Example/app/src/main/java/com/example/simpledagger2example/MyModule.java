/*
 * @Chandra Dhakite
 */

/*
 * @Chandra Dhakite
 * This is Module which will define the on3e or more injectable classes as denoted by @Provides annotation
 * In our case we added the our injectable class MyInterfaceImplementation
 * We wanted create the one instance of the class we denoted by @Singlton annotation
 */



package com.example.simpledagger2example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    @Singleton
    public static MyInterfaceImplementation provideMyInterfaceImplementation() {
        return new MyInterfaceImplementation();
    }

}
