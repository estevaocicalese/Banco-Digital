
public class Tela {
    public static void main(String[] args) {
        Cliente estevao = new Cliente();
        estevao.setNome("Estevão");

        Conta cc = new ContaCorrente(estevao);
        Conta poupanca = new ContaPoupança(estevao);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
