package com.example.mono.json;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Portatiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar =getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_portatiles);


        Spinner spinnercat= findViewById(R.id.spinnercat);
        ArrayAdapter<CharSequence> adaptercat=ArrayAdapter.createFromResource(this,R.array.Categ,android.R.layout.simple_spinner_item);
        adaptercat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercat.setAdapter(adaptercat);
        Spinner spinnerproc=findViewById(R.id.spinnerproc);
        ArrayAdapter<CharSequence>  adapterproc=ArrayAdapter.createFromResource(this,R.array.Procesador,android.R.layout.simple_spinner_item);
        adapterproc.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerproc.setAdapter(adapterproc);

        Spinner spinnerram=findViewById(R.id.spinnerram);
        ArrayAdapter<CharSequence>  adapterram=ArrayAdapter.createFromResource(this,R.array.Ram,android.R.layout.simple_spinner_item);
        adapterram.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerram.setAdapter(adapterram);

        Spinner spinneralm=findViewById(R.id.spinneralmac);
        ArrayAdapter<CharSequence>  adapteralm=ArrayAdapter.createFromResource(this,R.array.Almacenamiento,android.R.layout.simple_spinner_item);
        adapteralm.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinneralm.setAdapter(adapteralm);

        Spinner spinnerpant=findViewById(R.id.spinnerpant);
        ArrayAdapter<CharSequence>  adapterpant=ArrayAdapter.createFromResource(this,R.array.Pantalla,android.R.layout.simple_spinner_item);
        adapterpant.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerpant.setAdapter(adapterpant);

        Spinner spinnersisop=findViewById(R.id.spinnersisop);
        ArrayAdapter<CharSequence>  adaptersisop=ArrayAdapter.createFromResource(this,R.array.Sis_op,android.R.layout.simple_spinner_item);
        adaptersisop.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnersisop.setAdapter(adaptersisop);

        Spinner spinnerbat=findViewById(R.id.spinnerbat);
        ArrayAdapter<CharSequence>  adapterbat=ArrayAdapter.createFromResource(this,R.array.Batery,android.R.layout.simple_spinner_item);
        adapterbat.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerbat.setAdapter(adapterbat);



    }
}
