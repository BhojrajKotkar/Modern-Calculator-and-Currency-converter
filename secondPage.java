/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Bhojraj
 */
public class secondPage extends javax.swing.JFrame
{

    /**
     * Creates new form secondPage
     */
    public secondPage()
    {
        initComponents();
        setLocationRelativeTo(null);
        btncenter.setText("Convert");
        commonFunction.addLabelBackground(lblcross,"C:\\Users\\91976\\Documents\\NetBeansProjects\\GUIAPP3\\src\\main\\java\\mypackage\\images\\cancel.png");
        commonFunction.addLabelBackground(lblhome,"C:\\Users\\91976\\Documents\\NetBeansProjects\\GUIAPP3\\src\\main\\java\\mypackage\\images\\home.png");
        commonFunction.addLabelBackground(lblcar,"C:\\Users\\91976\\Documents\\NetBeansProjects\\GUIAPP3\\src\\main\\java\\mypackage\\images\\car.png");
        commonFunction.addLabelBackground(lblmap, "C:\\Users\\91976\\Documents\\NetBeansProjects\\GUIAPP3\\src\\main\\java\\mypackage\\images\\mapp.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        cmbconvert = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btncenter = new javax.swing.JButton();
        txtnum = new javax.swing.JTextField();
        lblresult = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcross = new javax.swing.JLabel();
        lblhome = new javax.swing.JLabel();
        lblcar = new javax.swing.JLabel();
        lblmap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(203, 218, 243));

        cmbconvert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbconvert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Any One:", "Meter to Centimeter", "km to Meter", "Feet to inches", "Miles to meters", "Hours to minutes" }));
        cmbconvert.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbconvertItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText(" Select any one:");

        btncenter.setBackground(new java.awt.Color(204, 0, 0));
        btncenter.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btncenter.setForeground(new java.awt.Color(255, 255, 102));
        btncenter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncenterActionPerformed(evt);
            }
        });

        txtnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblresult.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblresult.setForeground(new java.awt.Color(0, 102, 102));
        lblresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(99, 145, 221));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Let's Convert");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblcross.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcrossMouseClicked(evt);
            }
        });

        lblhome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblhomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblhome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcross, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblcar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblmap, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btncenter, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbconvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcross, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblhome, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(lblmap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblcar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncenter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    private void cmbconvertItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbconvertItemStateChanged
    {//GEN-HEADEREND:event_cmbconvertItemStateChanged
        String str;
        str = (String) cmbconvert.getSelectedItem();
        btncenter.setText(str);
        
        
    }//GEN-LAST:event_cmbconvertItemStateChanged

    private void btncenterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncenterActionPerformed
    {//GEN-HEADEREND:event_btncenterActionPerformed

        if(btncenter.getActionCommand().equals("Meter to Centimeter"))
        {
            try
            {
                int mtr;
                String strmtr;
                strmtr = txtnum.getText();
                mtr = Integer.parseInt(strmtr);
                int res;
                res = mtr*100;
                lblresult.setText(mtr +" meter = "+String.valueOf(res)+" cm");
            
//                if(txtnum.getText().equals(null))
//                {
//                    lblresult.setText("Enter Number First for Conversion");
//                }
            } catch (Exception e)
            {
                lblresult.setText("Enter number for conversion");
            }
        }
        
        if(btncenter.getActionCommand().equals("km to Meter"))
        {
            try
            {
                String str2;
                str2 = txtnum.getText();
                int num = Integer.parseInt(str2);
                int ans;
                ans = num*1000;
                lblresult.setText(num +" Km = "+String.valueOf(ans)+" Meter");
            } catch (Exception e)
            {
                lblresult.setText("Enter number for conversion");
            }
        }
        
        if(btncenter.getActionCommand().equals("Feet to inches"))
        {
            try
            {
                String str3 = txtnum.getText();
                int num1 = Integer.parseInt(str3);
                int res;
                res = num1*12;
                lblresult.setText(num1+" foot = "+String.valueOf(res)+" inches");
            } catch (Exception e)
            {
                lblresult.setText("Enter number for conversion");
            }
        }
        
        if(btncenter.getActionCommand().equals("Miles to meters"))
        {
            try
            {
                String str4 = txtnum.getText();
                int num2 = Integer.parseInt(str4);
                Double res;
                res = num2*1609.344;
                lblresult.setText(num2+" miles = "+String.valueOf(res)+" meter");
            } catch (Exception e)
            {
                lblresult.setText("Enter number for conversion");
            }
        }
        
         if(btncenter.getActionCommand().equals("Hours to minutes"))
        {
            try
            {
                String str4 = txtnum.getText();
                int num2 = Integer.parseInt(str4);
                int res;
                res = num2*60;
                lblresult.setText(num2+" hrs = "+String.valueOf(res)+" seconds");
            } catch (Exception e)
            {
                lblresult.setText("Enter number for conversion");
            }
        }
    }//GEN-LAST:event_btncenterActionPerformed

    private void lblcrossMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcrossMouseClicked
    {//GEN-HEADEREND:event_lblcrossMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblcrossMouseClicked

    private void lblhomeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblhomeMouseClicked
    {//GEN-HEADEREND:event_lblhomeMouseClicked
        firstPage pg = new firstPage();
        this.setVisible(false);
        pg.setVisible(true);
    }//GEN-LAST:event_lblhomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new secondPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncenter;
    private javax.swing.JComboBox<String> cmbconvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcar;
    private javax.swing.JLabel lblcross;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblmap;
    private javax.swing.JLabel lblresult;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
