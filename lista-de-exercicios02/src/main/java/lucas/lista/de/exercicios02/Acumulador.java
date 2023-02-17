/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.de.exercicios02;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class Acumulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer numeroDigitado = 0;
        Integer soma = 0;

        do {
            System.out.print("Digite um número: ");
            numeroDigitado = entrada.nextInt();
            soma += numeroDigitado;
        } while (!numeroDigitado.equals(0));

        System.out.println(String.format("A soma dos numeros digitados é %d", soma));
    }

}
