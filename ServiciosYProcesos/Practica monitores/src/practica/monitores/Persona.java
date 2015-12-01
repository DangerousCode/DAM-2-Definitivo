/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

/**
 *
 * @author Alvaro
 */
class Persona {
    
    int numero;
    String producto;
    
    public Persona(int numero, String producto) {
        this.numero = numero;
        this.producto = producto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


}
