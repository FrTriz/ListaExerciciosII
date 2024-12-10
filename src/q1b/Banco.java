package q1b;

public class Banco {
    String nome;
    int cpf;
    int rg;
    double saldo;
    int num;
    int agencia;
    void cadastrar(String nome, int cpf, int rg, double saldo, int num, int agencia){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
        this.num = num;
        this.agencia = agencia;
        System.out.println("Cadastro pronto!");
    }
    void editar(String nome, int cpf, int rg, double saldo, int num, int agencia){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
        this.num = num;
        this.agencia = agencia;
        System.out.println("Edição pronta!");
    }
    void imprimirSaldo(){
        System.out.println("O saldo é de " + this.saldo + " reais.");
    }


}