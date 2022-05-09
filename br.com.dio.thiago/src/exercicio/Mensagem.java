package exercicio;

public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mesagemBomDia();
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mesagemBoaTarde();
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
        }
    }

    public static void mesagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mesagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }

    public static void mesagemBoaNoite() {
        System.out.println("Boa Noite!");
    }
}
