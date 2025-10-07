public class LeitorConcreto implements Leitor{

    private String nome;

    public LeitorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNotificacao (String noticia) {
        System.out.println(nome + " recebeu " + noticia);
    }
}
