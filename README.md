Utilização do basico de POO para criar um codigo que representa um Iphone com as utilidades principais de Reprodutor de musicas, Aparelho telefonico e Navegador de Internet.

```mermaid
classDiagram
    class ReprodutorMusical {
        +SelecionarMusica(String musica)
        +Tocar()
        +Pausar()
    }

    class AparelhoTelefonico {
        +Ligar(String numero)
        +atender()
        +iniciarcorreiodevoz()
    }

    class NavegadorInternet {
        +ExibirPagina(String Url)
        +AdionarAba()
        +AtualizarPagina()
    }

    class iPhone {
    }

    ReprodutorMusical --> iPhone
    AparelhoTelefonico --> iPhone
    NavegadorInternet --> iPhone
```
