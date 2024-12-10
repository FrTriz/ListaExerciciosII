package q1e;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.cadastrarFuncionario("Ricardo","20/06/1999",234567865,345678987,"Bairro Tomba, Feira de Santana-ba","Salvador-ba",5000,"Arquiteto","Bacharel",456);
        f2.cadastrarFuncionario("Sabrina","30/08/1990",345678987,234567898,"Bairro Bonocô, Salvador-ba","São Paulo-sp",7000,"Engenheira Civil","Bacharel",876);

        System.out.println("Dados do funcionário 1:");
        f1.imprimirDados();
        System.out.println("\n\nDados do funcionário 2:");
        f2.imprimirDados();

        f1.editarFuncionario("Ricardo Miranda","20/06/1995",234567867,345678987,"Bairro Tomba, Feira de Santana-ba","Feira de Santana-ba",3500,"Arquiteto","Bacharel",456);
        f2.editarFuncionario("Sabrina Chaves","30/11/1990",345678987,234567898,"Bairro Cosme De Farias, Salvador-ba","São Paulo-sp",7000,"Engenheira Civil","Bacharel",876);

        System.out.println("\n\nDados do funcionaário 1 depois da edição:");
        f1.imprimirDados();
        System.out.println("\n\nDados do funcionário 2 depois da edição:");
        f2.imprimirDados();
    }
}
