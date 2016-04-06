package com.lazuch.sketchupintro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class act5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act5);
    }


    // user wants previous page
    public void clickPrev(View v) {
        Intent intent = new Intent(this, act4.class);
        startActivity(intent);
    }

    // user wants home page
    public void clickHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
