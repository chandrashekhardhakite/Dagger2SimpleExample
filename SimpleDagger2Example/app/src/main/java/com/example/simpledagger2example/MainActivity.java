
/*
 * @Chandra Dhakite
 * Now we are get the reference our implementation class (MyInterfaceImplementation)
 * By using the @inject annotation and call the Component inject method which we stored in Application class
 * finally using dependency injection will set the Date ("Yahooo Dagger2 !")
 */

package com.example.simpledagger2example;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    @Inject
    MyInterfaceImplementation myInterfaceImplementation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.datetime);
        ((MyApplication) getApplication()).getMyComponent().inject(MainActivity.this);
        mTextView.setText((new Date(myInterfaceImplementation.getDate()).toString()));
    }
}
