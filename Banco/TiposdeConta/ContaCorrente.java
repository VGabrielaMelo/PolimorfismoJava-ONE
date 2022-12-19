package TiposdeConta;
import Base.ContaPrincipal;

public class ContaCorrente extends ContaPrincipal {
    // Reescrita do Construtor
    public ContaCorrente( int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.3; // Modificação
        return super.sacar(valorASacar);
    }
}