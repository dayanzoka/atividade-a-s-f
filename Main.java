import Factory.MediaFactory;
import Strategy.PostTextoStrategy;
import unified.Conteudo;
import unified.MediaAdapter;

public class Main {

    public static void main(String[] args) {
        // inicializar os componentes
        MediaFactory fabrica = new MediaFactory();
        GerenciadorMidia gerenciador = new GerenciadorMidia();

        // definir o conteudo
        String mensagem = "este é um post unificado usando adapter e strategy :D";
        Conteudo meuConteudo = new Conteudo(mensagem);
        meuConteudo.titulo = "nosso novo sistema"; 

        // definir a estrategia de postagem
        gerenciador.setEstrategia(new PostTextoStrategy());

        // publicar em todas as plataformas
        System.out.println("iniciando publicações :P\n");

        MediaAdapter adaptadorTwitter = fabrica.criarAdaptador("twitter");
        gerenciador.publicar(adaptadorTwitter, meuConteudo);

        MediaAdapter adaptadorInstagram = fabrica.criarAdaptador("instagram");
        gerenciador.publicar(adaptadorInstagram, meuConteudo);

        MediaAdapter adaptadorLinkedIn = fabrica.criarAdaptador("linkedin");
        gerenciador.publicar(adaptadorLinkedIn, meuConteudo);
        
        System.out.println("\n~~ publicações finalizadas :D ~~");
    }
}