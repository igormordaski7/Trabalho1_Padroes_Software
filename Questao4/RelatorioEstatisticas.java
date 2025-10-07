// Decorator que adiciona estatísticas
public class RelatorioEstatisticas extends RelatorioDecorator{

    public RelatorioEstatisticas (Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Adicionando estatísticas de faturamento");
    }
}
