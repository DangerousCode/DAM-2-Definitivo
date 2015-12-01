package com.example.alumnot.galeriagestos;

import android.app.Activity;
import android.app.ProgressDialog;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import org.xmlpull.v1.XmlPullParser;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Handler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import org.apache.http.*;

import java.net.URL;
import java.net.URLConnection;
import org.apache.http.impl.client.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
public class MainActivity extends Activity implements GestureOverlayView.OnGesturePerformedListener {

    //GUI
    private ImageSwitcher switcher;
    private Button btnL;
    private Button btnR;

    //Logica de la aplicacion
    private int contador=-1; //control de imagen actual

    private int totalImagenes=0; //total de imagenes

    private ArrayList<Imagen> listaImagenes=new ArrayList<Imagen>();

    //Enum que guarda las direcciones para ir de una imagen a otra
    enum  enumDirection{DERECHA, IZQUIERDA};
    enumDirection direction=enumDirection.DERECHA;

    //Para la barra de progreso
    private ProgressDialog pDialog;
    public static final int progress_bar_type=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias a GUI
        switcher=(ImageSwitcher) findViewById(R.id.imageSwitcher);
        //preparamos el switcher
        switcher.setFactory(new MyImageSwitcherFactory());
        btnL=(Button) findViewById(R.id.btnleft);
        btnR=(Button) findViewById(R.id.btnright);

        //Runnable para la descarga del XML(hilo)
        Runnable hiloXML=new Runnable() {
            //Handler(manejador) para saber cuando acaba la tarea del Runnable
            Handler handler=new Handler();
            @Override

            //Tarea principal del hilo
            public void run(){
                //aqui se volcará el XML descargado
                XmlPullParser contenidoXML=null;

                HttpGet urlXML=new HttpGet("http://bishoport.com/android/imagenes.xml");
                DefaultHttpClient client=new DefaultHttpClient();

                try{
                    //Iniciamos la conexión
                    HttpResponse execute=client.execute(urlXML);

                    contenidoXML=XmlPullParserFactory.newInstance().newPullParser();
                    InputStream content=execute.getEntity().getContent();
                    contenidoXML.setInput(content,null);
                    recorrerXML(contenidoXML);

                } catch (Exception e) {
                    Log.i("myApp", "No hay conexion");
                }
                handler.post(new Runnable(){
                    @Override
                    public void run(){
                        Toast.makeText(MainActivity.this,"XML Preparado",Toast.LENGTH_LONG).show();
                    }
                });
            }
        };
        new Thread(hiloXML).start();
    }

    private void recorrerXML(XmlPullParser xmlDescargado) throws XmlPullParserException, IOException {
        int eventType=-1;
        while(eventType!=XmlPullParser.END_DOCUMENT){
            if(eventType==XmlPullParser.START_TAG){
                String tagName=xmlDescargado.getName();
                if(tagName.equals("imagen")){
                    String tituloValue=xmlDescargado.getAttributeValue(null,"titulo");
                    String urlValue=xmlDescargado.getAttributeValue(null,"url");
                    Imagen myImagen=new Imagen(tituloValue, urlValue);
                    listaImagenes.add(myImagen);
                }
            }
            eventType=xmlDescargado.next();
        }
        totalImagenes=listaImagenes.size();
    }

    private class MyImageSwitcherFactory implements ViewSwitcher.ViewFactory{

        @Override
        public View makeView() {
            ImageView imageView=(ImageView)
                    LayoutInflater.from(getApplicationContext()).inflate(R.layout.image_item,switcher,false);
            return imageView;
        }
    }

    @Override
    public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {

    }
}
