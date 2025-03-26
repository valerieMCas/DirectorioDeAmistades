/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.directorioDeAmistades.views;

import autonoma.directorioDeAmistades.moldels.Amigo;
import autonoma.directorioDeAmistades.moldels.Directorio;
import autonoma.directorioDeAmistades.moldels.Persona;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Directorio directorio;
    private ArrayList<Amigo> amigos;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Directorio directorio) { 
        
        initComponents();
        this.setLocationRelativeTo(null);
        try{
           this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/DirectorioDeAmistades/images/-Directorio logo principal.png")).getImage());
        }catch(Exception e){
            
        }
        this.directorio=directorio;
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
        lblCalculadora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonAgregarAmigo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonBuscarAmigo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonMostrarDirectorio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BotonInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        lblCalculadora.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        lblCalculadora.setText("Directorio");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BotonAgregarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonAgregarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonAgregarAmigoMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directorioDeAmistades/images/agregar-carpeta.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Agregar Amigo");

        javax.swing.GroupLayout BotonAgregarAmigoLayout = new javax.swing.GroupLayout(BotonAgregarAmigo);
        BotonAgregarAmigo.setLayout(BotonAgregarAmigoLayout);
        BotonAgregarAmigoLayout.setHorizontalGroup(
            BotonAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonAgregarAmigoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(BotonAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        BotonAgregarAmigoLayout.setVerticalGroup(
            BotonAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonAgregarAmigoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        BotonBuscarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        BotonBuscarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBuscarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBuscarAmigoMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directorioDeAmistades/images/iconBuscar.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Buscar amigo");

        javax.swing.GroupLayout BotonBuscarAmigoLayout = new javax.swing.GroupLayout(BotonBuscarAmigo);
        BotonBuscarAmigo.setLayout(BotonBuscarAmigoLayout);
        BotonBuscarAmigoLayout.setHorizontalGroup(
            BotonBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonBuscarAmigoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(BotonBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BotonBuscarAmigoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18))
        );
        BotonBuscarAmigoLayout.setVerticalGroup(
            BotonBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonBuscarAmigoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        BotonMostrarDirectorio.setBackground(new java.awt.Color(255, 255, 255));
        BotonMostrarDirectorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMostrarDirectorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMostrarDirectorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMostrarDirectorioMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directorioDeAmistades/images/Directorio.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("Mostrar Directorio");

        javax.swing.GroupLayout BotonMostrarDirectorioLayout = new javax.swing.GroupLayout(BotonMostrarDirectorio);
        BotonMostrarDirectorio.setLayout(BotonMostrarDirectorioLayout);
        BotonMostrarDirectorioLayout.setHorizontalGroup(
            BotonMostrarDirectorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonMostrarDirectorioLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(BotonMostrarDirectorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        BotonMostrarDirectorioLayout.setVerticalGroup(
            BotonMostrarDirectorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonMostrarDirectorioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        BotonSalir.setBackground(new java.awt.Color(255, 255, 255));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directorioDeAmistades/images/icons8-salida-de-incendios-80.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(0, 255, 0));
        jLabel10.setText("Salir");

        javax.swing.GroupLayout BotonSalirLayout = new javax.swing.GroupLayout(BotonSalir);
        BotonSalir.setLayout(BotonSalirLayout);
        BotonSalirLayout.setHorizontalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonSalirLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(BotonSalirLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonSalirLayout.setVerticalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonSalirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        BotonInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonInfo.setText("Informacion");
        BotonInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInfoMouseClicked(evt);
            }
        });
        BotonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BotonAgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(BotonBuscarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BotonMostrarDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMostrarDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonInfo)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(lblCalculadora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCalculadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarAmigoMouseClicked
        AgregarAmigo agregar = new AgregarAmigo(this, true, this.directorio, this);
        agregar.setVisible(true);
    }//GEN-LAST:event_BotonAgregarAmigoMouseClicked

    private void BotonAgregarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarAmigoMouseEntered
        this.mouseEntered(BotonAgregarAmigo);
    }//GEN-LAST:event_BotonAgregarAmigoMouseEntered

    private void BotonAgregarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarAmigoMouseExited
        this.mouseExited(BotonAgregarAmigo);
    }//GEN-LAST:event_BotonAgregarAmigoMouseExited

    private void BotonBuscarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarAmigoMouseClicked
        BuscarAmigo buscar = new BuscarAmigo(this, true, this.directorio, this);
        buscar.setVisible(true);
    }//GEN-LAST:event_BotonBuscarAmigoMouseClicked

    private void BotonBuscarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarAmigoMouseEntered
        this.mouseEntered(BotonBuscarAmigo);
    }//GEN-LAST:event_BotonBuscarAmigoMouseEntered

    private void BotonBuscarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarAmigoMouseExited
        this.mouseExited(BotonBuscarAmigo);
    }//GEN-LAST:event_BotonBuscarAmigoMouseExited

    private void BotonMostrarDirectorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMostrarDirectorioMouseClicked
        MostrarAmigos mostrar = new MostrarAmigos(this, true, this.directorio);
        mostrar.setVisible(true);
        
    }//GEN-LAST:event_BotonMostrarDirectorioMouseClicked

    private void BotonMostrarDirectorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMostrarDirectorioMouseEntered
        this.mouseEntered(BotonMostrarDirectorio);
    }//GEN-LAST:event_BotonMostrarDirectorioMouseEntered

    private void BotonMostrarDirectorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMostrarDirectorioMouseExited
        this.mouseExited(BotonMostrarDirectorio);
    }//GEN-LAST:event_BotonMostrarDirectorioMouseExited

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        JOptionPane.showMessageDialog(this, "Saliendo...");
        this.dispose();
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        this.mouseEntered(BotonSalir);
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        this.mouseExited(BotonSalir);
    }//GEN-LAST:event_BotonSalirMouseExited

    private void BotonInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInfoMouseClicked
        JOptionPane.showMessageDialog(this, "INFORMACION:\n" +
"	\n" +
"	-Taller:\n" +
"	*Directorio de amistades.\n" +
"\n" +
"	-Asignatura:\n" +
"	*Programacion orientada a objetos(POO).\n" +
"\n" +
"	-Universidad:\n" +
"	*Universidad Autonoma de Manizales(UAM).\n" +
"\n" +
"	-Desarrolladores:\n" +
"	* Valerie Moreno\n" +
"	* Martin Taborda Aristizabal.");
    }//GEN-LAST:event_BotonInfoMouseClicked

    private void BotonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInfoActionPerformed

    }//GEN-LAST:event_BotonInfoActionPerformed

    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(223,220,220));
    }
    
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonAgregarAmigo;
    private javax.swing.JPanel BotonBuscarAmigo;
    private javax.swing.JButton BotonInfo;
    private javax.swing.JPanel BotonMostrarDirectorio;
    private javax.swing.JPanel BotonSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCalculadora;
    // End of variables declaration//GEN-END:variables
}
