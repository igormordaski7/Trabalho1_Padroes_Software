// Classe abstrata do Decorator
public class RelatorioDecorator implements Relatorio{

    protected Relatorio relatorio; // referência para o relatório original

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void gerar() {
        relatorio.gerar(); // executa o comportamento original
    }
}
