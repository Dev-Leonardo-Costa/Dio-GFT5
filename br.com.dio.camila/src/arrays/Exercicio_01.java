package arrays;

public class Exercicio_01 {
    public static void main(String[] args) {

        int[]  vetor ={1,2,3,4,5,6};
        int contador = 0;

        while (contador < (vetor.length)){
            System.out.println(vetor[contador]);
            contador++;
        }

        System.out.println("-----------------------");

        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
