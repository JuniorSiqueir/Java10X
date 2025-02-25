package Scanners;

public class Ternarios {
    public static void main(String[] args) {
        //Maneiras de reduzir o codigo
        // variavel = (condição) ?(se for verdadeira) valorSeVerdadeiro :(se for falso) valorFalso;

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missões";

        System.out.println(nivel);
    }
}
