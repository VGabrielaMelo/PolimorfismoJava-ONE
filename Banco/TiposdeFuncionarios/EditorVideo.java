package Banco.TiposdeFuncionarios;

import Banco.FuncionarioPrincipal;

public class EditorVideo extends FuncionarioPrincipal {
    public double getBonificacao() {
        System.out.println("Verificando bonificação do cargo Editor: ");
        return 150;
    }
}
