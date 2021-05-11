/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.maciej.szczypta.kolkokrzyzyk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import pl.maciej.szczypta.kolkokrzyzyk.gameutils.DrawPlayer;
import pl.maciej.szczypta.kolkokrzyzyk.gameutils.GameLogic;

/**
 *
 * @author gromm
 */
public class GameWindow extends javax.swing.JFrame {
    private boolean player = false;
    private Player p1, p2;
    private JButton[][] buttonTab;
    private GameLogic logicGame;
    /**
     * Creates new form GameWindow
     */
    public GameWindow() {
        initComponents();
        setTitle("Kolki i krzyzyk");
        InitGame();
        initButtons();
        setCircleCrossToButtons();
    }
    
    private void initButtons(){
        buttonTab = new JButton[3][3];
        buttonTab[0][0] =jButton11;//bottom left corner
        buttonTab[0][1] =jButton12;
        buttonTab[0][2] =jButton13;//top left corner
        
        buttonTab[1][0] =jButton21;//center bottom 
        buttonTab[1][1] =jButton22;
        buttonTab[1][2] =jButton23;//center top 
        
        buttonTab[2][0] =jButton31;//bottom right corner
        buttonTab[2][1] =jButton32;
        buttonTab[2][2] =jButton33;//top right corner
    }

    private void InitGame(){
        //System.out.println(DrawPlayer.randomPlayer());
        //System.out.println(DrawPlayer.randomSign());
        
        
        player = DrawPlayer.randomPlayer();
        
        if(player){
            jLabelP1.setBackground(Color.GREEN);
            jLabelP2.setBackground(Color.GRAY);
            
        }else{
            jLabelP2.setBackground(Color.GREEN);
            jLabelP1.setBackground(Color.GRAY);
        }
        
        if(DrawPlayer.randomSign()){
            jLabelP1Sign.setText("O");   
            jLabelP2Sign.setText("X");  
            p1= new Player("O", jTextFieldP1.getText());
            p2= new Player("X", jTextFieldP2.getText());
        }else{
            jLabelP1Sign.setText("X");   
            jLabelP2Sign.setText("O");  
            p1= new Player("X", jTextFieldP1.getText());
            p2= new Player("O", jTextFieldP2.getText());
        }
        logicGame = new GameLogic();
        System.out.println(logicGame);
    }
    
    /**
    * set Listener to all buttons for circle or cross
    */
    private void setCircleCrossToButtons(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                final int x = i;
                final int y = j;
                buttonTab[i][j].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    
                    setCircleOrCross(x ,y);
                }
                });
            }
        }
        

    }
    
    private void clearButtonText(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttonTab[i][j].setText("");
                buttonTab[i][j].setEnabled(true);
            }
        }

    }
    
    private void setCircleOrCross(int x,int y) {           
        //JButton b = (JButton) evt.getSource();
        boolean isWinner = false;
        
        if(player){
            buttonTab[x][y].setText(p1.getSign());
            if(p1.getSign().equals("O"))
               isWinner = logicGame.addPlayerMoveBoard(x, y, 1);
            else
                isWinner = logicGame.addPlayerMoveBoard(x, y, 2);
            
            jLabelP1.setBackground(Color.GRAY);
            jLabelP2.setBackground(Color.GREEN);
        }else{
            buttonTab[x][y].setText(p2.getSign());
            if(p2.getSign().equals("O"))
                isWinner = logicGame.addPlayerMoveBoard(x, y, 1);
            else
                isWinner = logicGame.addPlayerMoveBoard(x, y, 2);
            
            jLabelP1.setBackground(Color.GREEN);
            jLabelP2.setBackground(Color.GRAY);
        }
        //TODO isWinner?
        buttonTab[x][y].setEnabled(false);
        System.out.println(logicGame+"\n");
        
        if(isWinner){
            System.out.println("Wygrana! "+player);
        }
        
        player = !player; //zmiana true na false lub false na true
        
        //System.out.println(b.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonPVP = new javax.swing.JRadioButton();
        jRadioButtonPVC = new javax.swing.JRadioButton();
        jTextFieldP1 = new javax.swing.JTextField();
        jTextFieldP2 = new javax.swing.JTextField();
        jLabelP1 = new javax.swing.JLabel();
        jLabelP2 = new javax.swing.JLabel();
        jLabelP1Sign = new javax.swing.JLabel();
        jLabelP2Sign = new javax.swing.JLabel();
        jButtonNewGame = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        buttonGroup.add(jRadioButtonPVP);
        jRadioButtonPVP.setSelected(true);
        jRadioButtonPVP.setText("2 graczy");

        buttonGroup.add(jRadioButtonPVC);
        jRadioButtonPVC.setText("vs Komputer");

        jLabelP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP1.setText("Gracz 1");
        jLabelP1.setOpaque(true);

        jLabelP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP2.setText("Gracz 2");
        jLabelP2.setOpaque(true);

        jLabelP1Sign.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelP1Sign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP1Sign.setText("x");

        jLabelP2Sign.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelP2Sign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP2Sign.setText("o");

        jButtonNewGame.setText("New Game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton31.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton31.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton31.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton31.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton32.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton32.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton32.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton32.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton32.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton21.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton21.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton21.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton21.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton21.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton11.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton11.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton11.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton11.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton23.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton23.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton23.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton23.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton23.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton22.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton22.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton22.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton22.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton22.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton12.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton12.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton12.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton12.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton12.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton13.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton13.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton13.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton13.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton13.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton33.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton33.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton33.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton33.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton33.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelP1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(194, 194, 194)
                        .addComponent(jLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldP1)
                            .addComponent(jRadioButtonPVP, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelP1Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelP2Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonPVC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNewGame)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPVP)
                    .addComponent(jRadioButtonPVC)
                    .addComponent(jButtonNewGame))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelP1Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelP2Sign)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelP1)
                    .addComponent(jLabelP2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        clearButtonText();
        InitGame();
        
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JLabel jLabelP1;
    private javax.swing.JLabel jLabelP1Sign;
    private javax.swing.JLabel jLabelP2;
    private javax.swing.JLabel jLabelP2Sign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonPVC;
    private javax.swing.JRadioButton jRadioButtonPVP;
    private javax.swing.JTextField jTextFieldP1;
    private javax.swing.JTextField jTextFieldP2;
    // End of variables declaration//GEN-END:variables
}
