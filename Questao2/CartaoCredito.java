public class CartaoCredito implements Pagamento{

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via Cartão de Crédito");
    }
}
