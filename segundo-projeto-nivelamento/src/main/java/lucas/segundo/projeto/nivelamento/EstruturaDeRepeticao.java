package lucas.segundo.projeto.nivelamento;

import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("for de 0 a 10");

        for (int i = 0; i < 10; i++) {
            System.out.println("Volta " + i + "°");
        }

        System.out.println("for de 10 a 0");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Volta " + i + "°");
        }

        int i = 0;
        System.out.println("while de 0 até 10");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("while adivinhe um número");
        System.out.println("Digite um número");
//        vai ser 42
        Integer numeroDigitado = entrada.nextInt();

        while (numeroDigitado != 42) {
            System.out.println("Número invalido Tente de novo");
            numeroDigitado = entrada.nextInt();
        }

        System.out.println("Acertou");

        System.out.println("do while - adivinhe um número");

        System.out.println("Digite um numero");
        numeroDigitado = entrada.nextInt();

        do {
            System.out.println("Número invalido Tente de novo");
            numeroDigitado = entrada.nextInt();
        } while (numeroDigitado != 42);

    }

}
