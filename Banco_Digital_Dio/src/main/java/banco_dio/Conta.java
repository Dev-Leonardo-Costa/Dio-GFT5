package banco_dio;

import lombok.Data;

@Data
public abstract class Conta implements ImplConta {
    protected static final Integer AGENCIA_PADRAO = 1;
    private static Integer SEQUENCIAL = 1;
    protected Integer agencia;
    protected Integer conta;
    protected double saldo;
    private Cliente cliente;
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimir() {
        System.out.println("Banco do brasil");
        System.out.println(String.format("Titular => %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia =>  %d ", this.agencia));
        System.out.println(String.format("Conta =>  %d ", this.conta));
        System.out.println(String.format("Saldo =>  %.2f ", this.saldo));
    }
}
