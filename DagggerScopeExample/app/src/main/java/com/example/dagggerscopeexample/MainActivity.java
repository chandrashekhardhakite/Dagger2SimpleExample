package com.example.dagggerscopeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dagggerscopeexample.app.Greeting;
import com.example.dagggerscopeexample.auth.Credentials;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    final static String TAG = MainActivity.class.getSimpleName();

    @Inject
    Greeting mGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(null!= MyApplication.getAppComponent()) {
            Log.i(TAG, "inSide");
            MyApplication.getAppComponent().inject(MainActivity.this);
        }
        setContentView(R.layout.activity_main);
        final EditText loginEditText = findViewById(R.id.etLogin);
        final Button loginButton = findViewById(R.id.btnLogin);
        TextView greetingTextView = findViewById(R.id.tvGreeting);
        greetingTextView.setText(mGreeting.getGreetings());

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = loginEditText.getText().toString().trim();
                if (login.matches("")) {
                    return;
                }
                Credentials credentials = MyApplication
                        .plusAuthComponent()
                        .getCredentials();
                credentials.setLogin(login);
                startActivity(new Intent(view.getContext(), Main2Activity.class));


            }
        });
    }
}

