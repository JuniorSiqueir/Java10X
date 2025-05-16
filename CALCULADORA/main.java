package CALCULADORA;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        numero calculos = new numero();
        System.out.println("Escolha o primeiro numero");
        calculos.numeroA = scanner.nextInt();
        System.out.println("Escolha o segundo numero");
        calculos.numeroB = scanner.nextInt();

        System.out.println("ESCOLHA A OPERAÇÃO");
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - DIVIDIR");
        System.out.println("4 - MULTIPLICAR");
        escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                calculos.somar();
                break;
            case 2:
                calculos.subtrair();
                break;
            case 3:
                calculos.dividir();
                break;
            case 4:
                calculos.multiplicar();
                break;
            default:
                System.out.println("OPÇÃO INVALIDA!!!!!");
        }


    }
}
