package POO_DESAFIO2;

public class ninjaAvancado extends ninjaBasico implements ninja{
    String especilidade;


    public ninjaAvancado(String nome, String habilidade, int idade, String especilidade) {
        super(habilidade, idade, nome);
        this.especilidade = especilidade;
    }

    public void executaEspecialidade(){
        System.out.println("Eu por ser avançado sou especialista em " + especilidade);
    }
}
