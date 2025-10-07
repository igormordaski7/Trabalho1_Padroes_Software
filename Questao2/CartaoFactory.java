// Fábricas concretas para cada tipo de pagamento
public class CartaoFactory extends PagamentoFactory{

    @Override
    public Pagamento criarPagamento() {
        return new CartaoCredito();
    }
}
