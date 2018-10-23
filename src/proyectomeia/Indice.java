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
public class Indice {
    
    int numeroRegistro;
    String posicion;
    String nombreLista;
    String usuario;
    String usuarioAsociado;
    int siguiente;
    int estatus;

    public Indice(int numeroRegistro, String posicion, String nombreLista, String usuario, String usuarioAsociado, int siguiente, int estatus) {
        this.numeroRegistro = numeroRegistro;
        this.posicion = posicion;
        this.nombreLista = nombreLista;
        this.usuario = usuario;
        this.usuarioAsociado = usuarioAsociado;
        this.siguiente = siguiente;
        this.estatus = estatus;
    }    

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioAsociado() {
        return usuarioAsociado;
    }

    public void setUsuarioAsociado(String usuarioAsociado) {
        this.usuarioAsociado = usuarioAsociado;
    }

    public int getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }    
    
    public String toFixedSizeString(){
        return String.format("%-12s", numeroRegistro) + "|" + String.format("%-12s", posicion) + "|" + String.format("%-30s", nombreLista) +
                "|" + String.format("%-20s", usuario) + "|" + String.format("%-20s", usuarioAsociado) + "|" + String.format("%-12s", siguiente) + "|" + estatus;
    }
    
}
