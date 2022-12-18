package Banco.TiposdeFuncionarios;

import Banco.FuncionarioPrincipal;

public class Gerente  extends FuncionarioPrincipal{
    private int senha;

    // Metodos
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else { 
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.getSalario();
    }
}
