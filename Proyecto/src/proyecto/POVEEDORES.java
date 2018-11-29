
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

public class POVEEDORES extends javax.swing.JFrame {
    
  


    String url="jdbc:mysql://localhost:3306/saosoft";
    String driver="com.mysql.jdbc.Driver";

   
    public POVEEDORES() {
        initComponents();
        mostrar("");
          setLocationRelativeTo(null);
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
    void mostrar(String valor ){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO_PRODUCTO");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("DIRECCION");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("E-MAIL");
    modelo.addColumn("PRODUCTO");
    jTable1.setModel(modelo);
    String sql ="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM proveedores";
    }
    else{
        sql="SELECT * FROM proveedores WHERE codproducto='"+valor+"'";
    }
 
        String []datos = new String [6];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(6);
                    modelo.addRow(datos);
                }
                    jTable1.setModel(modelo);
            } catch (SQLException ex) {
                Logger.getLogger(POVEEDORES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        actualizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TnomP = new javax.swing.JTextField();
        TtelP = new javax.swing.JTextField();
        TcodigoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TdirP = new javax.swing.JTextField();
        TemailP = new javax.swing.JTextField();
        TprodP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TbuscarP = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/regresar_opt.jpg"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/niña.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 230, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/234.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 330));

        jLabel3.setFont(new java.awt.Font("TlwgTypewriter", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("PROVEEDORES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 410, -1));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Tips.png"))); // NOI18N
        Guardar.setText("Registrar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 160, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 900, 140));

        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 120, 40));

        jLabel11.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/logo.jpg"))); // NOI18N
        jLabel11.setText("SAOSOFT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 110, 40));

        jButton2.setText("Mostrar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 120, 40));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 4, 4));
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));
        jPanel1.add(TnomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 160, -1));
        jPanel1.add(TtelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 160, -1));
        jPanel1.add(TcodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        jLabel4.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(14, 7, 7));
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel1.add(TdirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, -1));
        jPanel1.add(TemailP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 400, -1));

        TprodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TprodPActionPerformed(evt);
            }
        });
        TprodP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TprodPKeyTyped(evt);
            }
        });
        jPanel1.add(TprodP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 400, -1));

        jLabel9.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(14, 4, 4));
        jLabel9.setText("Producto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jLabel7.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 9, 9));
        jLabel7.setText("Telefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 20));

        jLabel8.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 8, 8));
        jLabel8.setText("E-mail");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 20));

        jLabel6.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 14, 14));
        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 560, 210));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TbuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbuscarPActionPerformed(evt);
            }
        });
        TbuscarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TbuscarPKeyTyped(evt);
            }
        });
        jPanel2.add(TbuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 380, 30));

        Buscar.setText("Buscar proveedor");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 570, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/B86.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            this.setVisible(false);
             ventana2 ven2 = new ventana2();
            ven2.setVisible(true);
            ven2.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
      
         try{
       

          PreparedStatement s=cn.prepareStatement("insert into proveedores values(?,?,?,?,?,?)")  ;
          s.setString(1,TcodigoP.getText());
          s.setString(2,TnomP.getText());
          s.setString(3,TdirP.getText());
          s.setString(4,TtelP.getText());
          s.setString(5, TemailP.getText());
          s.setString(6, TprodP.getText());
          s.executeUpdate();
          JOptionPane.showMessageDialog(this, "Informacion Almacenada");
          TcodigoP.setText("");
          TnomP.setText("");
          TdirP.setText("");
          TtelP.setText("");
          TemailP.setText("");
          TprodP.setText("");
          mostrar("");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void TprodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TprodPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TprodPActionPerformed

    private void TbuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbuscarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TbuscarPActionPerformed

    private void TprodPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TprodPKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            Guardar.doClick();
        }
    }//GEN-LAST:event_TprodPKeyTyped

    private void TbuscarPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbuscarPKeyTyped
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            Buscar.doClick();
        }
        
    }//GEN-LAST:event_TbuscarPKeyTyped

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE proveedores SET nombre='"+TnomP.getText()+"',Direccion='"+TdirP.getText()+"',telefono='"+TtelP.getText()+"',e-mail='"+TemailP.getText()+"',producto='"+TprodP.getText()+"' WHERE codproducto='"+TcodigoP.getText()+"'");
                pst.executeUpdate();
                mostrar("");
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrar("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int confirmado = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar El Archivo?");
        if (JOptionPane.OK_OPTION == confirmado){
            int fila = jTable1.getSelectedRow();
            String cod="";
            cod=jTable1.getValueAt(fila, 0).toString();
    
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM proveedores WHERE  codproducto='"+cod+"'");
                pst.executeUpdate();
                mostrar("");
            } catch (Exception e) {
         }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int fila= jTable1.getSelectedRow();
            if(fila>=0){
            TcodigoP.setText(jTable1.getValueAt(fila, 0).toString());
            TnomP.setText(jTable1.getValueAt(fila, 1).toString());
            TdirP.setText(jTable1.getValueAt(fila, 3).toString());
            TtelP.setText(jTable1.getValueAt(fila, 2).toString());
            TemailP.setText(jTable1.getValueAt(fila, 2).toString());
            TprodP.setText(jTable1.getValueAt(fila, 3).toString());
            }   
            else{
            JOptionPane.showMessageDialog(null,"no seleciono fila");
            }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        mostrar(TbuscarP.getText());
    }//GEN-LAST:event_BuscarActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POVEEDORES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField TbuscarP;
    private javax.swing.JTextField TcodigoP;
    private javax.swing.JTextField TdirP;
    private javax.swing.JTextField TemailP;
    private javax.swing.JTextField TnomP;
    private javax.swing.JTextField TprodP;
    private javax.swing.JTextField TtelP;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    conectar cc= new conectar();
    Connection cn= cc.conexion();

}
