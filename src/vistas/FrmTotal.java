/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;

/**
 *
 * @author DavidGamez
 */
public class FrmTotal extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmTotal
     */
    public FrmTotal() {
        initComponents();
        initComponents();
        this.setSize(new Dimension(695, 650));
        this.setTitle("Datos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttomMetroPane1 = new necesario.ButtomMetroPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        facturaa = new javax.swing.JTextField();
        dates = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cedu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombrec = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        domis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        celu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ite1 = new javax.swing.JTextField();
        ite2 = new javax.swing.JTextField();
        ite3 = new javax.swing.JTextField();
        ite4 = new javax.swing.JTextField();
        ite5 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        v1 = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        v3 = new javax.swing.JTextField();
        v4 = new javax.swing.JTextField();
        v5 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        top = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();

        javax.swing.GroupLayout buttomMetroPane1Layout = new javax.swing.GroupLayout(buttomMetroPane1);
        buttomMetroPane1.setLayout(buttomMetroPane1Layout);
        buttomMetroPane1Layout.setHorizontalGroup(
            buttomMetroPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        buttomMetroPane1Layout.setVerticalGroup(
            buttomMetroPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SISTEMA DE VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 13, 125, 35));

        jLabel2.setText("FACTURA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 220, 35));

        jLabel6.setBackground(new java.awt.Color(153, 0, 153));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Factura #                              Fecha:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 220, -1));

        facturaa.setEnabled(false);
        jPanel1.add(facturaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 94, -1));

        dates.setEnabled(false);
        jPanel1.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 87, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("c.c. del Cliente:                      Terminos:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 220, -1));

        cedu.setEnabled(false);
        jPanel1.add(cedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 104, -1));

        jLabel8.setText("contra entrega");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel9.setText("Nombre del Cliente:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 200, 111, -1));

        nombrec.setEnabled(false);
        jPanel1.add(nombrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 223, 125, -1));

        jLabel10.setText("Direccion del Cliente:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 258, 125, -1));

        domis.setEnabled(false);
        jPanel1.add(domis, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 281, 125, -1));

        jLabel11.setText("Telefono del Cliente:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 200, 116, -1));

        celu.setEnabled(false);
        jPanel1.add(celu, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 223, 126, -1));

        jLabel12.setText("Producto:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 321, 75, 26));

        jLabel13.setText("Cantidad:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 321, 64, 26));

        jLabel14.setText("VR. Unitario:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 321, 66, 26));

        jLabel15.setText("Total:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 321, 90, 26));

        ite1.setEnabled(false);
        ite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ite1ActionPerformed(evt);
            }
        });
        jPanel1.add(ite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 369, 87, -1));

        ite2.setEnabled(false);
        jPanel1.add(ite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 404, 87, -1));

        ite3.setEnabled(false);
        jPanel1.add(ite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 439, 87, -1));

        ite4.setEnabled(false);
        jPanel1.add(ite4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 474, 87, -1));

        ite5.setEnabled(false);
        jPanel1.add(ite5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 509, 87, -1));

        c1.setEnabled(false);
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 369, 52, -1));

        c2.setEnabled(false);
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 404, 52, -1));

        c3.setEnabled(false);
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 439, 52, -1));

        c4.setEnabled(false);
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 474, 52, -1));

        c5.setEnabled(false);
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 509, 52, -1));

        v1.setEnabled(false);
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 369, 91, -1));

        v2.setEnabled(false);
        jPanel1.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 404, 91, -1));

        v3.setEnabled(false);
        v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ActionPerformed(evt);
            }
        });
        jPanel1.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 439, 91, -1));

        v4.setEnabled(false);
        jPanel1.add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 474, 91, -1));

        v5.setEnabled(false);
        jPanel1.add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 509, 91, -1));

        t1.setEnabled(false);
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 369, 90, -1));

        t2.setEnabled(false);
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 404, 90, -1));

        t4.setEnabled(false);
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 474, 90, -1));

        t3.setEnabled(false);
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 439, 90, -1));

        t5.setEnabled(false);
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 509, 90, -1));

        jLabel16.setText("TOTAL A PAGAR:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 553, 102, 32));

        top.setEnabled(false);
        top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topActionPerformed(evt);
            }
        });
        jPanel1.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 549, 185, 40));

        jButton1.setText("Crear Factura Nueva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 557, -1, -1));

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterDatos i= new InterDatos();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void topActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topActionPerformed

    private void v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v3ActionPerformed

    private void ite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ite1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ite1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.ButtomMetroPane buttomMetroPane1;
    public static javax.swing.JTextField c1;
    public static javax.swing.JTextField c2;
    public static javax.swing.JTextField c3;
    public static javax.swing.JTextField c4;
    public static javax.swing.JTextField c5;
    public static javax.swing.JTextField cedu;
    public static javax.swing.JTextField celu;
    public static javax.swing.JTextField dates;
    public static javax.swing.JTextField domis;
    public static javax.swing.JTextField facturaa;
    public static javax.swing.JTextField ite1;
    public static javax.swing.JTextField ite2;
    public static javax.swing.JTextField ite3;
    public static javax.swing.JTextField ite4;
    public static javax.swing.JTextField ite5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField nombrec;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    public static javax.swing.JTextField t1;
    public static javax.swing.JTextField t2;
    public static javax.swing.JTextField t3;
    public static javax.swing.JTextField t4;
    public static javax.swing.JTextField t5;
    public static javax.swing.JTextField top;
    public static javax.swing.JTextField v1;
    public static javax.swing.JTextField v2;
    public static javax.swing.JTextField v3;
    public static javax.swing.JTextField v4;
    public static javax.swing.JTextField v5;
    // End of variables declaration//GEN-END:variables
}