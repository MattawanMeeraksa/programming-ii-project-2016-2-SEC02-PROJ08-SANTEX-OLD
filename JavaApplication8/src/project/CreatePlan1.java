/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.text.*;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class CreatePlan1 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pstm = null;

//    JTextField txtPName;
//    JTextArea txtDes;
//    JTextField txtTtDays;
//    JLabel lblheadcreate;
//    JPanel jPanel1;
//    JLabel lblPName;
//    JLabel lblDes;
//    JLabel lblTtDays;
//    JButton createbtn;
//    JButton cancelbtn;
//    JScrollPane jScrollPane1;
    /**
     * Creates new form CreatePlan1
     */
    public CreatePlan1() {
        try {
            initComponents();
            conn = MySQLConnect.getMySQLConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreatePlan1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreatePlan1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        lblPName = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();
        createbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        lblheadcreate = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        startDateChoose = new com.toedter.calendar.JDateChooser();
        endDateChoose = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblPName.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblPName.setForeground(new java.awt.Color(255, 255, 255));
        lblPName.setText("Plan Name");

        lblDes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDes.setForeground(new java.awt.Color(255, 255, 255));
        lblDes.setText("Description");

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPNameKeyTyped(evt);
            }
        });

        txtDes.setColumns(20);
        txtDes.setRows(5);
        txtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDes);

        createbtn.setBackground(new java.awt.Color(255, 255, 255));
        createbtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        createbtn.setText("CREATE");
        createbtn.setPreferredSize(new java.awt.Dimension(83, 35));
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        cancelbtn.setText("CANCEL");
        cancelbtn.setPreferredSize(new java.awt.Dimension(83, 35));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        lblheadcreate.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblheadcreate.setForeground(new java.awt.Color(255, 255, 255));
        lblheadcreate.setText("Create Plan");

        lblStartDate.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblStartDate.setForeground(new java.awt.Color(255, 255, 255));
        lblStartDate.setText("Start Date");

        lblEndDate.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblEndDate.setForeground(new java.awt.Color(255, 255, 255));
        lblEndDate.setText("End Date");

        startDateChoose.setDateFormatString("yyyy-MM-dd");

        endDateChoose.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPName)
                            .addComponent(lblDes)
                            .addComponent(lblStartDate)
                            .addComponent(lblEndDate))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(txtPName, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(startDateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblheadcreate)
                            .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblheadcreate)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPName)
                                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDes))
                                .addGap(60, 60, 60)
                                .addComponent(lblStartDate))
                            .addComponent(startDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndDate)
                            .addComponent(endDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        try {
            if (txtPName.getText().equals("") || txtDes.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Your input is incorrect");
            } else {
                String sql = "insert into PLAN (planName,descriptionPlan,nameDay, startDate,endDate,dayperweek) values (?,?,?,?,?,?)";
                pstm = (PreparedStatement) conn.prepareStatement(sql);
                pstm.setString(1, txtPName.getText());
                pstm.setString(2, txtDes.getText());
                pstm.setString(3, " ");
                pstm.setString(4, ((JTextField) startDateChoose.getDateEditor().getUiComponent()).getText());
                pstm.setString(5, ((JTextField) endDateChoose.getDateEditor().getUiComponent()).getText());
                pstm.setInt(6, 0);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Plan created successfully");
                MyPlan2 sp = new MyPlan2();
               
                sp.setVisible(true);
                setVisible(false);
                sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sp.setLocationRelativeTo(null);
            }

        }  catch (SQLException ex) {
            Logger.getLogger(CreatePlan1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_createbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        GUIMyPlan1 frame = new GUIMyPlan1();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void txtPNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyTyped
        
    }//GEN-LAST:event_txtPNameKeyTyped

    private void txtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesKeyTyped
        
    }//GEN-LAST:event_txtDesKeyTyped

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePlan1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePlan1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePlan1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePlan1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePlan1().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton createbtn;
    private com.toedter.calendar.JDateChooser endDateChoose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblheadcreate;
    private com.toedter.calendar.JDateChooser startDateChoose;
    private javax.swing.JTextArea txtDes;
    private javax.swing.JTextField txtPName;
    // End of variables declaration//GEN-END:variables
}
