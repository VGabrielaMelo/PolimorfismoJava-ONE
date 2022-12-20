package Sistema;
import Base.FuncionarioPrincipal;

public class ControleBonificacao {
    private double soma;

    public void registra(FuncionarioPrincipal f) {
        double bonificacao = f.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
