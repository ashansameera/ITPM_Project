/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IT18229530;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mycode.DBconnect;
import IT19035536.Session_management;
import IT19035536.Main_Page;
import mycode.DBconnects;

/**
 *
 * @author aweer
 */
public class lecGrpSub extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public lecGrpSub() {
        initComponents();
         con = DBconnects.connects();
        clear();
    }
  private void clear(){
            j1.setSelectedIndex(-1);
            j2.setSelectedIndex(-1);
             j3.setSelectedIndex(-1);
              j4.setSelectedIndex(-1);
            j5.setSelectedIndex(-1);
  }
    private void fillcombox1(){
    
        try{
        String sql = "select * from session";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while (rs.next()){
        String lecture = rs.getString("Id");
        j1.addItem(lecture);
        }
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(this, e);
        }
        
    }
    private void fillcombox2(){
    
        try{
        String sql = "select * from subject";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while (rs.next()){
        String lecture = rs.getString("Subject_Code");
        j2.addItem(lecture);
        }
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(this, e);
        }
        
    }
    private void fillcombox3(){
    
        try{
        String sql = "select * from addstudentgroup";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while (rs.next()){
        String lecture = rs.getString("GroupNo");
        j3.addItem(lecture);
        }
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(this, e);
        }
        
    }
    private void fillcombox4(){
    
        try{
        String sql = "select * from lecture";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while (rs.next()){
        String lecture = rs.getString("Lecture_Name");
        j4.addItem(lecture);
        }
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(this, e);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        j1 = new javax.swing.JComboBox<>();
        j3 = new javax.swing.JComboBox<>();
        j4 = new javax.swing.JComboBox<>();
        j2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l3 = new java.awt.Label();
        j5 = new javax.swing.JComboBox<>();
        l4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l5 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 400));

        jLabel2.setText("Select Code");

        jLabel3.setText("Select group");

        jLabel4.setText("Select lecture");

        jLabel5.setText("    Time");

        jLabel1.setText("Select session ID");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        j1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                j1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Lecture Group SubGroup");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        j5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        j5.setAutoscrolls(true);
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j4, 0, 210, Short.MAX_VALUE)
                            .addComponent(j2, 0, 210, Short.MAX_VALUE)
                            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j5, 0, 243, Short.MAX_VALUE)
                            .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sessionID = j1.getSelectedItem().toString();
        String subcodes = j2.getSelectedItem().toString();
        String group = j3.getSelectedItem().toString();
        String lecture = j4.getSelectedItem().toString();
        String time =j5.getSelectedItem().toString();
        
  
         try{
            String q = "INSERT INTO lecgrpsub (sub_code,groups,Lecturer,Time,sessionID)"
                + "values ('"+subcodes+"','"+ group +"','"+ lecture+"','"+time+"','"+sessionID +"')";
        pst = (PreparedStatement) con.prepareStatement(q);
        pst.execute();
        JOptionPane.showMessageDialog(this, "Successfully added!");
        
        }
        catch (Exception e){
            
             JOptionPane.showMessageDialog(this, e);
        }
         
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
       fillcombox1();
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
       fillcombox2();
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        fillcombox3();
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
       fillcombox4();
    }//GEN-LAST:event_j4ActionPerformed

    private void j1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_j1PopupMenuWillBecomeInvisible
       String temp = (String) j1.getSelectedItem();
       String sql = "select * from session where Id=?";
        
        try{
       
        pst = con.prepareStatement(sql);
        pst.setString(1, temp);
        rs = pst.executeQuery();
        if(rs.next()){
        String add = rs.getString("subcode");
        l2.setText(add);
        String add1 = rs.getString("Groups");
        l3.setText(add1);
        String add2 = rs.getString("Lecture");
        l4.setText(add2);
        String add3 = rs.getString("Duration");
        l5.setText(add3);
                }
        }catch (Exception e){
            
             JOptionPane.showMessageDialog(this, e);
        } 
    }//GEN-LAST:event_j1PopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManageNotAvailable manages = new ManageNotAvailable();
        manages.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main_Page m1 = new Main_Page();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j5ActionPerformed

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
            java.util.logging.Logger.getLogger(lecGrpSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecGrpSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecGrpSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecGrpSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecGrpSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> j1;
    private javax.swing.JComboBox<String> j2;
    private javax.swing.JComboBox<String> j3;
    private javax.swing.JComboBox<String> j4;
    private javax.swing.JComboBox<String> j5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l2;
    private java.awt.Label l3;
    private javax.swing.JLabel l4;
    private java.awt.Label l5;
    // End of variables declaration//GEN-END:variables
}
