package ParaEstudar;
import java.util.ArrayList;
import java.util.Scanner;

public class ZoologicoRevisao {

    public static void main(String[] args) {
        // SCANNER:
        // Classe utilizada para ler a entrada do usuário a partir do console.
        Scanner scanner = new Scanner(System.in);

        // ARRAY (usando ArrayList):
        // ArrayList é uma implementação de lista dinâmica, mais flexível que um array
        // padrão. Aqui, ele armazena objetos do tipo 'Animal'. Isso é possível
        // graças ao polimorfismo: podemos adicionar objetos de subclasses (Cachorro, Gato)
        // a uma lista da superclasse (Animal).
        ArrayList<Animal> animais = new ArrayList<>();

        System.out.println("--- Bem-vindo ao Sistema de Revisão de Java! ---");
        System.out.println("Vamos adicionar alguns animais.");

        // Adicionando animais com base na entrada do usuário
        for (int i = 0; i < 2; i++) {
            System.out.println("\nAdicionando Animal #" + (i + 1));
            System.out.print("Digite o tipo (cachorro/gato): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha pendente após ler um número

            if (tipo.equals("cachorro")) {
                animais.add(new Cachorro(nome, idade));
            } else if (tipo.equals("gato")) {
                animais.add(new Gato(nome, idade));
            } else {
                System.out.println("Tipo inválido, pulando este animal.");
            }
        }

        System.out.println("\n--- Lista de Animais no Sistema ---");

        // Iterando sobre o ARRAYLIST e usando os MÉTODOS dos objetos
        for (Animal animal : animais) {
            System.out.println("------------------------------------");
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());

            // Polimorfismo em ação: o Java sabe qual método 'fazerSom' chamar
            // (o do Cachorro ou o do Gato) em tempo de execução.
            animal.fazerSom();
            animal.comer();
            animal.interagir();

            // Verificação de TIPO DE CLASSE (instanceof) para chamar métodos específicos
            if (animal instanceof Cachorro) {
                // É necessário fazer um "cast" para tratar o objeto como Cachorro
                Cachorro c = (Cachorro) animal;
                c.buscarBolinha();
            }
        }

        System.out.println("------------------------------------");
        System.out.println("\nRevisão concluída!");
        scanner.close(); // Boa prática: fechar o scanner quando não for mais usá-lo.
    }
}
