package com.example.mono.json;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Escanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar =getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_escanner);
    }
}
