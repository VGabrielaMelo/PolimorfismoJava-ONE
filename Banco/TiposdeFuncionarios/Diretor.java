package TiposdeFuncionarios;

import Base.FuncionarioAutenticavel;

public class Diretor extends FuncionarioAutenticavel {
    @Override
    public double getBonificacao() {
        System.out.println("Procurando bonificaão do cargo gerente");
        return 1000;
    }
}
