1. Objetivo Unificar o gerenciamento de múltiplas redes sociais (Twitter, Instagram, LinkedIn), permitindo que o sistema use uma única interface para publicar conteúdo em APIs diferentes e incompatíveis.

2. Padrões de Design

Factory (MediaFactory):

Função: Centraliza a criação dos "adaptadores".

Como: Você pede um adaptador pelo nome (ex: "twitter"), e a fábrica o constrói e entrega pronto.

Adapter (TwitterAdapter, InstagramAdapter, ...):

Função: É o "tradutor". Faz com que as APIs externas (ApiTwitter, ApiInstagram) obedeçam à nossa interface unificada (MediaAdapter).

Como: Ele implementa MediaAdapter.postar() e, internamente, chama o método específico da API (ex: api.tweetar()).

Strategy (PostTextoStrategy):

Função: Define o algoritmo de publicação (ex: como postar um texto simples vs. como postar um vídeo).

Como: O GerenciadorMidia armazena uma estratégia e a utiliza para executar a postagem, permitindo trocar o algoritmo facilmente.

3. Fluxo de Execução (Como tudo funciona)

O Main (cliente) pede à MediaFactory um adaptador (ex: TwitterAdapter).

O Main define qual Strategy o GerenciadorMidia deve usar (ex: PostTextoStrategy).

O Main chama gerenciador.publicar(), passando o adaptador e o Conteudo.

O Gerenciador delega a ação para a Strategy (a PostTextoStrategy).

A Strategy, por sua vez, chama o método postar() do Adapter (o TwitterAdapter).

O Adapter (tradutor) executa sua função e chama o método final da API externa (ex: ApiTwitter.tweetar()).