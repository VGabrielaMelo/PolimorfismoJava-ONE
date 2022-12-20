package TiposdeFuncionarios;
import Base.FuncionarioPrincipal;
import Sistema.AutenticacaoUtil;
import Sistema.Autenticavel;

public class Administrador extends FuncionarioPrincipal implements Autenticavel {   
    private AutenticacaoUtil autenticador;

    public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
