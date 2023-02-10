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
public class SalarioLiquido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu salário bruto: ");
        Double salarioBruto = entrada.nextDouble();
        
        System.out.println("Quanto a condução diaria só de ida: ");
        Double conducaoDiaria = entrada.nextDouble();
        
        Double descInss = (salarioBruto * 0.1); 
        Double descIr = (salarioBruto * 0.2);
        Double descVt = (conducaoDiaria * 2) * 22;
        
        Double totalDesc = descInss + descIr + descVt;
        
        Double salarioLiquido = salarioBruto - totalDesc;
        
        System.out.println("Seu salário bruto é R$" + salarioBruto +", tem um total de R$" + totalDesc + " em descontos e "
                + "receberá umlíquido de R$" + salarioLiquido);
    }
    
}
