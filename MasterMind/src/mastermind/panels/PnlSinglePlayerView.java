/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PnlSinglePlayerView.java
 *
 * Created on 5-mrt-2011, 14:11:33
 */

package mastermind.panels;

import mastermind.controls.BPanel;
import mastermind.events.request.RequestEvent;

/**
 *
 * @author Bram
 */
public class PnlSinglePlayerView extends BPanel {

    /** Creates new form PnlSinglePlayerView */
    public PnlSinglePlayerView() {
        initComponents();
    }
    public void showMain() {
         fireRequestEvent(new RequestEvent(this, "show:main"));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnNewGame = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnShowSolution = new javax.swing.JLabel();
        btnSetColors = new javax.swing.JLabel();
        pnlMasterMindGame1 = new mastermind.panels.PnlMasterMindGame();
        lblAchterGrond = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        jLayeredPane1.setName("jLayeredPane1"); // NOI18N

        btnNewGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewGame.setName("btnNewGame"); // NOI18N
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
        });
        btnNewGame.setBounds(530, 120, 210, 50);
        jLayeredPane1.add(btnNewGame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mastermind.MasterMindApp.class).getContext().getResourceMap(PnlSinglePlayerView.class);
        btnBack.setText(resourceMap.getString("btnBack.text")); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setName("btnBack"); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.setBounds(630, 490, 120, 50);
        jLayeredPane1.add(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnShowSolution.setText(resourceMap.getString("btnShowSolution.text")); // NOI18N
        btnShowSolution.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowSolution.setName("btnShowSolution"); // NOI18N
        btnShowSolution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowSolutionMouseClicked(evt);
            }
        });
        btnShowSolution.setBounds(490, 190, 250, 50);
        jLayeredPane1.add(btnShowSolution, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnSetColors.setText(resourceMap.getString("btnSetColors.text")); // NOI18N
        btnSetColors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetColors.setName("btnSetColors"); // NOI18N
        btnSetColors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetColorsMouseClicked(evt);
            }
        });
        btnSetColors.setBounds(540, 250, 200, 40);
        jLayeredPane1.add(btnSetColors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlMasterMindGame1.setName("pnlMasterMindGame1"); // NOI18N
        pnlMasterMindGame1.setBounds(60, 50, 353, 520);
        jLayeredPane1.add(pnlMasterMindGame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblAchterGrond.setIcon(resourceMap.getIcon("lblAchterGrond.icon")); // NOI18N
        lblAchterGrond.setName("lblAchterGrond"); // NOI18N
        lblAchterGrond.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(lblAchterGrond, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        fireRequestEvent(new RequestEvent(this, "show:main"));
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
       // JOptionPane.showMessageDialog(null, "Nieuwe game start hier");
        //new game regen of rows
        pnlMasterMindGame1.initGame();
      
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnShowSolutionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowSolutionMouseClicked
        pnlMasterMindGame1.showSolution();
    }//GEN-LAST:event_btnShowSolutionMouseClicked

    private void btnSetColorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetColorsMouseClicked
        pnlMasterMindGame1.showColorChooser();
    }//GEN-LAST:event_btnSetColorsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnNewGame;
    private javax.swing.JLabel btnSetColors;
    private javax.swing.JLabel btnShowSolution;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblAchterGrond;
    private mastermind.panels.PnlMasterMindGame pnlMasterMindGame1;
    // End of variables declaration//GEN-END:variables

}
