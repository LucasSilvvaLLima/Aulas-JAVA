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
public class CalculoCalorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos minutos de aquecimento: ");
        Integer aquecimento = entrada.nextInt();
        
        System.out.println("Qunatos minutos de exercícios aeróbicos: ");
        Integer aerobico = entrada.nextInt();
        
        System.out.println("Quantos minutos de Musculação: ");
        Integer musculacao = entrada.nextInt();
        
        Integer totalExercicio = aquecimento + aerobico + musculacao;
        Integer percaCalorias = (aquecimento * 12) + (aerobico * 20) + (musculacao * 25);
        
        System.out.println("Olá, Jorge. Você fez um total de "+ totalExercicio +
                " minutos de exercícios e perdeu cerca de "+ percaCalorias +" calorias");
    }
    
}
