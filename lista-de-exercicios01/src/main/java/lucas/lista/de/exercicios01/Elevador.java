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
public class Elevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Limite de peso no elevador: ");
        Double limitePeso = entrada.nextDouble();
        System.out.println("Limite de Pessoas no elevador ");
        Integer limitePessoa = entrada.nextInt();
        
        System.out.println("Peso da 1° pessoa: ");
        Double peso1 = entrada.nextDouble();
        
        System.out.println("Peso da 2° pessoa: ");
        Double peso2 = entrada.nextDouble();
        
        System.out.println("Peso da 3° pessoa: ");
        Double peso3 = entrada.nextDouble();
       
        Double pesoTotal = peso1 + peso2 + peso3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "+ limitePessoa +" pessoas."
                + "O peso total no elevador é de "+ pesoTotal + ", sendo que ele suporta " + limitePeso);
    }

}
