package mesa11;

public class cachorro extends animal{


    public cachorro(String nome, Integer idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void acao() {
        System.out.println("O cachorro estÃ¡ correndo");

    }
}