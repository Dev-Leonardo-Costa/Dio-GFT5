package poo.heranca;

public class Carro{

    private String modelo;
    private String cor;
    private Integer capacidade;

    Carro(){

    }

    public Carro(String modelo, String cor, Integer capacidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public void ligar() {
        System.out.println("Ligado");
    }

    public void desligar() {
        System.out.println("Desligado");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    double totalValor(double valorDoTanqueCheio) {
        return capacidade * valorDoTanqueCheio;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
