package pl.home.local.adams.listazakupow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adams
 */
public class ListaZakupow extends javax.swing.JFrame{

    public ListaZakupow() {
        initComponents();
        addKeyListenerTojTFCoKupiles();
        addKeyListenerTojTFWartosc();
        addKeyListenerTojTFData();
        addToolTipToElements();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPWprowadzZakupy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCoKupiles = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFWartosc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADzisiejszeZakupy = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldToday = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldWeek = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonZapisz = new javax.swing.JButton();
        jPListaZakupow = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wpisz co kupiłeś");

        jTFCoKupiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCoKupilesActionPerformed(evt);
            }
        });

        jLabel2.setText("Podaj wartość");

        jTFWartosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFWartoscActionPerformed(evt);
            }
        });

        jLabel3.setText("Data zakupu");

        jLabel4.setText("Dzisiejsze zakupy");

        jTADzisiejszeZakupy.setColumns(20);
        jTADzisiejszeZakupy.setRows(5);
        jScrollPane1.setViewportView(jTADzisiejszeZakupy);

        jLabel5.setText("Wydatki z dzisiaj:");

        jLabel6.setText("Wydatki z tygodnia:");

        jLabel7.setText("Typ zakupionego towaru");

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonZapisz.setText("ZAPISZ");
        jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapiszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPWprowadzZakupyLayout = new javax.swing.GroupLayout(jPWprowadzZakupy);
        jPWprowadzZakupy.setLayout(jPWprowadzZakupyLayout);
        jPWprowadzZakupyLayout.setHorizontalGroup(
            jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPWprowadzZakupyLayout.createSequentialGroup()
                            .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFCoKupiles)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFWartosc))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldWeek))
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldToday))
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPWprowadzZakupyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonZapisz)))
                .addContainerGap())
        );
        jPWprowadzZakupyLayout.setVerticalGroup(
            jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonZapisz))
                .addGap(18, 18, 18)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Wprowadź zakupy", jPWprowadzZakupy);

        javax.swing.GroupLayout jPListaZakupowLayout = new javax.swing.GroupLayout(jPListaZakupow);
        jPListaZakupow.setLayout(jPListaZakupowLayout);
        jPListaZakupowLayout.setHorizontalGroup(
            jPListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPListaZakupowLayout.setVerticalGroup(
            jPListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista zakupów", jPListaZakupow);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCoKupilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCoKupilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCoKupilesActionPerformed

    private void jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapiszActionPerformed
        jTADzisiejszeZakupy.setText(jTADzisiejszeZakupy.getText()+"\n"+jTFCoKupiles.getText()+";"+jTFWartosc.getText()+";"+jComboBoxType.getSelectedItem()+";"+jTextFieldData.getText());
        
        
        File f = new File(file_name);
        try {
            FileWriter fw = new FileWriter(f,true);
            fw.append(jTFCoKupiles.getText()+";"+jTFWartosc.getText()+";"+jComboBoxType.getSelectedItem()+";"+jTextFieldData.getText());
            fw.close();
        }catch (IOException ex) {
            System.out.println("ERR: "+ex.toString());
        }
        
        jTFCoKupiles.setText("");
        jTFWartosc.setText("");
        jComboBoxType.setSelectedItem("Item 1");
        jTextFieldData.setText("");
        
    }//GEN-LAST:event_jButtonZapiszActionPerformed

    private void jTFWartoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFWartoscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFWartoscActionPerformed

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
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaZakupow().setVisible(true);
            }
        });
    }
    
    private void addKeyListenerTojTFCoKupiles(){
        jTFCoKupiles.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char vr = e.getKeyChar();
                if(vr == KeyEvent.VK_ENTER || vr >= 'A' && vr<= 'Z' || vr >= 'a' && vr <='z' || vr == KeyEvent.VK_SPACE){
                    jTFCoKupiles.setEditable(true);
                    //System.out.println("Wprowadzono dane po naciśnięciu ENTERA");
                    //jTADzisiejszeZakupy.setText(jTFCoKupiles.getText());
                }else{
                    jTFCoKupiles.setEditable(false);
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("2 keyPressed "+e.getKeyChar());
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("3 keyReleased "+e.getKeyChar());
            }
        });
    }
    
    
    
    private void addKeyListenerTojTFData(){
        jTextFieldData.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldData.getText();
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE /*|| ch == KeyEvent.VK_MINUS*/) && 
                        (temp.length() < 10 || ch == KeyEvent.VK_BACK_SPACE)
                    ){
                    jTextFieldData.setEditable(true);
                    
                    if(temp.length() == 4 || temp.length()==7 && ch != KeyEvent.VK_BACK_SPACE){
                        jTextFieldData.setText(temp+'-');
                    }else{
                        
                    }
                    
                    System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                }else{
                    jTextFieldData.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
   
    private void addKeyListenerTojTFWartosc(){
        jTFWartosc.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTFWartosc.getText();
                char ch = e.getKeyChar();
                
                //System.out.println("Przecinek"+temp.indexOf(".")+" dlugosc tekstu: "+temp.length());
                
               
                
                
                if(temp.contains(".")){
                    String[] splitted = temp.split(".");
                    if(splitted[1].length() < 2){
                        if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE){
                        jTFWartosc.setEditable(true);
                        //System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                        }else{
                            jTFWartosc.setEditable(false);
                        }
                    }
                    
                }else{
                    if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE || ch == '.'){
                    jTFWartosc.setEditable(true);
                    //System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                    }else{
                        jTFWartosc.setEditable(false);
                    }
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    private void addToolTipToElements(){
        jTFCoKupiles.setToolTipText("<html>"
                + "<h3>Wprowadz tekst</h3>"
                + "<p>Nie uzywaj polskich znakow</p>"
                + "</html>");
        jTFWartosc.setToolTipText("<html>"
                + "<h3>Wprowadz wartosc</h3>"
                + "</html>");
        jTextFieldData.setToolTipText("<html>"
                + "<h3>Wprowadz date</h3>"
                + "<p>Rok mies dzien</p>"
                + "</html>");
        jTextFieldToday.setToolTipText("<html>"
                + "<h3>Wprowadz dzisiejsze wydatki</h3>"
                + "</html>");
        jTextFieldWeek.setToolTipText("<html>"
                + "<h3>Wprowadz tygodniowe wydatki</h3>"
                + "</html>");
    }
    
    private String file_name = "lista_zakopow.csv";
    private String product_names = "product_names.csv";
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZapisz;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPListaZakupow;
    private javax.swing.JPanel jPWprowadzZakupy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADzisiejszeZakupy;
    private javax.swing.JTextField jTFCoKupiles;
    private javax.swing.JTextField jTFWartosc;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldToday;
    private javax.swing.JTextField jTextFieldWeek;
    // End of variables declaration//GEN-END:variables


}
