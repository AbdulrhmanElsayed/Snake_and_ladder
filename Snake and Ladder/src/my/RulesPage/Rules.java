/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.RulesPage;

import javax.swing.ImageIcon;
import my.OptionsPage.OptionsPage;

/**
 *
 * @author Alaa
 */
public class Rules extends javax.swing.JFrame {

    /**
     * Creates new form Rules
     */
    public Rules() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RulesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        OkBTN = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        RulesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/RulesPage/Rules.png"))); // NOI18N
        getContentPane().add(RulesLabel);
        RulesLabel.setBounds(370, 20, 210, 80);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Unicode MS", 2, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(10);
        jTextArea1.setText("- In the beginning, the players roll the dice, the one with higher number starts playing.\n\n-  Incase both players get the same number, both of them keep rolling the dice until someone gets a number higher than the other.\n\n- The player rolls the dice and move as many cells as the number that appears due to the roll.\n\n- If a player stops at a cell that contains a head of a snake, \n  the player falls and follows the snake's body and stops at the cell containing the end of its body.\n\n- If a player stops at a cell that contains the bottom of a ladder, \n  the player goes up through the ladder and stops at the cell containing the top of the ladder.\n\n- If a player stops at a cell that contains the end of a snake's body or top of a ladder,\n  the player remains in place normally.\n\n- The first to get to cell number 100 wins.\n\n- If a player is close to cell 100 and gets a number that's higher than needed to win, \n  the player remains in place and doesn't move.\n(Ex: You're at cell 98 and need 2 to win. If you roll the dice and got 3, you remain in your place without movement, and so on)."); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 153, 51));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 120, 590, 490);

        OkBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/RulesPage/Ok button.png"))); // NOI18N
        OkBTN.setBorderPainted(false);
        OkBTN.setContentAreaFilled(false);
        OkBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OkBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OkBTN.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        OkBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OkBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                OkBTNMouseMoved(evt);
            }
        });
        OkBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OkBTNMouseExited(evt);
            }
        });
        OkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBTNActionPerformed(evt);
            }
        });
        getContentPane().add(OkBTN);
        OkBTN.setBounds(430, 640, 120, 90);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/RulesPage/Rules background.gif"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBTNActionPerformed
        new OptionsPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OkBTNActionPerformed

    private void OkBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkBTNMouseMoved
        OkBTN.setIcon(new ImageIcon(getClass().getResource("/my/RulesPage/Ok button(small).png")));
    }//GEN-LAST:event_OkBTNMouseMoved

    private void OkBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkBTNMouseExited
        OkBTN.setIcon(new ImageIcon(getClass().getResource("/my/RulesPage/Ok button.png")));
    }//GEN-LAST:event_OkBTNMouseExited

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
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton OkBTN;
    private javax.swing.JLabel RulesLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
