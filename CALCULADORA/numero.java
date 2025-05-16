package CALCULADORA;

public class numero implements operacoes{
    int numeroA;
    int numeroB;

    public void somar(){
        System.out.println("O RESULTADO DESSA OPERAÇÃO É: " + (numeroA + numeroB));
    }

    public void subtrair(){
        System.out.println("O RESULTADO DESSA OPERAÇÃO É: " + (numeroA - numeroB));
    }

    public void dividir(){
        System.out.println("O RESULTADO DESSA OPERAÇÃO É: " + (numeroA / numeroB));
    }

    public void multiplicar(){
        System.out.println("O RESULTADO DESSA OPERAÇÃO É: " + (numeroA * numeroB));
    }
}
