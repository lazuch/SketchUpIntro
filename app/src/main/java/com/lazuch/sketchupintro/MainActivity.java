package com.lazuch.sketchupintro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // user wants next page
    public void clickNext(View v) {
        Intent intent = new Intent(this, act2.class);
        startActivity(intent);
    }
}
