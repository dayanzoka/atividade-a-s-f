package Strategy;

// importa as classes do pacote unified
import unified.Conteudo;
import unified.MediaAdapter;

// padrão strategy 
public interface PostStrategy {
    void executar(MediaAdapter adaptador, Conteudo conteudo);
}