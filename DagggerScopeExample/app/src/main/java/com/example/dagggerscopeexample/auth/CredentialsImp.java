/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample.auth;

import com.example.dagggerscopeexample.app.Greeting;

public class CredentialsImp implements Credentials {
    private String mLogin;
    private Greeting mGreeting;

    public CredentialsImp(Greeting mGreeting) {
        this.mGreeting = mGreeting;
    }


    @Override
    public String getLogin() {
        return this.mLogin;
    }

    @Override
    public void setLogin(String login) {
        this.mLogin = login;

    }

    @Override
    public String getPersonalizedGreeting() {
        return mGreeting.getGreetings() + " " + mLogin;
    }
}
