package lucas.lista.de.exercicios02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 100: ");
        Integer numeroDigitado = entrada.nextInt();
        Integer sorteadoPrimeiraVez = 0;
        Integer contadorPar = 0;
        Integer contadorImpar = 0;
        String frasePosicao = "";
        String fraseFinal = "";

        for (int i = 1; i <= 200; i++) {
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
            Boolean validaPosicao = numeroDigitado.equals(numeroAleatorio) && sorteadoPrimeiraVez.equals(0);
            if (validaPosicao) {
                sorteadoPrimeiraVez = i;
            }

            if (numeroAleatorio % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
            System.out.println(i + "° " + numeroAleatorio);
        }

        if (sorteadoPrimeiraVez.equals(0)) {
            frasePosicao = "O número %d foi sorteado %d vezes";
        } else {
            frasePosicao = "O número %d foi sorteado pela 1° vez na %d° posição";
        }

        fraseFinal = String.format(frasePosicao +
                "\nQuantidade de pares sorteados: %d" +
                "\nQuantidade de impares sorteados: %d",
                numeroDigitado, sorteadoPrimeiraVez, contadorPar, contadorImpar);

        System.out.println(fraseFinal);
    }
}
