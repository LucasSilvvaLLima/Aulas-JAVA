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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        Double n1 = entrada.nextDouble();
        
        System.out.print("Digite um numero: ");
        Double n2 = entrada.nextDouble();
        
        Double soma = n1 + n2;
        Double subtracao = n1 - n2;
        Double multiplicacao = n1 * n2;
        Double divisao = n1 / n2;
        
        System.out.println("Resultado da soma: \n" + soma);
        System.out.println("Resultado da subtração: \n" + subtracao);
        System.out.println("Resultado da multiplicação: \n" + multiplicacao);
        System.out.println("Resultado da divisão: \n" + divisao);
        
        
    }
    
}
