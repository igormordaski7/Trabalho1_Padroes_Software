import java.util.ArrayList;
import java.util.List;

// Classe para enviar as notificações
public class Topico {

    private String nome;
    private List<Leitor> leitores = new ArrayList<>();

    public Topico(String nome) {
        this.nome = nome;
    }

    // Inscrever novos leitores
    public void inscrever (Leitor leitor) {
        leitores.add(leitor);
    }

    // Publica uma nova notícia e notifica todos os inscritos
    public void publicarNoticia(String noticia) {
        System.out.println("Nova notícia publicada em " + nome + ": " + noticia);
        for(Leitor l : leitores) {
            l.receberNotificacao(noticia);
        }
    }
}
