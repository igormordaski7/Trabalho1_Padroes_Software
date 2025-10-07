// Fábricas concretas para cada tipo de pagamento
public class PixFactory extends PagamentoFactory{

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }
}
