package mesa11;

public class preguica extends animal{

    public preguica(String nome, Integer idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("som de preguiça");

    }

    @Override
    public void acao() {
        System.out.println("A preguiça sobe em árvores");

    }
}
