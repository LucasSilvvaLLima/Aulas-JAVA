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
public class Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número entre 1 e 100");
        Integer numeroDigitado =entrada.nextInt();
        Integer numeroAleatorio = 0;
        for(int i = 1; i <= 201; i++){
            numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 201);
        }
    }
    
}
