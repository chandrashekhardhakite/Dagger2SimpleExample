/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample.app;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    public Greeting provideGreetingImplementation() {
        return new GreetingImplementation();
    }

}
