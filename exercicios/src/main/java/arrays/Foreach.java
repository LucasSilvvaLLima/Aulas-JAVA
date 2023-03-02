/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author lucka
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};
        
        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println("");
        
        for(double nota: notas){
            System.out.print(nota + " ");
        }
    }
    
}
