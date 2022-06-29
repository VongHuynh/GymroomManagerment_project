/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.ui;

import com.group2.dao.KhachHangDAO;
import com.group2.entity.KhachHang;
import com.group2.swing.Alert;
import com.group2.swing.AvataTbHoiVien;
import com.group2.swing.AvataTbKhachHang;
import com.group2.swing.ScrollBarCustom;
import com.group2.utils.MsgBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HieuHoang
 */
public class KhachHangUI extends javax.swing.JPanel {

    boolean kt = true;
    DefaultTableModel model;
    KhachHangDAO khDAO = new KhachHangDAO();

    /**
     * Creates new form KhachHangUI
     */
    public KhachHangUI() {
        initComponents();
        designTable();
        fillToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientBackGround1 = new com.group2.swing.GradientBackGround();
        txtTimKiem = new com.group2.swing.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setOpaque(false);

        gradientBackGround1.setBorderRadius(10);
        gradientBackGround1.setShadowSize(5);

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTimKiem.setLabelText("Nhập số điện thoại hoặc họ tên");
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        tblKhachHang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Số điện thoại", "Họ tên", "Địa chỉ", "Ngày sinh", "Giới tính", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setRowHeight(25);
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        javax.swing.GroupLayout gradientBackGround1Layout = new javax.swing.GroupLayout(gradientBackGround1);
        gradientBackGround1.setLayout(gradientBackGround1Layout);
        gradientBackGround1Layout.setHorizontalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
                .addContainerGap())
        );
        gradientBackGround1Layout.setVerticalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        timKiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        kt = false;
        if (evt.getClickCount() == 2) {
            new ChiTietKhachHangJDailog(kt, khDAO.selectById(tblKhachHang.getValueAt(tblKhachHang.getSelectedRow(), 0))).setVisible(true);
            fillToTable();
        }
       
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void designTable() {
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        jScrollPane1.setHorizontalScrollBar(new ScrollBarCustom());
        tblKhachHang.getTableHeader().setBackground(new Color(40, 62, 81));
        tblKhachHang.getTableHeader().setForeground(Color.WHITE);
        tblKhachHang.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 13));
        tblKhachHang.getTableHeader().setOpaque(false);
        tblKhachHang.getColumnModel().getColumn(0).setCellRenderer(new AvataTbKhachHang());

    }

    private void fillToTable() {
        model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        List<KhachHang> list = khDAO.selectAll();
        for (KhachHang kh : list) {
            Object row[] = {kh.getSoDT(), kh.getHoTen(), kh.getDiaChi(), kh.getNgaySinh(), kh.isGioiTinh() ? "Nam" : "Nữ",kh.getEmail()};
            model.addRow(row);
        }
    }

    private void timKiem() {
        model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        List<KhachHang> list = khDAO.timKhachHang("%" + txtTimKiem.getText() + "%", "%" + txtTimKiem.getText() + "%");
        for (KhachHang kh : list) {
            Object row[] = {kh.getSoDT(), kh.getHoTen(), kh.getDiaChi(), kh.getNgaySinh(), kh.isGioiTinh() ? "Nam" : "Nữ", kh.getEmail()};
            model.addRow(row);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.GradientBackGround gradientBackGround1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private com.group2.swing.TextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}