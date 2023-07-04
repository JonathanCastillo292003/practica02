/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.java.practica02mvc.vista.cancion;

import ec.edu.ups.java.practica02mvc.controlador.ControladorCantante;
import ec.edu.ups.java.practica02mvc.controlador.ControladorCompositor;
import ec.edu.ups.java.practica02mvc.modelo.Cancion;
import ec.edu.ups.java.practica02mvc.modelo.Cantante;
import ec.edu.ups.java.practica02mvc.modelo.Compositor;
import ec.edu.ups.java.practica02mvc.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class VentanaCrearCancion extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCantante;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaCrearCancion
     */
    public VentanaCrearCancion(ControladorCompositor controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel4.setText(mensajes.getString("txtCodigo"));
        jLabel5.setText(mensajes.getString("txtTitulo"));
        jLabel2.setText(mensajes.getString("txtLetra"));        
        jLabel6.setText(mensajes.getString("txtTiempoEnMinutos1"));
        jLabel7.setText(mensajes.getString("txxtCodigoCantante1"));
        jLabel3.setText(mensajes.getString("txtNombreCantante"));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        txtNombreCantante = new javax.swing.JTextField();
        txtTiempoEnMinutos1 = new javax.swing.JTextField();
        txxtCodigoCantante1 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        Pantalla = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Cancion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear cancion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 130, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 64, 104, 41));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Titulo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 117, 104, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Letra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 170, 104, 41));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 210, 41));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tiempo en minutos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 229, 139, 41));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese el codigo del autor:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 41));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 74, 305, -1));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 117, 305, -1));
        jPanel1.add(txtLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 305, -1));

        txtNombreCantante.setEditable(false);
        jPanel1.add(txtNombreCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 310, -1));
        jPanel1.add(txtTiempoEnMinutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 239, 310, -1));
        jPanel1.add(txxtCodigoCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 310, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, 34));

        btnAceptar1.setText("Aceptar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, 34));

        Pantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/java/practica02mvc/vistaPrincipal/WhatsApp Image 2023-06-22 at 9.51.11 AM.jpeg"))); // NOI18N
        Pantalla.setText("jLabel10");
        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        String nombre = txtTitulo.getText();
        String letra = txtLetra.getText();
        int codigo = Integer.parseInt(txtCodigo.getText());
        double tiempo = (double) Integer.parseInt(txtNombreCantante.getText());

        Cancion cancion = new Cancion();
        cancion.setCodigo(codigo);
        cancion.setLetra(letra);
        cancion.setTiempoEnMinutos(tiempo);
        cancion.setTitulo(nombre);
         String codigation = txxtCodigoCantante1.getText();

        Compositor compositor = controladorCantante.buscar(codigation);
        compositor.AgregarCancion(cancion);
        controladorCantante.update(compositor);
        JOptionPane.showMessageDialog(this, "Cancion Añadido");
        limpiarCampos();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void limpiarCampos() {
        this.txtCodigo.setText("");

        this.txtLetra.setText("");
        this.txtNombreCantante.setText("");
        this.txtTiempoEnMinutos1.setText("");
        this.txxtCodigoCantante1.setText("");
        this.txtTitulo.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pantalla;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNombreCantante;
    private javax.swing.JTextField txtTiempoEnMinutos1;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txxtCodigoCantante1;
    // End of variables declaration//GEN-END:variables
}
