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

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 63, 124));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Time!");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>Type your text in the text area</center></html>");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center> Choose the text file<center></html>");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Or");

        manual.setBackground(new java.awt.Color(231, 63, 124));
        input.add(manual);
        manual.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        manual.setForeground(new java.awt.Color(255, 255, 255));
        manual.setText("Manual Text");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });

        file.setBackground(new java.awt.Color(231, 63, 124));
        input.add(file);
        file.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(file)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(manual))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(jLabel4))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(file)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manual)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 590));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("Enter Key");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 140, 70));

        jLabel6.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        jLabel6.setText("<html>DES Encryption : 1234<br>DES Decryption : The key you received <br>Caesar Encryption : The number you entered<br>Caesar Decryption : the number you entered<br>Substitution Encryption: Enter 1234 <br> Substitution Decryption : Enter 1234</html>  ");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 310, 200));

        key.setText("Your Key...");
        key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyKeyReleased(evt);
            }
        });
        bg.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 300, 30));

        goes.setBackground(new java.awt.Color(231, 63, 134));
        goes.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
        goes.setForeground(new java.awt.Color(255, 255, 255));
        goes.setText("Go!");
        goes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        goes.setBorderPainted(false);
        goes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goesActionPerformed(evt);
            }
        });
        bg.add(goes, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 130, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
       CipherIT.getInput(2);
       new Manual().setVisible(true);
    }//GEN-LAST:event_manualActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        CipherIT.getInput(1);
        javax.swing.JFileChooser FileExplorer = new javax.swing.JFileChooser();
        int response = FileExplorer.showOpenDialog(null);
        if(response == FileExplorer.APPROVE_OPTION)
        {
            String file = FileExplorer.getSelectedFile().getAbsolutePath();
           
            CipherIT.getFile(file);
        }
    }//GEN-LAST:event_fileActionPerformed

    private void goesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goesActionPerformed
       if(CipherIT.Input!=-7 && !CipherIT.filepath.equals("") && !CipherIT.key.equals("")){
        CipherIT.infoDisplay();
       //Put the algorithm for the project here
       dispose();
       }
    }//GEN-LAST:event_goesActionPerformed

    private void keyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyKeyReleased
        CipherIT.getKey(key.getText());
    }//GEN-LAST:event_keyKeyReleased

    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
