/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_tic_tac_toe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFRAME_GAME extends javax.swing.JFrame {

    private String startGame="x";
    private int xcount=0,ocount=0;
    private boolean checker;
    
    public JFRAME_GAME() {
        initComponents();
    }

    private void gamescore(){
        jLabelPlayerx.setText(String.valueOf(xcount));
        jLabelPlayerO.setText(String.valueOf(ocount));
    }
    
    private void choose_a_player(){
        if(startGame.equalsIgnoreCase("x")){
            startGame="o";
        }
        else{
            startGame="x";
        }
    }
    private void winingGame(){
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        String b4=jButton10.getText();
        String b5=jButton11.getText();
        String b6=jButton12.getText();
        String b7=jButton13.getText();
        String b8=jButton14.getText();
        String b9=jButton16.getText();
        
        //x win horizontal
        if(b1==("x")&&b2==("x")&&b3==("x")){
            JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.orange);
            jButton2.setBackground(Color.orange);
            jButton3.setBackground(Color.orange);
            xcount++;
            gamescore();
            
        }
        if(b4==("x")&&b5==("x")&&b6==("x")){
             JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton10.setBackground(Color.orange);
             jButton11.setBackground(Color.orange);
             jButton12.setBackground(Color.orange);
             xcount++;
             gamescore();
        }
        if(b7==("x")&&b8==("x")&&b9==("x")){
             JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton13.setBackground(Color.orange);
             jButton14.setBackground(Color.orange);
             jButton16.setBackground(Color.orange);
             xcount++;
             gamescore();
        }
        //o win horizontal
        
        if(b1==("o")&&b2==("o")&&b3==("o")){
            JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.red);
            jButton2.setBackground(Color.red);
            jButton3.setBackground(Color.red);
            ocount++;
            gamescore();
        }
        if(b4==("o")&&b5==("o")&&b6==("o")){
             JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton10.setBackground(Color.red);
             jButton11.setBackground(Color.red);
             jButton12.setBackground(Color.red);
             ocount++;
             gamescore();
        }
        if(b7==("o")&&b8==("o")&&b9==("o")){
             JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton13.setBackground(Color.red);
             jButton14.setBackground(Color.red);
             jButton16.setBackground(Color.red);
             ocount++;
             gamescore();
        }
        
        //x win vertical
        if(b1==("x")&&b4==("x")&&b7==("x")){
            JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.orange);
            jButton10.setBackground(Color.orange);
            jButton13.setBackground(Color.orange);
            xcount++;
            gamescore();
        }
        if(b2==("x")&&b5==("x")&&b8==("x")){
             JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.orange);
             jButton11.setBackground(Color.orange);
             jButton14.setBackground(Color.orange);
             xcount++;
             gamescore();
        }
        if(b3==("x")&&b6==("x")&&b9==("x")){
             JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton3.setBackground(Color.orange);
             jButton12.setBackground(Color.orange);
             jButton16.setBackground(Color.orange);
             xcount++;
             gamescore();
        }
        //o win vertical
        
        if(b1==("o")&&b4==("o")&&b7==("o")){
            JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.red);
            jButton10.setBackground(Color.red);
            jButton13.setBackground(Color.red);
            ocount++;
            gamescore();
        }
        if(b2==("o")&&b5==("o")&&b8==("o")){
             JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton2.setBackground(Color.red);
             jButton11.setBackground(Color.red);
             jButton14.setBackground(Color.red);
             ocount++;
             gamescore();
        }
        if(b3==("o")&&b6==("o")&&b9==("o")){
             JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton3.setBackground(Color.red);
             jButton12.setBackground(Color.red);
             jButton16.setBackground(Color.red);
             ocount++;
             gamescore();
        }
        //x win diagonal
        if(b1==("x")&&b5==("x")&&b9==("x")){
            JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.orange);
            jButton11.setBackground(Color.orange);
            jButton16.setBackground(Color.orange);
            xcount++;
            gamescore();
        }
        if(b3==("x")&&b5==("x")&&b7==("x")){
             JOptionPane.showMessageDialog(this,"Player X Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton3.setBackground(Color.orange);
             jButton11.setBackground(Color.orange);
             jButton13.setBackground(Color.orange);
             xcount++;
             gamescore();
        }
        
        //o win diagonal
        
        if(b1==("o")&&b5==("o")&&b9==("o")){
            JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.red);
            jButton11.setBackground(Color.red);
            jButton16.setBackground(Color.red);
            ocount++;
            gamescore();
        }
        if(b3==("o")&&b5==("o")&&b7==("o")){
             JOptionPane.showMessageDialog(this,"Player O Wins","TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
             jButton3.setBackground(Color.red);
             jButton11.setBackground(Color.red);
             jButton13.setBackground(Color.red);
             ocount++;
             gamescore();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPlayerO = new javax.swing.JLabel();
        jLabelPlayerx = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC-TAC-TOE by Harman");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.cyan);
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 52)); // NOI18N
        jLabel2.setText(" Player O :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 80));

        jLabelPlayerO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPlayerO.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelPlayerO.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayerO.setText("0");
        jLabelPlayerO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelPlayerO.setOpaque(true);
        jPanel3.add(jLabelPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 290, 80));

        jLabelPlayerx.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPlayerx.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelPlayerx.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPlayerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayerx.setText("0");
        jLabelPlayerx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelPlayerx.setOpaque(true);
        jPanel3.add(jLabelPlayerx, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 290, 80));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 52)); // NOI18N
        jLabel4.setText(" Player X :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 630, 290));

        jPanel5.setBackground(new java.awt.Color(204, 51, 0));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setBackground(new java.awt.Color(0, 0, 153));
        jButton15.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("New Game");
        jButton15.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 140));

        jButton18.setBackground(new java.awt.Color(0, 0, 153));
        jButton18.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Exit");
        jButton18.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton18.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 300, 140));

        jButton19.setBackground(new java.awt.Color(0, 0, 153));
        jButton19.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Restart");
        jButton19.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton19.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 300, 140));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 630, 310));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 680, 680));

        jPanel4.setBackground(java.awt.Color.cyan);
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(java.awt.Color.blue);
        jButton1.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 190));

        jButton2.setBackground(java.awt.Color.blue);
        jButton2.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 190, 190));

        jButton3.setBackground(java.awt.Color.blue);
        jButton3.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 200, 190));

        jButton10.setBackground(java.awt.Color.blue);
        jButton10.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 180));

        jButton11.setBackground(java.awt.Color.blue);
        jButton11.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, 180));

        jButton12.setBackground(java.awt.Color.blue);
        jButton12.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 200, 180));

        jButton13.setBackground(java.awt.Color.blue);
        jButton13.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, 180));

        jButton14.setBackground(java.awt.Color.blue);
        jButton14.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton14.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 190, 180));

        jButton16.setBackground(java.awt.Color.blue);
        jButton16.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setMaximumSize(new java.awt.Dimension(250, 400));
        jButton16.setPreferredSize(new java.awt.Dimension(200, 380));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 200, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 670, 680));

        jPanel6.setBackground(java.awt.Color.cyan);
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 74)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIC-TAC-TOE");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 550, 80));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1370, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private JFrame frame;
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Continue if you want to exit","TIC TAC TOE"
                ,JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton16.setEnabled(true);
        
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton14.setText("");
        jButton16.setText("");
        
        
        jButton1.setBackground(Color.blue);
        jButton2.setBackground(Color.blue);
        jButton3.setBackground(Color.blue);
        jButton10.setBackground(Color.blue);
        jButton11.setBackground(Color.blue);
        jButton12.setBackground(Color.blue);
        jButton13.setBackground(Color.blue);
        jButton14.setBackground(Color.blue);
        jButton16.setBackground(Color.blue);
        
        
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton16.setEnabled(true);
        
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton14.setText("");
        jButton16.setText("");
        
        
        jButton1.setBackground(Color.blue);
        jButton2.setBackground(Color.blue);
        jButton3.setBackground(Color.blue);
        jButton10.setBackground(Color.blue);
        jButton11.setBackground(Color.blue);
        jButton12.setBackground(Color.blue);
        jButton13.setBackground(Color.blue);
        jButton14.setBackground(Color.blue);
        jButton16.setBackground(Color.blue);
        
        jLabelPlayerx.setText("0");
        jLabelPlayerO.setText("0");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            checker=false;
        }
        else
            checker=true;
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_jButton16ActionPerformed

    
    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRAME_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPlayerO;
    private javax.swing.JLabel jLabelPlayerx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
