package mesa11;

public class main {
    public static void main(String[] args) {
        preguica carlinha = new preguica ("Carlinha", 15, "Cinza");
        cavalo romeu = new cavalo("Romeu", 10, "Marrom");
        cachorro dora = new cachorro("Dora", 7, "Caramelo");

        carlinha.acao();
        carlinha.emitirSom();

        romeu.acao();
        romeu.emitirSom();

        dora.acao();
        dora.emitirSom();

    }
}
