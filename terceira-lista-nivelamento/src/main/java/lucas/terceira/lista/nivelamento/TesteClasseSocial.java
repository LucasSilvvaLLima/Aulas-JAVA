/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class TesteClasseSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        ClasseSocial classe = new ClasseSocial();;
//        
//        System.out.println("Digite sua renda: ");
//        Double salario = entrada.nextDouble();
//        
//        Double qtdeSalariosMinimo = classe.qtdSalariosMinimo(salario);
//        
//        System.out.println(String.format("Você recebe aproximadamente %.1f salários-mínimos.", qtdeSalariosMinimo));
//        System.out.println(classe.classeSocialUsuario(salario));
        
        String n1 = "Lucas";
        String n2 = entrada.nextLine();
        
        if(n1 == n2){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }
    }
    
}
