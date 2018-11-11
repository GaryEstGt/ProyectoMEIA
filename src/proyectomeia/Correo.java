/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author luise
 */
public class Correo {
    private String emisor;
    private String receptor;
    private String mensaje;
    private String asunto;
    private String adjunto;
    private int estatus;
    private String fecha;
    
    @Override
    public String toString(){
        return emisor + "/" + receptor + "/" + fecha + "/" + asunto + "/" + mensaje + "/" + adjunto + "/" + estatus;                
    }
    
    public static Correo toCorreo(String correo){
        String[] campos = correo.split("\\/");
        return new Correo(campos[0], campos[1], campos[2], campos[3], campos[4], Integer.parseInt(campos[5]), campos[6]);
    }

    public Correo(String emisor, String receptor, String mensaje, String asunto, String adjunto, int estatus, String fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.mensaje = mensaje;
        this.asunto = asunto;
        this.adjunto = adjunto;
        this.estatus = estatus;
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }    
    
}
