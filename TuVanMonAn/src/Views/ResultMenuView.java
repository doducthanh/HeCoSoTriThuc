/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Controller.MainController;
import Model.ConnectSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DoThanh
 */
public class ResultMenuView extends javax.swing.JFrame {
    float TDEE = 0;
    public float[] CaloSang = new float[3];
    public float[] CaloTrua = new float[3];
    public float[] CaloToi = new float[3];
    Vector vUnlike = new Vector(0);
    private Object  iUnlike = 0;
    private Vector  vUnlike1 = new Vector();
    private Vector  vUnlike2 = new Vector();
    private Vector  vUnlike3 = new Vector();
    final int delta = 10;
    /** Creates new form ResultMenuView */
    public ResultMenuView() {
        initComponents();
    }

    public void setCalo(float calo){
        labelCalo.setText(String.valueOf(calo));
    }
    
    public void setTable(int index){
        if (index == 1) {
            new MainController().Insert2Table(1, CaloSang, vUnlike, jTable1, jTable2, jTable3);
        }
        if (index == 2) {
            new MainController().Insert2Table(2, CaloTrua, vUnlike, jTable1, jTable2, jTable3);
        }
        if (index == 3) {
            new MainController().Insert2Table(3, CaloToi, vUnlike, jTable1, jTable2, jTable3);
        }
    }
    
    public void setCaloTungBua(float [] calosang, float []calotrua, float []calotoi){
        this.CaloSang[0] = calosang[0];
        this.CaloSang[1] = calosang[1];
        this.CaloSang[2] = calosang[2];
        
        this.CaloTrua[0] = calotrua[0];
        this.CaloTrua[1] = calotrua[1];
        this.CaloTrua[2] = calotrua[2];
        
        this.CaloToi[0] = calotoi[0];
        this.CaloToi[1] = calotoi[1];
        this.CaloToi[2] = calotoi[2];
        
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCalo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hệ tư vấn dinh dưỡng");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Số calo trong 1 ngày");

        labelCalo.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Calo");

