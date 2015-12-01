package com.forexample.joni.camposdebatalla2;

import java.io.Serializable;

/**
 * @author Jonas Gomez
 */
public class Battleground implements Serializable
{
    private String nombre;
    private String descripcion;
    private String objetivo;
    private String bg;

    public Battleground(String nombre, String descripcion, String objetivo, String bg)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.objetivo=objetivo;
        this.bg=bg;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public String getObjetivo()
    {
        return objetivo;
    }

    public String getBg()
    {
        return bg;
    }
}
