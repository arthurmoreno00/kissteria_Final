/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package kissteria;


/**
 *
 * @author Aluno
 */

public class Guerreiro extends Personagem {
    private int forca;
    private int velocidade;
    private String caminhoImagem;

    public Guerreiro(String nome, int pontosVida, int pontosAtaque, int pontosDefesa, String tipoPersonagem, int forca, int velocidade) {
        super(nome, pontosVida, pontosAtaque, pontosDefesa, tipoPersonagem);
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public Guerreiro() {
        super("Guerreiro", 0, 0, 0, "TipoDePersonagem");
        this.forca = forca;
        this.velocidade = velocidade;
    }

    
   @Override
    public void atacar(Personagem adversario) {
        int dano = forca + velocidade - adversario.pontosDefesa;
        adversario.pontosVida -= dano;
    }
    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public void setPontosAtaque(int pontosAtaque) {
        this.pontosAtaque = pontosAtaque;
    }

    public int getPontosDefesa() {
        return pontosDefesa;
    }

    public void setPontosDefesa(int pontosDefesa) {
        this.pontosDefesa = pontosDefesa;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", pontosVida=" + pontosVida + ", pontosAtaque=" + pontosAtaque + ", pontosDefesa=" + pontosDefesa + ", forca=" + forca + ", velocidade=" + velocidade + ", tipoPersonagem=" + tipoPersonagem +'}';
    }


     
}
