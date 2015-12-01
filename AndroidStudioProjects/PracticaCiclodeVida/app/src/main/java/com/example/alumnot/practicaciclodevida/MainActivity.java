package com.example.alumnot.practicaciclodevida;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("myApp", "estado onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        Log.i("myApp","estado onStart");
        super.onStart();
    }

    public void irActivity2(View v){
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }
    @Override
    protected void onRestart(){
        Log.i("myApp","estado onRestart");
        super.onRestart();
    }

    //CICLO DE VIDA: SALIDA DE LA ACTIVITY
    @Override
    protected void onPause(){
        Log.i("myApp","estado onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        Log.i("myApp","estado onDestroy");
        super.onDestroy();
    }
}
