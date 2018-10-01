/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author garya
 */
public class OpcionesAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form OpcionesAdministrador
     */
    public OpcionesAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackUp = new javax.swing.JButton();
        BtnIngresarUsuarios = new javax.swing.JButton();
        btnModificarDatos = new javax.swing.JButton();
        btnBuscarUsuarios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btnBackUp.setText("Realizar copia de seguridad");
        btnBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpActionPerformed(evt);
            }
        });

        BtnIngresarUsuarios.setText("Ingresar Usuarios");
        BtnIngresarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarUsuariosActionPerformed(evt);
            }
        });

        btnModificarDatos.setText("Modificar Datos");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });

        btnBuscarUsuarios.setText("Buscar Usuarios");
        btnBuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuariosActionPerformed(evt);
            }
        });

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
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBackUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnIngresarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BtnIngresarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnModificarDatos)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnBackUp)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpActionPerformed
        // TODO add your handling code here:
        javax.swing.JFileChooser Chooser= new javax.swing.JFileChooser();
        Chooser.setSelectedFile(new File("MEIA_Backup.txt"));
        Chooser.setFileFilter(new FileNameExtensionFilter("txt", "txt"));

        File fFile=Chooser.getSelectedFile();
        Chooser.setCurrentDirectory(new File("MEIA_Backup.txt"));
        Chooser.setSelectedFile (fFile);
        String ruta = ""; 
       try{ 
        if(Chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){ 
        ruta = Chooser.getSelectedFile().getAbsolutePath(); 
       String contenidoUsuario= Lector.Obtener("C:\\MEIA\\usuario.txt");
       contenidoUsuario+=Lector.Obtener("C:\\MEIA\\Bitacora_Usuario.txt");
      
        Escritor.Escribir(ruta,contenidoUsuario);
        Date fecha=new Date();
        File bitacora=new File("C:\\MEIA\\desc_bitacora_backup.txt");
        DescriptorBitacoraBackup descriptor=new DescriptorBitacoraBackup();
        if(!bitacora.exists()){
            Date fechaActual=new Date();
            descriptor.setFechaCreacion(fechaActual.toString());
            descriptor.setUsuarioCreacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            descriptor.setNombre("bitacora_backup");
            descriptor.setNumRegistros(1);
            Escritor.Escribir("C:\\MEIA\\desc_bitacora_backup.txt", descriptor.toString());
        }
        else{
            DescriptorBitacoraBackup desc=OperacionesSecuencial.obtenerDescriptorBB();
            Date fechaAct=new Date();
            desc.setFechaModificacion(fechaAct.toString());
            desc.setUsuarioModificacion(ProyectoMEIA.usuarioEnUso.getUsuario());
            desc.setNumRegistros(desc.getNumRegistros()+1);
            Escritor.Escribir("C:\\MEIA\\desc_bitacora_backup.txt", desc.toString());
        }
        AgregarBitacora(new BitacoraBackup(ruta,ProyectoMEIA.usuarioEnUso.getUsuario(),fecha.toString()));
} 
}catch (HeadlessException ex){ 
} 
    }//GEN-LAST:event_btnBackUpActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
         LogIn ventana=null;
            try {
                ventana = new LogIn();
            } catch (IOException ex) {
                Logger.getLogger(OpcionesUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            ventana.show();
            dispose(); 
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnIngresarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarUsuariosActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            RegistroUsuario registro = new RegistroUsuario(false);
            registro.setVisible(true);
            this.setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnIngresarUsuariosActionPerformed

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        // TODO add your handling code here:
          OpcionesUsuario registro = new OpcionesUsuario();
                        registro.setVisible(true);
                        this.setVisible(false);
    }//GEN-LAST:event_btnModificarDatosActionPerformed

    private void btnBuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuariosActionPerformed
        // TODO add your handling code here:
          BuscarUsuarios registro = new BuscarUsuarios();
                        registro.setVisible(true);
                        this.setVisible(false);
    }//GEN-LAST:event_btnBuscarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesAdministrador().setVisible(true);
            }
        });
    }
        public void AgregarBitacora(BitacoraBackup datosBitacora){
        File ArchivoBitacora=new File("C:\\MEIA\\bitacora_backup.txt");
        if(!ArchivoBitacora.exists()){
            Escritor.Escribir("C:\\MEIA\\bitacora_backup.txt", datosBitacora.toString());
            
        }else{
            String contenidoExistente=Lector.Obtener("C:\\MEIA\\bitacora_backup.txt");
            contenidoExistente+=datosBitacora.toString();
            Escritor.Escribir("C:\\MEIA\\bitacora_backup.txt", contenidoExistente);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresarUsuarios;
    private javax.swing.JButton btnBackUp;
    private javax.swing.JButton btnBuscarUsuarios;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
