/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.swing;

import com.group2.utils.Auth;
import com.group2.utils.GImage;
import com.group2.utils.MsgBox;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author HieuHoang
 */
public class Menu extends javax.swing.JPanel {

    private EventSelected event;
    private JPanel panel;

    public void addEventSelectedMenuItem(EventSelected event) {
        this.event = event;
        listMenuItem2.addEventSelectedMenuItem(this.event);
    }
    JFrame mainFrame;
    int x;
    int y;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();

        jPopupMenu1.setBackground(new Color(0, 0, 0, 0));
        jPopupMenu1.add(jPanel2);

        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

        });
        jPanel1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mainFrame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
                mainFrame.setOpacity(0.8f);

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mainFrame.setOpacity(1f);

            }

        });
        init();
    }

    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        conBtn1 = new com.group2.swing.ConBtn();
        conBtn2 = new com.group2.swing.ConBtn();
        conBtn3 = new com.group2.swing.ConBtn();
        jPanel1 = new javax.swing.JPanel();
        imageView1 = new com.group2.swing.ImageView();
        jLabel1 = new javax.swing.JLabel();
        listMenuItem2 = new com.group2.swing.ListMenuItem<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        jPopupMenu1.setFocusable(false);

        setOpaque(false);

        conBtn1.setBackground(new java.awt.Color(255, 0, 51));
        conBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtn1ActionPerformed(evt);
            }
        });

        conBtn2.setBackground(new java.awt.Color(255, 204, 0));
        conBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtn2ActionPerformed(evt);
            }
        });

        conBtn3.setBackground(new java.awt.Color(0, 153, 102));
        conBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtn3ActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        imageView1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icons/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Phòng Gym");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imageView1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imageView1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        listMenuItem2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listMenuItem2.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(listMenuItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenuItem2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    private void conBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtn2ActionPerformed
        // TODO add your handling code here:
        if (mainFrame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            mainFrame.setExtendedState(JFrame.NORMAL);
            panel.setLayout(new MigLayout("wrap 4, insets 20"));

        } else {
            mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            panel.setLayout(new MigLayout("wrap 5, insets 5"));

        }
    }//GEN-LAST:event_conBtn2ActionPerformed

    private void conBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtn1ActionPerformed
        // TODO add your handling code here:
        if (MsgBox.confirm(mainFrame, "Bạn có muốn thoát ứng dụng không?")) {
            System.exit(0);

        }
    }//GEN-LAST:event_conBtn1ActionPerformed

    private void conBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtn3ActionPerformed
        // TODO add your handling code here:
        this.mainFrame.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_conBtn3ActionPerformed

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#000428"), 0, getHeight(), Color.decode("#283E51"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.ConBtn conBtn1;
    private com.group2.swing.ConBtn conBtn2;
    private com.group2.swing.ConBtn conBtn3;
    private com.group2.swing.ImageView imageView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.group2.swing.ListMenuItem<MenuItemModel> listMenuItem2;
    // End of variables declaration//GEN-END:variables

    private void init() {

        if (Auth.isManager()) {
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_member_48px_1.png", "Quản lý hội viên", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_customer_insight_48px.png", "Quản lý khách hàng", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_package_48px.png", "Quản lý gói tập", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_product_documents_48px.png", "Quản lý sản phẩm", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_staff_48px.png", "Quản lý nhân viên", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_chart_30px.png", "Thống kê dữ liệu", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

        } else {
            //0
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));
///2
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_member_48px_1.png", "Quản lý hội viên", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));
//4
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_customer_insight_48px.png", "Quản lý khách hàng", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));
//6
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_package_48px.png", "Gói tập", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));
//8
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_product_documents_48px.png", "Sản phẩm", MenuItemModel.MenuItemType.MENUITEM));
            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));
//10
//            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_chart_30px.png", "Thống kê dữ liệu", MenuItemModel.MenuItemType.MENUITEM));
//            listMenuItem2.addItem(new MenuItemModel("/com/group2/icons/icons8_gym_48px.png", "Trang chủ", MenuItemModel.MenuItemType.EMPTY));

        }

    }
}
