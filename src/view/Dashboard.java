/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Axioo
 */
public class Dashboard extends javax.swing.JFrame {
    private String userRole;

    /**
     * Creates new form dashboard
     */
    public Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_navbar.setBackground(new java.awt.Color(51, 255, 255));
        pn_navbar.setPreferredSize(new java.awt.Dimension(715, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Sistem Penjualan Selo Hardware");

        btnLogout.setBackground(new java.awt.Color(255, 51, 102));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(250, 423));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        pn_content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Selamat Datang di Sistem Penjualan");

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pn_utama.add(pn_content, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_utama, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(727, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int response = JOptionPane.showConfirmDialog(this, 
            "Apakah anda yakin ingin logout?", "Konfirmasi", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);
            
        if (response == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
       ImageIcon produkIcon = new ImageIcon(getClass().getResource("/assets/products.png"));
       ImageIcon kasirIcon = new ImageIcon(getClass().getResource("/assets/sell.png"));
       ImageIcon pengadaanIcon = new ImageIcon(getClass().getResource("/assets/warehouse.png"));
       ImageIcon laporanIcon = new ImageIcon(getClass().getResource("/assets/report.png"));
       ImageIcon userIcon = new ImageIcon(getClass().getResource("/assets/user.png"));

       ActionListener produkAction = (e) -> {
            pn_utama.removeAll();
            pn_utama.add(new ProdukPanel());
            pn_utama.revalidate();
            pn_utama.repaint();
       };
       ActionListener kasirAction = (e) -> {
            pn_utama.removeAll();
            pn_utama.add(new KasirPanel());
            pn_utama.revalidate();
            pn_utama.repaint();
       };
       ActionListener pengadaanAction = (e) -> {
            pn_utama.removeAll();
            pn_utama.add(new PengadaanPanel());
            pn_utama.revalidate();
            pn_utama.repaint();
       };
       ActionListener laporanAction = (e) -> {
            pn_utama.removeAll();
            pn_utama.add(new LaporanPanel());
            pn_utama.revalidate();
            pn_utama.repaint();
       };
       ActionListener manajemenAction = (e) -> {
            pn_utama.removeAll();
            pn_utama.add(new ManajemenUserPanel());
            pn_utama.revalidate();
            pn_utama.repaint();
       };
       
       if ("superadmin".equalsIgnoreCase(userRole)) {
        MenuItem menuProduk = new MenuItem(produkIcon, false, null, "Daftar Produk", produkAction);
        MenuItem menuKasir = new MenuItem(kasirIcon, false, null, "Kasir", kasirAction);
        MenuItem menuPengadaan = new MenuItem(pengadaanIcon, false, null, "Pengadaan", pengadaanAction);
        MenuItem menuLaporan = new MenuItem(laporanIcon, false, null, "Laporan", laporanAction);
        MenuItem menuManajemen = new MenuItem(userIcon, false, null, "Laporan", manajemenAction);
        addMenu(menuProduk, menuKasir, menuPengadaan, menuLaporan,menuManajemen);
        } else if ("admin".equalsIgnoreCase(userRole)) {
            MenuItem menuProduk = new MenuItem(produkIcon, false, null, "Daftar Produk", produkAction);
            MenuItem menuPengadaan = new MenuItem(pengadaanIcon, false, null, "Pengadaan", pengadaanAction);
            addMenu(menuProduk, menuPengadaan);
        } else if ("user".equalsIgnoreCase(userRole)) {
            MenuItem menuProduk = new MenuItem(produkIcon, false, null, "Daftar Produk", produkAction);
            MenuItem menuKasir = new MenuItem(kasirIcon, false, null, "Kasir", kasirAction);
            addMenu(menuProduk, menuKasir);
        }
    }
    
    private void addMenu(MenuItem... menu){
        for (int i = 0; i < menu.length; i++){
            pn_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for(MenuItem m : subMenu){
            addMenu(m);
            }
        }
    pn_menu.revalidate();
    }

void setUserRole(String userRole) {
    this.userRole = userRole; // Simpan role ke dalam variabel instance
    
    // Reset menu panel
    pn_menu.removeAll();
    
    // Jalankan execute() untuk menambahkan menu sesuai role
    execute();
    
    // Refresh menu panel
    pn_menu.revalidate();
    pn_menu.repaint();
}
}
