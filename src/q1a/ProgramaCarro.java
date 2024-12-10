package q1a;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.cadastrar(123,"Ford","Cinza","Ford KA","Gasolina",2015,4,100,true);
        c2.cadastrar(321,"Fiat","Preto","Fiat uno","Diesel",2011,2,50,false);

        System.out.println("Carro 1 antes da edição:");
        c1.status();
        System.out.println("\n\nCarro 2 antes da edição:");
        c2.status();

        c1.editar(456,"Ford","Branco","Ford KA","Álcool",2016,4,100,false);
        c2.editar(654,"Fiat","Prata","Fiat uno","Gasolina",2010,2,65,true);

        System.out.println("\n\nCarro 1 depois da edição:");
        c1.status();
        System.out.println("\n\nCarro 2 depois da edição:");
        c2.status();
    }
}