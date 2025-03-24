/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.directorioDeAmistades.views;

import autonoma.directorioDeAmistades.moldels.Directorio;
import autonoma.directorioDeAmistades.moldels.Persona;
import autonoma.manejoexcepciones.exceptions.MismoAmigoException;
import autonoma.manejoexcepciones.exceptions.ValidarCamposLlenosException;
import autonoma.manejoexcepciones.exceptions.VerificacionTelefonoException;
import autonoma.manejoexcepciones.exceptions.VerificaionCorreoException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class AgregarAmigo extends javax.swing.JDialog {
    private Directorio directorio;
    private VentanaPrincipal ventana;
    /**
     * Creates new form AgregarAmigo
     */
    public AgregarAmigo(java.awt.Frame parent, boolean modal, Directorio directorio, VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        try{
           this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/DirectorioDeAmistades/images/-Directorio logo principal.png")).getImage());
        }catch(Exception e){
            
        }
        this.directorio = directorio;
        this.ventana = ventana;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CorreoEletronico = new javax.swing.JTextField();
        NombreAmigo1 = new javax.swing.JTextField();
        TelefonoAmigo1 = new javax.swing.JTextField();
        AgregarAmigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Agregar Informacion de amigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Telefono:");

        CorreoEletronico.setBackground(new java.awt.Color(204, 255, 255));
        CorreoEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoEletronicoActionPerformed(evt);
            }
        });

        NombreAmigo1.setBackground(new java.awt.Color(204, 255, 255));
        NombreAmigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAmigo1ActionPerformed(evt);
            }
        });

        TelefonoAmigo1.setBackground(new java.awt.Color(204, 255, 255));
        TelefonoAmigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoAmigo1ActionPerformed(evt);
            }
        });

        AgregarAmigo.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        AgregarAmigo.setText("AgregarAmigo");
        AgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAmigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CorreoEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TelefonoAmigo1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NombreAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(AgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CorreoEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarAmigo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorreoEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoEletronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoEletronicoActionPerformed

    private void NombreAmigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAmigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAmigo1ActionPerformed

    private void TelefonoAmigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoAmigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoAmigo1ActionPerformed

    private void AgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAmigoActionPerformed
        String nombre = this.NombreAmigo1.getText();
        String telefono = this.TelefonoAmigo1.getText().trim();
        try{
            Integer.parseInt(telefono);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El dato telfono ingresado solo debe tener numeros");
            this.TelefonoAmigo1.setText(" ");
        }
        String correo = this.CorreoEletronico.getText();
        Persona persona= new Persona(nombre, telefono, correo);
        try{
            this.directorio.agregarAmigo(persona);
            JOptionPane.showMessageDialog(this, "El amigo fue agregado exitosamente!!!");
        }catch(ValidarCamposLlenosException e){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
        }catch(VerificacionTelefonoException e){
            JOptionPane.showMessageDialog(this, "Los telefonos deben colmenzar por 606 y 30");
            this.TelefonoAmigo1.setText(" ");
        }catch(VerificaionCorreoException e){
            JOptionPane.showMessageDialog(this, "El correo debe contener el @");
            this.CorreoEletronico.setText(" ");
        }catch(MismoAmigoException e){
            JOptionPane.showMessageDialog(this, "La persona ya esta agreganda");
            this.CorreoEletronico.setText(" ");
        }
        
        
        
    }//GEN-LAST:event_AgregarAmigoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAmigo;
    private javax.swing.JTextField CorreoEletronico;
    private javax.swing.JTextField NombreAmigo1;
    private javax.swing.JTextField TelefonoAmigo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
