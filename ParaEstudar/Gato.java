package ParaEstudar;

/**
 * OUTRA CLASSE CONCRETA E HERANÇA:
 * A classe Gato também herda de Animal e fornece sua própria implementação
 * para os métodos abstratos.
 */
class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(this.nome + " faz: Miau!");
    }

    // Sobrescrevendo o método da interface para um comportamento mais específico
    @Override
    public void interagir() {
        super.interagir(); // Chama a implementação da classe pai primeiro
        System.out.println(this.nome + " começou a ronronar.");
    }
}