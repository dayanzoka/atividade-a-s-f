package Adapters;

import APIs.ApiLinkedin;
import unified.Conteudo;
import unified.MediaAdapter;

public class LinkedinAdapter implements MediaAdapter {

    private ApiLinkedin api = new ApiLinkedin();

    @Override
    public void postar(Conteudo conteudo) {
        api.submeterArtigo(conteudo.titulo, conteudo.textoPrincipal);
    }
}
