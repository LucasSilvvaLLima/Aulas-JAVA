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
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da base inteiro: ");
        Integer valorBase = entrada.nextInt();

        System.out.print("Digite o valor do expoente inteiro: ");
        Integer valorExpoente = entrada.nextInt();

        while (valorBase < 0 || valorExpoente < 0) {
            System.out.println("ERRO: Digite apenas números positivos");
            System.out.print("Digite o valor da base inteiro: ");
            valorBase = entrada.nextInt();

            System.out.print("Digite o valor do expoente inteiro: ");
            valorExpoente = entrada.nextInt();
        }
        
        Integer resultado = valorBase;
        for(int i = 1; i < valorExpoente; i++){
            resultado *= valorBase; 
        }
        System.out.println(String.format("%d elevado a %d = %d", valorBase, valorExpoente, resultado));
        
    }

}
