/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.ui;

import com.group2.dao.HoaDonCTDAO;
import com.group2.dao.KhachHangDAO;
import com.group2.dao.SanPhamDAO;
import com.group2.entity.GioHangSP;
import com.group2.entity.KhachHang;
import com.group2.entity.SanPham;
import com.group2.entity.SanPhamMua;
import com.group2.swing.Alert;
import com.group2.swing.GioHangSPPanel;
import com.group2.swing.ItemCartPanel;
import com.group2.swing.ScrollBarCustom;
import com.group2.utils.Auth;
import com.group2.utils.BillSP;
import com.group2.utils.MsgBox;
import com.group2.utils.GDate;
import com.group2.utils.Validation;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author HieuHoang
 */
public class HoaDonSanPhamJDailog extends javax.swing.JDialog {

    DecimalFormat df = new DecimalFormat("###,###.###");
    GioHangSPPanel gioHangPanel;

    /**
     * Creates new form HoaDonSanPham1JDailog
     */
    public HoaDonSanPhamJDailog(GioHangSPPanel gioHangPanel) {
        this.gioHangPanel = gioHangPanel;
        initComponents();
        designPanel();
        setBackground(new Color(0, 0, 0, 0));
        listPanelItem.setLayout(new MigLayout("wrap 1"));
        fillSPMuaToPanel();
        txtTongTien.setText(df.format(GioHangSP.tongTienGH()) + "₫");
        tongTienTT.setText(df.format(GioHangSP.tienThanhToan()) + "₫");

    }

    private void designPanel() {
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        jScrollPane1.setHorizontalScrollBar(new ScrollBarCustom());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        gradientBackGround1 = new com.group2.swing.GradientBackGround();
        conBtn2 = new com.group2.swing.ConBtn();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gradientBackGround2 = new com.group2.swing.GradientBackGround();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new com.group2.swing.TextField();
        txtHoVaTen = new com.group2.swing.TextField();
        jLabel6 = new javax.swing.JLabel();
        rdoNam = new com.group2.swing.RadioButtonCustom();
        rdoNu = new com.group2.swing.RadioButtonCustom();
        txtNgaySinh = new com.group2.swing.TextField();
        txtEmail = new com.group2.swing.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        rdoTienMat = new com.group2.swing.RadioButtonCustom();
        rdoThe = new com.group2.swing.RadioButtonCustom();
        jSeparator3 = new javax.swing.JSeparator();
        textAreaScroll2 = new com.group2.swing.TextAreaScroll();
        txtDiaChi = new com.group2.swing.TextArea();
        gradientBackGround3 = new com.group2.swing.GradientBackGround();
        jLabel5 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        giamGia = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tongTienTT = new javax.swing.JLabel();
        button1 = new com.group2.swing.Button();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPanelItem = new javax.swing.JPanel();
        textAreaScroll1 = new com.group2.swing.TextAreaScroll();
        txtGhiChu = new com.group2.swing.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);

        gradientBackGround1.setBorderRadius(10);

        conBtn2.setBackground(new java.awt.Color(204, 0, 0));
        conBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtn2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Hóa đơn sản phẩm");

