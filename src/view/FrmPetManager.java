
package view;

import classes.*;
import controller.*;
import java.awt.HeadlessException;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.modelDog;


public class FrmPetManager extends javax.swing.JFrame {
    
    ctlPet ctlPet;
    modelDog modeldog;
    
    LinkedList<clsDog> dogObjectList = new LinkedList<>();
    LinkedList<clsCat> catObjectList = new LinkedList<>();

    public FrmPetManager() {
        initComponents();
        this.ctlPet = new ctlPet();
        this.modeldog = new modelDog();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PetList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbHealthStatusDog = new javax.swing.JComboBox<>();
        cbBreedDog = new javax.swing.JComboBox<>();
        txtCodeDog = new javax.swing.JTextField();
        txtBornYearDog = new javax.swing.JTextField();
        txtNameDog = new javax.swing.JTextField();
        txtColorDog = new javax.swing.JTextField();
        btnCrearDog = new javax.swing.JButton();
        btnBuscarDog = new javax.swing.JButton();
        btnEditarDog = new javax.swing.JButton();
        btnEliminarDog = new javax.swing.JButton();
        cbPedigree = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(245, 59, 113));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(82, 50, 32));

        cbHealthStatusCat.setBackground(new java.awt.Color(255, 204, 204));
        cbHealthStatusCat.setForeground(new java.awt.Color(82, 50, 32));
        cbHealthStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermo", "Sano", "En Diagnostico" }));

        cbBreedCat.setBackground(new java.awt.Color(255, 204, 204));
        cbBreedCat.setForeground(new java.awt.Color(82, 50, 32));
        cbBreedCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persia", "Siberiano", "Siames", "Kohana" }));

        txtCodeCat.setBackground(new java.awt.Color(255, 204, 204));

        txtBornYearCat.setBackground(new java.awt.Color(255, 204, 204));

        txtNameCat.setBackground(new java.awt.Color(255, 204, 204));

        txtColorCat.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setBackground(new java.awt.Color(221, 221, 221));
        jLabel7.setForeground(new java.awt.Color(221, 221, 221));
        jLabel7.setText("Name: ");

        jLabel8.setBackground(new java.awt.Color(221, 221, 221));
        jLabel8.setForeground(new java.awt.Color(221, 221, 221));
        jLabel8.setText("Color: ");

        jLabel9.setBackground(new java.awt.Color(221, 221, 221));
        jLabel9.setForeground(new java.awt.Color(221, 221, 221));
        jLabel9.setText("Breed: ");

        jLabel10.setBackground(new java.awt.Color(221, 221, 221));
        jLabel10.setForeground(new java.awt.Color(221, 221, 221));
        jLabel10.setText("Code:");

        jLabel11.setBackground(new java.awt.Color(221, 221, 221));
        jLabel11.setForeground(new java.awt.Color(221, 221, 221));
        jLabel11.setText("Born Year: ");

        jLabel12.setBackground(new java.awt.Color(221, 221, 221));
        jLabel12.setForeground(new java.awt.Color(221, 221, 221));
        jLabel12.setText("Health Status: ");

        btnBuscarCat.setBackground(new java.awt.Color(245, 59, 113));
        btnBuscarCat.setText("Buscar");

        btnCrearCat.setBackground(new java.awt.Color(245, 59, 113));
        btnCrearCat.setText("Crear");
        btnCrearCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCatActionPerformed(evt);
            }
        });

        btnEliminarCat.setBackground(new java.awt.Color(245, 59, 113));
        btnEliminarCat.setText("Eliminar");

        btnEditarCat.setBackground(new java.awt.Color(245, 59, 113));
        btnEditarCat.setText("Editar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBornYearCat, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorCat))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtNameCat, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbHealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9)
                                .addGap(43, 43, 43)
                                .addComponent(cbBreedCat, 0, 529, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCrearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnEliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnEditarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBornYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColorCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbHealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CatManager", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("CatManager");

        PetList.setBackground(new java.awt.Color(255, 204, 204));
        PetList.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        PetList.setForeground(new java.awt.Color(82, 50, 32));
        PetList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "AQUI APARECERAN LAS MASCOTAS!!!" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(PetList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PetList", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("PetList");

        jPanel1.setBackground(new java.awt.Color(82, 50, 32));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Code:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Born Year: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name: ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Health Status: ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Breed: ");

        cbHealthStatusDog.setBackground(new java.awt.Color(255, 204, 204));
        cbHealthStatusDog.setForeground(new java.awt.Color(82, 50, 32));
        cbHealthStatusDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermo", "Sano", "En Diagnostico" }));

        cbBreedDog.setBackground(new java.awt.Color(255, 204, 204));
        cbBreedDog.setForeground(new java.awt.Color(82, 50, 32));
        cbBreedDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastor Aleman", "Chihuahua", "Golden", "Dalmata" }));

        txtCodeDog.setBackground(new java.awt.Color(255, 204, 204));
        txtCodeDog.setForeground(new java.awt.Color(82, 50, 32));

        txtBornYearDog.setBackground(new java.awt.Color(255, 204, 204));
        txtBornYearDog.setForeground(new java.awt.Color(82, 50, 32));

        txtNameDog.setBackground(new java.awt.Color(255, 204, 204));
        txtNameDog.setForeground(new java.awt.Color(82, 50, 32));

        txtColorDog.setBackground(new java.awt.Color(255, 204, 204));
        txtColorDog.setForeground(new java.awt.Color(82, 50, 32));

        btnCrearDog.setBackground(new java.awt.Color(245, 59, 113));
        btnCrearDog.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearDog.setText("Crear");
        btnCrearDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDogActionPerformed(evt);
            }
        });

        btnBuscarDog.setBackground(new java.awt.Color(245, 59, 113));
        btnBuscarDog.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDog.setText("Buscar");
        btnBuscarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDogActionPerformed(evt);
            }
        });

        btnEditarDog.setBackground(new java.awt.Color(245, 59, 113));
        btnEditarDog.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDog.setText("Editar");
        btnEditarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDogActionPerformed(evt);
            }
        });

        btnEliminarDog.setBackground(new java.awt.Color(245, 59, 113));
        btnEliminarDog.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDog.setText("Eliminar");
        btnEliminarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDogActionPerformed(evt);
            }
        });

        cbPedigree.setBackground(new java.awt.Color(255, 204, 204));
        cbPedigree.setForeground(new java.awt.Color(82, 50, 32));
        cbPedigree.setText("Pedigree");
        cbPedigree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPedigreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addComponent(txtBornYearDog))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorDog))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNameDog))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(btnCrearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(btnEliminarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(btnEditarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBreedDog, 0, 315, Short.MAX_VALUE)
                                .addGap(71, 71, 71)
                                .addComponent(cbPedigree)
                                .addGap(60, 60, 60)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtCodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtBornYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPedigree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCrearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        txtCodeDog.getAccessibleContext().setAccessibleName("TxtCodeDog");

        jTabbedPane1.addTab("DogManager", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("DogManager");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 70)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(245, 59, 113));
        jLabel13.setText("Manager de Mascotas");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Container");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cbPedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedigreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPedigreeActionPerformed

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
                catObjectList.add(cat);
                this.FillJlist();
                JOptionPane.showMessageDialog(this, "Registro guardado");
            }
        } catch(HeadlessException | NumberFormatException e) {
       JOptionPane.showMessageDialog(this, "Digite un valor valido");
        }
    }//GEN-LAST:event_btnCrearCatActionPerformed

    private void btnEliminarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDogActionPerformed
        try{
            String code = txtCodeDog.getText();
            if (code.equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            } else {
                        boolean found = false;
                        found = ctlPet.DeletePet(code, "Perro");
                        this.FillJlist();
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
    
    private void FillJlist(){
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (clsDog dog : dogObjectList){
            String data = dog.getName() + " - " + dog.getBreed() + " - " + " Perro";
            model.add(index, data);
            index++;
        }
        PetList.setModel(model);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPetManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> PetList;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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
