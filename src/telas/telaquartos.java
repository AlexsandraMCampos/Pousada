package telas;
import java.sql.*;
import dal.ModuloConexao;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDate;


import java.util.Scanner;

public class telaquartos extends javax.swing.JFrame {
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
       
    public telaquartos() {
        initComponents();
         conexao = ModuloConexao.conector();
                  Selecionar();     
            
    }
    
//    public class SimulacaoReserva{;
//        private int QtdDias;
//        private LocalDate txtEntrada;
//        private LocalDate txtSaida;
//        private int txtValorQuarto;
//        
//    }
//      
//    public SimulacaoReserva(){}
//      public SimulacaoReserva (int QtdDias, LocalDate txtEntrada, LocalDate txtSaida, int txtValorQuartos){
//        this.QtdDias = QtdDias;
//        this.txtEntrada = txtEntrada;
//        this.txtSaida = txtSaida;
//        this.txtValorQuartos = txtValorQuartos;
//       
//
//      }
    

      private void Selecionar() {        
        
    String idQuarto = String.valueOf(telaprincipal_1.pegarIDQuarto());
    
    String sql = "SELECT preco FROM tbl_quarto WHERE ID=?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, idQuarto);
            rs = pst.executeQuery();
            
            // Se existir quarto correspondente
            if(rs.next()){
                String valorQuarto = rs.getString("preco");
                
                txtValorQuarto.setText(valorQuarto);
            }else{
                JOptionPane.showMessageDialog(null, "Quarto inválido!!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void limpar(){
                       
            txtValorQuarto.setText(null);
    }  
    
            private void total(){
                
               String entrada = txtEntrada.getText();
               String saida = txtSaida.getText();
                       
     
                      
     
     
  
        
        
  
    }
            
            
            
    
    
    
//public class ContaQuartos{
//    
//    private int conta;
//    
//    public void setConta(int conta){
//        this.conta = conta;
//        
//    }
//    public int getConta(){
//        return conta;
//            }
//    public void totalQuartos(int valor){
//        conta += valor;
//    }
//    
//    public void verificarQtdd(){
//        System.out.print(getConta());
//    }
//}


    
          
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValorQuarto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVoltarPrincipal = new javax.swing.JButton();
        btnSeguirReserva = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        QtdDias = new javax.swing.JSpinner();
        btnTotal = new javax.swing.JButton();
        txtEntrada = new javax.swing.JTextField();
        txtSaida = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Escolha o seu quarto");

        jLabel4.setText("Entrada");

        jLabel6.setText("Saída");

        jLabel9.setText("Valor Quarto");

        txtValorQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorQuartoActionPerformed(evt);
            }
        });

        jLabel3.setText("Qtdd Quartos");

        btnVoltarPrincipal.setText("VOLTAR");
        btnVoltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPrincipalActionPerformed(evt);
            }
        });

        btnSeguirReserva.setText("SEGUIR COM A RESERVA");
        btnSeguirReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguirReservaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quarto.png"))); // NOI18N

        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        txtEntrada.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEntradaCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnVoltarPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btnSeguirReserva)
                .addGap(0, 149, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTotal)
                            .addComponent(txtValorQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QtdDias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(QtdDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtValorQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTotal)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarPrincipal)
                    .addComponent(btnSeguirReserva))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarPrincipalActionPerformed

    private void btnSeguirReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguirReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguirReservaActionPerformed

    private void txtValorQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorQuartoActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtValorQuartoActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        total();
    }//GEN-LAST:event_btnTotalActionPerformed

    private void txtEntradaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEntradaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner QtdDias;
    private javax.swing.JButton btnSeguirReserva;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnVoltarPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtSaida;
    private javax.swing.JTextField txtValorQuarto;
    // End of variables declaration//GEN-END:variables
}
