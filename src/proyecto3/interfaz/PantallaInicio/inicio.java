/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3.interfaz.PantallaInicio;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto3.interfaz.Principal.pantallaP;

/**
 *
 * @author 13mariano
 */
public class inicio extends javax.swing.JFrame {
    
    private int auxiliar = 0;
    hilo hilo = new hilo();
    private boolean flag = false;

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        inicio.this.getRootPane().setOpaque(false);
        inicio.this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        inicio.this.setBackground(new Color(0,0,0,0));
        inicio.this.setResizable(false);
        inicio.this.setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraP = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setMaximumSize(new java.awt.Dimension(407, 420));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(407, 420));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        barraP.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3/interfaz/Imagenes/JarAnlyzer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraP, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(flag == false){
            flag=true;
            barraP.setMaximum(49);
            barraP.setStringPainted(true);
            barraP.setMinimum(0);
            
            
            hilo.start();
        }
            
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    
private class hilo extends Thread{
    @Override
    public void run(){
        try {
            while (true) { 
                auxiliar++;
                barraP.setValue(auxiliar);
                repaint();
                switch(auxiliar){
                   
                    case 50:
                       
                        pantallaP pantallap = new pantallaP();
                        pantallap.setVisible(true);
                        pantallap.setLocationRelativeTo(inicio.this);
                        inicio.this.dispose();
                        break;
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraP;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
