/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luise
 */
public class ManejoUsuariosEnListas extends javax.swing.JFrame {

    /**
     * Creates new form ManejoUsuariosEnListas
     */
    public ManejoUsuariosEnListas() throws IOException {        
        initComponents();        
        LlenarComboboxUsuario();                
        
        if(ProyectoMEIA.usuarioEnUso.getRol() == 1){
            cmbUsuario.setEnabled(true);
            cmbUsuario1.setEnabled(true);
        }else{
            cmbUsuario.setEnabled(false);
            cmbUsuario1.setEnabled(false);
            cmbUsuario.setSelectedItem(ProyectoMEIA.usuarioEnUso.getUsuario());
            cmbUsuario1.setSelectedItem(ProyectoMEIA.usuarioEnUso.getUsuario());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmbUsuario = new javax.swing.JComboBox<>();
        cmbLista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbUsuarioAsociado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnAsociarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtUsuarioBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListasAsociadas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstListasCreadas = new javax.swing.JList<>();
        lblNombreUsuario = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cmbUsuario1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbLista1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbUsuarioAsociado1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnDesasociarUsuario = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el usuario");

        jLabel2.setText("Seleccione la lista");

        jLabel3.setText("Seleccione el usuario que desea asociar");

        btnAsociarUsuario.setText("Asociar usuario");
        btnAsociarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsociarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbUsuarioAsociado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(btnAsociarUsuario))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsuarioAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(btnAsociarUsuario)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar un usuario", jPanel1);

        jLabel7.setText("Ingrese el nombre del usuario que desea buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre de usuario:");

        jLabel9.setText("Asociado a:");

        jLabel10.setText("Listas creadas:");

        jScrollPane1.setViewportView(lstListasAsociadas);

        jScrollPane2.setViewportView(lstListasCreadas);

        lblNombreUsuario.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblNombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar un usuario", jPanel2);

        cmbUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuario1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione el usuario");

        cmbLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLista1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione la lista");

        jLabel6.setText("Seleccione el usuario que desea eliminar");

        btnDesasociarUsuario.setText("Eliminar usuario");
        btnDesasociarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesasociarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbUsuarioAsociado1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLista1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(btnDesasociarUsuario))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsuarioAsociado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(btnDesasociarUsuario)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar un usuario", jPanel5);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        if(ProyectoMEIA.usuarioEnUso.getRol() == 1){
            OpcionesAdministrador opcionesAdministrador = new OpcionesAdministrador();
            opcionesAdministrador.setVisible(true);
            this.setVisible(false);
        }
        else{
            OpcionesUsuario opcionesUsuario = new OpcionesUsuario();
            opcionesUsuario.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAsociarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarUsuarioActionPerformed
        // TODO add your handling code here:
        if(!cmbUsuario.getSelectedItem().toString().isEmpty() && !cmbLista.getSelectedItem().toString().isEmpty()
            && !cmbUsuarioAsociado.getSelectedItem().toString().isEmpty()){
            try{
                Lista lista = null;
                Usuario usuario = null, usuarioAsociado = null;            
                
                lista = Lista_Usuario.EncontrarLista(cmbLista.getSelectedItem().toString(), cmbUsuario.getSelectedItem().toString());            
            
                usuario = Lista_Usuario.buscarUsuario(cmbUsuario.getSelectedItem().toString());            
            
                usuarioAsociado = Lista_Usuario.buscarUsuario(cmbUsuarioAsociado.getSelectedItem().toString());                                            
                        
                Lista_Usuario.AsociarNuevoUsuario(lista, usuario, usuarioAsociado);            
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al asociar usuario");
            }           
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar el usuario, lista y usuario asociado");
        }
    }//GEN-LAST:event_btnAsociarUsuarioActionPerformed

    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
        try {
            // TODO add your handling code here:
            LlenarComboboxLista();
        } catch (IOException ex) {
            Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void cmbUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuario1ActionPerformed
        try {
            // TODO add your handling code here:
            LlenarComboboxLista1();
        } catch (IOException ex) {
            Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbUsuario1ActionPerformed

    private void btnDesasociarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesasociarUsuarioActionPerformed
        // TODO add your handling code here:
        if(!cmbUsuario1.getSelectedItem().toString().isEmpty() && !cmbLista1.getSelectedItem().toString().isEmpty()
            && !cmbUsuarioAsociado1.getSelectedItem().toString().isEmpty()){
            
            if(Lista_Usuario.obtenerDescriptorIndice().getRegistrosActivos()!= 0){
                try{
                    Lista lista = null;
                    Usuario usuario = null, usuarioAsociado = null;                
                    
                    lista = Lista_Usuario.EncontrarLista(cmbLista1.getSelectedItem().toString(), cmbUsuario1.getSelectedItem().toString());                
                
                    usuario = Lista_Usuario.buscarUsuario(cmbUsuario1.getSelectedItem().toString());                
                
                    usuarioAsociado = Lista_Usuario.buscarUsuario(cmbUsuarioAsociado1.getSelectedItem().toString());                
                
                    Lista_Usuario.EliminarUsuario(lista, usuario, usuarioAsociado);                
                    
                }catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Error al eliminar usuario de la lista");
                }                
            }
            else{
                JOptionPane.showMessageDialog(null, "No hay usuarios asociados");
            }           
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar el usuario, lista y usuario asociado");
        }
    }//GEN-LAST:event_btnDesasociarUsuarioActionPerformed

    private void cmbLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLista1ActionPerformed
        
            // TODO add your handling code here:
            //LlenarComboboxUsuarioAsociado1();        
    }//GEN-LAST:event_cmbLista1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(!txtUsuarioBuscar.getText().toString().isEmpty()){
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de usuario");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManejoUsuariosEnListas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void LlenarComboboxUsuario() throws IOException{
        cmbUsuario.removeAllItems();                
        cmbUsuarioAsociado.removeAllItems();        
        cmbUsuario1.removeAllItems();                
        cmbUsuarioAsociado1.removeAllItems(); 
        
        OperacionesSecuencial.LlenarUsuariosMaestro();
        
        LinkedList<Usuario> usuarios = OperacionesSecuencial.obtenerUsuarios(2);
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getEstatus() != 0){
                cmbUsuario.addItem(usuarios.get(i).getUsuario());
                cmbUsuarioAsociado.addItem(usuarios.get(i).getUsuario());
                cmbUsuario1.addItem(usuarios.get(i).getUsuario());            
                cmbUsuarioAsociado1.addItem(usuarios.get(i).getUsuario());
            }            
        }                                
    }        
    
    public void LlenarComboboxLista() throws IOException{
        cmbLista.removeAllItems();
        SecuencialLista.LlenarListasMaestro();
        
        LinkedList<Lista> listas = SecuencialLista.obtenerListas(2);        
        for (int i = 0; i < listas.size(); i++) {
            if(listas.get(i).getUsuario().equals(cmbUsuario.getSelectedItem().toString()) && listas.get(i).getEstatus() != 0){
                cmbLista.addItem(listas.get(i).getNombreLista());
            }
        }
    }        
    
    public void LlenarComboboxLista1() throws IOException{
        cmbLista1.removeAllItems();
        SecuencialLista.LlenarListasMaestro();
        
        LinkedList<Lista> listas = SecuencialLista.obtenerListas(2);        
        for (int i = 0; i < listas.size(); i++) {
            if(listas.get(i).getUsuario().equals(cmbUsuario1.getSelectedItem().toString()) && listas.get(i).getEstatus() != 0){
                cmbLista1.addItem(listas.get(i).getNombreLista());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsociarUsuario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesasociarUsuario;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbLista;
    private javax.swing.JComboBox<String> cmbLista1;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JComboBox<String> cmbUsuario1;
    private javax.swing.JComboBox<String> cmbUsuarioAsociado;
    private javax.swing.JComboBox<String> cmbUsuarioAsociado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JList<String> lstListasAsociadas;
    private javax.swing.JList<String> lstListasCreadas;
    private javax.swing.JTextField txtUsuarioBuscar;
    // End of variables declaration//GEN-END:variables
}

