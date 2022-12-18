package Banco.Testes;
import Banco.TiposdeFuncionarios.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gabi = new Gerente(); //FuncionarioPrincipal(); por ser uma classe abstrata não pode mais ser usada.
        gabi.setNome("Gabriela Melo");
        gabi.setCpf("2222");
        gabi.setSalario(1333.65);
        
        System.out.println(gabi.getNome());
        System.out.println(gabi.getSalario());
        System.out.println(gabi.getBonificacao());
    }
}
