public class CriarConta {
    public static void main(String[] args) {
        ContaPrincipal primeiraConta = new ContaPrincipal(6646,969060);
        primeiraConta.depositar(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.depositar(100);
        System.out.println(primeiraConta.getSaldo());

        ContaPrincipal segundaConta = new ContaPrincipal(6645,969061);
        segundaConta.depositar(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }
}