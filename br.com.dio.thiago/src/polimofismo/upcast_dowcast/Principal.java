package polimofismo.upcast_dowcast;

public class Principal {
    public static void main(String[] args) {


        // FAZENDO UM UPCAST E UM DAWCAST

        //Upcast
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //Dowcast
//      Gerente gerenteDowcast = new Funcionario();
        Vendedor vendedorDowcast = (Vendedor) new Funcionario();
    }
}
