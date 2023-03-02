/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class DesafioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas deseja informar: ");
        int numNotas = entrada.nextInt();
        
        double[] notasAluno = new double[numNotas];
        
        for(int i = 0; i < notasAluno.length; i++){
            System.out.print("Digite a " + (i+1) + "° nota: ");
            notasAluno[i] = entrada.nextDouble();
        }
        
        double somaNotas = 0;
        for(double nota: notasAluno){
            somaNotas += nota;
        }
        
        double media = somaNotas / notasAluno.length;
        
        System.out.println("A sua média foi " + media );
        System.out.println("Notas: " + Arrays.toString(notasAluno));
    }
    
}
