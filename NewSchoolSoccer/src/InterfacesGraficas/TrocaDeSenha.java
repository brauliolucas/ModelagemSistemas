/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import java.awt.Color;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import newschoolsoccer.Professor;

/**
 *
 * @author Antônio Henrique Passamai Penizollo  
 * @author Braulio Silva Mendes Lucas  
 * @author João Victor Dutra Balboa  
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class TrocaDeSenha extends javax.swing.JPanel {

    /**
     * Creates new form TrocaDeSenha
     */
    
    private String perfil;
    public TrocaDeSenha(String perfil) {
        initComponents();
        this.perfil = perfil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texttoLogin = new javax.swing.JLabel();
        textoSenha = new javax.swing.JLabel();
        botaoSenha = new javax.swing.JButton();
        novaSenhaInvalidaMensagem = new javax.swing.JLabel();
        escudo = new javax.swing.JLabel();
        campoSenha1 = new javax.swing.JPasswordField();
        campoSenha2 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(94, 109, 252));

        texttoLogin.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        texttoLogin.setForeground(new java.awt.Color(255, 255, 255));
        texttoLogin.setText("Nova senha:");

        textoSenha.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        textoSenha.setForeground(new java.awt.Color(255, 255, 255));
        textoSenha.setText("Repita a senha:");

        botaoSenha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        botaoSenha.setText("Entrar");
        botaoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSenhaActionPerformed(evt);
            }
        });

        novaSenhaInvalidaMensagem.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        novaSenhaInvalidaMensagem.setForeground(new java.awt.Color(94, 109, 252));
        novaSenhaInvalidaMensagem.setText("Senhas não conferem. Digite novamente.");

        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesGraficas/Escudo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(escudo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texttoLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(novaSenhaInvalidaMensagem)
                        .addGap(184, 184, 184))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texttoLogin)
                    .addComponent(campoSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSenha)
                    .addComponent(campoSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(novaSenhaInvalidaMensagem)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSenhaActionPerformed
        
        
        if(campoSenha1.getText().equals(campoSenha2.getText()))
        {
            if(campoSenha1.getText().length() >= 6)
            {
                if(perfil == "admin"){
                    Professor.setPwAdemir(campoSenha1.getText());
                } else {
                    Professor.setPwProf(campoSenha1.getText());
                }
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso. Realizando Login.");
                ((Window) getRootPane().getParent()).dispose();
                
                JFrame novo = new JanelaComAbas(perfil);;
                novo.setVisible(true);
            }
            else 
            {
                novaSenhaInvalidaMensagem.setForeground(Color.red);
                novaSenhaInvalidaMensagem.setText("Favor digitar uma senha com pelo menos seis dígitos.");
            }
        }
        else
        {
            novaSenhaInvalidaMensagem.setForeground(Color.red);
            novaSenhaInvalidaMensagem.setText("Senhas não conferem. Digite novamente.");
        }

        
    }//GEN-LAST:event_botaoSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSenha;
    private javax.swing.JPasswordField campoSenha1;
    private javax.swing.JPasswordField campoSenha2;
    private javax.swing.JLabel escudo;
    private javax.swing.JLabel novaSenhaInvalidaMensagem;
    private javax.swing.JLabel textoSenha;
    private javax.swing.JLabel texttoLogin;
    // End of variables declaration//GEN-END:variables
}
