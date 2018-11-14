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
        return new Correo(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], Integer.parseInt(campos[6]));
    }

    public Correo(String emisor, String receptor, String fecha, String asunto, String mensaje, String adjunto, int estatus) {
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
    
    public int Compare(Correo correo){
        if(this.getEmisor().equals(correo.getEmisor())){
            if(this.getReceptor().equals(correo.getReceptor())){
                if(this.getFecha().equals(correo.getFecha())){
                    return 0;
                }
                else{
                    return 0;
                }
            }
            else{
                if(this.getReceptor().compareTo(correo.getReceptor()) > 0){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
        else{
            if(this.getEmisor().compareTo(correo.getEmisor()) > 0){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
    
}
