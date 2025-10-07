public class Pix implements Pagamento{

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via PIX");
    }
}
