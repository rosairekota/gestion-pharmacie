/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GestionConge.VUE;

import controllers.ProductController;
import controllers.StockController;
import controllers.VenteController;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

/**
 *
 * @author Rosaire
 */
public class Stock_ViewDialog extends javax.swing.JDialog {

    // declaration de quelques attributs
    JTextField field = new JTextField();

    public Stock_ViewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ProductController.getInstance().getProducts(combo_ProductId);
        ProductController.getInstance().getProducts(combo_product_id);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        d = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_stockFieldid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        a = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtQTE_SORTANTE = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        date_vente = new com.toedter.calendar.JDateChooser();
        btn_MODIF1 = new javax.swing.JButton();
        btn_DELETE1 = new javax.swing.JButton();
        btn_AFFICHER1 = new javax.swing.JButton();
        combo_product_id = new javax.swing.JComboBox();
        txt_CU_sortante = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txt_LIBELLE = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        date_DEPART = new com.toedter.calendar.JDateChooser();
        combo_ProductId = new javax.swing.JComboBox();
        txtQTEentrante = new javax.swing.JTextField();
        txt_CU_entrant = new javax.swing.JTextField();
        btn_AFFICHER = new javax.swing.JButton();
        btn_SAVE = new javax.swing.JButton();
        btn_MODIF = new javax.swing.JButton();
        btn_DELETE = new javax.swing.JButton();
        btn_RENITIALISER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(37, 56, 110));

        c.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Blackadder ITC", 0, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText(" Light Pharma(Lp)  ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Application à la gestion d'une pharmacie");

        d.setBackground(new java.awt.Color(160, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/Search_25px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txt_stockFieldid.setBackground(new java.awt.Color(160, 0, 0));
        txt_stockFieldid.setForeground(new java.awt.Color(255, 255, 255));
        txt_stockFieldid.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/Add User Male_25px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/navigation-rightjjj.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/navigation-rightjjj - Copie.png"))); // NOI18N
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dLayout = new javax.swing.GroupLayout(d);
        d.setLayout(dLayout);
        dLayout.setHorizontalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dLayout.createSequentialGroup()
                        .addComponent(txt_stockFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49)
                        .addGap(22, 22, 22))))
        );
        dLayout.setVerticalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLayout.createSequentialGroup()
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_stockFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cLayout = new javax.swing.GroupLayout(c);
        c.setLayout(cLayout);
        cLayout.setHorizontalGroup(
            cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(cLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(108, 108, 108)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        cLayout.setVerticalGroup(
            cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cLayout.createSequentialGroup()
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        a.setBackground(new java.awt.Color(0, 51, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/Settings_white_20px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/Menu_25px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/Sans titre.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GestionConge/IMAGE/icone/accueil-icone-9107-32.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b.setBackground(new java.awt.Color(37, 56, 110));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "ENREGISTREMENT ET MISE A JOUR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enregistrer les ventes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Selectioner Id du produit");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Prix vendu");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Quantité vendue");

        txtQTE_SORTANTE.setForeground(new java.awt.Color(0, 102, 102));
        txtQTE_SORTANTE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setText("Date vente");

        btn_MODIF1.setBackground(new java.awt.Color(160, 0, 0));
        btn_MODIF1.setForeground(new java.awt.Color(255, 255, 255));
        btn_MODIF1.setText("Enregister");
        btn_MODIF1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MODIF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MODIF1ActionPerformed(evt);
            }
        });

        btn_DELETE1.setBackground(new java.awt.Color(160, 0, 0));
        btn_DELETE1.setForeground(new java.awt.Color(255, 255, 255));
        btn_DELETE1.setText("Supprimer");
        btn_DELETE1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DELETE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DELETE1ActionPerformed(evt);
            }
        });

        btn_AFFICHER1.setBackground(new java.awt.Color(0, 51, 51));
        btn_AFFICHER1.setForeground(new java.awt.Color(255, 255, 255));
        btn_AFFICHER1.setText("Afficher ");
        btn_AFFICHER1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AFFICHER1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AFFICHER1ActionPerformed(evt);
            }
        });

        txt_CU_sortante.setForeground(new java.awt.Color(0, 102, 102));
        txt_CU_sortante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQTE_SORTANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(date_vente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_product_id, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btn_MODIF1)
                        .addGap(44, 44, 44)
                        .addComponent(btn_AFFICHER1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_DELETE1)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(txt_CU_sortante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQTE_SORTANTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(date_vente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MODIF1)
                    .addComponent(btn_DELETE1)
                    .addComponent(btn_AFFICHER1))
                .addGap(218, 218, 218))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(txt_CU_sortante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(337, Short.MAX_VALUE)))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Approvisionez-vous ici (STOCK)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 102, 102));
        jLabel43.setText("Selectioner Id du produit");

        txt_LIBELLE.setForeground(new java.awt.Color(0, 102, 102));
        txt_LIBELLE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 102, 102));
        jLabel44.setText("Libelle");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 102, 102));
        jLabel45.setText("Date du stock");

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 102, 102));
        jLabel47.setText("Quantité entrante");

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 102, 102));
        jLabel48.setText("Coût unitaire entrant");

        date_DEPART.setForeground(new java.awt.Color(0, 102, 102));

        txtQTEentrante.setForeground(new java.awt.Color(0, 102, 102));
        txtQTEentrante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_CU_entrant.setForeground(new java.awt.Color(0, 102, 102));
        txt_CU_entrant.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date_DEPART, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTEentrante, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txt_CU_entrant, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(101, 101, 101))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                            .addComponent(txt_LIBELLE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_LIBELLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQTEentrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CU_entrant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(date_DEPART, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bLayout = new javax.swing.GroupLayout(b);
        b.setLayout(bLayout);
        bLayout.setHorizontalGroup(
            bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
            .addGroup(bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bLayout.setVerticalGroup(
            bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)))
        );

        btn_AFFICHER.setBackground(new java.awt.Color(0, 51, 51));
        btn_AFFICHER.setForeground(new java.awt.Color(255, 255, 255));
        btn_AFFICHER.setText("Afficher");
        btn_AFFICHER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AFFICHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AFFICHERActionPerformed(evt);
            }
        });

        btn_SAVE.setBackground(new java.awt.Color(160, 0, 0));
        btn_SAVE.setForeground(new java.awt.Color(255, 255, 255));
        btn_SAVE.setText("Enregistrer");
        btn_SAVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SAVEActionPerformed(evt);
            }
        });

        btn_MODIF.setBackground(new java.awt.Color(160, 0, 0));
        btn_MODIF.setForeground(new java.awt.Color(255, 255, 255));
        btn_MODIF.setText("Modifier");
        btn_MODIF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MODIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MODIFActionPerformed(evt);
            }
        });

        btn_DELETE.setBackground(new java.awt.Color(160, 0, 0));
        btn_DELETE.setForeground(new java.awt.Color(255, 255, 255));
        btn_DELETE.setText("Supprimer");
        btn_DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DELETEActionPerformed(evt);
            }
        });

        btn_RENITIALISER.setBackground(new java.awt.Color(0, 51, 51));
        btn_RENITIALISER.setForeground(new java.awt.Color(255, 255, 255));
        btn_RENITIALISER.setText("Renitialiser");
        btn_RENITIALISER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_RENITIALISER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RENITIALISERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btn_SAVE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_MODIF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_DELETE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_RENITIALISER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_AFFICHER)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AFFICHER)
                    .addComponent(btn_SAVE)
                    .addComponent(btn_MODIF)
                    .addComponent(btn_DELETE)
                    .addComponent(btn_RENITIALISER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        new Stock_ViewDialog(null, true).setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.dispose();
        new Home_Frame().setVisible(true);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void btn_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SAVEActionPerformed
        StockController.getInstance().create(txt_LIBELLE, txtQTEentrante, txt_CU_entrant, combo_ProductId, date_DEPART); 
//        boolean ok = new TraitementConge_SERVICE().insertion(txt_MATRICULE, txt_NOM, txt_CU_sortante, txtQTE_SORTANTE, txt_SEXE, txt_TELEPHONE, txt_ADRESSE,
//                date_vente, txt_fonction, combo_ProductId, txt_TCUENTRANT, txt_LIBELLE, txtQTEentrante,
//                date_DEPART, date_FIN_CONGE, date_RETOUR, txt_OBSERVATION);
//        if (ok == true) {
//            int rep = JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer à nouveau? oui ou non ?\n"
//                    + "Si vous cliquez sur oui, vous resterer dans cette fenêtre. "
//                    + "sinon c'est la fenêtre d'affichage des données qui apparaitra", "MESSAGE IMPORTANT ", JOptionPane.YES_NO_OPTION);
//            if (rep == JOptionPane.YES_OPTION) {
//                this.dispose();
//                this.setVisible(true);
//            } else {
//                this.dispose();
//                new Stock_ViewDialogTable(null, true).setVisible(true);
//
//            }
//        }
//
//
    }//GEN-LAST:event_btn_SAVEActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Operation_Controleur.affichageTableParMatricule(mariage_table, txt_SEARCH_CODE);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_RENITIALISERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RENITIALISERActionPerformed
    StockController.getInstance().reset(txt_LIBELLE, txtQTEentrante, txt_CU_entrant, combo_ProductId, date_DEPART);
    StockController.getInstance().reset(txt_LIBELLE, txtQTE_SORTANTE, txt_CU_sortante, combo_product_id, date_DEPART);
    
    }//GEN-LAST:event_btn_RENITIALISERActionPerformed

    private void btn_MODIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MODIFActionPerformed

