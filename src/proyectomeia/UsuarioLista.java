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
public class UsuarioLista {
    
    String nombreLista;
    String usuario;
    String usuarioAsociado;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    String descripcion;
    int estatus;
    
    public String toFixedSizeString(){
        return String.format("%-30s", nombreLista) + "|" + String.format("%-20s", usuario) + "|" + String.format("%-20s", usuarioAsociado) +
                "|" + String.format("%-40s", descripcion) +"|" + estatus;
    }
    
    public UsuarioLista(String nombreLista, String usuario, String usuarioAsociado, String descripcion, int estatus){
        this.nombreLista = nombreLista;
        this.usuario = usuario;
        this.usuarioAsociado = usuarioAsociado;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }
    
}
