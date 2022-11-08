package aula11;

public class Poodle extends Cachorro{

    public Poodle(String nome, int idade, Integer numeroPatas) {
        super(nome, idade, numeroPatas);
    }

    public Poodle(String nome) {
        super(nome);
    }

    //sobrescrita
    @Override
    public void latir() {
        System.out.println("Late como Poodle au au");
    }
}