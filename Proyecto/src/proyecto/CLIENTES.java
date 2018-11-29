
package proyecto;
import com.sun.glass.events.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CLIENTES extends javax.swing.JFrame {
    

    
    public CLIENTES() {
        
        initComponents();
        mostrardatos("");
    }

    
    
    
    
    void mostrardatos(String valor){
            DefaultTableModel modelo= new DefaultTableModel();
         modelo.addColumn("COD_CLIENTE");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("e-mail");
        jTable1.setModel(modelo);
        String sql ="";
        if(valor.equals(""))
        {
            sql="SELECT * FROM clientes";
        }
        else{
            sql="SELECT * FROM clientes WHERE Ccodigo='"+valor+"'";
        }
 
            String []datos = new String [5];
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        datos[0]=rs.getString(1);
                        datos[1]=rs.getString(2);
                        datos[2]=rs.getString(3);
                        datos[3]=rs.getString(4);
                        datos[4]=rs.getString(5);
                        modelo.addRow(datos);
                    }
                        jTable1.setModel(modelo);
                } catch (SQLException ex) {
                    Logger.getLogger( CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TNombreC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TDireC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TTelC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TEmailC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        TbuscarC = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("TlwgTypewriter", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/regresar_opt.jpg"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 170, 40));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        jLabel2.setText("Dirección");

        jLabel3.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        jLabel3.setText("Nombre: ");

        jLabel6.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        jLabel7.setText("Telefono:");

        TTelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTelCActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        jLabel8.setText("E-mail");

        TEmailC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TEmailCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(TEmailC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(TCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TDireC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(TTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TNombreC)))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TDireC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 640, 150));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TbuscarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TbuscarCKeyTyped(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButton3.setText("Buscar cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(TbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TbuscarC))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 319, 640, 80));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 950, 140));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/15435.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 250, 330));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/234.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 240, 340));

        jButton4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButton4.setText("Mostrar datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 147, 44));

        jButton2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButton2.setText("actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 143, 44));

        Guardar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Tips.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 202, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/B86.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            this.setVisible(false);
             ventana2 ven2 = new ventana2();
            ven2.setVisible(true);
            ven2.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TTelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTelCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTelCActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
          try{
          PreparedStatement s=cn.prepareStatement("INSERT INTO clientes(Ccodigo,Cnombre,Ctelefono,Cdireccion,Cmail) VALUES(?,?,?,?,?)")  ;
          s.setString(1,TCodigo.getText());
          s.setString(2,TNombreC.getText());
          s.setString(3,TTelC.getText());
          s.setString(4,TDireC.getText());
          s.setString(5, TEmailC.getText());
          s.executeUpdate();
          mostrardatos("");
          JOptionPane.showMessageDialog(this, "Informacion Almacenada");
          TCodigo.setText("");
          TNombreC.setText("");
          TTelC.setText("");
          TDireC.setText("");
          TEmailC.setText("");
          

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void TEmailCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEmailCKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            Guardar.doClick();
        }
    }//GEN-LAST:event_TEmailCKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostrardatos(TbuscarC.getText());
        if(! "clientes FROM Ccodigo".equals(TbuscarC.getText()) ){
            JOptionPane.showMessageDialog(null,"El cliente no está registrado! ");
            mostrardatos("");
            TbuscarC.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"El cliente está registrado! ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TbuscarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbuscarCKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButton3.doClick();
        }
    }//GEN-LAST:event_TbuscarCKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila= jTable1.getSelectedRow();
    if(fila>=0){
        TCodigo.setText(jTable1.getValueAt(fila, 0).toString());
        TNombreC.setText(jTable1.getValueAt(fila, 1).toString());
        TDireC.setText(jTable1.getValueAt(fila, 2).toString());
        TTelC.setText(jTable1.getValueAt(fila, 3).toString());
        TEmailC.setText(jTable1.getValueAt(fila, 4).toString());
    }
    else{
    JOptionPane.showMessageDialog(null,"no seleciono fila");
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE clientes SET Cnombre='"+TNombreC.getText()+"',Ctelefono='"+TTelC.getText()+"',Cdireccion='"+TDireC.getText()+"',Cmail='"+TEmailC.getText()+"' WHERE Ccodigo='"+TCodigo.getText()+"'");
        pst.executeUpdate();
        mostrardatos("");
        TCodigo.setText("");
        TNombreC.setText("");
        TDireC.setText("");
        TTelC.setText("");
        TEmailC.setText("");
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int confirmado = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar El Archivo?");
        if (JOptionPane.OK_OPTION == confirmado){
            int fila = jTable1.getSelectedRow();
            String cod="";
            cod=jTable1.getValueAt(fila, 0).toString();
    
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM clientes WHERE  Ccodigo='"+cod+"'");
                pst.executeUpdate();
                mostrardatos("");
            } catch (Exception e) {
         }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLIENTES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField TCodigo;
    private javax.swing.JTextField TDireC;
    private javax.swing.JTextField TEmailC;
    private javax.swing.JTextField TNombreC;
    private javax.swing.JTextField TTelC;
    private javax.swing.JTextField TbuscarC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    conectar cc= new conectar();
    Connection cn= cc.conexion();
}
