/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class StartPlan1 extends javax.swing.JFrame {

    /**
     * Creates new form StratPlan1
     */
    private int planId;
    private String planName;

    public StartPlan1() {
        //initComponents();
    }

    public StartPlan1(int planId) {
        initComponents();
        this.planId = planId;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextTop = new javax.swing.JPanel();
        txtHow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        monCheck = new javax.swing.JCheckBox();
        tuesCheck = new javax.swing.JCheckBox();
        sunCheck = new javax.swing.JCheckBox();
        satCheck = new javax.swing.JCheckBox();
        wedCheck = new javax.swing.JCheckBox();
        thuCheck = new javax.swing.JCheckBox();
        friCheck = new javax.swing.JCheckBox();
        startBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextTop.setBackground(new java.awt.Color(51, 51, 51));

        txtHow.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        txtHow.setForeground(new java.awt.Color(255, 255, 255));
        txtHow.setText("How many days per week? ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wall-calendar (3).png"))); // NOI18N

        javax.swing.GroupLayout TextTopLayout = new javax.swing.GroupLayout(TextTop);
        TextTop.setLayout(TextTopLayout);
        TextTopLayout.setHorizontalGroup(
            TextTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextTopLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(txtHow, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        TextTopLayout.setVerticalGroup(
            TextTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextTopLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHow, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        monCheck.setBackground(new java.awt.Color(102, 102, 102));
        monCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        monCheck.setForeground(new java.awt.Color(255, 255, 255));
        monCheck.setText("Monday");
        monCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monCheckActionPerformed(evt);
            }
        });

        tuesCheck.setBackground(new java.awt.Color(102, 102, 102));
        tuesCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        tuesCheck.setForeground(new java.awt.Color(255, 255, 255));
        tuesCheck.setText("Tuesday");
        tuesCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesCheckActionPerformed(evt);
            }
        });

        sunCheck.setBackground(new java.awt.Color(102, 102, 102));
        sunCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        sunCheck.setForeground(new java.awt.Color(255, 255, 255));
        sunCheck.setText("Sunday");
        sunCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunCheckActionPerformed(evt);
            }
        });

        satCheck.setBackground(new java.awt.Color(102, 102, 102));
        satCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        satCheck.setForeground(new java.awt.Color(255, 255, 255));
        satCheck.setText("Saturday");
        satCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satCheckActionPerformed(evt);
            }
        });

        wedCheck.setBackground(new java.awt.Color(102, 102, 102));
        wedCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        wedCheck.setForeground(new java.awt.Color(255, 255, 255));
        wedCheck.setText("Wednesday");
        wedCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wedCheckActionPerformed(evt);
            }
        });

        thuCheck.setBackground(new java.awt.Color(102, 102, 102));
        thuCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        thuCheck.setForeground(new java.awt.Color(255, 255, 255));
        thuCheck.setText("Thrusday");
        thuCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuCheckActionPerformed(evt);
            }
        });

        friCheck.setBackground(new java.awt.Color(102, 102, 102));
        friCheck.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        friCheck.setForeground(new java.awt.Color(255, 255, 255));
        friCheck.setText("Friday");
        friCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friCheckActionPerformed(evt);
            }
        });

        startBtn.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        startBtn.setForeground(new java.awt.Color(255, 255, 255));
        startBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/diskette.png"))); // NOI18N
        startBtn.setText("  SAVE  ");
        startBtn.setContentAreaFilled(false);
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/file (4).png"))); // NOI18N
        cancelBtn.setText(" CANCEL");
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(satCheck)
                            .addComponent(thuCheck)
                            .addComponent(friCheck))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wedCheck)
                            .addComponent(tuesCheck)
                            .addComponent(sunCheck)
                            .addComponent(monCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startBtn)
                            .addComponent(cancelBtn))
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sunCheck)
                        .addGap(18, 18, 18)
                        .addComponent(monCheck)
                        .addGap(18, 18, 18)
                        .addComponent(tuesCheck)
                        .addGap(18, 18, 18)
                        .addComponent(wedCheck)))
                .addGap(18, 18, 18)
                .addComponent(thuCheck)
                .addGap(18, 18, 18)
                .addComponent(friCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(satCheck)
                .addGap(206, 206, 206))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String nameDay = "";
    String Sun = "";
    String Mon = "";
    String Tues = "";
    String Wedn = "";
    String Thru = "";
    String Fri = "";
    String Sat = "";
    int DPW = 0;
    private void monCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Monday");
        Mon = "Monday ";
        DPW++;
    }//GEN-LAST:event_monCheckActionPerformed

    private void sunCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Sunday");
        Sun = "Sunday ";
        DPW++;
    }//GEN-LAST:event_sunCheckActionPerformed

    private void tuesCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Tuesday");
        Tues = "Tuesday ";
        DPW++;
    }//GEN-LAST:event_tuesCheckActionPerformed

    private void wedCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Wednesday");
        Wedn = "Wednesday ";
        DPW++;
    }//GEN-LAST:event_wedCheckActionPerformed

    private void thuCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Thrusday");
        Thru = "Thrusday ";
        DPW++;
    }//GEN-LAST:event_thuCheckActionPerformed

    private void friCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Friday");
        Fri = "Friday ";
        DPW++;
    }//GEN-LAST:event_friCheckActionPerformed

    private void satCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satCheckActionPerformed
        // TODO add your handling code here:
        System.out.println("Saturday");
        Sat = "Saturday ";
        DPW++;
    }//GEN-LAST:event_satCheckActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        try {
            // TODO add your handling code here:
            nameDay = "" + Sun + Mon + Tues + Wedn + Thru + Fri + Sat;
            System.out.println("Started Plan " + getPlanName());
            System.out.println("Plan Id " + getPlanId());
            Plan p = new Plan();
            ResultSet rs = p.show();
            p.start(DPW, getPlanId(), nameDay);
            MyPlan mp = new MyPlan();
            mp.pack();
            mp.setVisible(false);
            mp.setDefaultCloseOperation(mp.EXIT_ON_CLOSE);
            GUIMyPlan1 frame = new GUIMyPlan1();
            frame.pack();
            frame.setSize(500, 350);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StartPlan1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StartPlan1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        MyPlan2 mp = new MyPlan2();
        mp.setVisible(true);
        mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mp.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StartPlan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPlan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPlan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPlan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPlan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TextTop;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox friCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox monCheck;
    private javax.swing.JCheckBox satCheck;
    private javax.swing.JButton startBtn;
    private javax.swing.JCheckBox sunCheck;
    private javax.swing.JCheckBox thuCheck;
    private javax.swing.JCheckBox tuesCheck;
    private javax.swing.JLabel txtHow;
    private javax.swing.JCheckBox wedCheck;
    // End of variables declaration//GEN-END:variables
}
