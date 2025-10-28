package Adapters;

import APIs.ApiInstagram;
import unified.Conteudo;
import unified.MediaAdapter;

public class InstagramAdapter implements MediaAdapter {

    private ApiInstagram api = new ApiInstagram();

    @Override
    public void postar(Conteudo conteudo) {
        api.publicarFoto(conteudo.textoPrincipal);
    }
}
