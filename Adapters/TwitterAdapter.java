package Adapters;

// importa classes dos pacotes 'apis' e 'unified'
import APIs.ApiTwitter;
import unified.Conteudo;
import unified.MediaAdapter;

public class TwitterAdapter implements MediaAdapter {

    private ApiTwitter api = new ApiTwitter();

    @Override
    public void postar(Conteudo conteudo) {
        api.tweetar(conteudo.textoPrincipal);
    }
}
