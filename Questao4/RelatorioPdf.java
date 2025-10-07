// Decorator que exporta para PDF
public class RelatorioPdf extends RelatorioDecorator{
    
    public RelatorioPdf(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Exportando relatório para PDF.");
    }
}
