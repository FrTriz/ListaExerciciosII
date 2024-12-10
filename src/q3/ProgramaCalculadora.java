package q3;

import java.util.Scanner;
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Calculadora calcula= new Calculadora();
        System.out.println("CALCULADORA JAVA!");
        System.out.println("\niNFORME O PRIMEIRO NÚMERO:");
        calcula.num1=scan.nextDouble();
        System.out.println("\nINFORME O SEGUNDO NÚMERO:");
        calcula.num2=scan.nextDouble();

        calcula.imprimirMenu(calcula.num1, calcula.num2);

    }
}