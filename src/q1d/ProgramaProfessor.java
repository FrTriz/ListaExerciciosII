package q1d;

public class ProgramaProfessor {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        Professor p2 = new Professor();

        p1.cadastrarProfessor("Rafaelo","Mestre","História",40,6000,"Atua como professor de ensino fundamental.");
        p2.cadastrarProfessor("Maria","Doutora","Matemática",40,10000,"Atua como professora de ensino médio.");

        System.out.println("Dados do professor 1:");
        p1.imprimirDados();
        System.out.println("\n\nDados do professor 2:");
        p2.imprimirDados();

        p1.editarAtuacao("Atua como professor de ensino médio.");
        p2.editarAtuacao("Atua como professora de Cálculo 1 para ensino superior.");

        p1.editarProfessor("Rafaelo Dantas","Mestre","História",40,3000);
        p2.editarProfessor("Maria Antônia", "Doutora","Matemática",42,10000);

        System.out.println("\n\nDados do professor 1 depois da edição:");
        p1.imprimirDados();
        System.out.println("\n\nDados do professor 2 depois da edição:");
        p2.imprimirDados();

    }
}