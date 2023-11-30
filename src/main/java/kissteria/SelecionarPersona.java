/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kissteria;

import java.awt.List;
import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

import kissteria.conexao.Conexao;

/**
 *
 * @author bryzzen
 */
public class SelecionarPersona extends javax.swing.JPanel {
    private ArrayList<Guerreiro> guerreiros;
    private ArrayList<Mistico> misticoList;
    private String tipoGuerreiroSelecionado;
    private String tipoMisticoSelecionado;
    private ImageIcon imagemVencedor;

    /**
     * Creates new form Selecionar_Personagem
     */
    public SelecionarPersona() {

        initComponents();
        misticoList = new ArrayList<>();
        guerreiros = new ArrayList<>();
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
        jVida = new javax.swing.JLabel();
        jAtaque = new javax.swing.JLabel();
        jVelocidade = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDefesa = new javax.swing.JLabel();
        jForca = new javax.swing.JLabel();
        jPersonagemMistico = new javax.swing.JLabel();
        jComboBoxMistico2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPersonagem1 = new javax.swing.JLabel();
        jVidaM = new javax.swing.JLabel();
        jAtaqueM = new javax.swing.JLabel();
        jDefesaM = new javax.swing.JLabel();
        jInteM = new javax.swing.JLabel();
        jRecupeM = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1batalha = new javax.swing.JButton();

        setForeground(new java.awt.Color(215, 215, 215));

        jLabel1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jLabel1.setText("Selecione seu Guerreiro");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jVida.setText("jVida");

        jAtaque.setText("jAtaque");

        jVelocidade.setText("jVelocidade");

        jLabel5.setText("jLabel5");

        jDefesa.setText("jDefesa");

        jForca.setText("jForca");

        jPersonagemMistico.setText("img");

        jComboBoxMistico2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMistico2ItemStateChanged(evt);
            }
        });
        jComboBoxMistico2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxMistico2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxMistico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMistico2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jLabel2.setText("Selecione seu Místico");

        jPersonagem1.setText("img");

        jVidaM.setText("jLabel3");

        jAtaqueM.setText("jLabel4");

        jDefesaM.setText("jLabel6");

        jInteM.setText("jLabel7");

        jRecupeM.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jButton1batalha.setText("BATALHAR");
        jButton1batalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1batalhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMistico2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton1batalha)))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jVidaM)
                            .addComponent(jAtaqueM)
                            .addComponent(jDefesaM)
                            .addComponent(jInteM)
                            .addComponent(jRecupeM)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPersonagemMistico, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 244, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVelocidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(549, Short.MAX_VALUE)
                    .addComponent(jPersonagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jVida)
                .addGap(18, 18, 18)
                .addComponent(jAtaque)
                .addGap(18, 18, 18)
                .addComponent(jDefesa)
                .addGap(21, 21, 21)
                .addComponent(jForca)
                .addGap(18, 18, 18)
                .addComponent(jVelocidade)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPersonagemMistico, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMistico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVidaM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAtaqueM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jDefesaM)
                .addGap(18, 18, 18)
                .addComponent(jInteM)
                .addGap(18, 18, 18)
                .addComponent(jRecupeM)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButton1batalha)
                        .addGap(18, 18, 18)))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jPersonagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void carregarListaMistico(){
        String sqlMistico = "SELECT * FROM tb_mistico";
            misticoList.clear();

    try {
        PreparedStatement preparacaoDaInstrucaoMistico = Conexao.getConexao().prepareStatement(sqlMistico);

        ResultSet resultrowsMistico = preparacaoDaInstrucaoMistico.executeQuery();
        System.out.println("kissteria.Selecionar_Personagem.carregarListaMisticos() ADICIONOU AEEE");

        while (resultrowsMistico.next()) {
            Mistico mistico = new Mistico();

            mistico.setNome(resultrowsMistico.getString("nome"));
            mistico.setPontosVida(resultrowsMistico.getInt("pontosVida"));
            mistico.setPontosAtaque(resultrowsMistico.getInt("pontosAtaque"));
            mistico.setPontosDefesa(resultrowsMistico.getInt("pontosDefesa"));
            mistico.setTipoPersonagem(resultrowsMistico.getString("tipoPersonagem"));
            mistico.setInteligencia(resultrowsMistico.getInt("inteligencia"));
            mistico.setRecuperacao(resultrowsMistico.getInt("recuperacao"));


            System.out.println(misticoList);
            misticoList.add(mistico);
        }
        resultrowsMistico.close();

        jComboBoxMistico2.removeAllItems();
        for (Mistico m : misticoList) {
            jComboBoxMistico2.addItem(m.getNome());
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao carregar os místicos!");
    }

        }

    private void carregarListaGuerreiros() {
        String sql = "SELECT * FROM tb_guerreiro";
        guerreiros.clear();

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(sql);

            ResultSet resultrows = preparacaoDaInstrucao.executeQuery();
            System.out.println("kissteria.Selecionar_Personagem.carregarListaGuerreiros() ADICIONOU AEEE");

            while (resultrows.next()) {
                Guerreiro guerreiro = new Guerreiro();

                guerreiro.setNome(resultrows.getString("nome"));
                guerreiro.setPontosAtaque(resultrows.getInt("pontosVida"));
                guerreiro.setForca(resultrows.getInt("forca"));
                guerreiro.setPontosDefesa(resultrows.getInt("pontosDefesa"));
                guerreiro.setPontosVida(resultrows.getInt("pontosVida"));
                guerreiro.setVelocidade(resultrows.getInt("velocidade"));
                guerreiro.setTipoPersonagem(resultrows.getString("tipoPersonagem"));

                guerreiros.add(guerreiro);

//                System.out.println(guerreiros);
            }
            resultrows.close();

            jComboBox1.removeAllItems(); // Use removeAllItems() em vez de removeAll()
            for (Guerreiro g : guerreiros) {
                jComboBox1.addItem(g.getNome());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os guerreiros!");
        }
    }
    void jComboBox1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox1AncestorAdded


         carregarListaGuerreiros();

    }//GEN-LAST:event_jComboBox1AncestorAdded

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
            int selectedIndex = jComboBox1.getSelectedIndex();
            if (selectedIndex >= 0 && selectedIndex < guerreiros.size()) {
                Guerreiro guerreiroSelecionado = guerreiros.get(selectedIndex);
                tipoGuerreiroSelecionado = guerreiroSelecionado.getTipoPersonagem();

                jVida.setText("Vida: " + guerreiroSelecionado.getPontosVida());
                jAtaque.setText("Ataque: " + guerreiroSelecionado.getPontosAtaque());
                jDefesa.setText("Defesa: " + guerreiroSelecionado.getPontosDefesa());
                jForca.setText("Força: " + guerreiroSelecionado.getForca());
                jVelocidade.setText("Velocidade: " + guerreiroSelecionado.getVelocidade());
                jLabel5.setText("Tipo: " + guerreiroSelecionado.getTipoPersonagem());

                carregarImagemGuerreiro(guerreiroSelecionado);



            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBoxMistico2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMistico2ItemStateChanged
         if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
            int selectedIndex = jComboBoxMistico2.getSelectedIndex();
            if (selectedIndex >= 0 && selectedIndex < misticoList.size()) {
                Mistico misticoSelecionado = misticoList.get(selectedIndex);
                tipoMisticoSelecionado = misticoSelecionado.getTipoPersonagem();

                jVidaM.setText("Vida: " + misticoSelecionado.getPontosVida());
                jAtaqueM.setText("Ataque: " + misticoSelecionado.getPontosAtaque());
                jDefesaM.setText("Defesa: " + misticoSelecionado.getPontosDefesa());
                jInteM.setText("Força: " + misticoSelecionado.getInteligencia());
                jRecupeM.setText("Velocidade: " + misticoSelecionado.getRecuperacao());
                jLabel9.setText("Tipo: " + misticoSelecionado.getTipoPersonagem());

                carregarImagemMistico(misticoSelecionado);



            }
        }
    }//GEN-LAST:event_jComboBoxMistico2ItemStateChanged

    private void jComboBoxMistico2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxMistico2AncestorAdded
       carregarListaMistico();
    }//GEN-LAST:event_jComboBoxMistico2AncestorAdded

    private void jComboBoxMistico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMistico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMistico2ActionPerformed

    private void jButton1batalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1batalhaActionPerformed
        int selectedIndexGuerreiro = jComboBox1.getSelectedIndex();
        int selectedIndexMistico = jComboBoxMistico2.getSelectedIndex();

        if (selectedIndexGuerreiro >= 0 && selectedIndexMistico >= 0) {
            Guerreiro guerreiroSelecionado = guerreiros.get(selectedIndexGuerreiro);
            Mistico misticoSelecionado = misticoList.get(selectedIndexMistico);

            Batalha batalha = new Batalha();
            batalha.iniciarBatalha(guerreiroSelecionado, misticoSelecionado);



            if (batalha.isStatus()) {
                carregarImagemVencedor(guerreiroSelecionado.getTipoPersonagem(), misticoSelecionado.getTipoPersonagem());
                JOptionPane.showMessageDialog(this, "Batalha Concluída! Vencedor: " + batalha.getVencedor());

                JPanel panel = new JPanel();
                JLabel imagemLabel = new JLabel(imagemVencedor);
                JLabel vencedorLabel = new JLabel("Vencedor: " + batalha.getVencedor());
                JLabel outraInformacaoLabel = new JLabel("Multiplicar Ataque: " + batalha.getMultiplicadorAtaqueGuerreiro());

                // Adicione informações adicionais sobre a batalha
                JLabel danoGuerreiroLabel = new JLabel("Dano causado pelo Guerreiro: " + batalha.getDanoGuerreiro());
                JLabel danoMisticoLabel = new JLabel("Dano causado pelo Místico: " + batalha.getDanoMistico());
                JLabel bonusGuerreiroLabel = new JLabel("Bônus do Guerreiro: " + batalha.getBonusGuerreiro());
                JLabel bonusMisticoLabel = new JLabel("Bônus do Místico: " + batalha.getBonusMistico());

                panel.add(imagemLabel);
                panel.add(vencedorLabel);
                panel.add(outraInformacaoLabel);
                panel.add(danoGuerreiroLabel);
                panel.add(danoMisticoLabel);
                panel.add(bonusGuerreiroLabel);
                if (batalha.getBonusMistico() != null && !batalha.getBonusMistico().isEmpty()){
                    panel.add(bonusMisticoLabel);
                }


                // Utiliza os tipos previamente armazenados para carregar a imagem do vencedor
//                carregarImagemVencedor(tipoGuerreiroSelecionado, tipoMisticoSelecionado);
                JOptionPane.showMessageDialog(this, panel, "Batalha Concluída!", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "A batalha continua! " + guerreiroSelecionado.getNome() +
                        " VS " + misticoSelecionado.getNome());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um guerreiro e um místico para a batalha.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1batalhaActionPerformed
    private void carregarImagemVencedor(String tipoGuerreiro, String tipoMistico) {
        // Utiliza os tipos para determinar qual imagem exibir
        if ("Magico".equals(tipoGuerreiro)) {
            imagemVencedor = new ImageIcon(getClass().getResource("/tipo1.png"));
        } else if ("Tanque".equals(tipoGuerreiro)) {
            imagemVencedor = new ImageIcon(getClass().getResource("/tipo2.png"));
        } else if ("bruxo".equals(tipoMistico)) {
            imagemVencedor = new ImageIcon(getClass().getResource("/bruxo.png"));
        } else if ("demonio".equals(tipoMistico)) {
            imagemVencedor = new ImageIcon(getClass().getResource("/demonio.png"));
        } else {
            // Se o tipo não for reconhecido, pode configurar uma imagem padrão ou limpar a imagem
            imagemVencedor = null;
        }
    }

    private void carregarImagemGuerreiro(Guerreiro guerreiro) {
        if (guerreiro.getTipoPersonagem() == null || guerreiro.getTipoPersonagem().isEmpty()) {
            guerreiro.setTipoPersonagem("Sem imagem");
        }

        // Verifica o tipo do guerreiro e carrega a imagem correspondente
        if (guerreiro.getTipoPersonagem().equals("Magico")) {
            jPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tipo1.png")));
        } else if (guerreiro.getTipoPersonagem().equals("Tanque")) {
            jPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tipo2.png")));
        } else {
            // Se o tipo não for reconhecido, pode configurar uma imagem padrão ou limpar a imagem
            jPersonagem1.setIcon(null);
        }
    }
    private void carregarImagemMistico(Mistico mistico) {
        if (mistico.getTipoPersonagem() == null || mistico.getTipoPersonagem().isEmpty()) {
            mistico.setTipoPersonagem("Sem imagem");
        }

        // Verifica o tipo do guerreiro e carrega a imagem correspondente
        if (mistico.getTipoPersonagem().equals("bruxo")) {
            jPersonagemMistico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bruxo.png")));
        } else if (mistico.getTipoPersonagem().equals("demonio")) {
            jPersonagemMistico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demonio.png")));
        } else {
            // Se o tipo não for reconhecido, pode configurar uma imagem padrão ou limpar a imagem
            jPersonagemMistico.setIcon(null);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAtaque;
    private javax.swing.JLabel jAtaqueM;
    private javax.swing.JButton jButton1batalha;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxMistico2;
    private javax.swing.JLabel jDefesa;
    private javax.swing.JLabel jDefesaM;
    private javax.swing.JLabel jForca;
    private javax.swing.JLabel jInteM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jPersonagem1;
    private javax.swing.JLabel jPersonagemMistico;
    private javax.swing.JLabel jRecupeM;
    private javax.swing.JLabel jVelocidade;
    private javax.swing.JLabel jVida;
    private javax.swing.JLabel jVidaM;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel jVencedor;

    void selecionarPersonagem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}