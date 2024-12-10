package q1b;

public class ProgramaBanco {
    public static void main(String[] args) {
        Banco conta1 = new Banco();
        Banco conta2 = new Banco();

        conta1.cadastrar("Pedro",675432987,92375819,0.50,123456,7810);
        conta2.cadastrar("Fernanda",345678765,567898765,100000,234356,8963);

        System.out.println("Saldo da conta 1:");
        conta1.imprimirSaldo();

        System.out.println("\nSaldo da conta 2:");
        conta2.imprimirSaldo();

        conta1.editar("Pedro", 345678987,456788765,40000,123456,7810);
        conta2.editar("Ana Beatriz",345678932,907654313,600000,234356,8963);

        System.out.println("\nSaldo da conta 1 depois da edição:");
        conta1.imprimirSaldo();
        System.out.println("\nSaldo da conta 2 depois da edição:");
        conta2.imprimirSaldo();


    }
}
