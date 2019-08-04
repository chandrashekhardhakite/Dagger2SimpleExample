/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample.auth;

import com.example.dagggerscopeexample.app.Greeting;

import javax.inject.Scope;

import dagger.Module;
import dagger.Provides;

@Module
public class AuthModule {

    @Provides
    @AuthScope
     public  Credentials provideCredentialsImCredentials(Greeting mGreeting){
        return new CredentialsImp(mGreeting);


    }
}
