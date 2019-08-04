/*
 * @Chandra Dhakite
 */

package com.example.simpledagger2example.mocks;

import com.example.simpledagger2example.MyInterfaceImplementation;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModuleMock {

    @Provides
    @Singleton
    static MyInterfaceImplementation provideMyInterfaceImplementation() {
        return new MyInterfaceImplementationMock();
    }

}
