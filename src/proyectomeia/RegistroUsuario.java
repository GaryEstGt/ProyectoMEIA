/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.File;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author garya
 */
public class RegistroUsuario extends javax.swing.JFrame implements DocumentListener {
    public static int usuariosIngresados=0;
    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() throws ParseException {
        initComponents();
        txtUsuario.setDocument(new LimitarCaracteres(20));        
        txtApellido.setDocument(new LimitarCaracteres(30));
        txtContraseña1.setDocument(new LimitarCaracteres(40));
        txtContraseña1.getDocument().addDocumentListener(this);
        txtCorreo.setDocument(new LimitarCaracteres(40));
        txtNombre.setDocument(new LimitarCaracteres(30)); 
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

        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSeleccionarfoto = new javax.swing.JButton();
        btnRegitrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPathfoto = new javax.swing.JTextField();
        lblNivelContraseña = new javax.swing.JLabel();
        txtCalendar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("Telefono");

        jLabel7.setText("Correo Alterno");

        jLabel8.setText("Fotografía");

        btnSeleccionarfoto.setText("Seleccionar");
        btnSeleccionarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarfotoActionPerformed(evt);
            }
        });

        btnRegitrar.setText("Registrarse");
        btnRegitrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegitrarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Registro de Usuario");

        txtPathfoto.setEditable(false);

        lblNivelContraseña.setText("Ingrese la contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblNivelContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtApellido)
                                    .addComponent(txtContraseña1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPathfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSeleccionarfoto))
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnRegitrar)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(330, 330, 330))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNivelContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeleccionarfoto)
                            .addComponent(txtPathfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegitrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarfotoActionPerformed
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

                
            txtPathfoto.setText(rutaArchivo);            
        }

    }//GEN-LAST:event_btnSeleccionarfotoActionPerformed

    private void btnRegitrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegitrarActionPerformed
        // TODO add your handling code here:
        if(VerificarCampos()){
            if(!lblNivelContraseña.getText().equals("Contraseña muy insegura")){
                Usuario usuario = new proyectomeia.Usuario(txtUsuario.getText(), txtNombre.getText(), txtApellido.getText(), txtContraseña1.getText()
                , txtCalendar.getDate().toString(),txtCorreo.getText(), txtPathfoto.getText(), Integer.parseInt(txtTelefono.getText()), 1);

                if(OperacionesSecuencial.obtenerDescriptorUsuario(1).getNumRegistros()!=0){
                    if(!VerSiExisteUsuario(usuario)){
                    //Escribir en el archivo
                    String textoAnterior=Lector.Obtener("C:/MEIA/bitacora_usuario.txt");
                    usuario.setRol(0);
               
                    Escritor.Escribir("C:/MEIA/bitacora_usuario.txt", textoAnterior+usuario.toString());               
                    }
                else{
                    //cambiar despriptor
                }
                }else{
                    usuario.setRol(1);
                    Escritor.Escribir("C:/MEIA/bitacora_usuario.txt",usuario.toString());
                    //cambiard descriptor
                }                
            }
            else{
                JOptionPane.showMessageDialog(null,"Debe mejorar la seguridad de su contraseña");
            }            
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }                
    }//GEN-LAST:event_btnRegitrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistroUsuario().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    boolean VerSiExisteUsuario(Usuario us){
        try{
            LinkedList<Usuario> usuarios = OperacionesSecuencial.obtenerUsuarios(1);
            for (int i = 0; i < usuarios.size(); i++) {
                if(us.getUsuario().equals(usuarios.get(i))){
                    return true;
                }
            }
            
            usuarios = OperacionesSecuencial.obtenerUsuarios(2);
            for (int i = 0; i < usuarios.size(); i++) {
                if(us.getUsuario().equals(usuarios.get(i))){
                    return true;
                }
            }
            
            return false;
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Error al leer el archivo");
            return true;
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegitrar;
    private javax.swing.JButton btnSeleccionarfoto;
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
    private javax.swing.JLabel lblNivelContraseña;
    private javax.swing.JTextField txtApellido;
    private com.toedter.calendar.JDateChooser txtCalendar;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPathfoto;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (!txtContraseña1.getText().equals(null) && !txtContraseña1.getText().isEmpty()){ 
            int punteo = verificarContraseña(txtContraseña1.getText());
            
            if (punteo >= 0 && punteo <= 25){
                lblNivelContraseña.setText("Contraseña muy insegura");
            }
            else if (punteo >= 26 && punteo <= 50){
                lblNivelContraseña.setText("Contraseña insegura");
            }
            else if (punteo >= 51 && punteo <= 75){
                lblNivelContraseña.setText("Contraseña segura");
            }
            else if (punteo >= 76){
                lblNivelContraseña.setText("Contraseña muy segura");
            }                  
        }
        else{
            lblNivelContraseña.setText("Ingrese la contraseña");
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

    @Override
    public void removeUpdate(DocumentEvent e) {
        insertUpdate(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {                
        insertUpdate(e);
    }   
    
    public boolean VerificarCampos(){
        if(txtUsuario.getText().isEmpty())
            return false;
        if(txtNombre.getText().isEmpty())
            return false;
        if(txtApellido.getText().isEmpty())
            return false;
        if(txtContraseña1.getText().isEmpty())
            return false;
        if(txtCalendar.getDate().toString().isEmpty())
            return false;
        if(txtCorreo.getText().isEmpty())
            return false;
        if(txtTelefono.getText().isEmpty())
            return false;
        if(txtPathfoto.getText().isEmpty())
            return false;
        
        return true;
    }
}
