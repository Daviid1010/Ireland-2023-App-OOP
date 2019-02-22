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
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Davy Sheehy
 */
public class EnglandGUI extends javax.swing.JFrame {

    /**
     * Creates new form EnglandGUI
     */
    public EnglandGUI() {
        initComponents();
        JFrame temp = new JFrame();
        temp.pack();
        Insets insets = temp.getInsets();
        temp = null;
        this.setSize(new Dimension(insets.left + insets.right + 740,
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

        backgroundPanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        coachTitleLbl = new javax.swing.JLabel();
        capTitleLbl = new javax.swing.JLabel();
        capacityLbl = new javax.swing.JLabel();
        stadLbl = new javax.swing.JLabel();
        capacityNameLbl = new javax.swing.JLabel();
        coachNameLbl = new javax.swing.JLabel();
        capNameLbl = new javax.swing.JLabel();
        stadiumNameLbl = new javax.swing.JLabel();
        logoBtn = new javax.swing.JButton();
        romeTouristInfoBtn = new javax.swing.JButton();
        coachinfoBtn = new javax.swing.JButton();
        capInfoBtn = new javax.swing.JButton();
        dubTouristBtn1 = new javax.swing.JButton();
        cardiffTouristBtn = new javax.swing.JButton();
        parisTouristBtn = new javax.swing.JButton();
        londonTouristInfoBtn = new javax.swing.JButton();
        edinTouristInfoBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        matchInfoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        backgroundPanel.setLayout(null);

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 0, 51));
        titleLbl.setText("England Team Home");
        backgroundPanel.add(titleLbl);
        titleLbl.setBounds(10, 20, 240, 40);

        coachTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        coachTitleLbl.setForeground(new java.awt.Color(255, 0, 51));
        coachTitleLbl.setText("Head Coach:");
        backgroundPanel.add(coachTitleLbl);
        coachTitleLbl.setBounds(10, 70, 130, 22);

        capTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        capTitleLbl.setForeground(new java.awt.Color(255, 0, 51));
        capTitleLbl.setText("Captain:");
        backgroundPanel.add(capTitleLbl);
        capTitleLbl.setBounds(10, 100, 90, 22);

        capacityLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        capacityLbl.setForeground(new java.awt.Color(255, 0, 51));
        capacityLbl.setText("Capacity:");
        backgroundPanel.add(capacityLbl);
        capacityLbl.setBounds(10, 160, 90, 22);

        stadLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stadLbl.setForeground(new java.awt.Color(255, 0, 51));
        stadLbl.setText("Stadium:");
        backgroundPanel.add(stadLbl);
        stadLbl.setBounds(10, 130, 90, 22);

        capacityNameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        capacityNameLbl.setForeground(new java.awt.Color(255, 0, 51));
        capacityNameLbl.setText("80000");
        backgroundPanel.add(capacityNameLbl);
        capacityNameLbl.setBounds(140, 160, 130, 22);

        coachNameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        coachNameLbl.setForeground(new java.awt.Color(255, 0, 51));
        coachNameLbl.setText("Eddie Jones");
        backgroundPanel.add(coachNameLbl);
        coachNameLbl.setBounds(140, 70, 130, 22);

        capNameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        capNameLbl.setForeground(new java.awt.Color(255, 0, 51));
        capNameLbl.setText("Dylan Hartley");
        backgroundPanel.add(capNameLbl);
        capNameLbl.setBounds(140, 100, 130, 22);

        stadiumNameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stadiumNameLbl.setForeground(new java.awt.Color(255, 0, 51));
        stadiumNameLbl.setText("Twickenham");
        backgroundPanel.add(stadiumNameLbl);
        stadiumNameLbl.setBounds(140, 130, 160, 22);

        logoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rfu-logo-300x300.jpg"))); // NOI18N
        logoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(logoBtn);
        logoBtn.setBounds(350, 60, 300, 300);

        romeTouristInfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        romeTouristInfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        romeTouristInfoBtn.setForeground(new java.awt.Color(255, 0, 51));
        romeTouristInfoBtn.setText("Rome Tourist Info");
        romeTouristInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        romeTouristInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romeTouristInfoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(romeTouristInfoBtn);
        romeTouristInfoBtn.setBounds(510, 500, 180, 40);

        coachinfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        coachinfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coachinfoBtn.setForeground(new java.awt.Color(255, 0, 51));
        coachinfoBtn.setText("See Coach Info");
        coachinfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        coachinfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachinfoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(coachinfoBtn);
        coachinfoBtn.setBounds(20, 400, 120, 40);

        capInfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        capInfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        capInfoBtn.setForeground(new java.awt.Color(255, 0, 51));
        capInfoBtn.setText("See Captain Info");
        capInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        capInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capInfoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(capInfoBtn);
        capInfoBtn.setBounds(170, 400, 130, 40);

        dubTouristBtn1.setBackground(new java.awt.Color(255, 255, 255));
        dubTouristBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dubTouristBtn1.setForeground(new java.awt.Color(255, 0, 51));
        dubTouristBtn1.setText("Dublin Tourist Info");
        dubTouristBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        dubTouristBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubTouristBtn1ActionPerformed(evt);
            }
        });
        backgroundPanel.add(dubTouristBtn1);
        dubTouristBtn1.setBounds(330, 400, 160, 40);

        cardiffTouristBtn.setBackground(new java.awt.Color(255, 255, 255));
        cardiffTouristBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardiffTouristBtn.setForeground(new java.awt.Color(255, 0, 51));
        cardiffTouristBtn.setText("Cardiff Tourist Info");
        cardiffTouristBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        cardiffTouristBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardiffTouristBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(cardiffTouristBtn);
        cardiffTouristBtn.setBounds(330, 450, 160, 40);

        parisTouristBtn.setBackground(new java.awt.Color(255, 255, 255));
        parisTouristBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parisTouristBtn.setForeground(new java.awt.Color(255, 0, 51));
        parisTouristBtn.setText("Paris Tourist Info");
        parisTouristBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        parisTouristBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parisTouristBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(parisTouristBtn);
        parisTouristBtn.setBounds(330, 500, 160, 40);

        londonTouristInfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        londonTouristInfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        londonTouristInfoBtn.setForeground(new java.awt.Color(255, 0, 51));
        londonTouristInfoBtn.setText("London Tourist Info");
        londonTouristInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        londonTouristInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                londonTouristInfoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(londonTouristInfoBtn);
        londonTouristInfoBtn.setBounds(510, 400, 180, 40);

        edinTouristInfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        edinTouristInfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edinTouristInfoBtn.setForeground(new java.awt.Color(255, 0, 51));
        edinTouristInfoBtn.setText("Edinburgh Tourist Info");
        edinTouristInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        edinTouristInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edinTouristInfoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(edinTouristInfoBtn);
        edinTouristInfoBtn.setBounds(510, 450, 180, 40);

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 0, 51));
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(logoutBtn);
        logoutBtn.setBounds(20, 480, 280, 60);

        matchInfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        matchInfoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        matchInfoBtn.setForeground(new java.awt.Color(255, 0, 51));
        matchInfoBtn.setText("See Match Info");
        matchInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        matchInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchInfoBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(matchInfoBtn);
        matchInfoBtn.setBounds(30, 290, 270, 70);

        getContentPane().add(backgroundPanel);
        backgroundPanel.setBounds(0, 0, 740, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoBtnActionPerformed
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URL avivaurl = new URL("https://www.irishrugby.ie");
                URI uri = avivaurl.toURI();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_logoBtnActionPerformed

    private void romeTouristInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romeTouristInfoBtnActionPerformed
        // TODO add your handling code here:
        RomeGUI rome = new RomeGUI();
        rome.setVisible(true);
    }//GEN-LAST:event_romeTouristInfoBtnActionPerformed

    private void dubTouristBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubTouristBtn1ActionPerformed
        // TODO add your handling code here:
        DublinGUI dub = new DublinGUI();
        dub.setVisible(true);
    }//GEN-LAST:event_dubTouristBtn1ActionPerformed

    private void cardiffTouristBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardiffTouristBtnActionPerformed
        // TODO add your handling code here:
        CardiffGUI card = new CardiffGUI();
        card.setVisible(true);
    }//GEN-LAST:event_cardiffTouristBtnActionPerformed

    private void parisTouristBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parisTouristBtnActionPerformed
        // TODO add your handling code here:
        ParisGUI paris = new ParisGUI();
        paris.setVisible(true);
    }//GEN-LAST:event_parisTouristBtnActionPerformed

    private void londonTouristInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_londonTouristInfoBtnActionPerformed
        // TODO add your handling code here:
        LondonGUI london = new LondonGUI();
        london.setVisible(true);
    }//GEN-LAST:event_londonTouristInfoBtnActionPerformed

    private void edinTouristInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edinTouristInfoBtnActionPerformed
        // TODO add your handling code here:
        EdinburghGUI edin = new EdinburghGUI();
        edin.setVisible(true);
    }//GEN-LAST:event_edinTouristInfoBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void coachinfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachinfoBtnActionPerformed
        // TODO add your handling code here:
        Manager headcoach = new Manager(22, 1, 0, 57, "Australia", "Eddie Jones");
        JOptionPane.showMessageDialog(null, headcoach.getInfo(headcoach.getName(), headcoach.getAge(), headcoach.getCountry(), headcoach.getWins(), headcoach.getLosses(), headcoach.getDraws()));

    }//GEN-LAST:event_coachinfoBtnActionPerformed

    private void capInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capInfoBtnActionPerformed
        // TODO add your handling code here:
        Captain cap = new Captain("Dylan Hartley",21,"New Zealand", 88, "Northhampton Saints");
        JOptionPane.showMessageDialog(null, cap.getInfo(cap.getName(), cap.getAge(), cap.getCountry(), cap.getAge(), cap.getClub()));
    }//GEN-LAST:event_capInfoBtnActionPerformed

    private void matchInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchInfoBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<MatchDay> matchArr = new ArrayList<>();
        MatchDay engGame1 = new MatchDay("England", "France", "Angus Gardner", "Twickenham, London", "4:50pm", "4/02/2017");
        matchArr.add(engGame1);
        MatchDay engGame2 = new MatchDay("Wales", "England", "Jerome Garces", "Principality Stadium,Cardiff", "4:50pm", "11/02/2017");
        matchArr.add(engGame2);
        MatchDay engGame3 = new MatchDay("England", "Italy", "Romain Poite", "Twickenham, London", "3:00pm", "26/02/2017");
        matchArr.add(engGame3);
        MatchDay engGame4 = new MatchDay("England", "Scotland", "Mathieu Raynal", "Twickenham, London", "4:00pm", "11/03/2017");
        matchArr.add(engGame4);
        MatchDay engGame5 = new MatchDay("Ireland", "England", "Jerome Garces", "Aviva Stadium, Dublin", "5:0pm", "18/03/2017");
        matchArr.add(engGame5);
        for (int i = 0; i < matchArr.size(); i++) {
            JOptionPane.showMessageDialog(null, matchArr.get(i).getInfo(matchArr.get(i).getHomeTeam(), matchArr.get(i).getAwayTeam(), matchArr.get(i).getReferee(), matchArr.get(i).getStadium(), matchArr.get(i).getMatchTime(), matchArr.get(i).getMatchDate()));
        }
    }//GEN-LAST:event_matchInfoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EnglandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnglandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnglandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnglandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnglandGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton capInfoBtn;
    private javax.swing.JLabel capNameLbl;
    private javax.swing.JLabel capTitleLbl;
    private javax.swing.JLabel capacityLbl;
    private javax.swing.JLabel capacityNameLbl;
    private javax.swing.JButton cardiffTouristBtn;
    private javax.swing.JLabel coachNameLbl;
    private javax.swing.JLabel coachTitleLbl;
    private javax.swing.JButton coachinfoBtn;
    private javax.swing.JButton dubTouristBtn1;
    private javax.swing.JButton edinTouristInfoBtn;
    private javax.swing.JButton logoBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton londonTouristInfoBtn;
    private javax.swing.JButton matchInfoBtn;
    private javax.swing.JButton parisTouristBtn;
    private javax.swing.JButton romeTouristInfoBtn;
    private javax.swing.JLabel stadLbl;
    private javax.swing.JLabel stadiumNameLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