//        int rep = JOptionPane.showConfirmDialog(null, "voulez-vous vraiment modifier? oui ou non ?\n", "MESSAGE IMPORTANT ", JOptionPane.YES_NO_OPTION);
//        if (rep == JOptionPane.YES_OPTION) {
//            boolean ok = new TraitementConge_SERVICE().insertion(txt_MATRICULE, txt_NOM, txt_CU_sortante, txtQTE_SORTANTE, txt_SEXE, txt_TELEPHONE, txt_ADRESSE,
//                    date_vente, txt_fonction, combo_ProductId, txt_TCUENTRANT, txt_LIBELLE, txtQTEentrante,
//                    date_DEPART, date_FIN_CONGE, date_RETOUR, txt_OBSERVATION);
//            if (ok) {
//                this.dispose();
//                new Stock_ViewDialog(null, true).setVisible(true);
//
//            }
//        } else {
//
//            new TraitementConge_SERVICE().renitialiser(txt_MATRICULE, txt_NOM, txt_CU_sortante, txtQTE_SORTANTE, txt_SEXE, txt_TELEPHONE, txt_ADRESSE,
//                    date_vente, txt_fonction, combo_ProductId, txt_TCUENTRANT, txt_LIBELLE, txtQTEentrante,
//                    date_DEPART, date_FIN_CONGE, date_RETOUR, txt_OBSERVATION);
//        }

    }//GEN-LAST:event_btn_MODIFActionPerformed

    private void btn_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DELETEActionPerformed
