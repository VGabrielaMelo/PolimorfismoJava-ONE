package TiposdeFuncionarios;
import Base.FuncionarioPrincipal;
import Sistema.Autenticavel;

public class Diretor extends FuncionarioPrincipal implements Autenticavel {
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        System.out.println("Procurando bonificaão do cargo gerente");
        return 1000;
    }
}
