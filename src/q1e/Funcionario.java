package q1e;

public class Funcionario {
    String nome;
    String nascimento;
    int rg;
    int cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    String grauInst;
    int matricula;

    public void imprimirDados(){
        System.out.println("NOME: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("CPF: "+this.cpf);
        System.out.println("NASCIMENTO: "+this.nascimento);
        System.out.println("ENDEREÇO: "+this.endereco);
        System.out.println("NATURALIDADE"+this.naturalidade);
        System.out.println("PROFISSÃO: "+this.profissao);
        System.out.println("GRAU DE INSTRUÇÃO: "+this.grauInst);
        System.out.println("SALÁRIO:"+this.salario);
        System.out.println("MATRÍCULA:"+this.matricula);
    }

    void cadastrarFuncionario(String nome, String nascimento, int rg, int cpf, String endereco, String naturalidade, double salario, String profissao, String grauInst, int matricula) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInst = grauInst;
        this.matricula = matricula;
        System.out.println("Cadastro Pronto!");
    }
    void editarFuncionario(String nome, String nascimento, int rg, int cpf, String endereco, String naturalidade, double salario, String profissao, String grauInst, int matricula) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInst = grauInst;
        this.matricula = matricula;
        System.out.println("Edição Pronta!");
    }
}