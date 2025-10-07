// Decorator que adiciona gráficos
public class RelatorioGraficos extends RelatorioDecorator{

    public RelatorioGraficos(Relatorio relatorio) {
        super(relatorio);
    }

    public void gerar() {
        super.gerar();
        System.out.println("Adicionando gráficos ao relatório");
    }
}
