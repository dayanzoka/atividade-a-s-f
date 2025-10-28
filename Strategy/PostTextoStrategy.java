package Strategy;

// importa as classes do pacote 'unified'
import unified.Conteudo;
import unified.MediaAdapter;

// padrão strategy (implementação concreta)
public class PostTextoStrategy implements PostStrategy {
    
    @Override
    public void executar(MediaAdapter adaptador, Conteudo conteudo) {
        System.out.println("\nusando estratégia de texto simples...\n");
        adaptador.postar(conteudo);
    }
}