package visibilidades;

public class Classe1 {

    private String p1;
    protected String p2;
    public String p3;

    // esse que é privado so teremos acesso dentro da propria classe
    private void medoto1() {
    }

    // esse metodo não pode ser acessado por fora do pacote
    protected void medoto2() {
    }
    // esse que e publico temos acesso livre
    public void medoto3() {
    }
}
