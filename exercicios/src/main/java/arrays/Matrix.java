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
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double somaNotas = 0;
        int qtdNotas = 0;
        double mediaTurma = 0;
        
        System.out.print("Numero de alunos: ");
        int numAlunos = entrada.nextInt();
        System.out.print("Numero de Notas por alunos: ");
        int numNotas = entrada.nextInt();

        double[][] alunosNotas = new double[numAlunos][numNotas];
        
        for (int i = 0; i < alunosNotas.length; i++) {
            for (int x = 0; x < alunosNotas[i].length; x++) {
                System.out.println("Nota " + (x + 1) + " do aluno " + (i + 1) + ": ");
                alunosNotas[i][x] = entrada.nextDouble();
                somaNotas += alunosNotas[i][x];
                qtdNotas++;
            }
        }
        
        mediaTurma = somaNotas / qtdNotas;
        
        for (double[] alunosNota : alunosNotas) {
            System.out.println(Arrays.toString(alunosNota));
        }
        
        System.out.println("\n" + somaNotas + "\n" + qtdNotas);
        System.out.println("Média da Turma: " + mediaTurma);
    }

}
