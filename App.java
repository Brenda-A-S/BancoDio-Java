public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Brenda");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Brenda");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente2);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
