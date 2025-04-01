package Desafios;

import java.util.Scanner;

public class Desafio2Sozinho {
    public static void main(String[] args) {

        //Entrada de Dados
        Scanner scanner = new Scanner(System.in);

        //ARRAY
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        //CONTADORES
        int opcao = 0;
        int ninjasCadastrados = 0;

        while(opcao != 3) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX){
                        System.out.println("DIGITE O NOME DO NINJA PARA CADASTRO");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("NINJA CADASTRADO COM SUCESSO!");
                    } else {
                        System.out.println("SEM ESPAÇO NA LISTA!");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("NENHUM NINJA CADASTRADO!");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("SAINDO DO PROGRAMA");
                    break;

                default:
                    System.out.println("OPÇÃO INVALIDA!");
            }

        }

    }
}
