package com.jlixerkun.singleapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadIntroduceDatos extends AppCompatActivity {




    public final static String EXTRA_MESSAGE =  "com.jlixerkun.singleapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_introduce_datos);
    }

    public void atras(View view){
        Intent devuelta = new Intent(this, Presentacion.class);
        startActivity(devuelta);
    }

    public void continuarPaso2(View view){
        Intent paso2 = new Intent(this, Paso2.class);
        CheckBox acepto = (CheckBox) findViewById(R.id.checkBoxAceptaCondiciones);

        if(acepto.isChecked()){
            final EditText usuario = (EditText) findViewById(R.id.usuario);
            final String nombreUsuario = usuario.getText().toString();
            paso2.putExtra(EXTRA_MESSAGE, nombreUsuario);
            startActivity(paso2);
        }else{
            String mensajeTexto = getString(R.string.mensaje_no_acepta);
            Toast mensaje = Toast.makeText(this, mensajeTexto, Toast.LENGTH_LONG);
            mensaje.setGravity(Gravity.CENTER_VERTICAL,0,0);
            mensaje.show();
        }
    }
}
