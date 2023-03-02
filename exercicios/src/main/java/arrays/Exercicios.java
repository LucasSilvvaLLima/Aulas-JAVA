/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author lucka
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] notasAlunoA = new double[4];
        
        notasAlunoA[0] = 7.2;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 6.7;
        
        System.out.println(Arrays.toString(notasAlunoA));
        
        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println(total / notasAlunoA.length);
        
        double[] notasAlunoB  = {9.8, 7.6, 6.9, 10};
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
    
}
