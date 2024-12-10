package q3;

import java.util.Scanner;

public class Calculadora {
    double num1;
    double num2;

    public void soma(double num1, double num2){
        System.out.println("SOMA DOS NÚMEROS:");
        double som=num1+num2;
        System.out.println("RESULTADO DA SOMA: "+som);
    }
    public void subtrair(double num1, double num2){
        System.out.println("SUBTRAÇÃO DOS NÚMEROS:");
        double sub=num1-num2;
        System.out.println("RESULTADO DA SUBTRAÇÃO:"+sub);
    }
    public void dividir(double num1, double num2){
        System.out.println("DIVISÃO DOS NÚMEROS:");
        double div=num1/num2;
        System.out.println("RESULTADO DA DIVISÃO:"+div);
    }
    public void multiplicar(double num1, double num2){
        System.out.println("MULTIPLICAÇÃO DOS NÚMEROS:");
        double multpl=num1*num2;
        System.out.println("RESULTADO DA MULTIPLICAÇÃO:"+multpl);
    }
    public void imprimirMenu(double num1, double num2){
        Scanner scan=new Scanner(System.in);
        int opEscolhida;
        do{
            System.out.println("### MENU ###");
            System.out.println("[1]-ADIÇÃO");
            System.out.println("[2]-SUBTRAÇÃO");
            System.out.println("[3]-MULTIPLICAÇÃO");
            System.out.println("[4]-DIVISÃO");
            System.out.println("[5]-SAIR");
            System.out.println("DECISÃO: ");
            opEscolhida= scan.nextInt();

            switch (opEscolhida){
                case 1:
                    soma(num1, num2);
                    break;
                case 2:
                    subtrair(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Você encerrou o programa.");
                    return;
                default:
                    System.out.println("Número inválido, tente novamente.");
                    return;
            }
        }while (opEscolhida!=5);

        scan.close();
    }

}
