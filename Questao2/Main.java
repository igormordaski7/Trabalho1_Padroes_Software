/*  Questão 2 – Sistema de pagamentos
    Padrões aplicados: Factory Method + Interfaces
    Justificativa: O problema apresentado exige que o sistema instancie dinamicamente diferentes meios de pagamento 
    (cartão de crédito, boleto, PIX), sem que o código principal precise conhecer os detalhes de criação 
    de cada objeto. Para resolver isso, foi utilizado o padrão Factory Method.

    Esse padrão encapsula o processo de criação dos objetos em uma classe-fábrica, isolando o código cliente da lógica de 
    instanciação. Assim, o sistema apenas solicita à fábrica um "processador de pagamento" e recebe o objeto correto de forma genérica.

    A interface "Pagamento" define o comportamento comum (método processarPagamento), enquanto as classes concretas implementam 
    suas próprias regras. Caso seja necessário adicionar novos métodos de pagamento futuramente, basta criar uma nova classe e 
    registrá-la na fábrica, sem modificar o código existente*/

public class Main {

    public static void main(String[] args) {
        
         // Escolha dinâmica do meio de pagamento, simulando uma configuração vinda do sistema
        PagamentoFactory factory = new PixFactory(); // Pode ser trocado para CartaoFactory ou BoletoFactory

        Pagamento pagamento = factory.criarPagamento();
        pagamento.processar(500);
    }
}
