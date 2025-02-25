package Scanners;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstudoSwithCases {
    public static void main(String[] args) {
        /*
        Switch Cases - Servem para gerar casos especificos
        Objetivo - Pedir para o usuário escolher um personagem
         */

        //Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        //Mostra opções para o usuário
        System.out.println("ESCOLHA UM PERSONAGEM: ");
        System.out.println("1 - NARUTO UZUMAKI");
        System.out.println("2 - SASUKE UCHIHA");
        System.out.println("3 - SAKURA HARUNO");

        //Pedir opções para o usuário
        int escolheUser = scanner.nextInt();
        System.out.println("Você escolheu o numero: " + escolheUser);

        //Reação ao escolher o usuário

        switch (escolheUser) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("RESPOSTA INVALIDA!");
        }

        //Fecha a caixa
        scanner.close();
        
    }
}
