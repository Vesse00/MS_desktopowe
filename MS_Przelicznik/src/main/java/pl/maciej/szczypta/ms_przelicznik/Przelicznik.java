/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.maciej.szczypta.ms_przelicznik;

/**
 *
 * @author gromm
 */
public class Przelicznik extends javax.swing.JFrame {

    /**
     * Creates new form Przelicznik
     */
    public Przelicznik() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        MS_jPanelDistance = new javax.swing.JPanel();
        MS_jLabelNapis = new javax.swing.JLabel();
        MS_jTextFieldGet = new javax.swing.JTextField();
        MS_jComboBoxJednoska = new javax.swing.JComboBox<>();
        MS_jLabelto = new javax.swing.JLabel();
        MS_jComboBoxJednoskaTo = new javax.swing.JComboBox<>();
        MS_jButtonPrzelicz = new javax.swing.JButton();
        MS_jLabelWynik = new javax.swing.JLabel();
        MS_jTextFieldWynik = new javax.swing.JTextField();
        MS_jPanelTemp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MS_jTextFieldInp = new javax.swing.JTextField();
        MS_jComboBoxTempIn = new javax.swing.JComboBox<>();
        MS_jComboBoxTempOut = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        MS_jButtonTemperatura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MS_jTextFieldWynikTemp = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MS_jMenuPlik = new javax.swing.JMenu();
        MS_jMenuItemHistory = new javax.swing.JMenuItem();
        MS_jMenuItemClose = new javax.swing.JMenuItem();
        MS_jMenuAbout = new javax.swing.JMenu();
        MS_jMenuItemAbout = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MS_jLabelNapis.setText("Wprowadz dystans:");

