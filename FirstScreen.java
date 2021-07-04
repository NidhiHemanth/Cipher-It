import org.netbeans.lib.awtextra.*;

public class FirstScreen extends javax.swing.JFrame {

    public FirstScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
                              
    private void initComponents() {

        Cryption = new javax.swing.ButtonGroup();
        Algorithm = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Go = new javax.swing.JButton();
        Encryption = new javax.swing.JRadioButton();
        Decryption = new javax.swing.JRadioButton();
        DES = new javax.swing.JRadioButton();
        Caesar = new javax.swing.JRadioButton();
        Substitution1 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);


        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 63, 124));

        jLabel1.setBackground(new java.awt.Color(231, 63, 124));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 25)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select your Parameters!");

        jLabel2.setBackground(new java.awt.Color(231, 63, 124));
        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("To Encrypt or To Decrypt?");

        jLabel4.setBackground(new java.awt.Color(231, 63, 124));
        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Using DES or Simple Substitution?");

        Go.setBackground(new java.awt.Color(231, 63, 124));
        Go.setFont(new java.awt.Font("Monospaced", 3, 18)); 
        Go.setForeground(new java.awt.Color(255, 255, 255));
        Go.setText("Go!");
        Go.setToolTipText("");
        Go.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Go.setContentAreaFilled(false);
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        Encryption.setBackground(new java.awt.Color(231, 63, 124));
        Cryption.add(Encryption);
        Encryption.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); 
        Encryption.setForeground(new java.awt.Color(255, 255, 255));
        Encryption.setText("Encryption");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        Decryption.setBackground(new java.awt.Color(231, 63, 124));
        Cryption.add(Decryption);
        Decryption.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15));
        Decryption.setForeground(new java.awt.Color(255, 255, 255));
        Decryption.setText("Decryption");
        Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptionActionPerformed(evt);
            }
        });

        DES.setBackground(new java.awt.Color(231, 63, 124));
        Algorithm.add(DES);
        DES.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); 
        DES.setForeground(new java.awt.Color(255, 255, 255));
        DES.setText("DES");
        DES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESActionPerformed(evt);
            }
        });

        Caesar.setBackground(new java.awt.Color(231, 63, 124));
        Algorithm.add(Caesar);
        Caesar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); 
        Caesar.setForeground(new java.awt.Color(255, 255, 255));
        Caesar.setText("Caesar");
        Caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaesarActionPerformed(evt);
            }
        });

        Substitution1.setBackground(new java.awt.Color(231, 63, 124));
        Algorithm.add(Substitution1);
        Substitution1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); 
        Substitution1.setForeground(new java.awt.Color(255, 255, 255));
        Substitution1.setText("Substitution");
        Substitution1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Substitution1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(DES, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Caesar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Substitution1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Decryption))
                    .addComponent(Go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decryption)
                    .addComponent(Encryption))
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DES)
                    .addComponent(Caesar)
                    .addComponent(Substitution1))
                .addGap(50, 50, 50)
                .addComponent(Go, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setIcon(new javax.swing.ImageIcon("logo.png")); 
        jLabel5.setText("logo");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 48)); 
        jLabel6.setText("Cipher-It!");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); 
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><center> A Java based application! <br> Encrypt or decrypt data! <br>Easily integrate with cryptographic applications for safe data storage and communication </center></html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 0, 440, 550));

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
    }// </editor-fold>                        

    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CipherIT.getCryption(1);
    }                                          

    private void DecryptionActionPerformed(java.awt.event.ActionEvent evt) {                                           
       CipherIT.getCryption(2);
    }                                          

    private void CaesarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        CipherIT.getAlgorithm(2);
    }                                      

    private void DESActionPerformed(java.awt.event.ActionEvent evt) {                                    
        CipherIT.getAlgorithm(1);
    }                                   

    private void Substitution1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        CipherIT.getAlgorithm(3);
    }                                             

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {
        if(CipherIT.Algorithm != -7 && CipherIT.Cryption != -7)
        {     
        new Inputs().setVisible(true);
        dispose();
        }
        else 
        System.out.println("Choose your Parameters");
    }

    
    
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new FirstScreen().setVisible(true);

            }
        });

    }

                  
    private javax.swing.ButtonGroup Algorithm;
    private javax.swing.JRadioButton Caesar;
    private javax.swing.ButtonGroup Cryption;
    private javax.swing.JRadioButton DES;
    private javax.swing.JRadioButton Decryption;
    private javax.swing.JRadioButton Encryption;
    private javax.swing.JButton Go;
    private javax.swing.JRadioButton Substitution1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
       
}
