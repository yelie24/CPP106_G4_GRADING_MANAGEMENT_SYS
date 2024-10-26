package com.mycompany.grademanagementsystem;

//for creating and managing the swing components(GUI)
import javax.swing.*;

//for creating and managing table models
import javax.swing.table.DefaultTableModel;

//for reading data from files
import java.io.BufferedReader;
import java.io.FileReader;

//for writing text to files
import java.io.FileWriter;
import java.io.PrintWriter;

// For handling IO exceptions that may occur during file operations
import java.io.IOException;

//for dynamic array storage(like tables)
import java.util.Vector;

public class Edit_Grade extends javax.swing.JInternalFrame {
    //for managing data in the table
    private DefaultTableModel tableModel;
    
    public Edit_Grade() {
        initComponents();
        initializeTable(); // Initialize the table model
        displayFileInTable(); // Load and display data from file
        
    }
    //to initialize the table with predefined column names
    private void initializeTable() {
        String[] columns = { "First Name", "Last Name", "Student Number", "Year Level", "Prelim", "Midterm", "Final", "GPA", "Remarks" };
        tableModel = new DefaultTableModel(columns, 0);
        jTable1.setModel(tableModel); // Set the table model for jTable1
    }
    
    // Method to read student data from a file and display it in the table
    private void displayFileInTable() {
        try (BufferedReader reader = new BufferedReader(new FileReader("testingGMS.txt"))) {
            String line;
            //Read each line from the file until no more lines are left
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\s+");//Splits the lines based on whitespace
                //ensure there are enough data parts to avoid
                if (data.length >= 22) {
                    //Extract student information from the data
                    Vector<String> row = new Vector<>();
                    row.add(data[2]); 
                    row.add(data[5]); 
                    row.add(data[8]); 
                    row.add(data[11]); 
                    row.add(data[13]); 
                    row.add(data[15]); 
                    row.add(data[17]); 
                    row.add(data[19]); 
                    row.add(data[21]); 

                    tableModel.addRow(row); // Add new row to the table model
                }
            }
        } 
        catch (Exception e) {
            //Display error message
            JOptionPane.showMessageDialog(this, "Error reading file! Please contact your Programmer.", "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        StudentnoTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        prelimgrade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        midtermgrade1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        finalgrade = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(230, 235, 240));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Student Number:");

        StudentnoTF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudentnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentnoTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("New Prelim Grade:");

        prelimgrade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        prelimgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelimgradeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("New Midterm Grade:");

        midtermgrade1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        midtermgrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midtermgrade1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("New Final Grade:");

        finalgrade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        finalgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalgradeActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Edit Student Information");

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(416, 416, 416))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(midtermgrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prelimgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StudentnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midtermgrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prelimgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentnoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentnoTFActionPerformed

    private void prelimgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelimgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prelimgradeActionPerformed

    private void midtermgrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midtermgrade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midtermgrade1ActionPerformed

    private void finalgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalgradeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Get input values
        String studentNumber = StudentnoTF.getText().trim();
        String newPrelim = prelimgrade.getText().trim();
        String newMidterm = midtermgrade1.getText().trim();
        String newFinal = finalgrade.getText().trim();
        boolean found = false;
        
    try {
        // Read the existing data
        BufferedReader reader = new BufferedReader(new FileReader("testingGMS.txt"));
        StringBuilder updatedContent = new StringBuilder();
        String line;

    while ((line = reader.readLine()) != null) {
        String[] data = line.split("\\s+");
        if (data.length >= 22) {
            String studNum = data[8]; // Assuming student number is at index 8

            // If the student number matches, update the grades
            if (studNum.equals(studentNumber)) {
                line = line.replace(data[13], newPrelim)
                           .replace(data[15], newMidterm)
                           .replace(data[17], newFinal);
                found = true; // Student number found and grades updated
            }
        }
        updatedContent.append(line).append(System.lineSeparator());
    }
    reader.close();

    // Write the updated content back to the file if a record was found
    if (found) {
        PrintWriter writer = new PrintWriter(new FileWriter("testingGMS.txt"));
        writer.print(updatedContent.toString());
        writer.close();

        // Refresh the table display
        tableModel.setRowCount(0); // Clear current table
        displayFileInTable(); // Reload data from file
        JOptionPane.showMessageDialog(this, "Grades updated successfully!", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
    } 
    else {
        // Show error if student number was not found in the file
        JOptionPane.showMessageDialog(this, "Student number not found!", "ERROR!", JOptionPane.ERROR_MESSAGE);
    }
    
    // Clear the text fields after attempting the update
    StudentnoTF.setText("");
    prelimgrade.setText("");
    midtermgrade1.setText("");
    finalgrade.setText("");

    } 
    catch (Exception e) {
    // Show error if there's an issue with file access
    JOptionPane.showMessageDialog(this, "Error updating grades: " + e.getMessage(), "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
    
    // Clear the text fields if an exception occurs
    StudentnoTF.setText("");
    prelimgrade.setText("");
    midtermgrade1.setText("");
    finalgrade.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StudentnoTF;
    private javax.swing.JTextField finalgrade;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField midtermgrade1;
    private javax.swing.JTextField prelimgrade;
    // End of variables declaration//GEN-END:variables
}
