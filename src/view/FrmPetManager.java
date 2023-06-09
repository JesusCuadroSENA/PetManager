
package view;

import classes.*;
import controller.*;
import java.awt.HeadlessException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.modelCat;
import model.modelDog;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import model.DbData;


public class FrmPetManager extends javax.swing.JFrame {
    
    DbData dbData;

    ctlPet ctlPet;
    modelDog modeldog;
    modelCat modelCat;
    
    LinkedList<clsDog> dogObjectList = new LinkedList<>();
    LinkedList<clsCat> catObjectList = new LinkedList<>();

    public FrmPetManager() {
        setIconImage(new ImageIcon(getClass().getResource("/img/images.png")).getImage());
        initComponents();
        this.dbData = new DbData();
        this.ctlPet = new ctlPet();
        this.modeldog = new modelDog();
        this.modelCat = new modelCat();
        mostrarDatosDog();
        mostrarDatosCat();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CatTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        DogTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbBreedDog = new javax.swing.JComboBox<>();
        btnCrearDog = new javax.swing.JButton();
        btnBuscarDog = new javax.swing.JButton();
        btnEditarDog = new javax.swing.JButton();
        btnEliminarDog = new javax.swing.JButton();
        cbPedigree = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbHealthStatusDog = new javax.swing.JComboBox<>();
        txtCodeDog = new javax.swing.JTextField();
        txtBornYearDog = new javax.swing.JTextField();
        txtNameDog = new javax.swing.JTextField();
        txtColorDog = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbHealthStatusCat = new javax.swing.JComboBox<>();
        cbBreedCat = new javax.swing.JComboBox<>();
        txtCodeCat = new javax.swing.JTextField();
        txtBornYearCat = new javax.swing.JTextField();
        txtNameCat = new javax.swing.JTextField();
        txtColorCat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBuscarCat = new javax.swing.JButton();
        btnCrearCat = new javax.swing.JButton();
        btnEliminarCat = new javax.swing.JButton();
        btnEditarCat = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(245, 59, 113));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        CatTable.setBackground(new java.awt.Color(255, 204, 204));
        CatTable.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        CatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(CatTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CatTable", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("PetList");

        DogTable.setBackground(new java.awt.Color(255, 204, 204));
        DogTable.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        DogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(DogTable);

        jTabbedPane1.addTab("DogTable", jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(82, 50, 32));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Breed: ");

        cbBreedDog.setBackground(new java.awt.Color(255, 204, 204));
        cbBreedDog.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cbBreedDog.setForeground(new java.awt.Color(82, 50, 32));
        cbBreedDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastor Aleman", "Chihuahua", "Golden", "Dalmata" }));

        btnCrearDog.setBackground(new java.awt.Color(0, 204, 0));
        btnCrearDog.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnCrearDog.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearDog.setText("Crear");
        btnCrearDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDogActionPerformed(evt);
            }
        });

        btnBuscarDog.setBackground(new java.awt.Color(255, 204, 102));
        btnBuscarDog.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnBuscarDog.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDog.setText("Buscar");
        btnBuscarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDogActionPerformed(evt);
            }
        });

        btnEditarDog.setBackground(new java.awt.Color(153, 204, 255));
        btnEditarDog.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnEditarDog.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDog.setText("Editar");
        btnEditarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDogActionPerformed(evt);
            }
        });

        btnEliminarDog.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarDog.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnEliminarDog.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDog.setText("Eliminar");
        btnEliminarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDogActionPerformed(evt);
            }
        });

        cbPedigree.setBackground(new java.awt.Color(255, 204, 204));
        cbPedigree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbPedigree.setForeground(new java.awt.Color(82, 50, 32));
        cbPedigree.setText("Pedigree");
        cbPedigree.setBorder(null);
        cbPedigree.setBorderPainted(true);
        cbPedigree.setBorderPaintedFlat(true);
        cbPedigree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPedigreeActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(221, 221, 221));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(221, 221, 221));
        jLabel18.setText("Color: ");

        jLabel20.setBackground(new java.awt.Color(221, 221, 221));
        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(221, 221, 221));
        jLabel20.setText("Code:");

        jLabel21.setBackground(new java.awt.Color(221, 221, 221));
        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(221, 221, 221));
        jLabel21.setText("Born Year: ");

        jLabel22.setBackground(new java.awt.Color(221, 221, 221));
        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(221, 221, 221));
        jLabel22.setText("Health Status: ");

        cbHealthStatusDog.setBackground(new java.awt.Color(255, 204, 204));
        cbHealthStatusDog.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cbHealthStatusDog.setForeground(new java.awt.Color(82, 50, 32));
        cbHealthStatusDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermo", "Sano", "En Diagnostico" }));
        cbHealthStatusDog.setToolTipText("");

        txtCodeDog.setBackground(new java.awt.Color(255, 204, 204));
        txtCodeDog.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        txtBornYearDog.setBackground(new java.awt.Color(255, 204, 204));
        txtBornYearDog.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        txtNameDog.setBackground(new java.awt.Color(255, 204, 204));
        txtNameDog.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        txtColorDog.setBackground(new java.awt.Color(255, 204, 204));
        txtColorDog.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLabel24.setBackground(new java.awt.Color(221, 221, 221));
        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(221, 221, 221));
        jLabel24.setText("Name: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)
                        .addComponent(cbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbPedigree)
                .addGap(312, 312, 312))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbHealthStatusDog, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodeDog))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtColorDog)
                                .addComponent(txtNameDog)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(txtBornYearDog)))
                    .addGap(108, 108, 108)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(cbPedigree)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCodeDog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNameDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtColorDog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBornYearDog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(cbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(367, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("DogManager", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("DogManager");

        jPanel2.setBackground(new java.awt.Color(82, 50, 32));

        cbHealthStatusCat.setBackground(new java.awt.Color(255, 204, 204));
        cbHealthStatusCat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cbHealthStatusCat.setForeground(new java.awt.Color(82, 50, 32));
        cbHealthStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermo", "Sano", "En Diagnostico" }));

        cbBreedCat.setBackground(new java.awt.Color(255, 204, 204));
        cbBreedCat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cbBreedCat.setForeground(new java.awt.Color(82, 50, 32));
        cbBreedCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persia", "Siberiano", "Siames", "Kohana" }));

        txtCodeCat.setBackground(new java.awt.Color(255, 204, 204));
        txtCodeCat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        txtBornYearCat.setBackground(new java.awt.Color(255, 204, 204));
        txtBornYearCat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        txtNameCat.setBackground(new java.awt.Color(255, 204, 204));
        txtNameCat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        txtColorCat.setBackground(new java.awt.Color(255, 204, 204));
        txtColorCat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(221, 221, 221));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(221, 221, 221));
        jLabel7.setText("Name: ");

        jLabel8.setBackground(new java.awt.Color(221, 221, 221));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(221, 221, 221));
        jLabel8.setText("Color: ");

        jLabel9.setBackground(new java.awt.Color(221, 221, 221));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(221, 221, 221));
        jLabel9.setText("Breed: ");

        jLabel10.setBackground(new java.awt.Color(221, 221, 221));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(221, 221, 221));
        jLabel10.setText("Code:");

        jLabel11.setBackground(new java.awt.Color(221, 221, 221));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(221, 221, 221));
        jLabel11.setText("Born Year: ");

        jLabel12.setBackground(new java.awt.Color(221, 221, 221));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(221, 221, 221));
        jLabel12.setText("Health Status: ");

        btnBuscarCat.setBackground(new java.awt.Color(255, 204, 102));
        btnBuscarCat.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnBuscarCat.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCat.setText("Buscar");
        btnBuscarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCatActionPerformed(evt);
            }
        });

        btnCrearCat.setBackground(new java.awt.Color(0, 204, 0));
        btnCrearCat.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnCrearCat.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCat.setText("Crear");
        btnCrearCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCatActionPerformed(evt);
            }
        });

        btnEliminarCat.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarCat.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnEliminarCat.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCat.setText("Eliminar");
        btnEliminarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCatActionPerformed(evt);
            }
        });

        btnEditarCat.setBackground(new java.awt.Color(153, 204, 255));
        btnEditarCat.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnEditarCat.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCat.setText("Editar");
        btnEditarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCatActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gato.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameCat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodeCat))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorCat))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBornYearCat)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(3, 3, 3)
                                .addComponent(cbHealthStatusCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbBreedCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNameCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtColorCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBornYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbHealthStatusCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbBreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17)))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("CatManager", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("CatManager");

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, 730, 640));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Container");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 60)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(245, 59, 113));
        jLabel16.setText("Manager");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 60)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(245, 59, 113));
        jLabel13.setText("de");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 60)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(245, 59, 113));
        jLabel15.setText("Mascotas");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(799, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(71, 71, 71))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCatActionPerformed
        try{
            String code = txtCodeCat.getText();
            String name = txtNameCat.getText();
            String color = txtColorCat.getText();
            int born_year = Integer.parseInt(txtBornYearCat.getText());
            String breed = cbBreedCat.getSelectedItem().toString();
            String health_status = cbHealthStatusCat.getSelectedItem().toString();

            if((code.equals("")) || (name.equals("")) || (color.equals(""))|| (breed.equals("")) || (health_status.equals(""))){

                JOptionPane.showMessageDialog(null, "Ingrese todos los campos");

            } else {
                clsCat cat = new clsCat(breed, code, name, born_year, color, health_status);
                modelCat.EditPet(cat);
                JOptionPane.showMessageDialog(null, "Su registro ha sido actualizado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite un valor valido!!");
        }
    }//GEN-LAST:event_btnEditarCatActionPerformed

    private void btnEliminarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCatActionPerformed
        try{
            String code = txtCodeCat.getText();
            if (code.equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            } else {
                boolean found = false;
                found = ctlPet.DeletePet(code, "Gato");
                clearCatFields();
                JOptionPane.showMessageDialog(null, "Su registro ha sido eliminado");
                if(!found){
                    JOptionPane.showMessageDialog(null, "No hemos encontrado el codigo");
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Los datos no son validos");
        }
    }//GEN-LAST:event_btnEliminarCatActionPerformed

    private void btnCrearCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCatActionPerformed

        try{
            String code = txtCodeCat.getText();
            String name = txtNameCat.getText();
            String color = txtColorCat.getText();
            int born_year = Integer.parseInt(txtBornYearCat.getText());
            String breed = cbBreedCat.getSelectedItem().toString();
            String health_status = cbHealthStatusCat.getSelectedItem().toString();

            if(code.equals("") || name.equals("") || color.equals("")){
                JOptionPane.showMessageDialog(this, "Llene todos los campos");
            } else {
                clsCat cat = new clsCat(breed, code, name, born_year, color, health_status);
                modelCat.CreatePet(cat);
                JOptionPane.showMessageDialog(this, "Registro guardado");
            }
        } catch(HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite un valor valido");
        }
    }//GEN-LAST:event_btnCrearCatActionPerformed

    private void btnBuscarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCatActionPerformed
        String code = txtCodeCat.getText();

        clsCat cat = (clsCat) ctlPet.SearchPet(code, "Gato");

        if(cat == null){
            JOptionPane.showMessageDialog(this, "Codigo no encontrado");
        }else{
            txtNameCat.setText(cat.getName());
            txtColorCat.setText(cat.getColor());
            txtBornYearCat.setText(Integer.toString(cat.getBorn_year()));
            cbHealthStatusCat.setSelectedItem(cat.getHealth_Status());
            cbBreedCat.setSelectedItem(cat.getBreed());
        }
    }//GEN-LAST:event_btnBuscarCatActionPerformed

    private void cbPedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedigreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPedigreeActionPerformed

    private void btnEliminarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDogActionPerformed
        try{
            String code = txtCodeDog.getText();
            if (code.equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            } else {
                boolean found = false;
                found = ctlPet.DeletePet(code, "Perro");
                clearDogFields();
                JOptionPane.showMessageDialog(null, "Su registro ha sido eliminado");
                if(!found){
                    JOptionPane.showMessageDialog(null, "No hemos encontrado el codigo");
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Los datos no son validos");
        }
    }//GEN-LAST:event_btnEliminarDogActionPerformed

    private void btnEditarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDogActionPerformed

        try{

            String code = txtCodeDog.getText();
            String name = txtNameDog.getText();
            String color = txtColorDog.getText();
            int born_year = Integer.parseInt(txtBornYearDog.getText());
            String breed = cbBreedDog.getSelectedItem().toString();
            String health_status = cbHealthStatusDog.getSelectedItem().toString();
            boolean pedigree = cbPedigree.isSelected();

            if((code.equals("")) || (name.equals("")) || (color.equals(""))|| (breed.equals("")) || (health_status.equals(""))){

                JOptionPane.showMessageDialog(null, "Ingrese todos los campos");

            } else {
                clsDog dog = new clsDog(breed, code, name, born_year, color, health_status, pedigree);
                modeldog.EditPet(dog);
                JOptionPane.showMessageDialog(null, "Su registro ha sido actualizado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite un valor valido!!");
        }
    }//GEN-LAST:event_btnEditarDogActionPerformed

    private void btnBuscarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDogActionPerformed

        String code = txtCodeDog.getText();

        clsDog dog = (clsDog) ctlPet.SearchPet(code, "Perro");

        if(dog == null){
            JOptionPane.showMessageDialog(this, "Codigo no encontrado");
        }else{
            txtNameDog.setText(dog.getName());
            txtColorDog.setText(dog.getColor());
            txtBornYearDog.setText(Integer.toString(dog.getBorn_year()));
            cbHealthStatusDog.setSelectedItem(dog.getHealth_Status());
            cbBreedDog.setSelectedItem(dog.getBreed());
            cbPedigree.setSelected(dog.isPedigree());
        }
    }//GEN-LAST:event_btnBuscarDogActionPerformed

    private void btnCrearDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDogActionPerformed

        try{
            String code = txtCodeDog.getText();
            String name = txtNameDog.getText();
            String color = txtColorDog.getText();
            int born_year = Integer.parseInt(txtBornYearDog.getText());
            String breed = cbBreedDog.getSelectedItem().toString();
            String health_status = cbHealthStatusDog.getSelectedItem().toString();
            boolean pedigree = cbPedigree.isSelected();

            if(code.equals("") || name.equals("") || color.equals("")){
                JOptionPane.showMessageDialog(this, "Llene todos los campos");
            } else {
                clsDog dog = new clsDog(breed, code, name, born_year, color, health_status, pedigree);

                modeldog.CreatePet(dog);

                JOptionPane.showMessageDialog(this, "Registro guardado");

            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Digite un valor valido");
        }
    }//GEN-LAST:event_btnCrearDogActionPerformed
    
    private void clearDogFields(){
        txtCodeDog.setText("");
        txtNameDog.setText("");
        txtColorDog.setText("");
        txtBornYearDog.setText("");
        cbBreedDog.setSelectedIndex(0);
        cbHealthStatusDog.setSelectedIndex(0);
        cbPedigree.setSelected(false);
    }
    
    private void clearCatFields(){
        txtCodeCat.setText("");
        txtNameCat.setText("");
        txtColorCat.setText("");
        txtBornYearCat.setText("");
        cbBreedCat.setSelectedIndex(0);
        cbHealthStatusCat.setSelectedIndex(0);
    }
    
   public void mostrarDatosDog() {
       
          try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {          
                System.out.println("Conectado");
            }

        String[] titulos = {"PetCode",  "PetName", "PetHealth", "PetBornY", "PetColor", "DogBreed", "DogPedigree"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sqlID = "SELECT CodePet, NamePet, HealthStatusPet, BornYearPet, ColorPet, BreedDog, PedigreeDog FROM tblpet INNER JOIN tbldog ON (tblpet.IDPet = tbldog.IDPet)";


            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlID);

            while (rs.next()) {

                registros[0] = rs.getString("CodePet");
                registros[1] = rs.getString("NamePet");
                registros[2] = rs.getString("HealthStatusPet");
                registros[3] = rs.getString("BornYearPet");
                registros[4] = rs.getString("ColorPet");
                registros[5] = rs.getString("BreedDog");
                registros[6] = rs.getString("PedigreeDog");

                modelo.addRow(registros);

            }

            DogTable.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar datos" + e.getMessage());
        }

    }
     
   public void mostrarDatosCat() {
       
          try(Connection con = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            if (con != null) {          
                System.out.println("Conectado");
            }

        String[] titulos = {"PetCode",  "PetName", "PetHealth", "PetBornY", "PetColor", "CatBreed"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sqlID = "SELECT CodePet, NamePet, HealthStatusPet, BornYearPet, ColorPet, BreedCat FROM tblpet INNER JOIN tblcat ON (tblpet.IDPet = tblcat.IDPet)";


            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlID);

            while (rs.next()) {

                registros[0] = rs.getString("CodePet");
                registros[1] = rs.getString("NamePet");
                registros[2] = rs.getString("HealthStatusPet");
                registros[3] = rs.getString("BornYearPet");
                registros[4] = rs.getString("ColorPet");
                registros[5] = rs.getString("BreedCat");

                modelo.addRow(registros);

            }

            CatTable.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar datos" + e.getMessage());
        }

    } 
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPetManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CatTable;
    private javax.swing.JTable DogTable;
    private javax.swing.JButton btnBuscarCat;
    private javax.swing.JButton btnBuscarDog;
    private javax.swing.JButton btnCrearCat;
    private javax.swing.JButton btnCrearDog;
    private javax.swing.JButton btnEditarCat;
    private javax.swing.JButton btnEditarDog;
    private javax.swing.JButton btnEliminarCat;
    private javax.swing.JButton btnEliminarDog;
    private javax.swing.JComboBox<String> cbBreedCat;
    private javax.swing.JComboBox<String> cbBreedDog;
    private javax.swing.JComboBox<String> cbHealthStatusCat;
    private javax.swing.JComboBox<String> cbHealthStatusDog;
    private javax.swing.JCheckBox cbPedigree;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBornYearCat;
    private javax.swing.JTextField txtBornYearDog;
    private javax.swing.JTextField txtCodeCat;
    private javax.swing.JTextField txtCodeDog;
    private javax.swing.JTextField txtColorCat;
    private javax.swing.JTextField txtColorDog;
    private javax.swing.JTextField txtNameCat;
    private javax.swing.JTextField txtNameDog;
    // End of variables declaration//GEN-END:variables
}
