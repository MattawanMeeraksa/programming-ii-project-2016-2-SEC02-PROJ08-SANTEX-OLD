/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Administrator
 */
public class Home extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement pstm = null;
    private ArrayList<ToDoList> listName = new ArrayList<ToDoList>();
    private ArrayList<String> listName1 = new ArrayList<String>();
    private ArrayList<Integer> listId = new ArrayList<Integer>();
    private ArrayList<Integer> tmp_listId = new ArrayList<Integer>();
    private ArrayList<ToDoList> tmp_listName = new ArrayList<ToDoList>();
    private JPanel[] smallCheckListPanel;
    private ArrayList<Integer> selectedList = new ArrayList<Integer>();
    private JCheckBox[] checkList;
    private int[] checkedBox;
    private JLabel[] labelCheckList;
    private int planID;
    private String thisDay;
    private Date start;
    private Date end;

    public Home() {
        try {
            smallCheckListPanel = new JPanel[0];
            initComponents();
            conn = MySQLConnect.getMySQLConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public JCalendar getCalendar() {
        return Calendar;
    }

    public void setCalendar(JCalendar Calendar) {
        this.Calendar = Calendar;
    }

    public String getThisDay() {
        return thisDay;
    }

    public void setThisDay(String thisDay) {
        this.thisDay = thisDay;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showToDoList = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        activity2 = new javax.swing.JCheckBox();
        activity1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        txtSantex = new javax.swing.JLabel();
        myplanBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Calendar = new com.toedter.calendar.JCalendar();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDay = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        scrollPaneCheckList = new javax.swing.JScrollPane();
        bigpanelCheckList = new javax.swing.JPanel();
        scrollActToday = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        actToday = new javax.swing.JTextArea();
        refreshBtn = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton2.setText("jButton1");

        jButton3.setText("jButton1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(500, 375));
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        showToDoList.setBackground(new java.awt.Color(102, 102, 102));
        showToDoList.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(showToDoList);

        jLabel4.setText("jLabel4");

        activity2.setText("jCheckBox1");

        activity1.setText("jCheckBox1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1031, 592));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(51, 51, 51));

        txtSantex.setFont(new java.awt.Font("Century Gothic", 1, 45)); // NOI18N
        txtSantex.setForeground(new java.awt.Color(255, 255, 255));
        txtSantex.setText("Exercise Plan");

        myplanBtn.setBackground(new java.awt.Color(102, 102, 102));
        myplanBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        myplanBtn.setForeground(new java.awt.Color(255, 255, 255));
        myplanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/office-material.png"))); // NOI18N
        myplanBtn.setText("  MY PLAN ");
        myplanBtn.setContentAreaFilled(false);
        myplanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myplanBtnActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(102, 102, 102));
        createBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/archive.png"))); // NOI18N
        createBtn.setText("CREATE PLAN");
        createBtn.setContentAreaFilled(false);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/exercise (1).png"))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Instruction : \n1. if the color of checklist is yellow, list of \ntoday is wating for checking.\n\n2. If the color of checklist is green, list \nwas end.\n\n3. If the color of checklist is red\n    - the list that was skipped.\n    - the list haven't be coming yet.\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myplanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn))
                .addGap(0, 209, Short.MAX_VALUE))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtSantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(txtSantex, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(myplanBtn)
                .addGap(36, 36, 36)
                .addComponent(createBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 726));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Calendar.setBackground(new java.awt.Color(51, 51, 51));
        Calendar.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        Calendar.setTodayButtonText("");
        Calendar.setTodayButtonVisible(true);
        Calendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CalendarPropertyChange(evt);
            }
        });
        jPanel4.add(Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 147, 684, 414));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/notepad (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To do list");
        jLabel1.setAutoscrolls(true);

        txtDay.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtDay.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 27, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Activity Today");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/gym.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(11, 11, 11))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 27, 301, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Santex/image/check-box.png"))); // NOI18N
        jLabel10.setText("Check List");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 217, -1));

        bigpanelCheckList.setBackground(new java.awt.Color(51, 51, 51));
        bigpanelCheckList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPaneCheckList.setViewportView(bigpanelCheckList);

        jPanel4.add(scrollPaneCheckList, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 480, 240));

        actToday.setEditable(false);
        actToday.setColumns(20);
        actToday.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        actToday.setRows(5);
        jScrollPane3.setViewportView(actToday);

        scrollActToday.setViewportView(jScrollPane3);

        jPanel4.add(scrollActToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 490, 250));

        refreshBtn.setBackground(new java.awt.Color(255, 255, 255));
        refreshBtn.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Save");
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel4.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 390, -1, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1833, 782);
    }// </editor-fold>//GEN-END:initComponents

    public void loopCheckList() {
        bigpanelCheckList.removeAll();
        int y = 10;
        bigpanelCheckList.repaint();
        bigpanelCheckList.revalidate();
        smallCheckListPanel = new JPanel[listName.size()];
        checkList = new JCheckBox[listName.size()];
        labelCheckList = new JLabel[listName.size()];
        JLabel[] status = new JLabel[listName.size()];

        for (int i = 0; i < listName.size(); i++) {
            try {
                int count = i;
                smallCheckListPanel[i] = new JPanel();
                checkList[i] = new JCheckBox();
                checkList[i].addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        checkListActionPerformed(evt, count);
                    }
                });
                labelCheckList[i] = new JLabel();
                status[i] = new JLabel();
                smallCheckListPanel[i].setBackground(new java.awt.Color(51, 51, 51));
                smallCheckListPanel[i].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                labelCheckList[i].setBackground(new java.awt.Color(51, 51, 51));
                labelCheckList[i].setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
                labelCheckList[i].setForeground(new java.awt.Color(255, 255, 255));
                labelCheckList[i].setText(listName.get(i).getName());
                System.out.println(Calendar.getCalendar().getTime());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("EEEE"); //เป็น format ในการบอกว่าเป็นวันอะไรในสัปดาห์เช่นจันทร์หรืออังคาร
                String toDay2 = dateFormat.format(date);
                String dayCar = dateFormat.format(Calendar.getCalendar().getTime()); 
                //getTime() : ใช้คืนค่า Object date ที่เก็บค่าวันที่และเวลาเอาไว้
                //Calendar.getCalendar() : ออกมาเป็นรายละเอียดต่าง
                //Calendar.getCalendar() : จะออกมาเป็นวันที่ Sun May 21 12:08:07 ICT 2017 ตามเวลาปัจจุบันและ timezone
                System.out.println(toDay2); //ออกมาในรูป yyyy-MM-dd ก็คือตามวันปัจจุบันและตาม format ที่กำหนดไว้
                System.out.println("dateDone = " + listName.get(i).getDateDone());
                
                
                //ถ้า listNameตำแหน่งที่ i มี status = 1 และ listNameตำแหน่งที่ i มี datedone ไม่เท่ากับ nullก็คือมีค่า
                //ในส่วนของตรงนี้จะกลายเป็นสีเขียว
                if (listName.get(i).getStatus() == 1 && listName.get(i).getDateDone() != null) {
                    smallCheckListPanel[i].add(labelCheckList[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 14, -1, -1));
                    checkList[i].setBackground(new java.awt.Color(51, 51, 51));
                    checkList[i].setFont(new java.awt.Font("Century Gothic", 1, 20));
                    labelCheckList[i].setForeground(new java.awt.Color(153, 255, 51));
                    checkList[i].setForeground(new java.awt.Color(153, 255, 51));
                    checkList[i].setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                    checkList[i].setText("Done");
                    checkList[i].setEnabled(false);

                } 
                //ถ้า today2(วันปัจจุบัน) มีค่าเท่ากับ dayCar(วันที่กดปฏิทิน)
                //ให้ติ๊กได้และให้ text เป็นสีเหลือง
                else if (toDay2.equals(dayCar)) {
                    smallCheckListPanel[i].add(labelCheckList[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 14, -1, -1));
                    checkList[i].setBackground(new java.awt.Color(51, 51, 51));
                    checkList[i].setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                    checkList[i].setForeground(Color.YELLOW);
                    checkList[i].setText("Done");
                    labelCheckList[i].setForeground(Color.YELLOW);
                } 
                //ถ้าไม่ใช่ทั้งกรณีแรกและกรณี2ก็คือไม่ใช่วันปัจจุบันและมี status เป็น null
                else {
                    //เช็คว่า listname ตำแหน่งที่ i เป็นวันอะไร(วันในสัปดาห์)ต้องตรงตามตัวอักษรเป๊ะๆของ getThisDay
                    //และวันนี้มีค่าเหมือนกับวันที่กดปฏิทนหรือเปล่าและ listName ตำแหน่งทที่ i ที่มี status = 1
                    //ถ้าใช่ให้ checkList ตำแหน่งที่ i หายไปและทำการ remove ตำแหน่งที่ i ออกไปและ refresh หน้านั้นโดยใช้ repaint
                    if (listName.get(i).getDays().equalsIgnoreCase(getThisDay()) && toDay2.equals(dayCar) && listName.get(i).getStatus() == 1) {
                        checkList[i].setVisible(false);
                        bigpanelCheckList.remove(i);
                        bigpanelCheckList.repaint();
                        bigpanelCheckList.revalidate();
                    } 
                    //ถ้าไม่ตรงกับกรณีด้านบน
                    else {
                        //ให้ตัวอักษรเป็นสีแดงและไม่สามารถติ๊กเครื่องหมายได้
                        smallCheckListPanel[i].add(labelCheckList[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 14, -1, -1));
                        checkList[i].setBackground(new java.awt.Color(51, 51, 51));
                        checkList[i].setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                        checkList[i].setForeground(new java.awt.Color(255, 255, 255));
                        checkList[i].setText("Done");
                        checkList[i].setEnabled(false);
                        checkList[i].setForeground(Color.red);
                        labelCheckList[i].setEnabled(true);
                        labelCheckList[i].setForeground(Color.red);
                    }
                }
                //ในส่วนตรงนี้จะเป็นการเพิ่ม component ลงไปในส่วนต่างๆของหน้านี้
                smallCheckListPanel[i].add(checkList[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));
                bigpanelCheckList.add(status[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
                bigpanelCheckList.add(smallCheckListPanel[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(15, y, 440, -1));
                y += 35;
                jPanel4.add(bigpanelCheckList, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 464, 481, 240));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        scrollPaneCheckList.getViewport().removeAll();
        scrollPaneCheckList.setViewportView(bigpanelCheckList);
        bigpanelCheckList.repaint();
        bigpanelCheckList.revalidate(); //

    }

    //เป็น method ที่เป็น action ของ checkList ทีเราเพิ่มมาเพราะเนื่องจากว่าเราให้จำนวนเช็คลิสมีตามจำนวนของ listName
    public void checkListActionPerformed(java.awt.event.ActionEvent evt, int count) {
        if (checkList[count].isSelected() == true) {
            System.out.println("" + listId);
            System.out.println("Check list " + (count + 1) + " is selected");

        } else if (checkList[count].isSelected() == false) {
            System.out.println("Check list " + (count + 1) + " is not selected");
        }
    }

    //เรียกใช้เมื่อมีการกดวันที่ในปฏิทินของเรา
    public void clickCalendar() {
        try {
            String sql = null;
            listName.clear();
            listId.clear();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE"); //ไวใช้บอกวันว่าจันทร์หรืออังคารหรือ...
            String toDay = sdf.format(date);
            String selectedDay = sdf.format(Calendar.getCalendar().getTime());
            setThisDay(toDay);
           //
            sql = "SELECT * FROM LIST INNER JOIN PLAN ON LIST.list_planID = PLAN.planID "
                    + "WHERE startDate<=? AND endDate>=? AND list_nameDay =?";
            //เป็นการ parse จาก String ให้กลายเป็น type date
            Date dateToday = dateFormat.parse(dateFormat.format(date));
            //ถ้าวันที่เรากดหของปัจจุบันอยู่ก่อนหน้าวันปัจจุบันที่เป็น type date ให้ใช้ sql
            if (Calendar.getCalendar().getTime().before(dateToday)) {
                System.out.println("before this day");
            }
            pstm = conn.prepareStatement(sql); //INNER JOIN STATUSLIST ON LIST.listID = STATUSLIST.list_ID
            pstm.setString(1, dateFormat.format(Calendar.getCalendar().getTime()));
            pstm.setString(2, dateFormat.format(Calendar.getCalendar().getTime()));
            pstm.setString(3, selectedDay);
            String d = "";

            ResultSet rs = pstm.executeQuery();
            actToday.setText("");
            int rsCount = 0;
            while (rs.next()) {
                actToday.append("Exercise : " + rs.getString("listname") + "\n"); //กล่องด้านบนปริ้นตามจำนวน listname
                System.out.println("Exercise : " + rs.getString("listname"));
                listName1.add(rs.getString("listName"));
                listName.add(new ToDoList(rs.getInt("listID"), rs.getString("listName"), rs.getString("list_nameDay")));
                listId.add(rs.getInt("listID"));
                System.out.println("listId = " + rs.getInt("listID"));
                String sqlStatus = "SELECT * FROM STATUSLIST WHERE list_id=" + rs.getInt("listID")
                        + " AND listDate='" + dateFormat.format(Calendar.getCalendar().getTime()) + "'";
                Statement s = conn.createStatement();
                ResultSet rsStatus = s.executeQuery(sqlStatus);
                while (rsStatus.next()) {
                    listName.get(rsCount).setDateDone(rsStatus.getTimestamp("listDate"));
                    listName.get(rsCount).setStatus(rsStatus.getInt("statusDone"));
                    listName.get(rsCount).setStatusId(rsStatus.getInt("statusId"));
                }
                System.out.println("listId from object = " + listName.get(rsCount).getId());

                Date dateSelectday = dateFormat.parse(dateFormat.format(Calendar.getCalendar().getTime()));
                System.out.println("time dateSelectday = " + dateSelectday);
                if (!dateSelectday.equals(listName.get(rsCount).getDateDone())) {
                    System.out.println("not equal!");
                    listName.get(rsCount).setDateDone(null);
                }
                actToday.append("   - reps : " + rs.getInt("reps") + "\n");
                actToday.append("   - set : " + rs.getInt("set") + "\n");
                rsCount++;
            }
            tmp_listName = listName;
            tmp_listId = listId;
            loopCheckList();

            if (dateFormat.format(Calendar.getCalendar().getTime()).equals(dateFormat.format(date))) {
                txtDay.setText(dateFormat.format(date));
            } else {
                txtDay.setText(dateFormat.format(Calendar.getCalendar().getTime()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void backToMyPlan() {
        MyPlan mp = new MyPlan();
        mp.setVisible(true);
        mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mp.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public void createPlan() {
        CreatePlan cp = new CreatePlan();
        cp.setVisible(true);
        cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    
    
//งงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงงง
    public void saveCheckList() {
        ArrayList<ToDoList> list = this.listName;
        for (int i = 0; i < list.size(); i++) {
            if (this.checkList[i].isSelected()) {
                updateListStatus(list.get(i).getId(), i);
                checkList[i].setEnabled(false);
            } else {
            }
            this.checkList[i].setSelected(false);
        }
        repaint();
    }
    //งง

    public void updateListStatus(int id, int temp) {
        try {
            System.out.println(listName.size());
            if (checkList[temp].isSelected() == true) {
                System.out.println("BEFORE UPDATE");
                String sql = "INSERT INTO STATUSLIST (statusDone, list_ID, listDate) VALUES (?, ?, ?)";
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, 1);
                pstm.setInt(2, id);
                System.out.println("BEFORE UPDATE EXE  1");
                java.sql.Date myDate2 = new java.sql.Date(Calendar.getDate().getTime());
                pstm.setDate(3, myDate2);
                System.out.println("BEFORE UPDATE EXE  2");
                pstm.executeUpdate();

                System.out.println("UPDATE LAEW");
                checkList[temp].setForeground(new java.awt.Color(153, 255, 51));
                labelCheckList[temp].setForeground(new java.awt.Color(153, 255, 51));
                bigpanelCheckList.repaint();
                bigpanelCheckList.revalidate();
            }
//            if (checkList[temp].isSelected() == false) {
//                System.out.println("Check list " + (temp + 1) + " is not selected");
//                String sql = "INSERT INTO STATUSLIST (statusDone, list_ID, listDate) VALUES (?, ?, ?)";
//                pstm = conn.prepareStatement(sql);
//                pstm.setInt(1, 0);
//                pstm.setInt(2, id);
//                java.sql.Date myDate2 = new java.sql.Date(Calendar.getDate().getTime());
//                pstm.setDate(3, myDate2);
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void CalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CalendarPropertyChange
        clickCalendar();
    }//GEN-LAST:event_CalendarPropertyChange

    private void myplanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myplanBtnActionPerformed
        backToMyPlan();
    }//GEN-LAST:event_myplanBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        createPlan();
    }//GEN-LAST:event_createBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        saveCheckList();
    }//GEN-LAST:event_refreshBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public void chooseDayFromComboBox() throws ClassNotFoundException, SQLException {
//         Connection conn = MySQLConnect.getMySQLConnection();
//        System.out.println("selecting..");
//        pstm = conn.prepareStatement("SELECT startDate,endDate from PLAN where planID =");
//        ResultSet rs = pstm.executeQuery();
//        Date st;
//        Date end;
//        while (rs.next()) {
//            st = rs.getDate("startDate");
//            end = rs.getDate("endDate");
//            this.start = start;
//            this.end = end;
//            Calendar.setDate(start);
//        }
//    }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar Calendar;
    private javax.swing.JPanel Left;
    private javax.swing.JTextArea actToday;
    private javax.swing.JCheckBox activity1;
    private javax.swing.JCheckBox activity2;
    private javax.swing.JPanel bigpanelCheckList;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton myplanBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JScrollPane scrollActToday;
    private javax.swing.JScrollPane scrollPaneCheckList;
    private javax.swing.JTextPane showToDoList;
    private javax.swing.JLabel txtDay;
    private javax.swing.JLabel txtSantex;
    // End of variables declaration//GEN-END:variables
}
