package com.jlixerkun.singleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Presentacion extends AppCompatActivity {
//    public static String EXTRA_MESSAGE = "com.jlixerkun.singleapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
    }


    public void continuar (View view){
        Intent intent = new Intent(this, ActividadIntroduceDatos.class);
        startActivity(intent);
    }
}
