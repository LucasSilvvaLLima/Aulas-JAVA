/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class TesteCalculoAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculoAluno calc = new CalculoAluno();
        
        System.out.print("Digite Sua 1° nota: ");
        Double nota1 = entrada.nextDouble();
        System.out.print("Digite Sua 2° nota: ");
        Double nota2 = entrada.nextDouble();
        
        Double mediaAluno = calc.calcularMedia(nota1, nota2);
        
        System.out.println(String.format("Sua média no foi %.2f", mediaAluno));
        
    }
    
}
