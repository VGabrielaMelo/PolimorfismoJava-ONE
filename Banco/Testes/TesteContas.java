package Testes;

import TiposdeConta.ContaCorrente;
import TiposdeConta.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 222);
        cc.depositar(200);

        ContaPoupanca cp = new ContaPoupanca(111, 333);
        cp.depositar(500);

        cc.transferencia(100, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }  
}
