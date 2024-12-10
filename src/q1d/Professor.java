package q1d;

public class Professor {
    String nome;
    String titulacao;
    String formacao;
    float cargaH;
    double salario;
    String areaAt;

    void imprimirDados(){
        System.out.println("NOME: "+this.nome);
        System.out.println("TITULACÃO: "+this.titulacao);
        System.out.println("FORMAÇÃO: "+this.formacao);
        System.out.println("CARGA HORARIA: "+this.cargaH);
        System.out.println("SALARIO: "+this.salario);
        System.out.println("AREA DE ATUAÇÃO: "+this.areaAt);

    }
    public void cadastrarProfessor(String nome, String titulacao, String formacao, float cargaH, double salario, String areaAt) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaH = cargaH;
        this.salario = salario;
        this.areaAt = areaAt;
        System.out.println("Cadastro Pronto!");
    }
    public void editarProfessor(String nome, String titulacao, String formacao, float cargaH, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaH = cargaH;
        this.salario = salario;
        System.out.println("Edição Pronta!");
    }

    public void editarAtuacao(String areaAt) {
        this.areaAt = areaAt;
        System.out.println("Edição Pronta!");
    }
}
