package mesa10;

public class Main {

    public static void main(String[] args) {

        AssociadoHabilitado associado1 = new AssociadoHabilitado("1000001", "João", 110.00,"Futebol", 50.00);
        System.out.println("Seu custo mensal é de: " + associado1.custoMensal() + " reais");
    }

}