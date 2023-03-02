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
public class TesteValidacaoNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ValidacaoNumerica valida = new ValidacaoNumerica();
        Integer numero = 0;
        do{
            System.out.println("Digite um número para ver se ele é primo: ou um numero negativo para sair");
            numero = entrada.nextInt();
            
            valida.verificarPrimo(numero);
        }while(numero >= 0);
    }
    
}
