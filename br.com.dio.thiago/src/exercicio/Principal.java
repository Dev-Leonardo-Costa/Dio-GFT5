package exercicio;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Calculadora");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(30, 10);
        Calculadora.divisao(100, 10);
        Calculadora.multiplicacao(5, 5);

        System.out.println("Mensagens");
        Mensagem.mesagemBomDia();
        Mensagem.mesagemBoaTarde();
        Mensagem.mesagemBoaNoite();

        System.out.println("Emprestimo");
        Emprestimo.calcular();
    }
}
