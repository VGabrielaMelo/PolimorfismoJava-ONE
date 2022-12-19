package Testes;
import TiposdeFuncionarios.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Gabriela Melo");
        g1.setCpf("2222");
        g1.setSalario(3000.0);

        System.out.println("Nome: " + g1.getNome());
        System.out.println("Cpf: " + g1.getCpf());
        System.out.println("Salario: " + g1.getSalario());

        g1.setSenha(123456);
        boolean autentica = g1.autentica(123456);
        System.out.println("Autentica: " + autentica);

        System.out.println(g1.getBonificacao());
    }
}
