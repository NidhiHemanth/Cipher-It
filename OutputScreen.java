public class OutputScreen extends javax.swing.JFrame {
  
    public OutputScreen() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CryptedTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OutputFile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OUTPUTC = new javax.swing.JTextArea();
        keys = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(231, 63, 124));

        jLabel1.setBackground(new java.awt.Color(231, 63, 124));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 30)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thank you for using our application!");

        CryptedTitle.setBackground(new java.awt.Color(231, 63, 124));
        CryptedTitle.setFont(new java.awt.Font("Monospaced", 1, 18)); 
        CryptedTitle.setForeground(new java.awt.Color(255, 255, 255));
        CryptedTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CryptedTitle.setText("Your Encrypted text");

        jLabel3.setBackground(new java.awt.Color(231, 63, 124));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Your Key");

        OutputFile.setBackground(new java.awt.Color(231, 63, 124));
        OutputFile.setFont(new java.awt.Font("Consolas", 3, 14)); 
        OutputFile.setForeground(new java.awt.Color(255, 255, 255));
        OutputFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutputFile.setText("You can find your output file at: "+CipherIT.OutputFile);

        OUTPUTC.setBackground(new java.awt.Color(231, 63, 124));
        OUTPUTC.setColumns(20);
        OUTPUTC.setFont(new java.awt.Font("Monospaced", 0, 12)); 
        OUTPUTC.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTC.setLineWrap(true);
        OUTPUTC.setRows(5);
        OUTPUTC.setText(CipherIT.CryptedOutput);
        OUTPUTC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(OUTPUTC);

        keys.setBackground(new java.awt.Color(231, 63, 124));
        keys.setFont(new java.awt.Font("Monospaced", 1, 12)); 
        keys.setForeground(new java.awt.Color(255, 255, 255));
        keys.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        keys.setText(CipherIT.key);
        keys.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(keys, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OutputFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CryptedTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(OutputFile)
                .addGap(30, 30, 30)
                .addComponent(CryptedTitle)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(keys, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                                       
    private javax.swing.JLabel CryptedTitle;
    private javax.swing.JTextArea OUTPUTC;
    private javax.swing.JLabel OutputFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keys;
                    
}
