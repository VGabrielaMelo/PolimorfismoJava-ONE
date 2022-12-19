package TiposdeFuncionarios;
import Base.FuncionarioAutenticavel;

public class Administrador extends FuncionarioAutenticavel {   
    @Override
    public double getBonificacao() {
        return 500;
    }
}
