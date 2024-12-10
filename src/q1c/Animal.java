package q1c;
public class Animal {
    String especie;
    String nascimento;
    String nome;
    int numReg;
    String localNasc;

    void status(){
        System.out.println("Nome:" + nome);
        System.out.println("Espécie:" + especie);
        System.out.println("Nascimento:" + nascimento);
        System.out.printf("Número de registro:" + numReg);
        System.out.printf("Local de nascimento:" + localNasc);
    }

    public void cadastrarAnimal(String especie, String nascimento, String nome, int numReg, String localNasc) {
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.numReg = numReg;
        this.localNasc = localNasc;
        System.out.println("Cadastro Pronto!");
    }
    public void editarAnimal(String especie, String nascimento, String nome, int numReg, String localNasc) {
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.numReg = numReg;
        this.localNasc = localNasc;
        System.out.println("Edição Pronta!");
    }
}