package kissteria;

import java.util.Random;

public class Batalha {
    private boolean status;
    private String vencedor;
    private int roundAtual;
    private int maxRounds;
    private int multiplicadorAtaqueGuerreiro;
    private int multiplicadorDefesaGuerreiro;
    private int multiplicadorAtaqueMistico;
    private int multiplicadorDefesaMistico;
    private int danoGuerreiro;
    private int danoMistico;
    private String bonusGuerreiro;
    private String bonusMistico;

    public Batalha() {
        this.status = false;
        this.vencedor = null;
        this.roundAtual = 0;
        this.maxRounds = 3; // Defina o número máximo de rounds desejado
        this.multiplicadorAtaqueGuerreiro = 0;
        this.multiplicadorDefesaGuerreiro = 0;
        this.multiplicadorAtaqueMistico = 0;
        this.multiplicadorDefesaMistico = 0;
        this.danoGuerreiro = 0;
        this.danoMistico = 0;
        this.bonusGuerreiro = "";
        this.bonusMistico = "";
    }

    public void iniciarBatalha(Guerreiro guerreiro, Mistico mistico) {
        while (!status && roundAtual < maxRounds) {
            roundAtual++;

            // Atributos Multiplicadores
            this.multiplicadorAtaqueGuerreiro = new Random().nextInt(9) + 2;
            this.multiplicadorDefesaGuerreiro = new Random().nextInt(9) + 2;
            this.multiplicadorAtaqueMistico = new Random().nextInt(9) + 2;
            this.multiplicadorDefesaMistico = new Random().nextInt(9) + 2;

            // Calcular pontos de ataque e defesa ajustados com os multiplicadores
            int ataqueGuerreiro = guerreiro.getPontosAtaque() * multiplicadorAtaqueGuerreiro;
            int defesaGuerreiro = guerreiro.getPontosDefesa() * multiplicadorDefesaGuerreiro;
            int ataqueMistico = mistico.getPontosAtaque() * multiplicadorAtaqueMistico;
            int defesaMistico = mistico.getPontosDefesa() * multiplicadorDefesaMistico;

            // Calcular dano causado por cada personagem
            this.danoGuerreiro = ataqueGuerreiro - defesaMistico;
            this.danoMistico = ataqueMistico - defesaGuerreiro;

            // Aplicar dano ao pontosVida dos personagens
            guerreiro.setPontosVida(guerreiro.getPontosVida() - this.danoMistico);
            mistico.setPontosVida(mistico.getPontosVida() - this.danoGuerreiro);

            // Verificar o vencedor após cada round
            verificarVencedor(guerreiro, mistico);
        }
        // Definir bônus com base no dano causado
        definirBonus();
    }

    private void verificarVencedor(Guerreiro guerreiro, Mistico mistico) {
        // Verificar o vencedor após cada round
        if (guerreiro.getPontosVida() <= 0 && mistico.getPontosVida() <= 0) {
            this.status = false; // Empate
            this.vencedor = "Empate";
        } else if (guerreiro.getPontosVida() <= 0) {
            this.status = true;
            this.vencedor = mistico.getNome();
        } else if (mistico.getPontosVida() <= 0) {
            this.status = true;
            this.vencedor = guerreiro.getNome();
        }
    }

    private void definirBonus() {
        // Exemplo de lógica para definir bônus com base no dano causado
        if (this.danoGuerreiro > this.danoMistico) {
            this.bonusGuerreiro = "Bônus por causar mais dano!";
        } else if (this.danoMistico > this.danoGuerreiro) {
            this.bonusMistico = "Bônus por causar mais dano!";
        }
    }

    public boolean isStatus() {
        return status;
    }

    public String getVencedor() {
        return vencedor;
    }

    public int getRoundAtual() {
        return roundAtual;
    }

    public int getMaxRounds() {
        return maxRounds;
    }

    public int getMultiplicadorAtaqueGuerreiro() {
        return multiplicadorAtaqueGuerreiro;
    }

    public int getMultiplicadorDefesaGuerreiro() {
        return multiplicadorDefesaGuerreiro;
    }

    public int getMultiplicadorAtaqueMistico() {
        return multiplicadorAtaqueMistico;
    }

    public int getMultiplicadorDefesaMistico() {
        return multiplicadorDefesaMistico;
    }

    public int getDanoGuerreiro() {
        return danoGuerreiro;
    }

    public int getDanoMistico() {
        return danoMistico;
    }

    public String getBonusGuerreiro() {
        return bonusGuerreiro;
    }

    public String getBonusMistico() {
        return bonusMistico;
    }
}
