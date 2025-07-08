package ParaEstudar;

/**
 * CLASSE ABSTRATA:
 * Uma classe abstrata não pode ser instanciada diretamente. Ela serve como um
 * modelo base para outras classes (suas subclasses).
 * Pode conter tanto métodos concretos (com implementação) quanto métodos
 * abstratos (sem implementação), que devem ser implementados pelas subclasses.
 */
abstract class Animal implements Interagivel {
    // Atributos da classe (variáveis de instância)
    protected String nome;
    protected int idade;

    // Construtor da classe base
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato - não tem corpo, deve ser implementado pelas subclasses
    public abstract void fazerSom();

    // Método concreto - já possui uma implementação e é herdado pelas subclasses
    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    // Implementação do método da interface Interagivel
    @Override
    public void interagir() {
        System.out.println("Você está interagindo com o animal " + this.nome + ".");
    }

    // Getters para acessar os atributos encapsulados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}