/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ZwartWitPion.java
 *
 * Created on 7-mrt-2011, 13:00:53
 */

package mastermind.controls;

import java.awt.Color;

/**
 *
 * @author Bram
 */
public class ZwartWitPion extends javax.swing.JPanel {

    /** Creates new form ZwartWitPion */
    public ZwartWitPion() {
        initComponents();
        this.setBackground(new Color(255,255,255,0));
        img.setVisible(false);
    }

    public void setKleur(String s)
    {
        if (s.equals(""))
        {
            img.setVisible(false);
        }
        else
        {
            org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mastermind.MasterMindApp.class).getContext().getResourceMap(ZwartWitPion.class);
            if (s.equals("w"))
            {
                img.setIcon(resourceMap.getIcon("img.icon"));
            }
            else if (s.equals("z"))
            {
                img.setIcon(resourceMap.getIcon("img2.icon"));
            }
            img.setVisible(true);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mastermind.MasterMindApp.class).getContext().getResourceMap(ZwartWitPion.class);
        img.setIcon(resourceMap.getIcon("img.icon")); // NOI18N
        img.setText(resourceMap.getString("img.text")); // NOI18N
        img.setName("img"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    // End of variables declaration//GEN-END:variables

}