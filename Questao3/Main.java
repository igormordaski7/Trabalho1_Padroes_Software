/* Questão 3 – Sistema de notificações de notícias
   Padrão aplicado: Observer
   Justificativa: O enunciado solicita um sistema em que múltiplos leitores possam se inscrever em tópicos, e que recebam 
   notificações automáticas sempre que novas notícias forem publicadas.

   O padrão Observer foi aplicado porque ele define uma relação de dependência de um-para-muitos entre objetos. 
   Quando o "Assunto" (no caso, o Tópico) sofre uma mudança (uma nova notícia) todos os "Observadores" (leitores inscritos) 
   são automaticamente notificados. */

public class Main {

    public static void main(String[] args) {
        Topico esportes = new Topico("Esportes");
        Topico politica = new Topico("Politica");

        Leitor igor = new LeitorConcreto("Igor");
        Leitor teste = new LeitorConcreto("Teste");

        esportes.inscrever(igor);
        politica.inscrever(teste);
        politica.inscrever(igor);

        esportes.publicarNoticia("Brasil é hexa!!!");
        politica.publicarNoticia("Tudo bandidos");
    }
}
