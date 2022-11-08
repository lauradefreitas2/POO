package aula11;

public class Doberman extends Cachorro{

    private String nomePai;
    private Float peso;

    public Doberman(String nome, int idade, Integer numeroPatas) {
        super(nome, idade, numeroPatas);
    }

    public Doberman(String nome) {
        super(nome);
    }

    //sobrescrita
    @Override
    public void latir() {
        System.out.println("Late como Doberman AU AU AU AU AU");
    }

    public void morderComoDoberman(){
        System.out.println("Nunca fui mordida por um. Portanto nÃ£o sei!");
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}