        gradientBackGround2.setBorderRadius(5);
        gradientBackGround2.setShadowOpacity(0.3F);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 62, 81));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin khách hàng");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSDT.setLabelText("Số điện thoại");
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSDTKeyReleased(evt);
            }
        });

        txtHoVaTen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHoVaTen.setLabelText("Họ và tên");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(150, 150, 150));
        jLabel6.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNgaySinh.setLabelText("Ngày sinh");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setLabelText("Email");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 197, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phương thức thanh toán");

        buttonGroup2.add(rdoTienMat);
        rdoTienMat.setSelected(true);
        rdoTienMat.setText("Thanh toán bằng tiền mặt");
        rdoTienMat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup2.add(rdoThe);
        rdoThe.setText("Thanh toán trực tuyến(Momo, Ví điện tử VNPAY, Visa)");
        rdoThe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textAreaScroll2.setBackground(new java.awt.Color(255, 255, 255));
        textAreaScroll2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textAreaScroll2.setLabelText("Địa chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textAreaScroll2.setViewportView(txtDiaChi);

        javax.swing.GroupLayout gradientBackGround2Layout = new javax.swing.GroupLayout(gradientBackGround2);
        gradientBackGround2.setLayout(gradientBackGround2Layout);
        gradientBackGround2Layout.setHorizontalGroup(
            gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoThe, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(gradientBackGround2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gradientBackGround2Layout.createSequentialGroup()
                        .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gradientBackGround2Layout.createSequentialGroup()
                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradientBackGround2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 57, Short.MAX_VALUE)
                        .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textAreaScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        gradientBackGround2Layout.setVerticalGroup(
            gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientBackGround2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradientBackGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdoTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        gradientBackGround3.setBorderRadius(5);
        gradientBackGround3.setShadowOpacity(0.3F);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(202, 91, 91));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Giỏ hàng");

        header.setBackground(new java.awt.Color(246, 250, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tên sản phẩm");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Đơn giá");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Số lượng");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thành tiền");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("TT:");

        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTongTien.setText("960.000₫");

        giamGia.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        giamGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        giamGia.setText("0%");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Giảm giá:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Cần thanh toán:");

        tongTienTT.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tongTienTT.setForeground(new java.awt.Color(204, 0, 0));
        tongTienTT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tongTienTT.setText("900.000₫");

        button1.setBackground(new java.awt.Color(204, 0, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Thanh toán >>");
        button1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listPanelItem.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout listPanelItemLayout = new javax.swing.GroupLayout(listPanelItem);
        listPanelItem.setLayout(listPanelItemLayout);
        listPanelItemLayout.setHorizontalGroup(
            listPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        listPanelItemLayout.setVerticalGroup(
            listPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(listPanelItem);

        textAreaScroll1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textAreaScroll1.setLabelText("Ghi chú");
        textAreaScroll1.setOpaque(false);

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textAreaScroll1.setViewportView(txtGhiChu);

        javax.swing.GroupLayout gradientBackGround3Layout = new javax.swing.GroupLayout(gradientBackGround3);
        gradientBackGround3.setLayout(gradientBackGround3Layout);
        gradientBackGround3Layout.setHorizontalGroup(
            gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround3Layout.createSequentialGroup()
                        .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(giamGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tongTienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(gradientBackGround3Layout.createSequentialGroup()
                .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientBackGround3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientBackGround3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientBackGround3Layout.setVerticalGroup(
            gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(txtTongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(giamGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientBackGround3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(tongTienTT))
                .addGap(3, 3, 3)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout gradientBackGround1Layout = new javax.swing.GroupLayout(gradientBackGround1);
        gradientBackGround1.setLayout(gradientBackGround1Layout);
        gradientBackGround1Layout.setHorizontalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(conBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(gradientBackGround2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradientBackGround3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gradientBackGround1Layout.setVerticalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(conBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradientBackGround2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradientBackGround3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtn2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_conBtn2ActionPerformed

    private void txtSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyReleased
        thanhToan();
    }//GEN-LAST:event_txtSDTKeyReleased

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
//         TODO add your handling code here:

        if (GioHangSP.listSP.size() == 0) {
            MsgBox.alert(null, "Giỏ hàng trống", "Vui lòng chọn sản phẩm hoặc quét mã!", Alert.AlertType.ERROR);
        } else {
            //check số điện thoại
            if (Validation.checkExperession(txtSDT.getText(), "^(84|0[3|5|7|8|9])[0-9]{8}$") == false) {
                txtSDT.requestFocus();
                MsgBox.alert(this, "Lỗi", "Số điện thoại không đúng định dạng", Alert.AlertType.ERROR);
                return;
            }
            // check họ tên
            if (Validation.checkLength(txtHoVaTen.getText()) == false) {
                txtHoVaTen.requestFocus();
                MsgBox.alert(this, "Lỗi", "Họ tên không được để trống", Alert.AlertType.ERROR);
                return;
            }
            
            if(new Validation().checkName(txtHoVaTen.getText()) == false){
                txtHoVaTen.requestFocus();
                MsgBox.alert(this, "Lỗi", "Họ tên không hợp lệ", Alert.AlertType.ERROR);
                return;
            }
            // check ngày sinh
            if (new Validation().checkDate(txtNgaySinh.getText()) == false) {
                txtNgaySinh.requestFocus();
                MsgBox.alert(this, "Lỗi", "Vui lòng kiểm tra lại định dạng ngày 'yyyy-MM-dd'", Alert.AlertType.ERROR);
                return;
            }
            // check Email
            if (Validation.checkExperession(txtEmail.getText(), "^\\w+@\\w+(\\.\\w+){1,2}$") == false) {
                txtEmail.requestFocus();
                MsgBox.alert(this, "Lỗi", "Vui lòng kiểm tra lại email", Alert.AlertType.ERROR);
                return;
            }
            // chek địa chỉ
            if (Validation.checkLength(txtDiaChi.getText()) == false) {
                txtDiaChi.requestFocus();
                MsgBox.alert(this, "Lỗi", "Vui lòng nhập địa chỉ", Alert.AlertType.ERROR);
                return;
            }

            if (MsgBox.confirm(null, "Khách hàng có muốn xuất hóa đơn không?")) {
                hdctdao.themKHVaHD(txtSDT.getText(), Auth.user.getMaNV(), txtGhiChu.getText(), txtHoVaTen.getText(), txtDiaChi.getText(), GDate.toDate(txtNgaySinh.getText(), "yyyy-MM-dd"), rdoNam.isSelected() ? 1 : 0, null, txtEmail.getText());
                for (SanPhamMua sanPhamMua : GioHangSP.listSP) {
                    hdctdao.themSPVaoHD(sanPhamMua.getMaSP(),
                            sanPhamMua.getSoLuong(), sanPhamMua.getThanhTien());
                }
                BillSP billSP = new BillSP();
                billSP.printBill(txtSDT.getText(), Auth.user.getMaNV());
                GioHangSP.listSP.clear();
                gioHangPanel.setSLSanPham();
                dispose();

            } else {
                hdctdao.themKHVaHD(txtSDT.getText(), Auth.user.getMaNV(), txtGhiChu.getText(), txtHoVaTen.getText(), txtDiaChi.getText(), GDate.toDate(txtNgaySinh.getText(), "yyyy-MM-dd"), rdoNam.isSelected() ? 1 : 0, null, txtEmail.getText());
                for (SanPhamMua sanPhamMua : GioHangSP.listSP) {
                    hdctdao.themSPVaoHD(sanPhamMua.getMaSP(),
                            sanPhamMua.getSoLuong(), sanPhamMua.getThanhTien());
                }
                GioHangSP.listSP.clear();
                gioHangPanel.setSLSanPham();
                this.dispose();
            }

        }

    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public float checkVIP(Float n) {
        if (n < 5000000) {
            return (float) 0.0;
        } else if (n >= 5000000 && n < 10000000) {
            return (float) 0.05;
        } else if (n >= 10000000 && n < 20000000) {
            return (float) 0.1;
        } else if (n >= 20000000 && n < 50000000) {
            return (float) 0.15;
        } else {
            return (float) 0.2;
        }
    }
    HoaDonCTDAO hdctdao = new HoaDonCTDAO();
    KhachHangDAO daoKH = new KhachHangDAO();
    SanPhamDAO dao = new SanPhamDAO();
    List<SanPham> list = dao.selectAll();

    private void thanhToan() {
        String keyword = txtSDT.getText();
        List<KhachHang> kh = daoKH.selectNotInCourse(keyword);
        if (kh.size() > 0) {
            txtGhiChu.setText("");
            txtHoVaTen.setText(kh.get(0).getHoTen());
            txtNgaySinh.setText(kh.get(0).getNgaySinh().toString());
            txtEmail.setText(kh.get(0).getEmail());
            txtDiaChi.setText(kh.get(0).getDiaChi());

            if (kh.get(0).isGioiTinh() == true) {
                rdoNam.setSelected(true);
            } else {
                rdoNu.setSelected(true);
            }
            float tienKM = checkVIP(hdctdao.tongChiTieuKH(kh.get(0).getSoDT()));
            GioHangSP.giamGia = tienKM;
            giamGia.setText(Integer.valueOf((int) (tienKM * 100)) + "%");
            txtTongTien.setText(df.format(GioHangSP.tongTienGH()) + "₫");

            tongTienTT.setText(df.format(GioHangSP.tienThanhToan()) + "₫");
        } else {
            txtGhiChu.setText("");
            txtHoVaTen.setText("");
            txtNgaySinh.setText("");
            giamGia.setText("0%");
            txtGhiChu.setText("");
            GioHangSP.giamGia = 0;
            txtTongTien.setText(df.format(GioHangSP.tongTienGH()) + "₫");
            Float tongTien = GioHangSP.tongTienGH() - GioHangSP.tongTienGH() * 0;
            tongTienTT.setText(df.format(tongTien) + "₫");

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.group2.swing.ConBtn conBtn2;
    private javax.swing.JLabel giamGia;
    private com.group2.swing.GradientBackGround gradientBackGround1;
    private com.group2.swing.GradientBackGround gradientBackGround2;
    private com.group2.swing.GradientBackGround gradientBackGround3;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel listPanelItem;
    private com.group2.swing.RadioButtonCustom rdoNam;
    private com.group2.swing.RadioButtonCustom rdoNu;
    private com.group2.swing.RadioButtonCustom rdoThe;
    private com.group2.swing.RadioButtonCustom rdoTienMat;
    private com.group2.swing.TextAreaScroll textAreaScroll1;
    private com.group2.swing.TextAreaScroll textAreaScroll2;
    private javax.swing.JLabel tongTienTT;
    private com.group2.swing.TextArea txtDiaChi;
    private com.group2.swing.TextField txtEmail;
    private com.group2.swing.TextArea txtGhiChu;
    private com.group2.swing.TextField txtHoVaTen;
    private com.group2.swing.TextField txtNgaySinh;
    private com.group2.swing.TextField txtSDT;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void fillSPMuaToPanel() {
        listPanelItem.removeAll();
        for (SanPhamMua spm : GioHangSP.listSP) {
            ItemCartPanel item = new ItemCartPanel(spm, listPanelItem, txtTongTien, gioHangPanel, tongTienTT);
            item.setSize(546, 58);
            listPanelItem.add(item);
        }
    }
}
