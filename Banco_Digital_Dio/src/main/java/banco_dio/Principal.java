package banco_dio;

public class Principal {
    public static void main(String[] args) {
        Cliente clinete = new Cliente();
        clinete.setNome("Leonardo Costa");

        Conta contaCorrente = new ContaCorrente(clinete);
        contaCorrente.depositar(200);

        Conta contaPoupanca = new ContaPoupanca(clinete);
        contaCorrente.transferir(200,contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
