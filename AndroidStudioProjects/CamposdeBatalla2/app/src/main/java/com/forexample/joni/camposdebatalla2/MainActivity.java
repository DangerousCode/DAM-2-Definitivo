package com.forexample.joni.camposdebatalla2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Jonas Gomez
 */
public class MainActivity extends Activity
{
    private ArrayList<Battleground> listaBattlegrounds = new ArrayList<Battleground>();
    private ArrayList<String> listaTitulos = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            parsearXML();
            montarListView();
        }
        catch (XmlPullParserException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private void parsearXML() throws XmlPullParserException , IOException
    {

        XmlPullParser parser = getResources().getXml(R.xml.campos);
        int eventType = -1;

        while (eventType != XmlResourceParser.END_DOCUMENT)
        {
            eventType = parser.next();
            if(eventType == XmlResourceParser.START_TAG)
            {
                String currentTagName = parser.getName();
                if(currentTagName.equals("campo"))
                {
                    String nombreValue = parser.getAttributeValue(null,"nombre");
                    String descripcionValue = parser.getAttributeValue(null,"descripcion");
                    String bgValue = parser.getAttributeValue(null,"bg");
                    String objetivoValue = parser.getAttributeValue(null,"objetivo");

                    Battleground battlegroundActual = new Battleground(nombreValue, descripcionValue, bgValue, objetivoValue);

                    listaBattlegrounds.add(battlegroundActual);
                    listaTitulos.add(nombreValue);
                }
            }
        }
    }

    private void montarListView()
    {
        ListView listView = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item,listaTitulos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent i = new Intent(MainActivity.this, DetalleActivity.class);

                i.putExtra("objetoCampo", listaBattlegrounds.get(position));
                startActivity(i);
            }
        });
    }
}

