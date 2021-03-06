/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class MyPlan2 extends javax.swing.JFrame {

    DefaultTableModel model;
    Connection conn = null;
    PreparedStatement pstm = null;
    private String planName;
    private String planDes;
    private Date startDate;
    private Date endDate;
    private int dayPerWeek;
    private String nameDay;
    private int planId;

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

    public String getPlanDes() {
        return planDes;
    }

    public void setPlanDes(String planDes) {
        this.planDes = planDes;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDayPerWeek() {
        return dayPerWeek;
    }

    public void setDayPerWeek(int dayPerWeek) {
        this.dayPerWeek = dayPerWeek;
    }

    public String getNameDay() {
        return nameDay;
    }

    public void setNameDay(String nameDay) {
        this.nameDay = nameDay;
    }

    /**
     * Creates new form MyPlan2
     */
    public MyPlan2() {
        try {
            initComponents();
            conn = MySQLConnect.getMySQLConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyPlan2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyPlan2.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        myPlan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPName = new javax.swing.JLabel();
        txtDes = new javax.swing.JLabel();
        txtDPW = new javax.swing.JLabel();
        txtStart = new javax.swing.JLabel();
        txtEnd = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        lblPName = new javax.swing.JLabel();
        lblPName2 = new javax.swing.JLabel();
        lblDPW = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDes = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        myPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Plan Name", "Description Plan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        myPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myPlanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(myPlan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 123, 817, 356);

        jLabel1.setText("My Plan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(39, 26, 55, 20);

        txtPName.setText("Plan Name");
        getContentPane().add(txtPName);
        txtPName.setBounds(870, 70, 76, 20);

        txtDes.setText("Description");
        getContentPane().add(txtDes);
        txtDes.setBounds(870, 140, 79, 20);

        txtDPW.setText("Day per Week");
        getContentPane().add(txtDPW);
        txtDPW.setBounds(870, 240, 98, 20);

        txtStart.setText("Start Date");
        getContentPane().add(txtStart);
        txtStart.setBounds(870, 330, 70, 20);

        txtEnd.setText("End Date");
        getContentPane().add(txtEnd);
        txtEnd.setBounds(870, 420, 64, 20);
        getContentPane().add(lblEnd);
        lblEnd.setBounds(890, 450, 330, 40);
        getContentPane().add(lblPName);
        lblPName.setBounds(880, 90, 330, 40);
        getContentPane().add(lblPName2);
        lblPName2.setBounds(880, 90, 330, 40);
        getContentPane().add(lblDPW);
        lblDPW.setBounds(890, 270, 330, 40);
        getContentPane().add(lblStart);
        lblStart.setBounds(890, 360, 330, 40);

        jScrollPane1.setViewportView(lblDes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(880, 170, 320, 60);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 520, 140, 50);

        jButton2.setText("DETEIL");
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 520, 120, 50);

        jButton3.setText("START");
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 520, 120, 50);

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(910, 510, 120, 50);

        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBtn);
        editBtn.setBounds(1140, 510, 120, 50);

        setSize(new java.awt.Dimension(1324, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            //ถ้าค่าเปลี่ยนก็อัพเดทอัตโนมัติ
            model = (DefaultTableModel) myPlan.getModel();
            model.setRowCount(0); //บอกว่าแถวแรกของตารางเป็น 0
            String sql = "select * from PLAN";
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("planName"));
                v.add(rs.getString("descriptionPlan"));
                v.add(rs.getInt("planId"));
                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyPlan2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void myPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myPlanMouseClicked
        lblPName.setText(myPlan.getValueAt(myPlan.getSelectedRow(), 0) + "");
        lblDes.setText(myPlan.getValueAt(myPlan.getSelectedRow(), 1) + "");
        try {
            String sql = "select * from PLAN where planName=?";
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, myPlan.getValueAt(myPlan.getSelectedRow(), 0) + "");
            ResultSet rs = pstm.executeQuery();
            rs.next();
            lblDPW.setText(rs.getInt("dayperweek") + "");
            lblStart.setText(rs.getDate("startDate").toString());
            lblEnd.setText(rs.getDate("endDate").toString());
            setPlanName(rs.getString("planName"));
            setPlanDes(rs.getString("descriptionPlan"));
            setDayPerWeek(rs.getInt("dayperweek"));
            setNameDay(rs.getString("nameDay"));
            setStartDate(rs.getDate("startDate"));
            setEndDate(rs.getDate("endDate"));
            setPlanId(rs.getInt("planId"));
        } catch (SQLException ex) {
            Logger.getLogger(MyPlan2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_myPlanMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            String sql = "delete from PLAN where planName=?";
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, planName);
            pstm.executeUpdate();
            Object[] options = {"Yes", "No"}; //เป็นปุ่มที่ให้เลือกว่าจะกดอะไร
            int n = JOptionPane.showOptionDialog(deleteBtn, //1.เป็นชนิดของปุ่ม
                    "Do you want delete plan?", //2.เป็นข้อความโชว์บนกล่อง message
                    "Delete Plan!!!", //3.title ของ message box
                    JOptionPane.YES_NO_CANCEL_OPTION, //4.ชนิดของ optionPane ว่าเป็น yes/no
                    JOptionPane.QUESTION_MESSAGE,
                    null, //ไม่ใช้ไอคอน do not use a custom Icon
                    options, //ชื่อของในแต่ละปุ่ม the titles of button ที่มี yes no
                    options[0]); //default button title
            // ถ้ากด yes จะทำให้ n มีค่าเป็น 0
            if (n == 0) {
                //ให้มันแสดงเฉยๆว่าแพลนนั้นถูกลบออกไปแล้วแต่กดเลือกอะไรไม่ได้นอกจากแค่กด ok หรือปิดหน้าจอไป
                JOptionPane.showMessageDialog(null, "Your plan is deleted");
                MyPlan2 sp = new MyPlan2();
                sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sp.setVisible(true);
                sp.setLocationRelativeTo(null);
                setVisible(false);
            } else {
                System.out.println("Canceled");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyPlan2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        EditPlan eplan = new EditPlan(getPlanId(), getPlanName(), getPlanDes(),
                 getStartDate(), getEndDate(), getDayPerWeek(), getNameDay());
        System.out.println(getPlanId());
        eplan.pack();
        eplan.setVisible(true);
        eplan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eplan.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_editBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MyPlan2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyPlan2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyPlan2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyPlan2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPlan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDPW;
    private javax.swing.JTextPane lblDes;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPName2;
    private javax.swing.JLabel lblStart;
    private javax.swing.JTable myPlan;
    private javax.swing.JLabel txtDPW;
    private javax.swing.JLabel txtDes;
    private javax.swing.JLabel txtEnd;
    private javax.swing.JLabel txtPName;
    private javax.swing.JLabel txtStart;
    // End of variables declaration//GEN-END:variables
}
