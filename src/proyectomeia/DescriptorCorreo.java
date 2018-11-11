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
public class DescriptorCorreo {
    String nombreArchivo;
    int raiz;
    int cantidad;
    int activos;
    int inactivos;
    
    @Override
    public String toString(){
        return nombreArchivo + "\n" + raiz + "\n" + cantidad +
                "\n" + activos + "\n" + inactivos;
    }

    public DescriptorCorreo(String nombreArchivo, int raiz, int cantidad, int activos, int inactivos) {
        this.nombreArchivo = nombreArchivo;
        this.raiz = raiz;
        this.cantidad = cantidad;
        this.activos = activos;
        this.inactivos = inactivos;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getActivos() {
        return activos;
    }

    public void setActivos(int activos) {
        this.activos = activos;
    }

    public int getInactivos() {
        return inactivos;
    }

    public void setInactivos(int inactivos) {
        this.inactivos = inactivos;
    }
    
}
