import Strategy.PostStrategy;
import unified.Conteudo;
import unified.MediaAdapter;

// classe "Contexto" do padrao strategy
public class GerenciadorMidia {

    private PostStrategy estrategia; // referencia para a Strategy

    public void setEstrategia(PostStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void publicar(MediaAdapter adaptador, Conteudo conteudo) {
        if (estrategia == null) {
            System.out.println("erro: nenhuma estrategia definida.");
            return;
        }
        if (adaptador == null) {
            System.out.println("erro: adaptador nulo, pulando publicacao.");
            return;
        }
        // delega a ação para a estrategia
        estrategia.executar(adaptador, conteudo);
    }
}