/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dagggerscopeexample.auth.Credentials;

import javax.inject.Inject;

public class Main3Activity extends Activity {

    @Inject
    Credentials mCredentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getAuthComponent().inject(this);
        setContentView(R.layout.activity_main3);
        Button logoutButton = findViewById(R.id.btnLogout);
        TextView personalGreetingTextView = findViewById(R.id.tvPersonalGreeting);
        personalGreetingTextView.setText(mCredentials.getPersonalizedGreeting());
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyApplication.clearAuthComponent();
                startActivity(new Intent(view.getContext(), MainActivity.class));
                finish();
            }


        });

    }

}
