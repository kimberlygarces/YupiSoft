
package proyecto;

import java.awt.Dialog;


public class ventana2 extends javax.swing.JFrame {

   
    public ventana2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        facturacion = new javax.swing.JButton();
        Inventario = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        Proveedores = new javax.swing.JButton();
        LibroContable = new javax.swing.JButton();
        CostosProduccion = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facturacion.setFont(new java.awt.Font("Serif", 2, 15)); // NOI18N
        facturacion.setText("FACTURACIÓN");
        facturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionActionPerformed(evt);
            }
        });
        getContentPane().add(facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 226, -1));

        Inventario.setFont(new java.awt.Font("Serif", 2, 15)); // NOI18N
        Inventario.setText("INVENTARIO");
        Inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });
        getContentPane().add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 226, -1));

        Clientes.setFont(new java.awt.Font("Serif", 2, 15)); // NOI18N
        Clientes.setText("CLIENTES");
        Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 226, -1));

        Proveedores.setFont(new java.awt.Font("Serif", 2, 15)); // NOI18N
        Proveedores.setText("PROVEEDORES");
        Proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 226, -1));

        LibroContable.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        LibroContable.setText("LIBRO CONTABLE");
        LibroContable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LibroContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroContableActionPerformed(evt);
            }
        });
        getContentPane().add(LibroContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 226, -1));

        CostosProduccion.setFont(new java.awt.Font("Serif", 2, 15)); // NOI18N
        CostosProduccion.setText(" COSTOS DE PRODUCCIÓN");
        CostosProduccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CostosProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosProduccionActionPerformed(evt);
            }
        });
        getContentPane().add(CostosProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jButton7.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jButton7.setText("SALIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 127, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/logo.jpg"))); // NOI18N
        jLabel1.setText("saosoft");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Found.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void facturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionActionPerformed
       facturacion fac = new facturacion();
       fac.setLocationRelativeTo(null);
       fac.setVisible(true);
             this.setVisible(false);

       
     
              
    }//GEN-LAST:event_facturacionActionPerformed

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
        
        IMVENTARIO INV = new IMVENTARIO();
        INV.setLocationRelativeTo(null);
        INV.setVisible(true);
                    this.setVisible(false);


    }//GEN-LAST:event_InventarioActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        
        CLIENTES CLIENTE = new CLIENTES();
        CLIENTE.setLocationRelativeTo(null);
        CLIENTE.setVisible(true);
                    this.setVisible(false);
 
    }//GEN-LAST:event_ClientesActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
    
        POVEEDORES PROVEEDORES = new POVEEDORES();
        PROVEEDORES.setLocationRelativeTo(null);
        PROVEEDORES.setVisible(true);
                    this.setVisible(false);
 

    }//GEN-LAST:event_ProveedoresActionPerformed

    private void LibroContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroContableActionPerformed
        
        LIBROCONTABLE LIBRO = new LIBROCONTABLE();
        LIBRO.setLocationRelativeTo(null);
        LIBRO.setVisible(true);
                    this.setVisible(false);
 

    }//GEN-LAST:event_LibroContableActionPerformed

    private void CostosProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostosProduccionActionPerformed
        
        COSTOSDEPRODUCCION CPRO = new COSTOSDEPRODUCCION();
        CPRO.setLocationRelativeTo(null);
        CPRO.setVisible(true);
                    this.setVisible(false);


    }//GEN-LAST:event_CostosProduccionActionPerformed

   
    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton CostosProduccion;
    private javax.swing.JButton Inventario;
    private javax.swing.JButton LibroContable;
    private javax.swing.JButton Proveedores;
    private javax.swing.JButton facturacion;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
