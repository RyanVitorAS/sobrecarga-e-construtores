public class ContaBancaria {
    private double saldo;

    // Construtor que recebe o saldo inicial
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Construtor que inicia com saldo zero
    public ContaBancaria() {
        this.saldo = 0.0;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    // Método para consultar o saldo
    public double getSaldo() {
        return saldo;
    }
}