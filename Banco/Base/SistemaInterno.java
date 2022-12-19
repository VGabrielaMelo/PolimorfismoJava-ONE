package Base;

public class SistemaInterno {
    private int senha = 123456;

    public void autentica(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode acessar o sistema");
        } else {
            System.out.println("Não pode acessar o sistema");
        }
    }
}