import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
Me estuve horas averiguando que pasaba con lo de parsing file error,
y el mismo se dañaba y se arreglaba cuando le diera la gana,
asi que solo esta hecho el de creativos pq no tuve tiempo de
hacer los demas
*/

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
    }
    
    ArrayList <Personas> usuarios = new ArrayList();
    private int currentuser;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRegister = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jOpcionesregistro = new javax.swing.JComboBox<>();
        jB_Registrarse = new javax.swing.JButton();
        jLogin = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jEnter = new javax.swing.JButton();
        jRegisterCreativo = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jR_Nombre = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jR_Apellido = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jR_Carrera = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jR_Ocupacion = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jR_Clasesfaltantes = new javax.swing.JTextField();
        jR_Usuario = new javax.swing.JTextField();
        jRC = new javax.swing.JButton();
        jR_Password = new javax.swing.JTextField();
        jRegisterEstudiantes = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jR_Nombre2 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jR_Apellido2 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jR_Correo1 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jR_Carrera1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jR_Cursando = new javax.swing.JTextField();
        jR_Usuario2 = new javax.swing.JTextField();
        jRE = new javax.swing.JButton();
        jR_Password2 = new javax.swing.JTextField();
        jRegisterEjecutivos = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jR_Nombre3 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jR_Apellido3 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jR_Universitario = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jR_Maestria = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jR_Correo2 = new javax.swing.JTextField();
        jR_Usuario3 = new javax.swing.JTextField();
        jRE2 = new javax.swing.JButton();
        jR_Password3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jR_Cargo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Empresa = new javax.swing.JTextField();
        jRegisterNormales = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jR_Nombre1 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jR_Apellido1 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jR_Correo3 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jR_Hobbie = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jR_Usuario1 = new javax.swing.JTextField();
        jRN = new javax.swing.JButton();
        jR_Password1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCreativo = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCtitulo = new javax.swing.JTextField();
        jCfecha = new javax.swing.JTextField();
        jCprioridad = new javax.swing.JTextField();
        jCetiqueta = new javax.swing.JTextField();
        jCcategoria = new javax.swing.JTextField();
        jCdesc = new javax.swing.JTextField();
        jCpublico = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAC = new javax.swing.JTextArea();
        jBCreativo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCreativo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jd_Login = new javax.swing.JButton();
        jd_Register = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Register");

        jOpcionesregistro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jOpcionesregistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir tipo de usuario", "Normales", "Estudiantes", "Ejecutivos", "Creativos", " " }));
        jOpcionesregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcionesregistroActionPerformed(evt);
            }
        });

        jB_Registrarse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jB_Registrarse.setText("OK");
        jB_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_RegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jRegisterLayout = new javax.swing.GroupLayout(jRegister.getContentPane());
        jRegister.getContentPane().setLayout(jRegisterLayout);
        jRegisterLayout.setHorizontalGroup(
            jRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterLayout.createSequentialGroup()
                .addGroup(jRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegisterLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jB_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRegisterLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jOpcionesregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRegisterLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jRegisterLayout.setVerticalGroup(
            jRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jOpcionesregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jB_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("Login");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Usuario");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Contraseña");

        jEnter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jEnter.setText("Enter");
        jEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(jUsuario))
                    .addComponent(jEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLoginLayout = new javax.swing.GroupLayout(jLogin.getContentPane());
        jLogin.getContentPane().setLayout(jLoginLayout);
        jLoginLayout.setHorizontalGroup(
            jLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLoginLayout.setVerticalGroup(
            jLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel77.setText("Password");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel78.setText("Nombre");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel79.setText("Apellido");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel80.setText("Creativo");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel81.setText("Correo");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel82.setText("Ocupacion");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel83.setText("Usuario");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel84.setText("Edad");

        jRC.setText("Registrarse");
        jRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                        .addComponent(jR_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82)
                            .addComponent(jLabel84))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jR_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jR_Nombre)
                            .addComponent(jR_Apellido)
                            .addComponent(jR_Carrera)
                            .addComponent(jR_Ocupacion)
                            .addComponent(jR_Clasesfaltantes)))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRC)
                    .addComponent(jLabel80)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jR_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(jR_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel79)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel81)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Clasesfaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jRegisterCreativoLayout = new javax.swing.GroupLayout(jRegisterCreativo.getContentPane());
        jRegisterCreativo.getContentPane().setLayout(jRegisterCreativoLayout);
        jRegisterCreativoLayout.setHorizontalGroup(
            jRegisterCreativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterCreativoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jRegisterCreativoLayout.setVerticalGroup(
            jRegisterCreativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterCreativoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel93.setText("Password");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel94.setText("Nombre");

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel95.setText("Apellido");

        jLabel96.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel96.setText("Estudiante");

        jLabel97.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel97.setText("Correo");

        jLabel98.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel98.setText("Carrera");

        jLabel99.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel99.setText("Usuario");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel100.setText("Año que lleva cursando");

        jR_Cursando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_CursandoActionPerformed(evt);
            }
        });

        jRE.setText("Registrarse");
        jRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jREMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jR_Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jR_Password2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jR_Nombre2)
                                    .addComponent(jR_Apellido2)
                                    .addComponent(jR_Correo1)
                                    .addComponent(jR_Carrera1)
                                    .addComponent(jR_Cursando)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jRE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel96)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jR_Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jR_Password2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel94)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel95)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel97)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel98)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Carrera1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Cursando, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jRE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jRegisterEstudiantesLayout = new javax.swing.GroupLayout(jRegisterEstudiantes.getContentPane());
        jRegisterEstudiantes.getContentPane().setLayout(jRegisterEstudiantesLayout);
        jRegisterEstudiantesLayout.setHorizontalGroup(
            jRegisterEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterEstudiantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jRegisterEstudiantesLayout.setVerticalGroup(
            jRegisterEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterEstudiantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel101.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel101.setText("Password");

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel102.setText("Nombre");

        jLabel103.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel103.setText("Apellido");

        jLabel104.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel104.setText("Ejecutivos");

        jLabel105.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel105.setText("Titulo Universitario");

        jLabel106.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel106.setText("Titulo de Maestria");

        jLabel107.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel107.setText("Usuario");

        jLabel108.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel108.setText("Correo");

        jRE2.setText("Registrarse");
        jRE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRE2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Cargo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Empresa");

        Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jR_Usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel108)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jR_Password3)
                                    .addComponent(jR_Nombre3)
                                    .addComponent(jR_Apellido3)
                                    .addComponent(jR_Universitario)
                                    .addComponent(jR_Maestria)
                                    .addComponent(jR_Correo2)
                                    .addComponent(jR_Cargo2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(Empresa)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jRE2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel104)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jR_Usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addComponent(jR_Password3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel102)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel103)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Apellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel105)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Universitario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel106)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Maestria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Correo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Cargo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jRE2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jRegisterEjecutivosLayout = new javax.swing.GroupLayout(jRegisterEjecutivos.getContentPane());
        jRegisterEjecutivos.getContentPane().setLayout(jRegisterEjecutivosLayout);
        jRegisterEjecutivosLayout.setHorizontalGroup(
            jRegisterEjecutivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterEjecutivosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jRegisterEjecutivosLayout.setVerticalGroup(
            jRegisterEjecutivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterEjecutivosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel85.setText("Password");

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel86.setText("Nombre");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel87.setText("Apellido");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel88.setText("Normales");

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel89.setText("Correo");

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel90.setText("Hobbie");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel91.setText("Usuario");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel92.setText("Interes");

        jRN.setText("Registrarse");
        jRN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRNMouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Musica", "Libros", "Hogar" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jR_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel92))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jRN))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(124, 195, Short.MAX_VALUE)
                                        .addComponent(jLabel88)))
                                .addGap(84, 84, 84)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jR_Password1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jR_Nombre1)
                            .addComponent(jR_Apellido1)
                            .addComponent(jR_Correo3)
                            .addComponent(jR_Hobbie)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jR_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jR_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel86)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel87)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Correo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Hobbie, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jRegisterNormalesLayout = new javax.swing.GroupLayout(jRegisterNormales.getContentPane());
        jRegisterNormales.getContentPane().setLayout(jRegisterNormalesLayout);
        jRegisterNormalesLayout.setHorizontalGroup(
            jRegisterNormalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterNormalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRegisterNormalesLayout.setVerticalGroup(
            jRegisterNormalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterNormalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de Creacion");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Prioridad");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Etiqueta");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Categoria");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Descripcion");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Publico");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Texto");

        jCdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCdescActionPerformed(evt);
            }
        });

        jCpublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpublicoActionPerformed(evt);
            }
        });

        jTAC.setColumns(20);
        jTAC.setRows(5);
        jScrollPane2.setViewportView(jTAC);

        jBCreativo.setText("Agregrar");
        jBCreativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCreativoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(53, 53, 53)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCtitulo)
                        .addComponent(jCfecha)
                        .addComponent(jCprioridad)
                        .addComponent(jCetiqueta)
                        .addComponent(jCcategoria)
                        .addComponent(jCdesc)
                        .addComponent(jCpublico)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                    .addComponent(jBCreativo))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCprioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCetiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jCpublico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(34, 34, 34)))
                .addGap(18, 18, 18)
                .addComponent(jBCreativo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Nota", jPanel3);

        jTCreativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Hora y Fecha", "Prioridad", "Etiqueta", "Categoria", "Descripcion", "Publico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTCreativo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Nota", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar Nota", jPanel6);

        javax.swing.GroupLayout jCreativoLayout = new javax.swing.GroupLayout(jCreativo.getContentPane());
        jCreativo.getContentPane().setLayout(jCreativoLayout);
        jCreativoLayout.setHorizontalGroup(
            jCreativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreativoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jCreativoLayout.setVerticalGroup(
            jCreativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreativoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Google Keep");

        jd_Login.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jd_Login.setText("Login");
        jd_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jd_LoginMouseClicked(evt);
            }
        });

        jd_Register.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jd_Register.setText("Register");
        jd_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jd_RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jd_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jd_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jd_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jd_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jd_LoginMouseClicked
        // TODO add your handling code here:
        jLogin.setModal(true);
        jLogin.pack();
        jLogin.setLocationRelativeTo(this);
        this.setVisible(false);
        jLogin.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_jd_LoginMouseClicked

    private void jd_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jd_RegisterMouseClicked
        // TODO add your handling code here:
        jRegister.setModal(true);
        jRegister.pack();
        jRegister.setLocationRelativeTo(this);
        this.setVisible(false);
        jRegister.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_jd_RegisterMouseClicked

    private void jB_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_RegistrarseMouseClicked
        // TODO add your handling code here:
        int opcion = jOpcionesregistro.getSelectedIndex();
        switch (opcion) {
            case 1: {
                jRegisterNormales.setModal(true);
                jRegisterNormales.pack();
                jRegisterNormales.setLocationRelativeTo(this);
                jRegisterNormales.setVisible(true);
                break;
            }
            case 2: {
                jRegisterEstudiantes.setModal(true);
                jRegisterEstudiantes.pack();
                jRegisterEstudiantes.setLocationRelativeTo(this);
                jRegisterEstudiantes.setVisible(true);
                break;
            }
            case 3: {
                jRegisterEjecutivos.setModal(true);
                jRegisterEjecutivos.pack();
                jRegisterEjecutivos.setLocationRelativeTo(this);
                jRegisterEjecutivos.setVisible(true);
                break;
            }
            case 4: {
                jRegisterCreativo.setModal(true);
                jRegisterCreativo.pack();
                jRegisterCreativo.setLocationRelativeTo(this);
                jRegisterCreativo.setVisible(true);
                break;
            }
            default: JOptionPane.showMessageDialog(jRegister, "Porfavor ingrese un tipo de usuario");
        }
    }//GEN-LAST:event_jB_RegistrarseMouseClicked

    private void jEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnterMouseClicked
        // TODO add your handling code here:
        boolean flag = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (jUsuario.getText().equals(usuarios.get(i).getUsuario()) &&
                jPassword.getText().equals(usuarios.get(i).getPassword())) {
                currentuser = i;
                jUsuario.setText("");
                jPassword.setText("");
                jLogin.setVisible(false);
                currentuser = i;
                checkuser(i);
                flag = true;
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(jLogin, "Usuario no encontrado, o no hay usuarios existentes");
            jUsuario.setText("");
            jPassword.setText("");
        }
    }//GEN-LAST:event_jEnterMouseClicked

    private void jRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRCMouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario.getText();
        String password = jR_Password.getText();
        String nombre = jR_Nombre.getText();
        String apellido = jR_Apellido.getText();
        String correo = jR_Carrera.getText();
        String ocupacion = jR_Ocupacion.getText();
        int edad = Integer.parseInt(jR_Clasesfaltantes.getText());
        Creativos c = new Creativos(ocupacion, edad, nombre, apellido, correo, usuario, password);
        usuarios.add(c);
        jR_Usuario.setText("");
        jR_Password.setText("");
        jR_Nombre.setText("");
        jR_Apellido.setText("");
        jR_Carrera.setText("");
        jR_Ocupacion.setText("");
        jR_Clasesfaltantes.setText("");
        File archivo = new File("./"+nombre+apellido);
        c.setArchivo(archivo);
        String x = "";
        try {
            c.escribirArchivo(x);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        jRegisterCreativo.setVisible(false);
        jRegister.setVisible(false);
    }//GEN-LAST:event_jRCMouseClicked

    private void jREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jREMouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario2.getText();
        String password = jR_Password2.getText();
        String nombre = jR_Nombre2.getText();
        String apellido = jR_Apellido2.getText();
        String carrera = jR_Carrera1.getText();
        String correo = jR_Correo1.getText();
        int cursando = Integer.parseInt(jR_Cursando.getText());
        Estudiantes e = new Estudiantes(carrera, cursando, nombre, apellido, correo, usuario, password);
        usuarios.add(e);
        jR_Usuario2.setText("");
        jR_Password2.setText("");
        jR_Nombre2.setText("");
        jR_Apellido2.setText("");
        jR_Correo1.setText("");
        jR_Carrera1.setText("");
        jR_Cursando.setText("");
        jRegister.setVisible(false);
        jRegisterEstudiantes.setVisible(false);
    }//GEN-LAST:event_jREMouseClicked

    private void jRE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRE2MouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario3.getText();
        String password = jR_Password3.getText();
        String nombre = jR_Nombre3.getText();
        String apellido = jR_Apellido3.getText();
        String tituloM = jR_Maestria.getText();
        String tituloU = jR_Universitario.getText();
        String correo = jR_Correo2.getText();
        String cargo = jR_Cargo2.getText();
        String empresa = Empresa.getText();
        Ejecutivos e2 = new Ejecutivos(cargo, empresa, tituloU, tituloM, nombre, apellido, correo, usuario, password);
        usuarios.add(e2);
        jR_Usuario3.setText("");
        jR_Password3.setText("");
        jR_Nombre3.setText("");
        jR_Apellido3.setText("");
        jR_Universitario.setText("");
        jR_Maestria.setText("");
        jR_Correo2.setText("");
        jR_Cargo2.setText("");
        Empresa.setText("");
        jRegister.setVisible(false);
        jRegisterEjecutivos.setVisible(false);
    }//GEN-LAST:event_jRE2MouseClicked

    private void jRNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRNMouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario1.getText();
        String password = jR_Password1.getText();
        String nombre = jR_Nombre1.getText();
        String apellido = jR_Apellido1.getText();
        String hobbie = jR_Hobbie.getText();
        String correo = jR_Correo3.getText();
        String interes = "";
        switch (jComboBox1.getSelectedIndex()) {
            case 0: {
                interes = "Cocina";
                break;
            }
            case 1: {
                interes = "Musica";
                break;
            }
            case 2: {
                interes = "Libros";
                break;
            }
            case 3: {
                interes = "Hogar";
                break;
            }
        }
        Normales n = new Normales(hobbie, interes, nombre, apellido, correo, usuario, password);
        usuarios.add(n);
        jR_Usuario1.setText("");
        jR_Password1.setText("");
        jR_Nombre1.setText("");
        jR_Apellido1.setText("");
        jR_Correo3.setText("");
        jR_Hobbie.setText("");
        jRegisterNormales.setVisible(false);
        jRegister.setVisible(false);
    }//GEN-LAST:event_jRNMouseClicked

    private void jR_CursandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_CursandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_CursandoActionPerformed

    private void EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresaActionPerformed

    private void jOpcionesregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcionesregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpcionesregistroActionPerformed

    private void jCdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCdescActionPerformed

    private void jCpublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpublicoActionPerformed

    private void jBCreativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCreativoMouseClicked
        // TODO add your handling code here:
        NotaC c = new NotaC(jCtitulo.getText(), jCfecha.getText(), jCprioridad.getText(), jCetiqueta.getText(), jCcategoria.getText(), jCdesc.getText(), jCpublico.getText(), jTAC.getText());
        ((Creativos)usuarios.get(currentuser)).getNotas().add(c);
        JOptionPane.showMessageDialog(jCreativo,"Se creo su nota");
        Creativos s = new Creativos();
        String z = "";
        for (int i = 0; i < ((Creativos)usuarios.get(currentuser)).getNotas().size(); i++) {
            z += ((Creativos)usuarios.get(currentuser)).getNotas().get(i)+"\n";
        }
          
        try {
            s.escribirArchivo(z);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBCreativoMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        llenarlista();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    
    public void checkuser(int i) {
        if (usuarios.get(i) instanceof Creativos) {
            jCreativo.setModal(true);
            jCreativo.pack();
            jCreativo.setLocationRelativeTo(this);
            jRegister.setVisible(false);
            llenarlista();
            jCreativo.setVisible(true);
            jRegister.setVisible(true);
        }
        else if (usuarios.get(i) instanceof Ejecutivos) {
            
        }
        else if (usuarios.get(i) instanceof Estudiantes) {
            
        } 
        else {
            
        }
    }
    
    public void llenarlista() {
        DefaultTableModel model = (DefaultTableModel) jTCreativo.getModel();
        model.setRowCount(0);
        for (int j = 0; j < usuarios.get(currentuser).getNotas().size(); j++) {
            Object[] newrow = {
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getTitulo(),
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getFecha(),
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getPrioridad(),
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getEtiqueta(),
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getCategoria(),
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getDescripcion(),
                ((NotaC) usuarios.get(currentuser).getNotas().get(j)).getPublico(),};
            DefaultTableModel modelo = (DefaultTableModel) jTCreativo.getModel();
            modelo.addRow(newrow);
            jTCreativo.setModel(modelo);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Empresa;
    private javax.swing.JButton jBCreativo;
    private javax.swing.JButton jB_Registrarse;
    private javax.swing.JTextField jCcategoria;
    private javax.swing.JTextField jCdesc;
    private javax.swing.JTextField jCetiqueta;
    private javax.swing.JTextField jCfecha;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jCprioridad;
    private javax.swing.JTextField jCpublico;
    private javax.swing.JDialog jCreativo;
    private javax.swing.JTextField jCtitulo;
    private javax.swing.JButton jEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JDialog jLogin;
    private javax.swing.JComboBox<String> jOpcionesregistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jRC;
    private javax.swing.JButton jRE;
    private javax.swing.JButton jRE2;
    private javax.swing.JButton jRN;
    private javax.swing.JTextField jR_Apellido;
    private javax.swing.JTextField jR_Apellido1;
    private javax.swing.JTextField jR_Apellido2;
    private javax.swing.JTextField jR_Apellido3;
    private javax.swing.JTextField jR_Cargo2;
    private javax.swing.JTextField jR_Carrera;
    private javax.swing.JTextField jR_Carrera1;
    private javax.swing.JTextField jR_Clasesfaltantes;
    private javax.swing.JTextField jR_Correo1;
    private javax.swing.JTextField jR_Correo2;
    private javax.swing.JTextField jR_Correo3;
    private javax.swing.JTextField jR_Cursando;
    private javax.swing.JTextField jR_Hobbie;
    private javax.swing.JTextField jR_Maestria;
    private javax.swing.JTextField jR_Nombre;
    private javax.swing.JTextField jR_Nombre1;
    private javax.swing.JTextField jR_Nombre2;
    private javax.swing.JTextField jR_Nombre3;
    private javax.swing.JTextField jR_Ocupacion;
    private javax.swing.JTextField jR_Password;
    private javax.swing.JTextField jR_Password1;
    private javax.swing.JTextField jR_Password2;
    private javax.swing.JTextField jR_Password3;
    private javax.swing.JTextField jR_Universitario;
    private javax.swing.JTextField jR_Usuario;
    private javax.swing.JTextField jR_Usuario1;
    private javax.swing.JTextField jR_Usuario2;
    private javax.swing.JTextField jR_Usuario3;
    private javax.swing.JDialog jRegister;
    private javax.swing.JDialog jRegisterCreativo;
    private javax.swing.JDialog jRegisterEjecutivos;
    private javax.swing.JDialog jRegisterEstudiantes;
    private javax.swing.JDialog jRegisterNormales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAC;
    private javax.swing.JTable jTCreativo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jUsuario;
    private javax.swing.JButton jd_Login;
    private javax.swing.JButton jd_Register;
    // End of variables declaration//GEN-END:variables
}
