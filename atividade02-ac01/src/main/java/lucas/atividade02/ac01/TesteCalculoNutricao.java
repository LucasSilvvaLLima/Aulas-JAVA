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
public class TesteCalculoNutricao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculoNutricao calc = new CalculoNutricao();
        Integer continuar = 0;
        do {
            System.out.println("Digite seu peso: ");
            Double pesoUsuario = entrada.nextDouble();
            System.out.println("Digite sua altura: ");
            Double alturaUsuario = entrada.nextDouble();

            System.out.println("Olá Usuário:");
            calc.calcularIMC(pesoUsuario, alturaUsuario);

            System.out.println("Deseja calcular outro IMC?"
                    + "\nSIM Digite: Qualquer número!\nNÃO Digite: -1");
            continuar = entrada.nextInt();
        } while (!continuar.equals(-1));
        
        System.out.println("Tchau :) ");
    }

}
