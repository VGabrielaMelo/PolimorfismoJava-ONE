package Testes;

import Sistema.CalculadorImpostos;
import Sistema.SeguroVida;
import TiposdeConta.ContaCorrente;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.depositar(100.0);
    
        SeguroVida seguro = new SeguroVida();

        CalculadorImpostos calc = new CalculadorImpostos();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }   
}
