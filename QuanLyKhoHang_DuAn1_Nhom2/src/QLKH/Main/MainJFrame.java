package QLKH.Main;

import QLKH.Helper.DialogHelper;
import QLKH.Helper.ShareHelper;
import QLKH.Main.LoginJDialog;
import QLKH.Main.HangHoaJFrame;
import QLKH.Main.HoaDonBanHangJFrame;
import QLKH.Main.HoaDonMuaHangJFrame;
import QLKH.Main.KhachHangJFrame;
import QLKH.Main.NhaCungCapJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setLocationRelativeTo(this);
        this.openWelcome();
        this.openLogin();
        // System.out.println(ShareHelper.USER.getTaiKhoan());

    }
    boolean stt = false;

    public MainJFrame(boolean x) {
        this();
        stt = x;
    }

    void openWelcome() {
        new IntroJDialog(this, true).setVisible(true);
    }

    void openLogin() {
        new LoginJDialog(this, true).setVisible(true);
    }

    void setStatus(boolean insertable) {
        pnlDangXuat.setEnabled(true);
        pnlHangHoa.setEnabled(true);
        pnlHoaDonBanHang.setEnabled(true);
        pnlHoaDonMuaHang.setEnabled(true);
        pnlNhaCungCap.setEnabled(insertable);
        pnlNhanVien.setEnabled(insertable);
        pnlThongKe.setEnabled(insertable);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblMini = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlHangHoa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlNhaCungCap = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlHoaDonMuaHang = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pnlHoaDonBanHang = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnlDangXuat = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogo.setBackground(new java.awt.Color(255, 51, 51));
        pnlLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_48px.png"))); // NOI18N
        lblExit.setToolTipText("Close");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        pnlLogo.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 80)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Home");
        pnlLogo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 140));

        lblMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_minus_48px.png"))); // NOI18N
        lblMini.setToolTipText("Miniform");
        lblMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiniMouseClicked(evt);
            }
        });
        pnlLogo.add(lblMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jPanel1.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 210));

        pnlNhanVien.setToolTipText("Click");
        pnlNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNhanVienMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_management_60px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhân Viên");

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(pnlNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 130, 130));

        pnlKhachHang.setToolTipText("Click");
        pnlKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlKhachHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlKhachHangMousePressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_60px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Khách Hàng");

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(pnlKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, 130));

        pnlHangHoa.setToolTipText("Click");
        pnlHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHangHoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHangHoaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHangHoaMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_trolley_60px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hàng Hóa");

        javax.swing.GroupLayout pnlHangHoaLayout = new javax.swing.GroupLayout(pnlHangHoa);
        pnlHangHoa.setLayout(pnlHangHoaLayout);
        pnlHangHoaLayout.setHorizontalGroup(
            pnlHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlHangHoaLayout.setVerticalGroup(
            pnlHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHangHoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(pnlHangHoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 130, 130));

        pnlNhaCungCap.setToolTipText("Click");
        pnlNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNhaCungCapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNhaCungCapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNhaCungCapMousePressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_supplier_60px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nhà Cung Cấp");

        javax.swing.GroupLayout pnlNhaCungCapLayout = new javax.swing.GroupLayout(pnlNhaCungCap);
        pnlNhaCungCap.setLayout(pnlNhaCungCapLayout);
        pnlNhaCungCapLayout.setHorizontalGroup(
            pnlNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlNhaCungCapLayout.setVerticalGroup(
            pnlNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhaCungCapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(pnlNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 130, 130));
        pnlNhaCungCap.getAccessibleContext().setAccessibleName("");

        pnlHoaDonMuaHang.setToolTipText("Click");
        pnlHoaDonMuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHoaDonMuaHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHoaDonMuaHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHoaDonMuaHangMousePressed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_purchase_order_60px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Hóa Đơn ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Mua Hàng");

        javax.swing.GroupLayout pnlHoaDonMuaHangLayout = new javax.swing.GroupLayout(pnlHoaDonMuaHang);
        pnlHoaDonMuaHang.setLayout(pnlHoaDonMuaHangLayout);
        pnlHoaDonMuaHangLayout.setHorizontalGroup(
            pnlHoaDonMuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHoaDonMuaHangLayout.createSequentialGroup()
                .addGroup(pnlHoaDonMuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHoaDonMuaHangLayout.setVerticalGroup(
            pnlHoaDonMuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonMuaHangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addComponent(jLabel22))
        );

        jPanel1.add(pnlHoaDonMuaHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 130));

        pnlHoaDonBanHang.setToolTipText("Click");
        pnlHoaDonBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHoaDonBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHoaDonBanHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHoaDonBanHangMousePressed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_bill_60px.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Hóa Đơn ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Bán Hàng");

        javax.swing.GroupLayout pnlHoaDonBanHangLayout = new javax.swing.GroupLayout(pnlHoaDonBanHang);
        pnlHoaDonBanHang.setLayout(pnlHoaDonBanHangLayout);
        pnlHoaDonBanHangLayout.setHorizontalGroup(
            pnlHoaDonBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHoaDonBanHangLayout.setVerticalGroup(
            pnlHoaDonBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(3, 3, 3)
                .addComponent(jLabel24)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(pnlHoaDonBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 130, 130));

        pnlThongKe.setToolTipText("Click");
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlThongKeMousePressed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_graph_report_60px.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Thống Kê");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(pnlThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 130, 130));

        pnlDangXuat.setToolTipText("Click");
        pnlDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDangXuatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDangXuatMousePressed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Đăng Xuất");

        javax.swing.GroupLayout pnlDangXuatLayout = new javax.swing.GroupLayout(pnlDangXuat);
        pnlDangXuat.setLayout(pnlDangXuatLayout);
        pnlDangXuatLayout.setHorizontalGroup(
            pnlDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlDangXuatLayout.setVerticalGroup(
            pnlDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(pnlDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void pnlNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseExited
        // TODO add your handling code here:
        resetColor(pnlNhanVien);
    }//GEN-LAST:event_pnlNhanVienMouseExited

    private void pnlNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseEntered
        // TODO add your handling code here:
        setColor(pnlNhanVien);
    }//GEN-LAST:event_pnlNhanVienMouseEntered

    private void pnlNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMousePressed
        // TODO add your handling code here:

        if (ShareHelper.authenticated() || ShareHelper.USER.isVaiTro()) {
            new NhanVienJFrame().show();
        } else {
            DialogHelper.alert(this, "");
        }

    }//GEN-LAST:event_pnlNhanVienMousePressed

    private void pnlKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMouseEntered
        // TODO add your handling code here:
        setColor(pnlKhachHang);
    }//GEN-LAST:event_pnlKhachHangMouseEntered

    private void pnlKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMouseExited
        // TODO add your handling code here:
        resetColor(pnlKhachHang);
    }//GEN-LAST:event_pnlKhachHangMouseExited

    private void pnlKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMousePressed
        // TODO add your handling code here:
        new KhachHangJFrame().show();
    }//GEN-LAST:event_pnlKhachHangMousePressed

    private void pnlHangHoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHangHoaMouseEntered
        // TODO add your handling code here:
        setColor(pnlHangHoa);
    }//GEN-LAST:event_pnlHangHoaMouseEntered

    private void pnlHangHoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHangHoaMouseExited
        // TODO add your handling code here:
        resetColor(pnlHangHoa);
    }//GEN-LAST:event_pnlHangHoaMouseExited

    private void pnlHangHoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHangHoaMousePressed
        // TODO add your handling code here:
        new HangHoaJFrame().show();
    }//GEN-LAST:event_pnlHangHoaMousePressed

    private void pnlNhaCungCapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhaCungCapMouseEntered
        // TODO add your handling code here:
        setColor(pnlNhaCungCap);
    }//GEN-LAST:event_pnlNhaCungCapMouseEntered

    private void pnlNhaCungCapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhaCungCapMouseExited
        // TODO add your handling code here:
        resetColor(pnlNhaCungCap);
    }//GEN-LAST:event_pnlNhaCungCapMouseExited

    private void pnlNhaCungCapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhaCungCapMousePressed
        // TODO add your handling code here:
        new NhaCungCapJFrame().show();
    }//GEN-LAST:event_pnlNhaCungCapMousePressed

    private void pnlHoaDonMuaHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMuaHangMouseEntered
        // TODO add your handling code here:
        setColor(pnlHoaDonMuaHang);
    }//GEN-LAST:event_pnlHoaDonMuaHangMouseEntered

    private void pnlHoaDonMuaHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMuaHangMouseExited
        // TODO add your handling code here:
        resetColor(pnlHoaDonMuaHang);
    }//GEN-LAST:event_pnlHoaDonMuaHangMouseExited

    private void pnlHoaDonMuaHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMuaHangMousePressed
        // TODO add your handling code here:
        new HoaDonMuaHangJFrame().show();
    }//GEN-LAST:event_pnlHoaDonMuaHangMousePressed

    private void pnlHoaDonBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonBanHangMouseEntered
        // TODO add your handling code here:
        setColor(pnlHoaDonBanHang);
    }//GEN-LAST:event_pnlHoaDonBanHangMouseEntered

    private void pnlHoaDonBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonBanHangMouseExited
        // TODO add your handling code here:
        resetColor(pnlHoaDonBanHang);
    }//GEN-LAST:event_pnlHoaDonBanHangMouseExited

    private void pnlHoaDonBanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonBanHangMousePressed
        // TODO add your handling code here:
        new HoaDonBanHangJFrame().show();
    }//GEN-LAST:event_pnlHoaDonBanHangMousePressed

    private void lblMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiniMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMiniMouseClicked

    private void pnlThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseEntered
        // TODO add your handling code here:
        setColor(pnlThongKe);
    }//GEN-LAST:event_pnlThongKeMouseEntered

    private void pnlThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseExited
        // TODO add your handling code here:
        resetColor(pnlThongKe);
    }//GEN-LAST:event_pnlThongKeMouseExited

    private void pnlThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMousePressed
        // TODO add your handling code here:

        if (ShareHelper.authenticated() && ShareHelper.USER.isVaiTro()) {
            new ThongKeJFrame().show();
        } else {
            DialogHelper.alert(this, "Chỉ Thủ Kho Được Xem");
        }

    }//GEN-LAST:event_pnlThongKeMousePressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void pnlDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDangXuatMouseEntered
        // TODO add your handling code here:
        setColor(pnlDangXuat);
    }//GEN-LAST:event_pnlDangXuatMouseEntered

    private void pnlDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDangXuatMouseExited
        // TODO add your handling code here:
        resetColor(pnlDangXuat);
    }//GEN-LAST:event_pnlDangXuatMouseExited

    private void pnlDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDangXuatMousePressed
        // TODO add your handling code here:
        new LoginJDialog(this, false).show();
    }//GEN-LAST:event_pnlDangXuatMousePressed
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 51, 51));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMini;
    private javax.swing.JPanel pnlDangXuat;
    private javax.swing.JPanel pnlHangHoa;
    private javax.swing.JPanel pnlHoaDonBanHang;
    private javax.swing.JPanel pnlHoaDonMuaHang;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlNhaCungCap;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlThongKe;
    // End of variables declaration//GEN-END:variables
}
