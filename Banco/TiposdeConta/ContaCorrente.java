package TiposdeConta;
import Base.ContaPrincipal;
import Sistema.Tributavel;

public class ContaCorrente extends ContaPrincipal implements Tributavel {
    // Reescrita do Construtor
    public ContaCorrente( int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.3; // Modificação
        return super.sacar(valorASacar);
    }

    // @Override
	// public void deposita(double valor) {
    //     super.saldo += valor;
    // }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.05;
    }
}