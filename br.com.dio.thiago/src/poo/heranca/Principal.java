package poo.heranca;

public class Principal {
    public static void main(String[] args) {
        //        Carro carro = new Carro("Civic","Preto",59);
//        System.out.println(carro.getModelo());
//        System.out.println(carro.getCor());
//        System.out.println(carro.getCapacidade());
//        System.out.println(carro.totalValor(6.5));
//
        Carro carro2 = new Carro("\nCorsa", "Vermelho", 35);
        carro2.setModelo("Ws4");
        carro2.setCor("Ouro");
        carro2.setCapacidade(43);
        System.out.println(carro2);
    }
}
