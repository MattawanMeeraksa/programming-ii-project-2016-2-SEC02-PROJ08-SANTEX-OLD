/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
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
public class CreatePlan extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pstm = null;
    private String nameDay = "";
    private String sun = "";
    private String mon = "";
    private String tues = "";
    private String wedn = "";
    private String thru = "";
    private String fri = "";
    private String sat = "";
    private int dpwAll = 0;
    private int dpwMon,dpwTue,dpwWed,dpwThu,dpwFri,dpwSat,dpwSun;

    public String getNameDay() {
        return nameDay;
    }

    public void setNameDay(String nameDay) {
        this.nameDay = nameDay;
    }

    public String getSun() {
        return sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getTues() {
        return tues;
    }

    public void setTues(String tues) {
        this.tues = tues;
    }

    public String getWedn() {
        return wedn;
    }

    public void setWedn(String wedn) {
        this.wedn = wedn;
    }

    public String getThru() {
        return thru;
    }

    public void setThru(String thru) {
        this.thru = thru;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public int getDPW() {
        return dpwAll;
    }

    /**
     * Creates new form CreatePlan
     */
    public void setDPW(int dpw) {
        this.dpwAll = dpw;
    }

    public CreatePlan() {
        try {
            initComponents();
            conn = MySQLConnect.getMySQLConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreatePlan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreatePlan.class.getName()).log(Level.SEVERE, null, ex);
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
        lblheadcreate = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        startDateChoose = new com.toedter.calendar.JDateChooser();
        endDateChoose = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        lblcancel = new javax.swing.JLabel();
        lblsave = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        sunCheck = new javax.swing.JCheckBox();
        monCheck = new javax.swing.JCheckBox();
        tuesCheck = new javax.swing.JCheckBox();
        wedCheck = new javax.swing.JCheckBox();
        thuCheck = new javax.swing.JCheckBox();
        friCheck = new javax.swing.JCheckBox();
        satCheck = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        txtPName.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        txtPName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPNameFocusLost(evt);
            }
        });

        txtDes.setColumns(20);
        txtDes.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        txtDes.setRows(5);
        txtDes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDesFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtDes);

        lblheadcreate.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        lblheadcreate.setForeground(new java.awt.Color(255, 255, 255));
        lblheadcreate.setText("Create Plan");

        lblStartDate.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblStartDate.setForeground(new java.awt.Color(255, 255, 255));
        lblStartDate.setText("Start Date");

        lblEndDate.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblEndDate.setForeground(new java.awt.Color(255, 255, 255));
        lblEndDate.setText("End Date");

        startDateChoose.setDateFormatString("yyyy-MM-dd");
        startDateChoose.setMinSelectableDate(new java.util.Date(-62135791085000L));

        endDateChoose.setDateFormatString("yyyy-MM-dd");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/clipboard (1).png"))); // NOI18N

        lblcancel.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblcancel.setForeground(new java.awt.Color(255, 255, 255));
        lblcancel.setText("CANCEL");
        lblcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcancelMouseClicked(evt);
            }
        });

        lblsave.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblsave.setForeground(new java.awt.Color(255, 255, 255));
        lblsave.setText(" SAVE ");
        lblsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsaveMouseClicked(evt);
            }
        });

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/diskette.png"))); // NOI18N
        saveBtn.setContentAreaFilled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/file (4).png"))); // NOI18N
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        sunCheck.setBackground(new java.awt.Color(51, 51, 51));
        sunCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        sunCheck.setForeground(new java.awt.Color(255, 255, 255));
        sunCheck.setText("Sun");
        sunCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunCheckActionPerformed(evt);
            }
        });

        monCheck.setBackground(new java.awt.Color(51, 51, 51));
        monCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        monCheck.setForeground(new java.awt.Color(255, 255, 255));
        monCheck.setText("Mon");
        monCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monCheckActionPerformed(evt);
            }
        });

        tuesCheck.setBackground(new java.awt.Color(51, 51, 51));
        tuesCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        tuesCheck.setForeground(new java.awt.Color(255, 255, 255));
        tuesCheck.setText("Tue");
        tuesCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesCheckActionPerformed(evt);
            }
        });

        wedCheck.setBackground(new java.awt.Color(51, 51, 51));
        wedCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        wedCheck.setForeground(new java.awt.Color(255, 255, 255));
        wedCheck.setText("Wed");
        wedCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wedCheckActionPerformed(evt);
            }
        });

        thuCheck.setBackground(new java.awt.Color(51, 51, 51));
        thuCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        thuCheck.setForeground(new java.awt.Color(255, 255, 255));
        thuCheck.setText("Thu");
        thuCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuCheckActionPerformed(evt);
            }
        });

        friCheck.setBackground(new java.awt.Color(51, 51, 51));
        friCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        friCheck.setForeground(new java.awt.Color(255, 255, 255));
        friCheck.setText("Fri");
        friCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friCheckActionPerformed(evt);
            }
        });

        satCheck.setBackground(new java.awt.Color(51, 51, 51));
        satCheck.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        satCheck.setForeground(new java.awt.Color(255, 255, 255));
        satCheck.setText("Sat");
        satCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satCheckActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("How many days per week?");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/weekly-calendar5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblsave))
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcancel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(170, 170, 170))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPName)
                            .addComponent(lblDes)
                            .addComponent(lblStartDate)
                            .addComponent(lblEndDate))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblheadcreate)
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sunCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tuesCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wedCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thuCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(friCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(satCheck)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblheadcreate)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPName)
                        .addGap(65, 65, 65)
                        .addComponent(lblDes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStartDate)
                        .addGap(56, 56, 56)
                        .addComponent(lblEndDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(startDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(endDateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satCheck)
                    .addComponent(friCheck)
                    .addComponent(thuCheck)
                    .addComponent(wedCheck)
                    .addComponent(tuesCheck)
                    .addComponent(monCheck)
                    .addComponent(sunCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsave, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void createMyPlan() {
        System.out.println("Clicked Save button");
        try {
            if (txtPName.getText().equals("") || txtDes.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Your input is incorrect");
            } else {
                nameDay = "" + sun + mon + tues + wedn + thru + fri + sat;
                dpwAll = dpwMon+dpwTue+dpwWed+dpwThu+dpwFri+dpwSat+dpwSun;
                String sql = "insert into PLAN(planName,descriptionPlan,nameDay, startDate,endDate,dayperweek) values (?,?,?,?,?,?)";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, txtPName.getText());
                pstm.setString(2, txtDes.getText());
                pstm.setString(3, nameDay);
                java.sql.Date myDate = new java.sql.Date(startDateChoose.getDate().getTime());
                pstm.setDate(4, myDate);
                java.sql.Date myDate2 = new java.sql.Date(endDateChoose.getDate().getTime());
                pstm.setDate(5, myDate2);
                pstm.setInt(6, dpwAll);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Plan created successfully");
                MyPlan mp = new MyPlan();
                mp.setVisible(true);
                setVisible(false);
                mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mp.setLocationRelativeTo(null);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void backToHome() {
        System.out.println("Clicked Cancel button");
        MyPlan mp = new MyPlan();
        mp.pack();
        mp.setVisible(true);
        mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mp.setLocationRelativeTo(null);
        mp.setResizable(false);
        setVisible(false);
    }


    public void checkUserInputPlanName() {
        if (!(Pattern.matches("^[a-zA-Z0-9 ]+$", txtPName.getText()))) {
            txtPName.setText("");
        }
    }

    public void checkUserInputPlanDescription() {
        if (!(Pattern.matches("^[a-zA-Z0-9 \n]+$", txtDes.getText()))) {
            txtDes.setText("");
        }
    }
    

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if(startDateChoose.getDate().before(endDateChoose.getDate())){
            createMyPlan();
        }else if(startDateChoose.getDate().after(endDateChoose.getDate())){
            JOptionPane.showMessageDialog(null, "You can't choose end date before start date");
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        backToHome();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void lblsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsaveMouseClicked
        if(startDateChoose.getDate().before(endDateChoose.getDate())){
            createMyPlan();
        }else if(startDateChoose.getDate().after(endDateChoose.getDate())){
            JOptionPane.showMessageDialog(null, "You can't choose endDate before startDate");
        }
    }//GEN-LAST:event_lblsaveMouseClicked

    private void lblcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcancelMouseClicked
        backToHome();
    }//GEN-LAST:event_lblcancelMouseClicked

    private void sunCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunCheckActionPerformed
       //ถ้าช่องติ๊กวันอาทิตย์ถูกติ๊กปุ๊ป
        if (sunCheck.isSelected() == true) {
            System.out.println("Selected Sunday");
            //ไปกำหนดค่าที่เป็น string ให้กับ sun ว่า "Sunday "
            sun = "Sunday ";
            //และ setSun ให้เป็นคำว่า Sunday
            setSun(sun);
            dpwSun++; //บวกเพิ่มค่า dpwSun ให้เป็น 1
            //ถ้าวันอาทิตย์ไม่ได้ถูกติ๊ก
        } else if (sunCheck.isSelected() == false) {
            System.out.println("Not Selected Sunday");
            sun = ""; //กำหนดค่า String ให้ตัวแปร sun ว่าเป็นตัวเปล่าๆ
            dpwSun = 0; //และกำหนดค่า int dpwSun เป็น 0 เพราะว่าไม่ได้เลือก
        }
    }//GEN-LAST:event_sunCheckActionPerformed

    private void monCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monCheckActionPerformed
        if (monCheck.isSelected() == true) {
            System.out.println("Selected Monday");
            mon = "Monday ";
            setMon(mon);
            dpwMon++;
        } else if (monCheck.isSelected() == false) {
            System.out.println("Not Selected Monday");
            mon = "";
            dpwMon = 0;
        }
    }//GEN-LAST:event_monCheckActionPerformed

    private void tuesCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesCheckActionPerformed
        if (tuesCheck.isSelected() == true) {
            System.out.println("Selected Tuesday");
            tues = "Tuesday ";
            setTues(tues);
            dpwTue++;
        } else if (tuesCheck.isSelected() == false) {
            System.out.println("Not Selected Tuesday");
            tues = "";
            dpwTue = 0;
        }
    }//GEN-LAST:event_tuesCheckActionPerformed

    private void wedCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedCheckActionPerformed
        if (wedCheck.isSelected() == true) {
            System.out.println("Selected Wednesday");
            wedn = "Wednesday ";
            setWedn(wedn);
            dpwWed++;
        } else if (wedCheck.isSelected() == false) {
            System.out.println("Not Selected Wednesday");
            wedn = "";
            dpwWed = 0;
        }
    }//GEN-LAST:event_wedCheckActionPerformed

    private void thuCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuCheckActionPerformed
        if (thuCheck.isSelected() == true) {
            System.out.println("Selected Thursday");
            thru = "Thursday ";
            setThru(thru);
            dpwThu++;
        } else if (thuCheck.isSelected() == false) {
            System.out.println("Not Selected Thursday");
            thru = "";
            dpwThu = 0;
        }
    }//GEN-LAST:event_thuCheckActionPerformed

    private void friCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friCheckActionPerformed
        if (friCheck.isSelected() == true) {
            System.out.println("Selected Friday");
            fri = "Friday ";
            setFri(fri);
            dpwFri++;
        } else if (friCheck.isSelected() == false) {
            System.out.println("Not Selected Friday");
            fri = "";
            dpwFri = 0;
        }
    }//GEN-LAST:event_friCheckActionPerformed

    private void satCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satCheckActionPerformed
        if (satCheck.isSelected() == true) {
            System.out.println("Selected Saturday");
            sat = "Saturday ";
            setSat(sat);
            dpwSat++;
        } else if (satCheck.isSelected() == false) {
            System.out.println("Not Selected Saturday");
            sat = "";
            dpwSat = 0;
        }
    }//GEN-LAST:event_satCheckActionPerformed

    private void txtPNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNameFocusLost
        checkUserInputPlanName();
    }//GEN-LAST:event_txtPNameFocusLost

    private void txtDesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesFocusLost
        checkUserInputPlanDescription();
    }//GEN-LAST:event_txtDesFocusLost

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
            java.util.logging.Logger.getLogger(CreatePlan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePlan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePlan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePlan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePlan().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private com.toedter.calendar.JDateChooser endDateChoose;
    private javax.swing.JCheckBox friCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblcancel;
    private javax.swing.JLabel lblheadcreate;
    private javax.swing.JLabel lblsave;
    private javax.swing.JCheckBox monCheck;
    private javax.swing.JCheckBox satCheck;
    private javax.swing.JButton saveBtn;
    private com.toedter.calendar.JDateChooser startDateChoose;
    private javax.swing.JCheckBox sunCheck;
    private javax.swing.JCheckBox thuCheck;
    private javax.swing.JCheckBox tuesCheck;
    private javax.swing.JTextArea txtDes;
    private javax.swing.JTextField txtPName;
    private javax.swing.JCheckBox wedCheck;
    // End of variables declaration//GEN-END:variables
}
