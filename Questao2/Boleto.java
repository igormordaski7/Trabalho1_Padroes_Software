public class Boleto implements Pagamento{

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via Boleto Bancário");
    }
}
