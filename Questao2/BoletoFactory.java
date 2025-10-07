// Fábricas concretas para cada tipo de pagamento
public class BoletoFactory extends PagamentoFactory{

    @Override
    public Pagamento criarPagamento() {
        return new Boleto();
    }
}
