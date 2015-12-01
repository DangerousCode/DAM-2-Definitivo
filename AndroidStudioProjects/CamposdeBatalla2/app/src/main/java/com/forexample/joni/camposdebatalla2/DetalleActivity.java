package com.forexample.joni.camposdebatalla2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Jonas Gomez
 */
public class DetalleActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView campoNombre = (TextView) findViewById(R.id.campo_nombre);
        TextView campoDescripcion = (TextView) findViewById(R.id.campo_descripcion);
        ImageView campoImagen= (ImageView) findViewById(R.id.campo_imagen);
        TextView campoObjetivo = (TextView) findViewById(R.id.campo_objetivo);
        Bundle extras = getIntent().getExtras();

        Battleground battlegroundActual = (Battleground) extras.getSerializable("objetoCampo");
        campoNombre.setText(battlegroundActual.getNombre());
        campoDescripcion.setText(battlegroundActual.getDescripcion());
        int res_imagen=getResources().getIdentifier(battlegroundActual.getBg(), "drawable", getPackageName());
        campoImagen.setImageResource(res_imagen);
        campoObjetivo.setText(battlegroundActual.getObjetivo());
    }
}