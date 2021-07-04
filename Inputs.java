public class Inputs extends javax.swing.JFrame {
    
    public Inputs() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        input = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manual = new javax.swing.JRadioButton();
        file = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        goes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 63, 124));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 50)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Time!");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>Type it in the Text Area</center></html>");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center> Choose the text file<center></html>");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Or");

        manual.setBackground(new java.awt.Color(231, 63, 124));
        input.add(manual);
        manual.setFont(new java.awt.Font("Consolas", 0, 20)); 
        manual.setForeground(new java.awt.Color(255, 255, 255));
        manual.setText("Manual Text");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });

        file.setBackground(new java.awt.Color(231, 63, 124));
        input.add(file);
        file.setFont(new java.awt.Font("Consolas", 0, 20)); 
        file.setForeground(new java.awt.Color(255, 255, 255));
        file.setText("File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(manual))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manual)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 590));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 30)); 
        jLabel2.setText("Enter Key");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 170, 70));

        jLabel6.setFont(new java.awt.Font("Consolas", 2, 16)); 
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html>DES Encryption : 1234<br>DES Decryption : Received key <br>Caesar Encryption : The shift number<br>Caesar Decryption : The shift number<br>Substitution Encryption : Enter 1234 <br> Substitution Decryption : Enter 1234</html>  ");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 330, 160));

        key.setText("Your Key...");
        key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyKeyReleased(evt);
            }
        });
        bg.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 330, 30));

        goes.setBackground(new java.awt.Color(231, 63, 124));
        goes.setFont(new java.awt.Font("Monospaced", 3, 14)); 
        goes.setForeground(new java.awt.Color(255, 255, 255));
        goes.setText("Go!");
        goes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        goes.setBorderPainted(false);
        goes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goesActionPerformed(evt);
            }
        });
        bg.add(goes, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

   private void manualActionPerformed(java.awt.event.ActionEvent evt) {
        CipherIT.getInput(2);
        new Manual().setVisible(true);
    }                                     

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {
        CipherIT.getInput(1);
        javax.swing.JFileChooser FileExplorer = new javax.swing.JFileChooser();
        int response = FileExplorer.showOpenDialog(null);
        if (response == FileExplorer.APPROVE_OPTION) {
            String file = FileExplorer.getSelectedFile().getAbsolutePath();

            CipherIT.getFile(file);
        }
    }                                   

   private void goesActionPerformed(java.awt.event.ActionEvent evt) {
        if (CipherIT.Input != -7 && !CipherIT.filepath.equals("") && CipherIT.keyValid == 0) {
            CipherIT.Execute();
            new OutputScreen().setVisible(true);

            dispose();
        }
    }                                    

    private void keyKeyReleased(java.awt.event.KeyEvent evt) {
        
        try
        {
         if(CipherIT.Algorithm == 2)
         {
          int x = Integer.parseInt(key.getText());
          if(x>25 || x<1)throw new NumberFormatException("Rejection T.T");
          }
          CipherIT.getKey(key.getText());
          CipherIT.keyValid = 0;
        }
        catch(NumberFormatException x)
        {
         CipherIT.keyValid = -7;
         System.out.println("Caesar requires a number");
        }
        
    }                              

    
 

    
    private javax.swing.JPanel bg;
    private javax.swing.JRadioButton file;
    private javax.swing.JButton goes;
    private javax.swing.ButtonGroup input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField key;
    private javax.swing.JRadioButton manual;
    
}
