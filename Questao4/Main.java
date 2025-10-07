/*  Questão 4 – Relatórios de vendas com funcionalidades opcionais
    Padrão aplicado: Decorator

    Justificativa:
    O problema pede uma forma de gerar relatórios básicos, mas que possam ser expandidos 
    com novas funcionalidades opcionais (estatísticas, gráficos, exportação em PDF), 
    sem alterar o código do relatório principal.

    O padrão Decorator foi utilizado porque ele permite adicionar comportamentos a objetos dinamicamente, sem modificar 
    sua estrutura original. Cada "decorador" representa uma extensão (como adicionar gráficos ou PDF) que envolve o relatório básico, 
    mantendo a compatibilidade com a interface comum. Isso proporciona uma forma flexível e escalável de adicionar novas funcionalidades 
    sem quebrar o código existente
*/

public class Main {
    public static void main(String[] args) {
        
        // Criação do relatório básico
        Relatorio relatorio = new RelatorioBasico();
    
        // Adicionando funcionalidades progressivamente sem modificar o código original
        Relatorio relatorioFinal = new RelatorioPdf(new RelatorioGraficos(new RelatorioEstatisticas(relatorio)));
    
        relatorioFinal.gerar();
    }

}
