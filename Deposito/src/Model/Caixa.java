package Model;

public class Caixa {
    private String corredor;
    private int posicao;
    private double peso;
    private String dono;

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String toString() {
        return "[Dono: " + dono + "] [Peso: " + peso + "kg] [Corredor: " + corredor + "] [Posição: " + posicao + "]";
    }
}
