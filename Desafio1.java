package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        //Ninja1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 15;
        String missao1 = "Achar gato";
        String statusDaMissao1 = "Concluida";
        char nivelDaMissao1 = 'D';

        System.out.println("============================================================");
        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idadeNinja1);
        System.out.println("Missão do Ninja " + nomeNinja1 + ": " + missao1);
        System.out.println("Nivel da Missão: " + nivelDaMissao1);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (idadeNinja1 < 15) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D'){
                statusDaMissao1 = "Concluida";

            } else {
                System.out.println("Não pode concluir, muito novo");
            }
        } else {
            statusDaMissao1 = "Concluida";
        }
        System.out.println("Status da Missão: " + statusDaMissao1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        //Ninja2
        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 18;
        String missao2 = "Matar familia completa";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        System.out.println("============================================================");
        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idadeNinja2);
        System.out.println("Missão do Ninja " + nomeNinja2 + ": " + missao2);
        System.out.println("Nivel da Missão: " + nivelDaMissao2);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (idadeNinja2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Concluida";

            } else {
                System.out.println("Não pode concluir, muito novo");
            }
        } else {
            statusDaMissao2 = "Concluida";
        }
        System.out.println("Status da Missão: " + statusDaMissao2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //Ninja3
        String nomeNinja3 = "Hinata";
        int idadeNinja3 = 14;
        String missao3 = "Casar";
        String statusDaMissao3 = "Em andamento";
        char nivelDaMissao3 = 'B';

        System.out.println("============================================================");
        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idadeNinja3);
        System.out.println("Missão do Ninja " + nomeNinja3 + ": " + missao3);
        System.out.println("Nivel da Missão: " + nivelDaMissao3);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (idadeNinja3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDaMissao3 = "Concluida";

            } else {
                System.out.println("Não pode concluir, muito novo(a)");
            }
        } else {
            statusDaMissao3 = "Concluida";
        }
        System.out.println("Status da Missão: " + statusDaMissao3);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");





    }
}
