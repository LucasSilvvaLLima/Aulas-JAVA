/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.de.exercicios01;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class CalculoMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite a 1° nota: ");
        Double nota1 = entrada.nextDouble();
        
        System.out.println("Digite a 2° nota: ");
        Double nota2 = entrada.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println("Olá, "+nome+". Sua média foi de " + media);
        
    }
    
}
