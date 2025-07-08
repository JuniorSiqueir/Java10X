package ParaEstudar;

/**
 * CLASSE CONCRETA E HERANÇA:
 * A classe Cachorro é uma classe "concreta" porque pode ser instanciada.
 * Ela "herda" da classe Animal usando a palavra-chave 'extends'. Isso significa
 * que Cachorro automaticamente possui todos os atributos e métodos de Animal.
 */
class Cachorro extends Animal {
    // Construtor da subclasse, que chama o construtor da superclasse (Animal)
    public Cachorro(String nome, int idade) {
        super(nome, idade); // 'super' chama o construtor da classe pai
    }

    // MÉTODO (SOBRESCRITA):
    // Implementação obrigatória do método abstrato 'fazerSom' da classe Animal.
    // A anotação @Override indica que estamos sobrescrevendo um método da superclasse.
    @Override
    public void fazerSom() {
        System.out.println(this.nome + " faz: Au au!");
    }

    // Método específico da classe Cachorro
    public void buscarBolinha() {
        System.out.println(this.nome + " foi buscar a bolinha!");
    }
}
