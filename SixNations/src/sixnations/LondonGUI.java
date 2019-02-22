/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Insets;
import java.net.URI;
import java.net.URL;
import javax.swing.JFrame;

/**
 *
 * @author Wayne Hartigan
 */
public class LondonGUI extends javax.swing.JFrame {

    /**
     * Creates new form LondonGUI
     */
    public LondonGUI() {
        initComponents();
        JFrame temp = new JFrame();
        temp.pack();
        Insets insets = temp.getInsets();
        temp = null;
        this.setSize(new Dimension(insets.left + insets.right + 1120,
                insets.top + insets.bottom + 600));
        this.setVisible(true);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapBtn = new javax.swing.JButton();
        tourismHead = new javax.swing.JLabel();
        subHeader = new javax.swing.JLabel();
        tour1 = new javax.swing.JButton();
        tour2 = new javax.swing.JButton();
        tour3 = new javax.swing.JButton();
        tour4 = new javax.swing.JButton();
        tour5 = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        backgroundPanel = new javax.swing.JPanel();
        logoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mapBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/London.jpg"))); // NOI18N
        mapBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mapBtn);
        mapBtn.setBounds(30, 80, 710, 430);

        tourismHead.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tourismHead.setForeground(new java.awt.Color(255, 0, 51));
        tourismHead.setText("London Tourism Page");
        getContentPane().add(tourismHead);
        tourismHead.setBounds(580, 20, 274, 70);

        subHeader.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        subHeader.setForeground(new java.awt.Color(255, 0, 51));
        subHeader.setText("Popular Tourist Attractions:");
        getContentPane().add(subHeader);
        subHeader.setBounds(820, 120, 260, 60);

        tour1.setBackground(new java.awt.Color(255, 255, 255));
        tour1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tour1.setForeground(new java.awt.Color(255, 0, 51));
        tour1.setText("Tower of London");
        tour1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        tour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tour1ActionPerformed(evt);
            }
        });
        getContentPane().add(tour1);
        tour1.setBounds(830, 230, 230, 17);

        tour2.setBackground(new java.awt.Color(255, 255, 255));
        tour2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tour2.setForeground(new java.awt.Color(255, 0, 51));
        tour2.setText("London Eye");
        tour2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        tour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tour2ActionPerformed(evt);
            }
        });
        getContentPane().add(tour2);
        tour2.setBounds(830, 280, 230, 17);

        tour3.setBackground(new java.awt.Color(255, 255, 255));
        tour3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tour3.setForeground(new java.awt.Color(255, 0, 51));
        tour3.setText("Churchill War Rooms");
        tour3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        tour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tour3ActionPerformed(evt);
            }
        });
        getContentPane().add(tour3);
        tour3.setBounds(830, 330, 230, 17);

        tour4.setBackground(new java.awt.Color(255, 255, 255));
        tour4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tour4.setForeground(new java.awt.Color(255, 0, 51));
        tour4.setText("Westminster Abbey");
        tour4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        tour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tour4ActionPerformed(evt);
            }
        });
        getContentPane().add(tour4);
        tour4.setBounds(830, 380, 230, 17);

        tour5.setBackground(new java.awt.Color(255, 255, 255));
        tour5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tour5.setForeground(new java.awt.Color(255, 0, 51));
        tour5.setText("Big Ben");
        tour5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        tour5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tour5ActionPerformed(evt);
            }
        });
        getContentPane().add(tour5);
        tour5.setBounds(830, 430, 230, 17);

        menuButton.setBackground(new java.awt.Color(255, 255, 255));
        menuButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuButton.setForeground(new java.awt.Color(255, 0, 51));
        menuButton.setText("Main Menu");
        menuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menuButton);
        menuButton.setBounds(930, 493, 186, 78);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        backgroundPanel.setLayout(null);

        logoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/England_national_rugby_union_team_(emblem).svg.png"))); // NOI18N
        logoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(logoBtn);
        logoBtn.setBounds(890, 10, 70, 110);

        getContentPane().add(backgroundPanel);
        backgroundPanel.setBounds(20, 20, 1120, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapBtnActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.google.ie/maps/place/London,+UK/@51.5281613,-0.6620036,9z/data=!3m1!4b1!4m5!3m4!1s0x47d8a00baf21de75:0x52963a5addd52a99!8m2!3d51.5073509!4d-0.1277583?hl=en");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_mapBtnActionPerformed

    private void tour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tour1ActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.google.ie/maps/place/Tower+of+London/@51.5081157,-0.078138,17z/data=!3m1!4b1!4m5!3m4!1s0x48760349331f38dd:0xa8bf49dde1d56467!8m2!3d51.5081124!4d-0.0759493?hl=en");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tour1ActionPerformed

    private void tour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tour2ActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.google.ie/maps/place/Coca-Cola+London+Eye/@51.5033273,-0.1217317,17z/data=!3m1!4b1!4m5!3m4!1s0x487604b900d26973:0x4291f3172409ea92!8m2!3d51.503324!4d-0.119543?hl=en");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tour2ActionPerformed

    private void tour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tour3ActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.google.ie/maps/place/Churchill+War+Rooms/@51.5033273,-0.1217317,17z/data=!4m5!3m4!1s0x487604dad55789ab:0xcd8d10d8b2cf95e4!8m2!3d51.502217!4d-0.1293287?hl=en");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tour3ActionPerformed

    private void tour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tour4ActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.google.ie/maps/place/Westminster+Abbey,+Westminster,+London+SW1P+3PA,+UK/@51.4991869,-0.1296608,17z/data=!3m1!4b1!4m5!3m4!1s0x487604c359914745:0x700da0b0ccd9ee00!8m2!3d51.4994174!4d-0.1275705?hl=en");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tour4ActionPerformed

    private void tour5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tour5ActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.google.ie/maps/place/Big+Ben/@51.4991869,-0.1296608,17z/data=!4m5!3m4!1s0x487604c38c8cd1d9:0xb78f2474b9a45aa9!8m2!3d51.5007292!4d-0.1246254?hl=en");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tour5ActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void logoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoBtnActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.englandrugby.com");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_logoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LondonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LondonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LondonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LondonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LondonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton logoBtn;
    private javax.swing.JButton mapBtn;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel subHeader;
    private javax.swing.JButton tour1;
    private javax.swing.JButton tour2;
    private javax.swing.JButton tour3;
    private javax.swing.JButton tour4;
    private javax.swing.JButton tour5;
    private javax.swing.JLabel tourismHead;
    // End of variables declaration//GEN-END:variables
}