        jLabel5.setText("Bữa sáng");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tên món", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Đổi món");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Bữa sáng");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tên món", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Đổi món");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Bữa sáng");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tên món", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Đổi món");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Xác nhận");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCalo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 317, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(labelCalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    public void DoiMon(int iTable){
        //Lấy ID của món ăn được chọn trong table gán vào biến 
        Object iUnlike = 0;
        switch(iTable)
        {
            case 1: 
                this.iUnlike = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                this.vUnlike1.add(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                break;
            case 2:
                this.iUnlike = jTable2.getValueAt(jTable2.getSelectedRow(), 0);
                this.vUnlike2.add(jTable2.getValueAt(jTable2.getSelectedRow(), 0));
                break;
            case 3:
                this.iUnlike = jTable3.getValueAt(jTable3.getSelectedRow(), 0);
                this.vUnlike3.add(jTable3.getValueAt(jTable3.getSelectedRow(), 0));
                break;
            default:
                this.iUnlike = 0;
        }
        //Xoá bảng
        ClearTable(iTable);
        //resetTable();
    }
    
    public void resetTable()
    {      
        int iRow1 = jTable1.getRowCount();
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        int iRow2 = jTable2.getRowCount();
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        int iRow3 = jTable3.getRowCount();
        DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();
        
        for(int i = 0; i < iRow1; i++)
            model1.removeRow(0);
        for(int i = 0; i < iRow2; i++)
            model2.removeRow(0);    
        for(int i = 0; i < iRow3; i++)
            model3.removeRow(0);
        
    }
    public void ClearTable(int iTable){
        int iRow = 0;
        DefaultTableModel model = null;
        switch(iTable)
        {
            case 1:
                iRow = jTable1.getRowCount();
                model = (DefaultTableModel) jTable1.getModel();
                for(int i = 0; i < iRow; i++)
                    model.removeRow(0);
                break;
            case 2:
                iRow = jTable2.getRowCount();
                model = (DefaultTableModel) jTable2.getModel();
                for(int i = 0; i < iRow; i++)
                    model.removeRow(0);
                break;
            case 3:
                iRow = jTable3.getRowCount();
                model = (DefaultTableModel) jTable3.getModel();
                for(int i = 0; i < iRow; i++)
                    model.removeRow(0);
                break;
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //ChangeFoodView changeFoodView = new ChangeFoodView();
        //changeFoodView.setVisible(true);
        DoiMon(1);
        Insert2Table(1, CaloSang, getvDoiMon1());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DoiMon(2);
        Insert2Table(2, CaloTrua, getvDoiMon2());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DoiMon(3);
        Insert2Table(3, CaloToi, getvDoiMon3());
        //new MainController().Insert2Table(3, CaloToi, vUnlike, jTable1, jTable2, jTable3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HomeView homeView = new HomeView();
        homeView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    public Object getDoiMon(){
        return iUnlike;
    }
    
    public Vector getvDoiMon1(){
        return vUnlike1;
    }
    
    public Vector getvDoiMon2(){
        return vUnlike2;
    }
    
    public Vector getvDoiMon3(){
        return vUnlike3;
    }
    
    public void Insert2Table(int iNhom, float [] Calo, Vector vUnlike){

        float ProteinClone = 0;
        float TinhbotClone = 0;
        float LipitClone = 0;

        float ProteinClone1 = 0;
        float TinhbotClone1 = 0;
        float LipitClone1 = 0;

        float prt;
        float tb;
        float lip;

        ConnectSQL connection = new ConnectSQL();
        Connection con = connection.connectsql();
        ResultSet rs = null;
        String sqlCommand = null;
        sqlCommand = "SELECT * FROM cstt.tbl_monan WHERE nhom = '" + iNhom + "' OR nhom = '4' ORDER BY nhom, diem DESC";
        Statement st;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            System.out.println(ex);
            //Logger.getLogger(JFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ProteinClone = Calo[0];
            TinhbotClone = Calo[1];
            LipitClone   = Calo[2];
            while(rs.next())
            {
                prt = rs.getInt(4);
                tb = rs.getInt(5);
                lip = rs.getInt(6);
                Object[] row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2); //Tên món ăn
                row[2] = rs.getString(3); //Khối lượng
                
                //Nếu gặp món ăn cần đổi thì continue;
                int iSize = vUnlike.size();
                boolean iCheck = false;
                for(int i = 0; i < iSize; i++)
                {
                    if(row[0].equals(vUnlike.get(i)))
                        iCheck = true;
                }
                if(iCheck)
                    continue;
                DefaultTableModel model = null;
                switch(iNhom)
                {
                    case 1: 
                        model = (DefaultTableModel) jTable1.getModel();
                        break;
                    case 2: 
                        model = (DefaultTableModel) jTable2.getModel();
                        break;
                    case 3: 
                        model = (DefaultTableModel) jTable3.getModel();
                        break;
                }
//                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                               
                ProteinClone = ProteinClone - prt;
                TinhbotClone = (TinhbotClone - tb);
                LipitClone   = LipitClone   - lip;
                if(ProteinClone > 0 && TinhbotClone > 0 && LipitClone > 0)
                {
                    model.addRow(row);
                }
                else{
                    ProteinClone = ProteinClone + prt;
                    TinhbotClone = TinhbotClone + tb;
                    LipitClone   = LipitClone   + lip;
//                    ProteinClone1 = ProteinClone;
//                    TinhbotClone1 = TinhbotClone;
//                    LipitClone1   = LipitClone;
                    if((Math.abs(ProteinClone) < delta) &&
                            (Math.abs(TinhbotClone) < delta) &&
                            (Math.abs(LipitClone) < delta))
                    {
                       // model.addRow(row);
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
//            Logger.getLogger(JFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
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
            java.util.logging.Logger.getLogger(ResultMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel labelCalo;
    // End of variables declaration//GEN-END:variables

}
