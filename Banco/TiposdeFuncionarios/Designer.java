package Banco.TiposdeFuncionarios;
import Banco.FuncionarioPrincipal;

public class Designer extends FuncionarioPrincipal{
    public double getBonificacao() {
        System.out.println("Verificando bonificação do cargo Designer: ");
        return 200;
    }
}
