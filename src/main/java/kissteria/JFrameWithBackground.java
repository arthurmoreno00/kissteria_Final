package kissteria;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class JFrameWithBackground extends JFrame {

    private Image background;
    private SelecionarPersona selecionarPersonaPanel;
    private Guerreiro guerreiro;
    private JLabel labelNome;
    private JLabel labelAtaque;
    private List<Guerreiro> guerreiros = new ArrayList<>();

    public JFrameWithBackground() {
  

        background = new ImageIcon(getClass().getResource("/selecao.jpg")).getImage();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null); 
        setResizable(false); 


        setContentPane(new ImagePanel());

 
        selecionarPersonaPanel = new SelecionarPersona();

        // Adicione os botões ao layout

        labelNome = new JLabel();
        labelAtaque = new JLabel();



        setLayout(new java.awt.FlowLayout());
        add(selecionarPersonaPanel);

    }

    private void exibirInformacoesGuerreiro(Guerreiro guerreiro) {
       
        labelNome.setIcon(new ImageIcon(getClass().getResource("/vida.png")));
        labelNome.setText("Nome: " + guerreiro.getNome());

        labelAtaque.setIcon(new ImageIcon(getClass().getResource("/foca.png")));
        labelAtaque.setText("Ataque: " + guerreiro.getPontosAtaque());
    }

    private class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
         
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new JFrameWithBackground().setVisible(true);
        });
    }
}
