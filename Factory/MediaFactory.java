package Factory;

// importa classes dos pacotes 'adapters' e 'unified'
import Adapters.InstagramAdapter;
import Adapters.LinkedinAdapter;
import Adapters.TwitterAdapter;
import unified.MediaAdapter;

// padrão Factory
public class MediaFactory {

    public MediaAdapter criarAdaptador(String plataforma) {
        
        if (plataforma.equalsIgnoreCase("twitter")) {
            return new TwitterAdapter();
        } else if (plataforma.equalsIgnoreCase("instagram")) {
            return new InstagramAdapter();
        } else if (plataforma.equalsIgnoreCase("linkedin")) {
            return new LinkedinAdapter();
        }
        
        System.out.println("erro: plataforma desconhecida.");
        return null;
    }
}