/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.UserData;

/**
 *
 * @author Farley Tran
 */
public class UserForm extends javax.swing.JPanel
{

    /**
     * Creates new form UserForm
     */
    public UserForm()
    {
        user = new UserData();
        initComponents();
    }
    
    private ImageIcon getImageIcon(String path,int widthImg, 
            int heightImg)
    {
        ImageIcon dabIcon = new ImageIcon(path);
        Image dabImage = dabIcon.getImage();
        Image modDabImage = dabImage.getScaledInstance(widthImg,
                heightImg, widthImg);
        return new ImageIcon(modDabImage);
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

        background = new javax.swing.JDesktopPane();
        background = new javax.swing.JDesktopPane()
        {
            protected void paintComponent(Graphics grphcs)
            {
                super.paintComponent(grphcs);
                Image img = getImageIcon("src/data/profile/background.png",background.getWidth(), background.getHeight()).getImage();
                grphcs.drawImage(img, 0, 0, null);
            }
        };
        jButton1 = new javax.swing.JButton();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        userPhone = new javax.swing.JLabel();

        background.setOpaque(false);

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Password");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        info1.setForeground(new java.awt.Color(51, 255, 153));
        info1.setText(user.getInfo1());

        info2.setForeground(new java.awt.Color(51, 255, 153));
        info2.setText(user.getInfo2());

        userPhone.setForeground(new java.awt.Color(51, 255, 153));
        userPhone.setText(user.getInfo3());

        background.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(info1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(info2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(userPhone, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(info1)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(info2)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(info1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        ChangePassword cp = new ChangePassword(user);
        cp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private UserData user;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane background;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel userPhone;
    // End of variables declaration//GEN-END:variables
}