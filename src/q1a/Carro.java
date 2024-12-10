package q1a;

public class Carro {
    int codigo;
    String marca;
    String cor;
    String modelo;
    String tipoComb;
    int anoFab;
    int numPortas;
    int qntdDisp;
    boolean basico;

    void status(){
        System.out.println("Modelo:" + modelo);
        System.out.println("Cor:" + cor);
        System.out.println("Marca:" + marca);
        System.out.println("Código:" + codigo);
        System.out.println("Ano de fabricação:" + anoFab);
        System.out.println("Número de Portas:" + numPortas);
        System.out.println("Quantidade disponível:" + qntdDisp);
        System.out.println("Tipo do Combustível:" + tipoComb);
        System.out.println("Básico?" + basico);
    }
    void cadastrar(int codigo, String marca, String cor, String modelo, String tipoComb, int anoFab, int numPortas, int qntdDisp, boolean basico){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.tipoComb = tipoComb;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.qntdDisp = qntdDisp;
        this.basico = basico;
        System.out.println("Cadastro pronto!");
    }
    void editar(int codigo, String marca, String cor, String modelo, String tipoComb, int anoFab, int numPortas, int qntdDisp, boolean basico){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.tipoComb = tipoComb;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.qntdDisp = qntdDisp;
        this.basico = basico;
        System.out.println("Edição pronta!");
    }
}