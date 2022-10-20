package EXcachorrinhos;

import java.util.Scanner;

public class cachorrinhos {
    public static void main(String[] args) {
        String nome;
        double quantidade = 5.0;
        Scanner scanner = new Scanner(System.in);   //minimo 3kilos

        System.out.println("qual seu nome?");
        nome = scanner.nextLine();
        System.out.println("qual a quantidade");
        quantidade = scanner.nextDouble();
        String imprimirMensagem = cachorrinhos.quantosPacotes(nome , quantidade);

        System.out.println(imprimirMensagem);      //sout
    }
    public static String quantosPacotes(String nome, double quantidadeComida){
        Scanner scanner  = new Scanner(System.in);
        double quantidade = 5.0;
        double soma = 0;
        double quantidadePacotes;
        int contador = 0;
        if (quantidadeComida < 3){
            return "quantidade comida insuficiente";
        }
        while (soma < quantidadeComida){
            System.out.println("qual a quantidade de pacotes");
            quantidadePacotes = scanner.nextDouble();
            soma+=quantidadePacotes;
            ++contador;
        }
        return nome+ " "+ "precisa de " + contador + " " + "pacotes";

    }


}
