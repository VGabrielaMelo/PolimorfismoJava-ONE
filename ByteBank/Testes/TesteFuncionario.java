package Testes;
import ByteBank.FuncionarioPrincipal;

public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioPrincipal gabi = new FuncionarioPrincipal();
        gabi.setNome("Gabriela Melo");
        gabi.setCpf("2222");
        gabi.setSalario(1333.65);
        
        System.out.println(gabi.getNome());
        System.out.println(gabi.getSalario());
        System.out.println(gabi.getBonificacao());
    }
}
