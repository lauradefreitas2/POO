package Exerciciospg;

public class exerciciospg {
    public static void main(String[] args) {
        Integer numero1 = 1;
        Integer numero2 = 2;
        int comparar;

        if (numero1.equals(numero2)){
            System.out.println("são iguais");
        }
        else {
            comparar=numero1.compareTo(numero2);
            if (numero1 >= numero2) {
                System.out.println(" o " + numero1 + "é maior ou igual a" + numero2);
            } else if (numero1 < numero2){
                System.out.println(" o " + numero1 + " é menor " + numero2);

            } else if (numero1 == numero2) {
                System.out.println(" o " + numero1 + "é igual ao " + numero2);

            }
        }
    }




}
