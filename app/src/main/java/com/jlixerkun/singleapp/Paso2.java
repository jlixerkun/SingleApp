package com.jlixerkun.singleapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Paso2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso2);

        Intent intent = getIntent();
        String nombreUsuario = intent.getStringExtra(ActividadIntroduceDatos.EXTRA_MESSAGE);
        String messageBienvenida = "Hola, " + nombreUsuario + ", has logrado llegar al final";
        TextView textoFinal = new TextView(this);
        textoFinal.setTypeface(Typeface.createFromAsset(this.getAssets(),"fonts/Lobster-Regular.ttf"));
        textoFinal.setTextSize(R.dimen.mid_text);
        textoFinal.setText(messageBienvenida);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_paso2);
        layout.addView(textoFinal);
    }

    public void exitApp(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
        System.runFinalization();
        System.exit(0);
    }


}
