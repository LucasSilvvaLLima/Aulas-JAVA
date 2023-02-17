/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.de.exercicios02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lucka
 */
public class Loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10");
        Integer numeroDigitado = entrada.nextInt();
        Integer contador = 0;
        Integer numeeroAleatorio = 0;
        String frase = "";
        
        do {
            numeeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(String.format("O número sorteado foi %d", numeeroAleatorio));
            contador++;
        } while (!numeeroAleatorio.equals(numeroDigitado)); 

        if (contador <= 3) {
            frase = String.format("Você é MUITO sortudo, acertou com %d tentativas ", contador);
        } else if (contador > 3 && contador <= 10) {
            frase = String.format("Você é sortudo acertou com %d tentativas", contador);
        } else {
            frase = String.format("É melhor você parar de apostar e ir trabalhar, acertou com %d tentativas", contador);
        }

        System.out.println(frase);
    }

}
