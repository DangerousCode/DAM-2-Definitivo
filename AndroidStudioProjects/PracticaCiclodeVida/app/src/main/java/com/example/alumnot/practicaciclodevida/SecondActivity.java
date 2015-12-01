package com.example.alumnot.practicaciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Alumnot on 13/10/2015.
 */
public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }
}
