package aula03;

import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        String iniciais;
        int dia;
        int mes;
        int ano;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Digite seu dia de nascimento: ");
        dia = scanner.nextInt();
        System.out.println("Digite seu mês de nascimento: ");
        mes = scanner.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        ano = scanner.nextInt();
        char pNome = nome.charAt(0);
        char pSobrenome = sobrenome.charAt(0);
        System.out.println("Seu Nome é "+nome+" "+sobrenome+" Iniciais "+pNome+"."+pSobrenome+" Dia do Nascimento "+dia+"/"+mes+"/"+ ano +"." );
    }
}