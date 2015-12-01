package com.example.alumnot.galeriagestos;

/**
 * Created by AlumnoT on 24/11/2015.
 */
public class Imagen {
    private String titulo="";
    private String url="";

    public Imagen(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrl() {
        return url;
    }
}
