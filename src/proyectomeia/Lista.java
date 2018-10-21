/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.util.Comparator;

/**
 *
 * @author garya
 */
public class Lista  {
    String nombreLista;
    String Usuario;
    String Descripcion;
    int numeroUsuarios;
    String fechaCreacion;
    int Estatus;

    public Lista(String nombreLista, String Usuario, String Descripcion, int numeroUsuarios, String fechaCreacion, int Estatus) {
        this.nombreLista = nombreLista;
        this.Usuario = Usuario;
        this.Descripcion = Descripcion;
        this.numeroUsuarios = numeroUsuarios;
        this.fechaCreacion = fechaCreacion;
        this.Estatus = Estatus;
    }

    @Override
    public String toString() {
        return nombreLista + "|" + Usuario + "|" + Descripcion + "|" + numeroUsuarios + "|" + fechaCreacion + "|" + Estatus;
    }
    public String toFixedSizeString(){
        return String.format("%-20s", nombreLista) + "|" + String.format("%-30s", Usuario) + "|" + String.format("%-50s", Descripcion) + "|" + numeroUsuarios+
                "|" + String.format("%-10s", fechaCreacion) +"|" + Estatus;                
    }
    
    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public void setNumeroUsuarios(int numeroUsuarios) {
        this.numeroUsuarios = numeroUsuarios;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getEstatus() {
        return Estatus;
    }

    public void setEstatus(int Estatus) {
        this.Estatus = Estatus;
    }

}
class Compare implements Comparator<Lista>{

    @Override
    public int compare(Lista o1, Lista o2) {
           if(o1.nombreLista.compareToIgnoreCase(o2.nombreLista) == 0)
        {                        
                return o1.Usuario.compareTo(o2.Usuario);
        } else {
            return o1.nombreLista.compareToIgnoreCase(o1.nombreLista);
        }   
    }
    
}

