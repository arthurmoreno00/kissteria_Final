/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kissteria;

/**
 *
 * @author jacks
 */
public abstract class Personagem {
     protected String nome;
    protected int pontosVida;
    protected int pontosAtaque;
    protected int pontosDefesa;
    protected String tipoPersonagem;
    

    public Personagem(String nome, int pontosVida, int pontosAtaque, int pontosDefesa, String tipoPersonagem) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
        this.pontosDefesa = pontosDefesa;
        this.tipoPersonagem = tipoPersonagem;
    }

    public abstract void atacar(Personagem adversario);

    public void listar() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontos de Vida: " + pontosVida);
        System.out.println("Pontos de Ataque: " + pontosAtaque);
        System.out.println("Pontos de Defesa: " + pontosDefesa);
        System.out.println("Tipo de Personagem: " + tipoPersonagem);
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
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

    public String getTipoPersonagem() {
        return tipoPersonagem;
    }

    public void setTipoPersonagem(String tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }
}
