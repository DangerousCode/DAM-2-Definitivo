package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ImageView campoImagen = (ImageView) findViewById(R.id.campoImagen);
        TextView campoTexto = (TextView) findViewById(R.id.campoTexto);
        TextView campoRol=(TextView) findViewById(R.id.campoRol);
        TextView campoNombre=(TextView) findViewById(R.id.campoNombre);
        Bundle extras = getIntent().getExtras();

        Personaje personajeActual = (Personaje) extras.getSerializable("Personaje");
<<<<<<< HEAD
        campoNombre.setText(personajeActual.getNombre());
=======
        campoNombre.setText(personajeActual.getNombre().toUpperCase());
>>>>>>> origin/master
        campoRol.setText(personajeActual.getRol().toUpperCase());

        int res_imagen=getResources().getIdentifier(personajeActual.getImagen(),"drawable",getPackageName());
        campoImagen.setImageResource(res_imagen);
        campoTexto.setText(personajeActual.getHistoria());
    }
}
