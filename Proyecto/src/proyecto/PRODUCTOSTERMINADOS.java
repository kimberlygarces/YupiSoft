
package proyecto;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PRODUCTOSTERMINADOS extends javax.swing.JFrame {
    String url="jdbc:mysql://localhost:3306/saosoft";
    String driver="com.mysql.jdbc.Driver";
    
   
    public PRODUCTOSTERMINADOS() {
        initComponents();
        mostrardatos("");
        try{
            Class.forName(driver);
            cn=DriverManager.getConnection(url, "root", "");

        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
     void mostrardatos(String valor){
            DefaultTableModel modelo= new DefaultTableModel();
         modelo.addColumn("COD_PRODUCTO");
        modelo.addColumn("NOMBRE_PRODUCTO");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("TOTAL");
        modelo.addColumn("CARACTERISTICAS");
        jTable1.setModel(modelo);
        String sql ="";
        if(valor.equals(""))
        {
            sql="SELECT * FROM Pterminados";
        }
        else{
            sql="SELECT * FROM Pterminados WHERE CPterminado='"+valor+"'";
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
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        txContenido = new javax.swing.JTextField();
        txNombre = new javax.swing.JTextField();
        txTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txCaracteristicas = new javax.swing.JTextField();
        Cantidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("TlwgTypewriter", 3, 18)); // NOI18N
        jLabel6.setText("Codigo del producto");

        jLabel7.setFont(new java.awt.Font("TlwgTypewriter", 3, 18)); // NOI18N
        jLabel7.setText("Contenido Neto");

        jLabel8.setFont(new java.awt.Font("TlwgTypewriter", 3, 18)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("TlwgTypewriter", 3, 18)); // NOI18N
        jLabel9.setText("Total Productos");

        txContenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txContenidoKeyTyped(evt);
            }
        });

        txNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNombreActionPerformed(evt);
            }
        });

        txTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txTotalKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("TlwgTypewriter", 3, 18)); // NOI18N
        jLabel10.setText("Caracteristicas");

        txCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCaracteristicasActionPerformed(evt);
            }
        });

        Cantidad.setBackground(new java.awt.Color(240, 240, 255));
        Cantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ml", "l", "gr", "kg", " " }));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9)
                                .addGap(48, 48, 48)
                                .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txCaracteristicas)
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 840, 150));

        jLabel1.setFont(new java.awt.Font("TlwgTypewriter", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("PRODUCTOS TERMINADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 298, -1, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 850, 140));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/regresar_opt.jpg"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 160, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Tips.png"))); // NOI18N
        jButton5.setText("Registar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 130, 37));

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 31));

        jButton3.setText("Mostrar Datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, 31));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/B86.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 970, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCaracteristicasActionPerformed

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButton2.doClick();
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void txNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNombreActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
          PreparedStatement s=cn.prepareStatement("INSERT INTO pterminados(CPterminado,Pterminado,Contenido,Total,Caracteristicas) VALUES(?,?,?,?,?)")  ;
          s.setString(1,txCodigo.getText());
          s.setString(2,txNombre.getText());
          s.setString(3,txContenido.getText());
          s.setString(4,txTotal.getText());
          s.setString(5, txCaracteristicas.getText());
          s.executeUpdate();
          mostrardatos("");
          JOptionPane.showMessageDialog(this, "Informacion Almacenada");
          txCodigo.setText("");
          txNombre.setText("");
          txContenido.setText("");
          txTotal.setText("");
          txCaracteristicas.setText("");
          

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE pterminados SET Pterminado='"+txNombre.getText()+"',Contenido='"+txContenido.getText()+"',Contenido='"+txContenido.getText()+"',Totalp='"+txTotal.getText()+"' WHERE CPterminado='"+txCodigo.getText()+"'");
        pst.executeUpdate();
        mostrardatos("");
        } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int confirmado = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar El Archivo?");
        if (JOptionPane.OK_OPTION == confirmado){
            int fila = jTable1.getSelectedRow();
            String cod="";
            cod=jTable1.getValueAt(fila, 0).toString();
    
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM pterminados WHERE  CPterminado='"+cod+"'");
                pst.executeUpdate();
                mostrardatos("");
            } catch (Exception e) {
         }
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int fila= jTable1.getSelectedRow();
        if(fila>=0){
            txCodigo.setText(jTable1.getValueAt(fila, 0).toString());
            txNombre.setText(jTable1.getValueAt(fila, 1).toString());
            txContenido.setText(jTable1.getValueAt(fila, 2).toString());
            txTotal.setText(jTable1.getValueAt(fila, 3).toString());
            txCaracteristicas.setText(jTable1.getValueAt(fila, 4).toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"no seleciono fila");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTotalKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButton5.doClick();
        }        
    }//GEN-LAST:event_txTotalKeyTyped

    private void txContenidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txContenidoKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButton5.doClick();
        }        
    }//GEN-LAST:event_txContenidoKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        mostrardatos(jTextField10.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        IMVENTARIO inventario = new IMVENTARIO();
        inventario.setLocationRelativeTo(null);
        this.setVisible(false);
        inventario.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTOSTERMINADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cantidad;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField txCaracteristicas;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txContenido;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txTotal;
    // End of variables declaration//GEN-END:variables
    conectar cc= new conectar();
    Connection cn= cc.conexion();
}
