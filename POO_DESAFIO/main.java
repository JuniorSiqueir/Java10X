package POO_DESAFIO;

public class main {
    public static void main(String[] args) {
        //Objeto Ninja
        ninja Naruto = new ninja();
        Naruto.nome = "Naruto";
        Naruto.idade = 18;
        Naruto.missao = "Colher batata";
        Naruto.nivelDificuldade = "Facil";
        Naruto.statusMissao = "Concluida";
        Naruto.mostrarInformacoes();

        System.out.println("=============================================================================");

        //Objeto Uchiha
        uchiha Sasuke = new uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 20;
        Sasuke.missao = "Matar?";
        Sasuke.nivelDificuldade = "Dificil";
        Sasuke.statusMissao = "Metade Feita";
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.mostrarInformacoes();
        Sasuke.mostrarHabilidadeEspecial();

    }
}
