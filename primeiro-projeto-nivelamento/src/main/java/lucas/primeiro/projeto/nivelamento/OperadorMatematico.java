/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.primeiro.projeto.nivelamento;

/**
 *
 * @author lucka
 */
public class OperadorMatematico {

    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 10;

//  1°) Soma (+)
        Integer soma = numero01 + numero02;

        System.out.println("Soma com variavel: " + soma);
        System.out.println("Somando direto: " + (numero01 + numero02));

//  2°) Subtração (-)
        System.out.println("Subtração: " + (numero01 + numero02));

//  3° Multiplicação (*)
        System.out.println("Multiplicação: " + (numero01 * numero02));

//  4° Divisão (/)
        System.out.println("Divisão: " + (numero01 / numero02));

//  5°) Resto (%)
        System.out.println("Resto: " + (numero01 % numero02));
        
//  6°) Potência
        Double potencia = Math.pow(2, 5);
        System.out.println("Potência: " + potencia);
//        System.out.println("Potência: " + Math.pow(2, 5));
        
        System.out.println("Valor de PI: " + Math.PI);
        System.out.printf("Valor de PI: %.2f", Math.PI);
    }

}
