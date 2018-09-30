/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author garya
 */
public class OpcionesUsuario extends javax.swing.JFrame implements DocumentListener{

    /**
     * Creates new form OpcionesUsuario
     */
    public OpcionesUsuario() {
        initComponents();
         txtContraseña.setDocument(new LimitarCaracteres(40));
        txtContraseña.getDocument().addDocumentListener(this);
        txtCorreo.setDocument(new LimitarCaracteres(40));
        txtTelefono.setDocument(new LimitarNumeros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelContraseña = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JPasswordField();
        btnCambiarcontraseña = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JPasswordField();
        btnCambiarCorreo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JPasswordField();
        btnCambiarTel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFoto = new javax.swing.JPasswordField();
        btnCambiarfoto = new javax.swing.JButton();
        CalendarFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnCambiarfecha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCambiarcontraseña.setText("Cambiar");
        btnCambiarcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarcontraseñaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nueva Contraseña");

        lblNivel.setText("nivel");

        javax.swing.GroupLayout panelContraseñaLayout = new javax.swing.GroupLayout(panelContraseña);
        panelContraseña.setLayout(panelContraseñaLayout);
        panelContraseñaLayout.setHorizontalGroup(
            panelContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContraseñaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContraseñaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelContraseñaLayout.createSequentialGroup()
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCambiarcontraseña)))
                .addContainerGap())
        );
        panelContraseñaLayout.setVerticalGroup(
            panelContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(panelContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarcontraseña)
                    .addComponent(lblNivel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setText("Cambiar Contraseña");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCambiarCorreo.setText("Cambiar");
        btnCambiarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarCorreoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nuevo Correo");

        btnCambiarTel.setText("Cambiar");
        btnCambiarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarTelActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuevo Telefono");

        jLabel6.setText("Nueva Foto");

        txtFoto.setEditable(false);

        btnCambiarfoto.setText("Cambiar");
        btnCambiarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarfotoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nuevo Cumpleaños");

        btnCambiarfecha.setText("Cambiar");
        btnCambiarfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarfechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiarTel))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiarCorreo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CalendarFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCambiarfecha)
                            .addComponent(btnCambiarfoto)))
                    .addComponent(jLabel7))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarCorreo))
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiarTel)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarfoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiarfecha)
                    .addComponent(CalendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setText("Cambiar Otros Datos");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(315, 315, 315))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarfotoActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imgenes", "jpg");
        File ficheroImagen;
        String rutaArchivo;
        dialogo.setFileFilter(filtro);
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();

                
            txtFoto.setText(rutaArchivo);            
        }
         LinkedList<Usuario> lista=OperacionesSecuencial.obtenerUsuarios(1);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getUsuario().equals(ProyectoMEIA.usuarioEnUso.getUsuario())){
                    lista.get(i).setPathFoto(txtFoto.getText());                    
                }
            }
             OperacionesSecuencial.rellenarUsuarios(lista);
            DescriptorUsuario user=OperacionesSecuencial.obtenerDescriptorUsuario(1);
            Date fechaActual=new Date();
            
            user.setFechaModificacion(fechaActual.toString());
            user.setUsuarioModificacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            OperacionesSecuencial.rellenarDescriptorUsuario(user, 1);
        
    }//GEN-LAST:event_btnCambiarfotoActionPerformed

    private void btnCambiarfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarfechaActionPerformed
        // TODO add your handling code here:
         Date fecha = CalendarFecha.getDate();
            String formato = CalendarFecha.getDateFormatString();
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
             LinkedList<Usuario> lista=OperacionesSecuencial.obtenerUsuarios(1);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getUsuario().equals(ProyectoMEIA.usuarioEnUso.getUsuario())){
                    lista.get(i).setFechaNacimiento(String.valueOf(sdf.format(fecha)));                    
                }
            }
             OperacionesSecuencial.rellenarUsuarios(lista);
            DescriptorUsuario user=OperacionesSecuencial.obtenerDescriptorUsuario(1);
            Date fechaActual=new Date();
            
            user.setFechaModificacion(fechaActual.toString());
            user.setUsuarioModificacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            OperacionesSecuencial.rellenarDescriptorUsuario(user, 1);
            
    }//GEN-LAST:event_btnCambiarfechaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        if(ProyectoMEIA.usuarioEnUso.getRol()==1){
            OpcionesAdministrador ventana = new OpcionesAdministrador();
            ventana.show();
            dispose();
        }
        else{
           LogIn ventana = new LogIn();
            ventana.show();
            dispose(); 
        }
        

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCambiarcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarcontraseñaActionPerformed
        // TODO add your handling code here:
        if(!lblNivel.getText().equals("Contraseña muy insegura")||!lblNivel.getText().equals("Contraseña insegura")||!lblNivel.getText().equals("Ingrese la contraseña")){
           LinkedList<Usuario> lista=OperacionesSecuencial.obtenerUsuarios(1);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getUsuario().equals(ProyectoMEIA.usuarioEnUso.getUsuario())){
                    lista.get(i).setContraseña(txtContraseña.getText());     
                }
            }
            OperacionesSecuencial.rellenarUsuarios(lista);
            DescriptorUsuario user=OperacionesSecuencial.obtenerDescriptorUsuario(1);
            Date fechaActual=new Date();
            
            user.setFechaModificacion(fechaActual.toString());
            user.setUsuarioModificacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            OperacionesSecuencial.rellenarDescriptorUsuario(user, 1);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña Invalida");
        }
    }//GEN-LAST:event_btnCambiarcontraseñaActionPerformed

    private void btnCambiarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCorreoActionPerformed
        // TODO add your handling code here:
        LinkedList<Usuario> lista=OperacionesSecuencial.obtenerUsuarios(1);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getUsuario().equals(ProyectoMEIA.usuarioEnUso.getUsuario())){
                    lista.get(i).setCorreo(txtCorreo.getText());                    
                }
            }
             OperacionesSecuencial.rellenarUsuarios(lista);
            DescriptorUsuario user=OperacionesSecuencial.obtenerDescriptorUsuario(1);
            Date fechaActual=new Date();
            
            user.setFechaModificacion(fechaActual.toString());
            user.setUsuarioModificacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            OperacionesSecuencial.rellenarDescriptorUsuario(user, 1);
    }//GEN-LAST:event_btnCambiarCorreoActionPerformed

    private void btnCambiarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarTelActionPerformed
        // TODO add your handling code here:
         LinkedList<Usuario> lista=OperacionesSecuencial.obtenerUsuarios(1);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getUsuario().equals(ProyectoMEIA.usuarioEnUso.getUsuario())){
                    lista.get(i).setTelefono(Integer.parseInt(txtTelefono.getText()));                    
                }
            }
             OperacionesSecuencial.rellenarUsuarios(lista);
            DescriptorUsuario user=OperacionesSecuencial.obtenerDescriptorUsuario(1);
            Date fechaActual=new Date();
            
            user.setFechaModificacion(fechaActual.toString());
            user.setUsuarioModificacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            OperacionesSecuencial.rellenarDescriptorUsuario(user, 1);
    }//GEN-LAST:event_btnCambiarTelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesUsuario().setVisible(true);
            }
        });
    }
    @Override
   public void insertUpdate(DocumentEvent e){
       if (!txtContraseña.getText().equals(null) && !txtContraseña.getText().isEmpty()){ 
            int punteo = verificarContraseña(txtContraseña.getText());
            
            if (punteo >= 0 && punteo <= 25){
                lblNivel.setText("Contraseña muy insegura");
            }
            else if (punteo >= 26 && punteo <= 50){
                lblNivel.setText("Contraseña insegura");
            }
            else if (punteo >= 51 && punteo <= 75){
                lblNivel.setText("Contraseña segura");
            }
            else if (punteo >= 76){
                lblNivel.setText("Contraseña muy segura");
            }                  
        }
        else{
            lblNivel.setText("Ingrese la contraseña");
        }
   }
    public int verificarContraseña(String texto){
        int puntuacion;
        
        if(texto.length() < 6){
            puntuacion = 0;
        }
        else{
            puntuacion = (texto.length() - 6) * 3;                      
            puntuacion = puntuacion + (2 * contarCoincidencias("ABCDEFGHIJKLMNOPQRSTUVWXYZ",texto));            
            int contadorSimbolos = contarCoincidencias("|°¬!#$%&/()=?'¡¿´¨+*~]}{`^[{-_;,:.<> ",texto);            
            int contadorNumeros = contarCoincidencias("1234567890",texto);
            if(contadorNumeros == texto.length()){ //si la contraseña es solo numeros
                puntuacion = 50;
            }            
            else{                
                puntuacion = puntuacion + (contadorNumeros + 5);
                puntuacion = puntuacion + (contadorSimbolos * 5);
                
            }
                              
        }
        return puntuacion;  //retorna cantidad de puntos que obtuvo la contraseña
    }
     public int contarCoincidencias(String texto1,String texto2){
        int contador=0;
        for (int i = 0; i < texto1.length(); i++) {
                for (int j = 0; j < texto2.length(); j++) {
                    if(texto1.charAt(i)==texto2.charAt(j)){
                        contador++;
                    }
                }
            }
        return contador;
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalendarFecha;
    private javax.swing.JButton btnCambiarCorreo;
    private javax.swing.JButton btnCambiarTel;
    private javax.swing.JButton btnCambiarcontraseña;
    private javax.swing.JButton btnCambiarfecha;
    private javax.swing.JButton btnCambiarfoto;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JPanel panelContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtCorreo;
    private javax.swing.JPasswordField txtFoto;
    private javax.swing.JPasswordField txtTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void removeUpdate(DocumentEvent e) {
        insertUpdate(e);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        insertUpdate(e);//To change body of generated methods, choose Tools | Templates.
    }
}
