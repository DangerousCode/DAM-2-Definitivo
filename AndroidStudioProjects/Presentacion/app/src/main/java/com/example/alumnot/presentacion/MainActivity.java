package com.example.alumnot.presentacion;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {
    //Variables modelo de datos
    private String numeroA="";
    private String numeroB="";
    private String operacion="";

    //Variables de objetos de la vista
    private TextView campoPantalla;

    //Variables de la lógica
    private boolean estadoA=true;
    private boolean estadoB=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPantalla=(TextView) findViewById(R.id.campoPantalla);
    }

    public void pulsaNumero(View v) {
        String teclaPulsada = String.valueOf(v.getTag());
        if (estadoA) {
            numeroA += teclaPulsada;
            campoPantalla.setText(numeroA);
        }
        if (!estadoA) {
            numeroB += teclaPulsada;
            campoPantalla.setText(numeroA + " " + operacion + " " + numeroB);
        }
    }
    public void pulsaOperacion(View v){
        int idPulsada=v.getId();
        if(idPulsada==R.id.tmas){
            operacion="+";
        }
        if(idPulsada==R.id.t_){
            operacion="-";
        }
        if(idPulsada==R.id.tx){
            operacion="*";
        }
        if(idPulsada==R.id.tdiv){
            operacion="/";
        }

        estadoA=false;
        estadoB=true;

        campoPantalla.setText(numeroA+" "+operacion);
    }

    public void pulsaResolver(View v){
        if(operacion=="+"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) + Double.parseDouble(numeroB)));
        }if(operacion=="X"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) * Double.parseDouble(numeroB)));
        }if(operacion=="/"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) / Double.parseDouble(numeroB)));
        }if(operacion=="-"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) - Double.parseDouble(numeroB)));
        }

        estadoA=true;
        estadoB=false;

        numeroA="";
        numeroB="";
        operacion="";

    }

    public void pulsaC(View v){
        estadoA=true;
        estadoB=false;

        numeroA="";
        numeroB="";
        operacion="";

        campoPantalla.setText("");
    }//EndpulsaC

    public void pulsaIgual(View v)
    {
        estadoA=true;
        estadoB=false;

        if(operacion=="+"){
            campoPantalla.setText(String.valueOf(Integer.parseInt(numeroA)+Integer.parseInt((numeroB))));
        }
        if(operacion=="-"){
            campoPantalla.setText(String.valueOf(Integer.parseInt(numeroA)-Integer.parseInt((numeroB))));
        }
        if(operacion=="X"){
            campoPantalla.setText(String.valueOf(Integer.parseInt(numeroA)*Integer.parseInt((numeroB))));
        }
        if(operacion=="/"){
            campoPantalla.setText(String.valueOf(Integer.parseInt(numeroA)/Integer.parseInt((numeroB))));

        }
    }
}
