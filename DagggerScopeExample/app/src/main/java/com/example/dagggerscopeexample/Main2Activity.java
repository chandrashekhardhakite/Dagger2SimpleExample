/*
 * @Chandra Dhakite
 */

package com.example.dagggerscopeexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagggerscopeexample.auth.Credentials;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {
    @Inject
    Credentials mCredentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getAuthComponent().inject(this);
        setContentView(R.layout.activity_main2);
        Button logoutButton = findViewById(R.id.btnLogout);
        final Button nextButton = findViewById(R.id.btnNext);
        TextView loginTextView = findViewById(R.id.tvLogin);
        loginTextView.setText(mCredentials.getLogin());
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyApplication.clearAuthComponent();
                startActivity(new Intent(view.getContext(), MainActivity.class));
                finish();
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), Main3Activity.class));
                finish();
            }
        });
    }

}

