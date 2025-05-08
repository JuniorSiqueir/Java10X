package POO_DESAFIO2;

public class main {
    public static void main(String[] args) {
    ninjaBasico Naruto = new ninjaBasico("Comer", 15, "Naruto");
    Naruto.mostrarInformacoes();
    Naruto.executarHabilidade();

    System.out.println("-------------------------------------------------------------------");

    ninjaAvancado Kakashi = new ninjaAvancado("Kakashi", "Teleporte", 26, "Furtividade");
    Kakashi.mostrarInformacoes();
    Kakashi.executarHabilidade();
    Kakashi.executaEspecialidade();



    }
}
