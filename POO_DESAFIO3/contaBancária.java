package POO_DESAFIO3;

public abstract class contaBancária implements conta {
    double saldo;

    public contaBancária(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo(){
        return this.saldo;
    }

    @Override
    public abstract void depositar (double valor);
}
