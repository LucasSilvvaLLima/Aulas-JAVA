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
public class CalculoRenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos possui.");
        Integer filhosCaso1 = entrada.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos possui");
        Integer filhosCaso2 = entrada.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos possui.");
        Integer filhosCaso3 = entrada.nextInt();
        
        Integer totalFilhos = filhosCaso1 + filhosCaso2 + filhosCaso3;
        
        Double bolsa = (filhosCaso1 * 25.12) + (filhosCaso2 * 15.88) + (filhosCaso3 * 12.44);
        
        System.out.println("Você tem um total de " + totalFilhos 
                +" filhos e vai receber R$" + bolsa +" de bolsa");
        
    }
    
}
