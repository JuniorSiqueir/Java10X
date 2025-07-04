package POO_DESAFIO3;

public class contaCorrente extends contaBancária {

    public contaCorrente(double saldo){
        super(saldo);
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizado com sucesso na Conta Corrente.");
    }

}
