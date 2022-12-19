package Testes;

import Base.SistemaInterno;
import TiposdeFuncionarios.Administrador;
import TiposdeFuncionarios.Gerente;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(123456);

        SistemaInterno sis = new SistemaInterno();
        sis.autentica(g);
        sis.autentica(adm);
    }
}
