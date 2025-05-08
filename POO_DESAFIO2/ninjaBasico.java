package POO_DESAFIO2;

public class ninjaBasico implements ninja {
    String nome;
    int idade;
    String habilidade;

    public ninjaBasico(String habilidade, int idade, String nome) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    public void executarHabilidade() {
        System.out.println("Eu vou executar a minha habilidade " + habilidade);
    }

    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ". Minha habilidade atual é " + habilidade + " e tenho " + idade + " anos");
    }


}
