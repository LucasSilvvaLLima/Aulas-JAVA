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
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Olá, "+nome+"! Qual o ano de seu nascimento?");
        Integer nascimento = entrada.nextInt();
        
        Integer idadeFutura = 2030 - nascimento;
        
        System.out.println("Em 2030 você tera " + idadeFutura + " anos");
        
    }
    
}
