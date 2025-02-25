package Scanners;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        Scanner é um jeito de trazer um usuário para dentro da aplicação
        Objetivo - Usário criar o ninja
         */
        //Abre/Cria um Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Recebe nome do ninja e mostra
        System.out.println("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O Nome do Ninja é: " + nomeDoNinja);

        //Recebe idade do ninja
        System.out.println("Escreva a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja);


        //Fecha scanner
        caixaDeTexto.close();
    }
}
