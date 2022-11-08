package mesa11;

public abstract class animal {
    private String nome;
    private Integer idade;
    private String cor;

    public animal(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public abstract void emitirSom();

    public abstract void acao();
}