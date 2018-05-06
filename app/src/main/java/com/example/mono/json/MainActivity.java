package com.example.mono.json;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.ThemeOverlay_Material_Dark);


        setContentView(R.layout.activity_main);

    }

    public void abrirportatiles(View view) {
        Intent intentport = new Intent(this, Portatiles.class);
        //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(intentport);
    }

    public void abrirdesk(View view) {
        Intent intentdesk = new Intent(this, Descktop.class);
        //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(intentdesk);
    }

    public void abriresca(View view) {
        Intent intentesc = new Intent(this, Escanner.class);
        //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(intentesc);

    }
}
