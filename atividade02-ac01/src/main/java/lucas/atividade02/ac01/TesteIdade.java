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
public class TesteIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Idade objIdade = new Idade();
        
        System.out.println("Digite sua idade");
        Integer idadeUsuario = entrada.nextInt();
        
        objIdade.classificaIdade(idadeUsuario);
        
    }
    
}
