/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

/**
 *
 * @author luise
 */
public class Nodo {
    int posicion;    
    int izquierdo;
    int derecho;
    Correo correo;

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }   

    public int getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(int izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getDerecho() {
        return derecho;
    }

    public void setDerecho(int derecho) {
        this.derecho = derecho;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString(){
        return String.format("%-12s", posicion) + "|" + String.format("%-12s", izquierdo) + "|" + String.format("%-12s", derecho) +
                "|" + correo.toString();
    }   

    public Nodo(int posicion, Correo correo) {
        this.posicion = posicion;        
        this.izquierdo = -1;
        this.derecho = -1;
        this.correo = correo;
    }
    
    public Nodo(int posicion,int izquierdo, int derecho, Correo correo) {
        this.posicion = posicion;        
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.correo = correo;
    }
    
}