//         int rep = JOptionPane.showConfirmDialog(null, "voulez-vous vraiment supprimer? oui ou non ?\n", "MESSAGE IMPORTANT ", JOptionPane.YES_NO_OPTION);
//        if (rep == JOptionPane.YES_OPTION) {
//            boolean ok = new TraitementConge_SERVICE().supprimer(txt_MATRICULE);
//            if (ok) {
//                this.dispose();
//                new Stock_ViewDialog(null, true).setVisible(true);
//
//            }
//        } else {
//
//            new TraitementConge_SERVICE().renitialiser(txt_MATRICULE, txt_NOM, txt_CU_sortante, txtQTE_SORTANTE, txt_SEXE, txt_TELEPHONE, txt_ADRESSE,
//                    date_vente, txt_fonction, combo_ProductId, txt_TCUENTRANT, txt_LIBELLE, txtQTEentrante,
//                    date_DEPART, date_FIN_CONGE, date_RETOUR, txt_OBSERVATION);
//        }
    }//GEN-LAST:event_btn_DELETEActionPerformed

    private void btn_AFFICHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AFFICHERActionPerformed
        this.dispose();
        new Stock_ViewDialogTable(null, true).setVisible(true);
    }//GEN-LAST:event_btn_AFFICHERActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        this.dispose();
        new Stock_ViewDialogTable(null, true).setVisible(true);
    }//GEN-LAST:event_jLabel49MouseClicked

    private void btn_MODIF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MODIF1ActionPerformed
        VenteController.getInstance().create(txtQTE_SORTANTE, txtQTE_SORTANTE, txt_CU_entrant, combo_ProductId, date_vente);
    }//GEN-LAST:event_btn_MODIF1ActionPerformed

    private void btn_DELETE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DELETE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DELETE1ActionPerformed

    private void btn_AFFICHER1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AFFICHER1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AFFICHER1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {

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
            java.util.logging.Logger.getLogger(Stock_ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Stock_ViewDialog dialog = new Stock_ViewDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JPanel b;
    private javax.swing.JButton btn_AFFICHER;
    private javax.swing.JButton btn_AFFICHER1;
    private javax.swing.JButton btn_DELETE;
    private javax.swing.JButton btn_DELETE1;
    private javax.swing.JButton btn_MODIF;
    private javax.swing.JButton btn_MODIF1;
    private javax.swing.JButton btn_RENITIALISER;
    private javax.swing.JButton btn_SAVE;
    private javax.swing.JPanel c;
    private javax.swing.JComboBox combo_ProductId;
    private javax.swing.JComboBox combo_product_id;
    private javax.swing.JPanel d;
    private com.toedter.calendar.JDateChooser date_DEPART;
    private com.toedter.calendar.JDateChooser date_vente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtQTE_SORTANTE;
    private javax.swing.JTextField txtQTEentrante;
    private javax.swing.JTextField txt_CU_entrant;
    private javax.swing.JTextField txt_CU_sortante;
    private javax.swing.JTextField txt_LIBELLE;
    private javax.swing.JTextField txt_stockFieldid;
    // End of variables declaration//GEN-END:variables
}
