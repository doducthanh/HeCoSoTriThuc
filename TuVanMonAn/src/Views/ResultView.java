/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.MainController;
import Util.Common.LuaChon;
import java.util.Vector;

/**
 *
 * @author DoThanh
 */
public class ResultView extends javax.swing.JFrame {
    public float chiecao, cannang, dotuoi;
    public boolean isMale;
    public int mucDoLaoDong;
    public int select;
    public int indexSelectTang, indexSelectGiam;
    public float TDEE;
    Vector vTest = new Vector(0);
    /**
     * Creates new form ResultView
     */
    public ResultView() {
        initComponents();
        //show();
    }

    public void showResult(){
        MainController mainController = new MainController();
        String result = mainController.getResult(chiecao, cannang);
        System.out.println("ket qua la "+result);
        textResult.setText(result);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textResult = new javax.swing.JLabel();
        tang1 = new javax.swing.JRadioButton();
        tang2 = new javax.swing.JLabel();
        tang3 = new javax.swing.JComboBox();
        tang4 = new javax.swing.JLabel();
        giam4 = new javax.swing.JLabel();
        giam3 = new javax.swing.JComboBox();
        giam2 = new javax.swing.JLabel();
        giam1 = new javax.swing.JRadioButton();
        giucan = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hệ tư vấn dinh dưỡng");

        textResult.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textResult.setText("jLabel3");

        tang1.setText("Tăng cân");
        tang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tang1ActionPerformed(evt);
            }
        });

        tang2.setText("Số cân");

        tang3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        tang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tang3ActionPerformed(evt);
            }
        });

        tang4.setText("kg / tháng");

        giam4.setText("kg / tháng");

        giam3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.5", "1", "1.5", "2" }));
        giam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giam3ActionPerformed(evt);
            }
        });

        giam2.setText("Số cân");

        giam1.setText("Giảm cân");
        giam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giam1ActionPerformed(evt);
            }
        });

        giucan.setSelected(true);
        giucan.setText("Giữ cân");
        giucan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giucanActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Next.png"))); // NOI18N
        jButton1.setText("Tiếp tục");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
            .addComponent(textResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(giam1)
                    .addComponent(tang1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(giucan))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tang2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tang3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(tang4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(giam2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(giam3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(giam4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tang3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tang2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tang4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tang1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(giam3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giam4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(giam1)
                        .addComponent(giam2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(giucan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void giam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giam1ActionPerformed
        // TODO add your handling code here:
        select = 1;
        giucan.setSelected(false);
        tang1.setSelected(false);
        giam1.setSelected(true);
    }//GEN-LAST:event_giam1ActionPerformed

    private void giucanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giucanActionPerformed
        // TODO add your handling code here:
        select = 2;
        giucan.setSelected(true);
        tang1.setSelected(false);
        giam1.setSelected(false);
    }//GEN-LAST:event_giucanActionPerformed

    private void tang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tang1ActionPerformed
        // TODO add your handling code here:
        select = 0;
        giucan.setSelected(false);
        tang1.setSelected(true);
        giam1.setSelected(false);
    }//GEN-LAST:event_tang1ActionPerformed

    private void tang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tang3ActionPerformed
        // TODO add your handling code here:
        indexSelectTang = tang3.getSelectedIndex();
    }//GEN-LAST:event_tang3ActionPerformed

    private void giam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giam3ActionPerformed
        // TODO add your handling code here:
        indexSelectGiam = giam3.getSelectedIndex();
    }//GEN-LAST:event_giam3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //thuc thien code cho button xac nhan.
        ResultMenuView listMenuView = new ResultMenuView();
        listMenuView.setVisible(true);
        MainController controller = new MainController();
        float calo = controller.getCaloNeed(select, indexSelectTang, indexSelectGiam, TDEE);
        listMenuView.setCalo(calo);
        listMenuView.setCaloTungBua(controller.CaloSang,
                controller.CaloTrua, controller.CaloToi);
        listMenuView.setTable(1);
        listMenuView.setTable(2);
        listMenuView.setTable(3);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ResultView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton giam1;
    private javax.swing.JLabel giam2;
    private javax.swing.JComboBox giam3;
    private javax.swing.JLabel giam4;
    private javax.swing.JRadioButton giucan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton tang1;
    private javax.swing.JLabel tang2;
    private javax.swing.JComboBox tang3;
    private javax.swing.JLabel tang4;
    private javax.swing.JLabel textResult;
    // End of variables declaration//GEN-END:variables
}
