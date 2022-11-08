package aula11;
/*Não existe algo que seja do tipo animal: existem cães, gatos, pássaros. Quando criarmos animais vamos criar
 cachorros, gatos, etc.

Uma classe abstrata (SEMPRE É SUPERCLASSE) é abstrata pq nunca criaremos objetos dela, serve para AGRUPAR CERTAS
 CLASSES SOBRE UM CRITÉRIO ESPECÍFICO para COMPARTILHAR característica e comportamento em comum. Usado com herança.

Classes abstratas são feitas particularmente para serem modelos de suas classes derivadas, que por via de regra,
deverão sobrescrever os métodos dessa classe abstrata para que seja possível a implementação dos mesmos.
PORTANTO SE DECLARA O MÉTODO NA SUPERCLASSE MAS ELE NÃO FAZ NADA, NA SUBCLASSE QUE ELE SERÁ SOBRESCRITO E
IMPLEMENTADO */


public abstract class Cachorro {

    private String nome;
    private int idade;
    private Integer numeroPatas;

    //sobrecarga
    public Cachorro(String nome, int idade, Integer numeroPatas) {
        this.nome = nome;
        this.idade = idade;
        this.numeroPatas = numeroPatas;
    }

    //sobrecarga
    public Cachorro(String nome) {
        this.nome = nome;
    }

    //O abstratc obriga a subclasse que herdar a classe Cachorro a implementar esse método
    //Como o método não é implementado aqui não seu usa {}
    //Define o contrato: obrigatório sobrescre na filha
    public abstract void latir();

    public void teste(){
        System.out.println("teste");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}