package Banco;

public class ContaPrincipal {
    private double saldo = 0.0;
    private int agencia;
    private int numeroConta;
    private Cliente nomeTitular; 
    private static int total;

    // Construtor
    public ContaPrincipal(int agencia, int numeroConta) {
        ContaPrincipal.total++;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }
    
    // Metodo
    // - void quer dizer que não ira ter retorno para o usuario
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getNomeTitular() {
        return this.nomeTitular;
    }
    public void setNomeTitular(Cliente nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor) {
        this.saldo +=  valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferencia(double valor, ContaPrincipal destino) {
        if (this.agencia >= valor) {
            this.agencia -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    // Metodo de classe 
    public static int getTotal() {
        return ContaPrincipal.total;
    }
}