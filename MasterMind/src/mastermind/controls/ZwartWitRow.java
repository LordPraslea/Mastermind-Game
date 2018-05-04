/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ZwartWitRow.java
 *
 * Created on 7-mrt-2011, 13:13:16
 */

package mastermind.controls;

import java.awt.Color;

/**
 *
 * @author Bram
 */
public class ZwartWitRow extends javax.swing.JPanel {

    /** Creates new form ZwartWitRow */
    public ZwartWitRow() {
        initComponents();
        this.setBackground(new Color(255,255,255,0));
    }

    public void setKleuren(String kleuren)
    {
        setAllNotVisible();
        int strlen = kleuren.length();
        //zet kleuren voor alle actieve pinnetjes
        if (strlen>=1)
        {
            zwartWitPion1.setKleur(kleuren.substring(0,1));
            if (strlen>=2)
            {
                zwartWitPion2.setKleur(kleuren.substring(1,2));
                if (strlen >=3)
                {
                    zwartWitPion3.setKleur(kleuren.substring(2,3));
                    if (strlen >=4)
                    {
                        zwartWitPion4.setKleur(kleuren.substring(3,4));
                    }
                }
            }
        }
    }

    public void setAllNotVisible()
    {
        zwartWitPion1.setKleur("");
        zwartWitPion2.setKleur("");
        zwartWitPion3.setKleur("");
        zwartWitPion4.setKleur("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zwartWitPion1 = new mastermind.controls.ZwartWitPion();
        zwartWitPion2 = new mastermind.controls.ZwartWitPion();
        zwartWitPion3 = new mastermind.controls.ZwartWitPion();
        zwartWitPion4 = new mastermind.controls.ZwartWitPion();

        setName("Form"); // NOI18N

        zwartWitPion1.setName("zwartWitPion1"); // NOI18N

        zwartWitPion2.setName("zwartWitPion2"); // NOI18N

        zwartWitPion3.setName("zwartWitPion3"); // NOI18N

        zwartWitPion4.setName("zwartWitPion4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zwartWitPion1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zwartWitPion2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zwartWitPion3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zwartWitPion4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zwartWitPion1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zwartWitPion2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zwartWitPion3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zwartWitPion4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mastermind.controls.ZwartWitPion zwartWitPion1;
    private mastermind.controls.ZwartWitPion zwartWitPion2;
    private mastermind.controls.ZwartWitPion zwartWitPion3;
    private mastermind.controls.ZwartWitPion zwartWitPion4;
    // End of variables declaration//GEN-END:variables

}