        MS_jTextFieldGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MS_jTextFieldGetActionPerformed(evt);
            }
        });

        MS_jComboBoxJednoska.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "m", "km" }));

        MS_jLabelto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MS_jLabelto.setText("NA:");

        MS_jComboBoxJednoskaTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "m", "km" }));

        MS_jButtonPrzelicz.setText("Przelicz");
        MS_jButtonPrzelicz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MS_jButtonPrzeliczActionPerformed(evt);
            }
        });

        MS_jLabelWynik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MS_jLabelWynik.setText("Wynik:");

        MS_jTextFieldWynik.setEditable(false);

        javax.swing.GroupLayout MS_jPanelDistanceLayout = new javax.swing.GroupLayout(MS_jPanelDistance);
        MS_jPanelDistance.setLayout(MS_jPanelDistanceLayout);
        MS_jPanelDistanceLayout.setHorizontalGroup(
            MS_jPanelDistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MS_jPanelDistanceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MS_jButtonPrzelicz)
                .addGap(29, 29, 29))
            .addGroup(MS_jPanelDistanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MS_jPanelDistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MS_jPanelDistanceLayout.createSequentialGroup()
                        .addGroup(MS_jPanelDistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MS_jLabelNapis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MS_jTextFieldGet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MS_jComboBoxJednoska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(MS_jLabelto)
                        .addGap(26, 26, 26)
                        .addComponent(MS_jComboBoxJednoskaTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(MS_jPanelDistanceLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MS_jLabelWynik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MS_jTextFieldWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        MS_jPanelDistanceLayout.setVerticalGroup(
            MS_jPanelDistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MS_jPanelDistanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MS_jLabelNapis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MS_jPanelDistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MS_jTextFieldGet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS_jComboBoxJednoska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS_jLabelto)
                    .addComponent(MS_jComboBoxJednoskaTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(MS_jPanelDistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MS_jLabelWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS_jTextFieldWynik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(MS_jButtonPrzelicz)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Dystans", MS_jPanelDistance);

        jLabel2.setText("Wprowadz temperature:");

        MS_jComboBoxTempIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "celsjusz", "fahrenheit", "kelwin" }));

        MS_jComboBoxTempOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "celsjusz", "fahrenheit", "kelwin" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NA:");

        MS_jButtonTemperatura.setText("Przelicz");
        MS_jButtonTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MS_jButtonTemperaturaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Wynik:");

        MS_jTextFieldWynikTemp.setEditable(false);

        javax.swing.GroupLayout MS_jPanelTempLayout = new javax.swing.GroupLayout(MS_jPanelTemp);
        MS_jPanelTemp.setLayout(MS_jPanelTempLayout);
        MS_jPanelTempLayout.setHorizontalGroup(
            MS_jPanelTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MS_jPanelTempLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MS_jButtonTemperatura)
                .addGap(26, 26, 26))
            .addGroup(MS_jPanelTempLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MS_jPanelTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(MS_jPanelTempLayout.createSequentialGroup()
                        .addComponent(MS_jTextFieldInp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MS_jComboBoxTempIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MS_jComboBoxTempOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MS_jPanelTempLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MS_jTextFieldWynikTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        MS_jPanelTempLayout.setVerticalGroup(
            MS_jPanelTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MS_jPanelTempLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MS_jPanelTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MS_jTextFieldInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS_jComboBoxTempIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS_jComboBoxTempOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(MS_jPanelTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MS_jTextFieldWynikTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(MS_jButtonTemperatura)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Temperatura", MS_jPanelTemp);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        MS_jMenuPlik.setText("Plik");

        MS_jMenuItemHistory.setText("Pokaz Historie");
        MS_jMenuPlik.add(MS_jMenuItemHistory);

        MS_jMenuItemClose.setText("Zamknij");
        MS_jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MS_jMenuItemCloseActionPerformed(evt);
            }
        });
        MS_jMenuPlik.add(MS_jMenuItemClose);

        jMenuBar1.add(MS_jMenuPlik);

        MS_jMenuAbout.setText("O programie");

        MS_jMenuItemAbout.setText("O programie");
        MS_jMenuAbout.add(MS_jMenuItemAbout);

        jMenuBar1.add(MS_jMenuAbout);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void MS_jTextFieldGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MS_jTextFieldGetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MS_jTextFieldGetActionPerformed

    private void MS_jButtonPrzeliczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MS_jButtonPrzeliczActionPerformed
        Dystans();
    }//GEN-LAST:event_MS_jButtonPrzeliczActionPerformed

    private void MS_jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MS_jMenuItemCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MS_jMenuItemCloseActionPerformed

    private void MS_jButtonTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MS_jButtonTemperaturaActionPerformed
        Temperatura();
    }//GEN-LAST:event_MS_jButtonTemperaturaActionPerformed

    
    public void Dystans(){
        
        String distance = MS_jTextFieldGet.getText();
        float f = Float.parseFloat(distance);
        
        var zczego = MS_jComboBoxJednoska.getSelectedItem();
        //System.out.println(f+" "+zczego);
        
        var naco =  MS_jComboBoxJednoskaTo.getSelectedItem();
        if(naco == "mm"){
            if(zczego == "mm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+f);
                MS_jTextFieldWynik.setText(""+f);
            }else if(zczego == "cm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*10));
                MS_jTextFieldWynik.setText(""+(f*10));
            }else if(zczego == "m"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*1000));
                MS_jTextFieldWynik.setText(""+(f*1000));
            }else if(zczego == "km"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*1000000));
                MS_jTextFieldWynik.setText(""+(f*1000000));
            }
        }else if(naco == "cm"){
            if(zczego == "mm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*10));
                MS_jTextFieldWynik.setText(""+(f*10));
            }else if(zczego == "cm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+f);
                MS_jTextFieldWynik.setText(""+f);
            }else if(zczego == "m"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.01));
                MS_jTextFieldWynik.setText(""+(f*0.01));
            }else if(zczego == "km"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.000001));
                MS_jTextFieldWynik.setText(""+(f*0.000001));
            }
            
        }else if(naco == "m"){
            if(zczego == "mm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.001));
                MS_jTextFieldWynik.setText(""+(f*0.001));
            }else if(zczego == "cm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.01));
                MS_jTextFieldWynik.setText(""+(f*0.01));
            }else if(zczego == "m"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+f);
                MS_jTextFieldWynik.setText(""+f);
            }else if(zczego == "km"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*1000));
                MS_jTextFieldWynik.setText(""+(f*1000));
            }
            
        }else if(naco == "km"){
            if(zczego == "mm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.000001));
                MS_jTextFieldWynik.setText(""+(f*0.000001));
            }else if(zczego == "cm"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.00001));
                MS_jTextFieldWynik.setText(""+(f*0.00001));
            }else if(zczego == "m"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+(f*0.001));
                MS_jTextFieldWynik.setText(""+(f*0.001));
            }else if(zczego == "km"){
                System.out.println(f+" "+zczego+" w przeliczeniu na "+naco+" = "+f);
                MS_jTextFieldWynik.setText(""+f);
            }
        }
    }
    
    public void Temperatura(){
        String temp = MS_jTextFieldInp.getText();
        float t = Float.parseFloat(temp);
        
        var zjakiej = MS_jComboBoxTempIn.getSelectedItem();
        var najaka = MS_jComboBoxTempOut.getSelectedItem();
        
        if(zjakiej == "celsjusz"){
            if(najaka == "celsjusz"){
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+t );
                MS_jTextFieldWynikTemp.setText(""+t);
            }else if(najaka == "fahrenheit"){
                double f = 1.8 * t +32;
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+f);
                MS_jTextFieldWynikTemp.setText(""+f);  
            }else if(najaka == "kelwin"){
                double k = t +273.15;
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+k);
                MS_jTextFieldWynikTemp.setText(""+k);
            }
            
        }else if(zjakiej == "fahrenheit"){
            if(najaka == "celsjusz"){
                double c =  0.5555555*(t - 32);
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+c);
                MS_jTextFieldWynikTemp.setText(""+c);
            }else if(najaka == "fahrenheit"){
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+t);
                MS_jTextFieldWynikTemp.setText(""+t);
            }else if(najaka == "kelwin"){
                double k = (t + 459.67) * 0.5555555;
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+k);
                MS_jTextFieldWynikTemp.setText(""+k);
            }
            
        }else if(zjakiej == "kelwin"){
            if(najaka == "celsjusz"){
                double c =  t - 273.15;
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+c);
                MS_jTextFieldWynikTemp.setText(""+c);
            }else if(najaka == "fahrenheit"){
                double f = (t * 1.8) - 459.67;
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+f);
                MS_jTextFieldWynikTemp.setText(""+f);
            }else if(najaka == "kelwin"){
                System.out.println("z "+zjakiej+" "+t+" Na: "+najaka+" "+t);
                MS_jTextFieldWynikTemp.setText(""+t);
            }
        }
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
            java.util.logging.Logger.getLogger(Przelicznik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Przelicznik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Przelicznik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Przelicznik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Przelicznik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MS_jButtonPrzelicz;
    private javax.swing.JButton MS_jButtonTemperatura;
    private javax.swing.JComboBox<String> MS_jComboBoxJednoska;
    private javax.swing.JComboBox<String> MS_jComboBoxJednoskaTo;
    private javax.swing.JComboBox<String> MS_jComboBoxTempIn;
    private javax.swing.JComboBox<String> MS_jComboBoxTempOut;
    private javax.swing.JLabel MS_jLabelNapis;
    private javax.swing.JLabel MS_jLabelWynik;
    private javax.swing.JLabel MS_jLabelto;
    private javax.swing.JMenu MS_jMenuAbout;
    private javax.swing.JMenuItem MS_jMenuItemAbout;
    private javax.swing.JMenuItem MS_jMenuItemClose;
    private javax.swing.JMenuItem MS_jMenuItemHistory;
    private javax.swing.JMenu MS_jMenuPlik;
    private javax.swing.JPanel MS_jPanelDistance;
    private javax.swing.JPanel MS_jPanelTemp;
    private javax.swing.JTextField MS_jTextFieldGet;
    private javax.swing.JTextField MS_jTextFieldInp;
    private javax.swing.JTextField MS_jTextFieldWynik;
    private javax.swing.JTextField MS_jTextFieldWynikTemp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
