package mesa11;

public class cavalo extends animal{

    public cavalo(String nome, Integer idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Hiin in in");

    }

    @Override
    public void acao() {
        System.out.println("O cavalo estÃ¡ correndo");

    }
}