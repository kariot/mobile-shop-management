/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Sreerag PR
 */
public class servicehome extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    
    public servicehome() {
        initComponents();
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
        logout = new javax.swing.JLabel();
        newservice = new javax.swing.JLabel();
        updateservicestatus = new javax.swing.JLabel();
        viewservice = new javax.swing.JLabel();
        sparestock = new javax.swing.JLabel();
        sparebooking = new javax.swing.JLabel();
        addcustomer = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutMouseReleased(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 60, 20));

        newservice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newservice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newserviceMouseReleased(evt);
            }
        });
        jPanel1.add(newservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 160, 160));

        updateservicestatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateservicestatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateservicestatusMouseReleased(evt);
            }
        });
        jPanel1.add(updateservicestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 160, 160));

        viewservice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewservice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewserviceMouseReleased(evt);
            }
        });
        jPanel1.add(viewservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 160, 160));

        sparestock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sparestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sparestockMouseReleased(evt);
            }
        });
        jPanel1.add(sparestock, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 160));

        sparebooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sparebooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sparebookingMouseReleased(evt);
            }
        });
        jPanel1.add(sparebooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 160, 160));

        addcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addcustomerMouseReleased(evt);
            }
        });
        jPanel1.add(addcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 160, 160));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 20, 20));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeMouseReleased(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 20, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/shop/management/service_homepage.png"))); // NOI18N
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseReleased
         this.setState(servicehome.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        dispose();
    }//GEN-LAST:event_closeMouseReleased

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_bgMouseDragged

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODxMouse = evt.getX();
    yMouse = evt.getY();
    xMouse = evt.getX();
    }//GEN-LAST:event_bgMousePressed

    private void logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseReleased
        loginpage lp=new loginpage();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseReleased

    private void newserviceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newserviceMouseReleased
        service_newservice ns = new service_newservice();
        ns.setVisible(true);dispose();
    }//GEN-LAST:event_newserviceMouseReleased

    private void viewserviceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewserviceMouseReleased
        service_view sv = new service_view();
        sv.setVisible(true);dispose();
    }//GEN-LAST:event_viewserviceMouseReleased

    private void updateservicestatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateservicestatusMouseReleased
        service_update su = new service_update();
        su.setVisible(true);dispose();
    }//GEN-LAST:event_updateservicestatusMouseReleased

    private void sparestockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sparestockMouseReleased
        service_sparestock ss = new service_sparestock();
        ss.setVisible(true);dispose();
    }//GEN-LAST:event_sparestockMouseReleased

    private void sparebookingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sparebookingMouseReleased
        service_bookproduct bp = new service_bookproduct();
        bp.setVisible(true);dispose();
    }//GEN-LAST:event_sparebookingMouseReleased

    private void addcustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomerMouseReleased
        service_addcustomer sa = new service_addcustomer();
        sa.setVisible(true);dispose();
    }//GEN-LAST:event_addcustomerMouseReleased

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
            java.util.logging.Logger.getLogger(servicehome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(servicehome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(servicehome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(servicehome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new servicehome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addcustomer;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel newservice;
    private javax.swing.JLabel sparebooking;
    private javax.swing.JLabel sparestock;
    private javax.swing.JLabel updateservicestatus;
    private javax.swing.JLabel viewservice;
    // End of variables declaration//GEN-END:variables
}
