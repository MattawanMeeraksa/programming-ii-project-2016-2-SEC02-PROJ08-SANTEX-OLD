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
    PreparedStatement pstm1 = null;
    PreparedStatement pstm2 = null;
    private String planName;
    private String planDes;
    private Date startDate;
    private Date endDate;
    private int dayPerWeek;
    private String nameDay;
    private int planId;
    private int listId;
    private int list_planID;

    public int getList_planID() {
        return list_planID;
    }

    public void setList_planID(int list_planID) {
        this.list_planID = list_planID;
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

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
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
        initComponents();
        try {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        myPlan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblEnd = new javax.swing.JLabel();
        txtEnd = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        txtStart = new javax.swing.JLabel();
        lblDPW = new javax.swing.JLabel();
        txtDPW = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        lblPName = new javax.swing.JLabel();
        txtPName = new javax.swing.JLabel();
        lblPName2 = new javax.swing.JLabel();
        txtDes = new javax.swing.JLabel();
        editBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addListBtn = new javax.swing.JLabel();
        detailListBtn = new javax.swing.JLabel();
        startBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Plan");

        myPlan.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(402, 700));

        lblEnd.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblEnd.setText("End Date");

        txtEnd.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N

        lblStart.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblStart.setText("Start Date");

        txtStart.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N

        lblDPW.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDPW.setText("Day per Week");

        txtDPW.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N

        lblDes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDes.setText("Description");

        lblPName.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblPName.setText("Plan Name");

        txtPName.setBackground(new java.awt.Color(255, 255, 255));
        txtPName.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N
        txtPName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtDes.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/edit.png"))); // NOI18N
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/dustbin.png"))); // NOI18N
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setText("Edit");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setText("Delete");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(lblPName2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnd)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                .addComponent(lblDPW)
                                .addComponent(txtDPW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStart)
                                .addComponent(lblDes)
                                .addComponent(lblPName)))))
                .addGap(351, 351, 351))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(editBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel5)))
                .addGap(133, 133, 133)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblPName2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblPName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDes)
                .addGap(21, 21, 21)
                .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblDPW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDPW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEnd)
                .addGap(18, 18, 18)
                .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        addListBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        addListBtn.setForeground(new java.awt.Color(255, 255, 255));
        addListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/plus (2).png"))); // NOI18N
        addListBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBtnMouseClicked(evt);
            }
        });

        detailListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/information.png"))); // NOI18N
        detailListBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailListBtnMouseClicked(evt);
            }
        });

        startBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/play-button.png"))); // NOI18N
        startBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startBtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add List Plan");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Detail List Plan");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Start Plan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(addListBtn)
                        .addGap(217, 217, 217)
                        .addComponent(detailListBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startBtn)
                        .addGap(163, 163, 163))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(398, 398, 398)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addListBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailListBtn)
                            .addComponent(startBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            //ถ้าค่าเปลี่ยนก็อัพเดทอัตโนมัติ
            model = (DefaultTableModel) myPlan.getModel();
            model.setRowCount(0); //บอกว่าแถวแรกของตารางเป็น 0
            String sql = "select * from PLAN";
            pstm1 = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                //เก็บ planId,planName,descrip,totaldays ในทุกๆช่องลงในตัวแปร planId ทีเป็นArrayList เพราะเราไม่รู้จำนวนที่แน่นอน
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
        txtPName.setText(myPlan.getValueAt(myPlan.getSelectedRow(), 0) + "");
        txtDes.setText(myPlan.getValueAt(myPlan.getSelectedRow(), 1) + "");
        try {
            String sql = "select * from PLAN where planName=?";
            pstm1 = (PreparedStatement) conn.prepareStatement(sql);
            pstm1.setString(1, myPlan.getValueAt(myPlan.getSelectedRow(), 0) + "");
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                txtDPW.setText(rs.getString("nameDay") + "");
                txtStart.setText(rs.getDate("startDate").toString());
                txtEnd.setText(rs.getDate("endDate").toString());
                setPlanName(rs.getString("planName"));
                setPlanDes(rs.getString("descriptionPlan"));
                setNameDay(rs.getString("nameDay"));
                setStartDate(rs.getDate("startDate"));
                setEndDate(rs.getDate("endDate"));
                setPlanId(rs.getInt("planId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyPlan2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_myPlanMouseClicked

    private void addListBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addListBtnMouseClicked
        AddList1 al = new AddList1(this, rootPaneCheckingEnabled, this, getPlanId());
        al.setVisible(true);

    }//GEN-LAST:event_addListBtnMouseClicked

    private void detailListBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailListBtnMouseClicked
        DetailList1 dl = new DetailList1(getPlanId());
        EditListPlan edlp = new EditListPlan(getPlanId());
        System.out.println(getPlanId());
        dl.setVisible(true);
        this.setVisible(false);
        dl.setLocationRelativeTo(null);
        dl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_detailListBtnMouseClicked

    private void startBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startBtnMouseClicked
        StartPlan1 sp = new StartPlan1(getPlanId());
        sp.setVisible(true);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sp.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_startBtnMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        EditPlan eplan = new EditPlan(getPlanId(), getPlanName(), getPlanDes(),
                getStartDate(), getEndDate(), getDayPerWeek(), getNameDay());
        System.out.println(getPlanId());
        eplan.setVisible(true);
        eplan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eplan.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_editBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        System.out.println("list_planID " + list_planID);
        System.out.println("planId " + planId);
        try {
            String sql = "delete from LIST where list_planID =" + planId;
            pstm1 = (PreparedStatement) conn.prepareStatement(sql);
            pstm1.executeUpdate();
            String sql2 = "delete from PLAN where planId=" + planId;
            pstm2 = (PreparedStatement) conn.prepareStatement(sql2);
            pstm2.executeUpdate();
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
    }//GEN-LAST:event_deleteBtnMouseClicked

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
    private javax.swing.JLabel addListBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JLabel detailListBtn;
    private javax.swing.JLabel editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDPW;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPName2;
    private javax.swing.JLabel lblStart;
    private javax.swing.JTable myPlan;
    private javax.swing.JLabel startBtn;
    private javax.swing.JLabel txtDPW;
    private javax.swing.JLabel txtDes;
    private javax.swing.JLabel txtEnd;
    private javax.swing.JLabel txtPName;
    private javax.swing.JLabel txtStart;
    // End of variables declaration//GEN-END:variables
}
