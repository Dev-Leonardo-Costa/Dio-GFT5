package polimofismo_subscrita;

public class Principal {
    public static void main(String[] args) {
        ClassMae[] classes = new ClassMae[]{
                new ClassFilha1(), new ClassFilha2(), new ClassMae()
        };

        for (ClassMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClassMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClassFilha2 classeFilha2 = new ClassFilha2();
        classeFilha2.metodo2();
    }
}
