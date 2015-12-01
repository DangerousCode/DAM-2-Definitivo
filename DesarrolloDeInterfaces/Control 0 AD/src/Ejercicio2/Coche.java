/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author AlumnoT
 */
public class Coche {

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", caballos=" + caballos + '}';
    }
    String marca;
    String modelo;
    double caballos;

    public Coche(String marca, String modelo, double caballos) {
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCaballos() {
        return caballos;
    }

    public void setCaballos(double caballos) {
        this.caballos = caballos;
    }
    
    
}
