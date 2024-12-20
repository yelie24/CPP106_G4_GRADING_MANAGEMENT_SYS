package com.mycompany.grademanagementsystem;
//to be able to write on files(txt)

//for reading data from files
import java.io.BufferedReader;
import java.io.FileReader;

//for writing data to files
import java.io.FileWriter;

// For handling IO exceptions that may occur during file operations
import java.io.IOException;

//to be able to display dialog boxes(error or message box)
import javax.swing.JOptionPane;

public class Add_Student extends javax.swing.JInternalFrame {

    public Add_Student() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gpaTF = new javax.swing.JTextField();
        remarksTF = new javax.swing.JTextField();
        firstname1 = new javax.swing.JLabel();
        lastname1 = new javax.swing.JLabel();
        yearlevel1 = new javax.swing.JLabel();
        studentnumber1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        FnameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LnameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        YlevelTF = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        StudentnoTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prelimgrade = new javax.swing.JTextField();
        midtermgrade = new javax.swing.JTextField();
        finalgrade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(230, 235, 240));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Show Student");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("First Name:");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Last Name:");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Year Level:");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Student Number:");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("GPA:");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Remarks:");

        gpaTF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        gpaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTFActionPerformed(evt);
            }
        });

        remarksTF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        remarksTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remarksTFActionPerformed(evt);
            }
        });

        firstname1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        firstname1.setText("__________________");

        lastname1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lastname1.setText("__________________");

        yearlevel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yearlevel1.setText("__________________");

        studentnumber1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        studentnumber1.setText("__________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearlevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(remarksTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstname1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstname1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearlevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remarksTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 159, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Add Student");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("First Name:");

        FnameTF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameTFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Last Name:");

        LnameTF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Year Level:");

        YlevelTF.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        YlevelTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-CPE", "2-CPE", "3-CPE", "4-CPE" }));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Student Number:");

        StudentnoTF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudentnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentnoTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Prelim Grade:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Midterm Grade:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Final Grade:");

        prelimgrade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        prelimgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelimgradeActionPerformed(evt);
            }
        });

        midtermgrade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        midtermgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midtermgradeActionPerformed(evt);
            }
        });

        finalgrade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        finalgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalgradeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(StudentnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(YlevelTF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(prelimgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(midtermgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FnameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LnameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(96, 96, 96)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YlevelTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prelimgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midtermgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void LnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameTFActionPerformed

    }//GEN-LAST:event_LnameTFActionPerformed

    private void FnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameTFActionPerformed
     
    }//GEN-LAST:event_FnameTFActionPerformed

    private void StudentnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentnoTFActionPerformed
      
    }//GEN-LAST:event_StudentnoTFActionPerformed

    private void prelimgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelimgradeActionPerformed
        
    }//GEN-LAST:event_prelimgradeActionPerformed

    private void midtermgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midtermgradeActionPerformed
       
    }//GEN-LAST:event_midtermgradeActionPerformed

    private void finalgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalgradeActionPerformed
        
    }//GEN-LAST:event_finalgradeActionPerformed

    private void gpaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTFActionPerformed

    }//GEN-LAST:event_gpaTFActionPerformed

    private void remarksTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarksTFActionPerformed
       
    }//GEN-LAST:event_remarksTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Start of Program
        //Declaration of Student information for user to input
        String Firstname = FnameTF.getText();
        String Lastname = LnameTF.getText();
        String Yearlevel = YlevelTF.getSelectedItem().toString();
        String Studentnumber = StudentnoTF.getText();

        // Set the retrieved data to the respective labels and display them
        firstname1.setText(Firstname);
        lastname1.setText(Lastname);
        yearlevel1.setText(Yearlevel);
        studentnumber1.setText(Studentnumber);

        String Prelim = prelimgrade.getText();
        String Midterm = midtermgrade.getText();
        String Final = finalgrade.getText();

        // Declare remarks and GPA as variables
        String remarks = "";
        double gpa = 0;

    try {
        // Check if student number is numeric
        if (!Studentnumber.matches("\\d+")) {
            throw new NumberFormatException("Student number must be numeric.");
    }
        
    // Check if the student number already exists in the file
    try (BufferedReader reader = new BufferedReader(new FileReader("testingGMS.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\\s+");
            if (data.length >= 22) {
                String existingStudentNumber = data[8]; // Assuming student number is at index 8
                if (existingStudentNumber.equals(Studentnumber)) {
                    JOptionPane.showMessageDialog(this, "Error: Student number already exists!", "DUPLICATE FILE!", JOptionPane.ERROR_MESSAGE);
                    return; // to exit the method if the student number already exists
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading from file!", "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method on read error
    }
    
        //Declare Prelimgrade, Midterm, and FinalGrade as well as average into double
        double Prelimgrade = Double.parseDouble(Prelim);
        double Midtermgrade = Double.parseDouble(Midterm);
        double Finalgrade = Double.parseDouble(Final);
        double average;

        // Error check for if input grade exceeds 100 or is less than 0
        if (Prelimgrade < 0 || Prelimgrade > 100) {
            throw new IllegalArgumentException("Prelim grade must be between 0 and 100.");
    }
        if (Midtermgrade < 0 || Midtermgrade > 100) {
            throw new IllegalArgumentException("Midterm grade must be between 0 and 100.");
    }
        if (Finalgrade < 0 || Finalgrade > 100) {
            throw new IllegalArgumentException("Final grade must be between 0 and 100.");
    }

        // Calculate average
        average = ((Prelimgrade + Midtermgrade + Finalgrade) / 3);

        // Check the condition of average to get GPA
        if (average >= 96 && average <= 100) {
            gpa = 1.0;
        } else if (average >= 92 && average < 96) {
            gpa = 1.25;
        } else if (average >= 88 && average < 92) {
            gpa = 1.50;
        } else if (average >= 84 && average < 88) {
            gpa = 1.75;
        } else if (average >= 80 && average < 84) {
            gpa = 2.0;
        } else if (average >= 75 && average < 80) {
            gpa = 2.25;
        } else if (average >= 70 && average < 75) {
            gpa = 2.50;
        } else if (average >= 65 && average < 70) {
            gpa = 2.75;
        } else if (average >= 60 && average < 65) {
            gpa = 3.0;
        } else {
            gpa = 5.0;
    }

        // Check the condition of GPA to get remarks
        if (gpa > 3.0) {
            remarks = "Failed";
        } else if (gpa >= 1.0 && gpa <= 3.0) {
            remarks = "Passed";
        } else {
            remarks = "Invalid";
    }
        // Format the GPA to 2 decimal places
        String formattedGPA = String.format("%.2f", gpa);

        // Set the formatted values to the text fields
        gpaTF.setText(formattedGPA);
        remarksTF.setText(remarks);
    
    //Filewriter appends the data to the txt file
    try (FileWriter Writer = new FileWriter("testingGMS.txt", true)) {
        //Write the student info to the file in this format
        Writer.write("First Name:" + " " + Firstname + " " +
                "Last Name:" + " " + Lastname + " " + 
                "Student Number:" + " " + Studentnumber + " " + 
                "Year Level:" + " " + Yearlevel + " " + 
                "Prelim:" + " " + Prelimgrade + " " + 
                "Midterm:" + " " + Midtermgrade + " " + 
                "Final:" + " "+ Finalgrade + " " + 
                "GPA:" + " "+ formattedGPA + " " + 
                "Remarks:" + " " + remarks + "\n");//'\n' is for adding newline
        
        Writer.write(System.lineSeparator()); // Cross-platform compatibility

        // Notify the user of a successful submission
        JOptionPane.showMessageDialog(null, "Successfully Submitted!");

        // Clear all the input fields for the next entry
        FnameTF.setText("");
        LnameTF.setText("");
        StudentnoTF.setText("");
        prelimgrade.setText("");
        midtermgrade.setText("");
        finalgrade.setText("");
        gpaTF.setText("");
        remarksTF.setText("");
        YlevelTF.setSelectedIndex(0); // Reset to default Year Level if needed

        // Optionally set focus back to the first input field
        FnameTF.requestFocus(); // Set focus to first name field to start adding another student

    } catch (Exception e) {
        //Display error message for writing file
        JOptionPane.showMessageDialog(null, "Error writing to file!");
        }
    } catch (NumberFormatException e) {
        //Display error message for invalid input
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "INPUT ERROR!", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        //Display error message for invalid grade input
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "INPUT ERROR!S", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Clear all of the inputted text field
        FnameTF.setText("");
        LnameTF.setText("");
        StudentnoTF.setText("");
        yearlevel1.setText("");

        // Clears all the labels displaying retrieved data
        firstname1.setText("");
        lastname1.setText("");
        studentnumber1.setText("");
        
        //Clears the grade field
        prelimgrade.setText("");
        midtermgrade.setText("");
        finalgrade.setText("");
        gpaTF.setText("");
        remarksTF.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FnameTF;
    private javax.swing.JTextField LnameTF;
    private javax.swing.JTextField StudentnoTF;
    private javax.swing.JComboBox<String> YlevelTF;
    private javax.swing.JTextField finalgrade;
    private javax.swing.JLabel firstname1;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lastname1;
    private javax.swing.JTextField midtermgrade;
    private javax.swing.JTextField prelimgrade;
    private javax.swing.JTextField remarksTF;
    private javax.swing.JLabel studentnumber1;
    private javax.swing.JLabel yearlevel1;
    // End of variables declaration//GEN-END:variables
}
