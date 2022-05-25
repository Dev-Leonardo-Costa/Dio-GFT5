package banco_dio;

public interface ImplConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
