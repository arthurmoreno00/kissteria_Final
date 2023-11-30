/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kissteria;

/**
 *
 * @author jacks
 */
public class Item {
    private String descricao;
    private String modalidade;
    private int preco;
    private int bonusAtaque;
    private int bonusDefesa;

    public Item(String descricao, String modalidade, int preco, int bonusAtaque, int bonusDefesa) {
        this.descricao = descricao;
        this.modalidade = modalidade;
        this.preco = preco;
        this.bonusAtaque = bonusAtaque;
        this.bonusDefesa = bonusDefesa;
    }
     public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getBonusAtaque() {
        return bonusAtaque;
    }

    public void setBonusAtaque(int bonusAtaque) {
        this.bonusAtaque = bonusAtaque;
    }

    public int getBonusDefesa() {
        return bonusDefesa;
    }

    public void setBonusDefesa(int bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }
}
