package listas.lista6.Exercicio2;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    ContaCorrente(float saldo){
        this.limite=2000;
        this.saldo=saldo;
        this.valorLimite=5000;

    }
    public void sacar(float valor) {
        if ((valor > 0) && (valor < this.valorLimite)) {
            this.saldo = saldo - valor;
        }
        else if (valor < 0) {
            throw new IllegalArgumentException("Não é possível sacar um valor negativo.");
        }
        else if (valor > valorLimite) {
            throw new IllegalArgumentException("Não é possível sacar um valor maior que um valor limite");
        }
    }

    void depositar(float valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
        else if (valor < 0) {
            throw new IllegalArgumentException("Não é possível depositar o valor negativo.");
        }
    }

    public void setValorLimite(float valorLimite) {
        this.valorLimite = valorLimite;
    }
    public float getSaldo(){
        return saldo;
    }
}
