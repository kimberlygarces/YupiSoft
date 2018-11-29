
package proyecto;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;



public class ventana1 extends javax.swing.JFrame {
    
  clase1 clas = new clase1();
  
    public ventana1() {
        initComponents();
            clase1 clas = new clase1();
            
            
    }

  
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        txtusuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 10)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/logo.jpg"))); // NOI18N
        jLabel1.setText("SAOsoft");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 40));

        jLabel2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 190, -1, -1));

        txtcontraseña.setFont(new java.awt.Font("URW Bookman L", 0, 15)); // NOI18N
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 218, 253, 32));

        txtusuario.setFont(new java.awt.Font("URW Bookman L", 0, 15)); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 143, 253, 32));

        jButton1.setFont(new java.awt.Font("Serif", 2, 15)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 283, 151, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/login.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Found.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        jButton2.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jButton2.setText("salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 336, 111, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
           
            clas.setUsuario(txtusuario.getText());
            clas.setContraseña(txtcontraseña.getText());
            
            if ("kms".equals(clas.getUsuario()) && "12345".equals(clas.getContraseña())) {
            
                this.setVisible(false);
            
            ventana2 ven2 = new ventana2();
            ven2.setVisible(true);
            ven2.setLocationRelativeTo(null); 
            
        } else {
                JOptionPane.showMessageDialog(null, " Ha ingresado el usario o la contraseña erradamente");
                txtusuario.setText("");
                txtcontraseña.setText("");
        }
            
     
                

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButton1.doClick();
        }
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyTyped
        // TODO add your handling code here:
        char cTecla=evt.getKeyChar();
        if(cTecla==KeyEvent.VK_ENTER){
            jButton1.doClick();
        }
        
    }//GEN-LAST:event_txtcontraseñaKeyTyped

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
