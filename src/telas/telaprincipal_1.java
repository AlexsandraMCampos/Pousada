package telas;

import dal.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.*;

public class telaprincipal_1 extends javax.swing.JFrame {
    
    static int idQuarto = 0;
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
 
    public telaprincipal_1() {
       initComponents();
         conexao = ModuloConexao.conector();
    }
    
    private void pegarQuarto() {
        
        String input = JOptionPane.showInputDialog("Digite o número do quarto:\n 1 - Executivo\n 2 - Família\n 3 - Premium");
        
        int id = Integer.parseInt(input);
        
        idQuarto = id;
    }
    
    public static int pegarIDQuarto() {
                
        return idQuarto;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuHospede = new javax.swing.JMenu();
        MenuReserva = new javax.swing.JMenu();
        EscolherQuartos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        MenuHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hospedes.png"))); // NOI18N
        MenuHospede.setText("Hospede");
        MenuHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHospedeActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuHospede);

        MenuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reservar.png"))); // NOI18N
        MenuReserva.setText("Reserva");
        MenuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservaActionPerformed(evt);
            }
        });

        EscolherQuartos.setText("Quartos");
        EscolherQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolherQuartosActionPerformed(evt);
            }
        });
        MenuReserva.add(EscolherQuartos);

        jMenuBar1.add(MenuReserva);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quarto.png"))); // NOI18N
        jMenu1.setText("Quartos");
        jMenuBar1.add(jMenu1);

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        int MenuSair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? ", "Atenção",
            JOptionPane.YES_NO_OPTION);
        if(MenuSair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHospedeActionPerformed
        telaprincipal_1 saibamais = new telaprincipal_1();
        saibamais.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_MenuHospedeActionPerformed

    private void MenuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservaActionPerformed

    }//GEN-LAST:event_MenuReservaActionPerformed

    private void EscolherQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolherQuartosActionPerformed
        pegarQuarto();
        
        telaquartos pousada = new telaquartos();
        pousada.setVisible(true);

        
    }//GEN-LAST:event_EscolherQuartosActionPerformed
    
    public static void main(String args[]) {

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaprincipal_1().setVisible(true);
            }
        });
    }    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EscolherQuartos;
    private javax.swing.JMenu MenuHospede;
    private javax.swing.JMenu MenuReserva;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}


