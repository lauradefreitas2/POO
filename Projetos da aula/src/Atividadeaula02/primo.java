package Atividadeaula02;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class primo { public static void main(String[] args) {


    boolean numeroPrimo = primo.ehPrimo(12);
    if(numeroPrimo) System.out.println("É primo");
    else System.out.println("Não é primo.");

}

    @Contract(pure = true)
    public static @NotNull Boolean ehPrimo(int numero) {


        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                return false;
            }

        }

        return numero > 1;
    }
}
