/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.primeiro.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class LeituraEscrita {

    public static void main(String[] args) {
//        Precisamos criar um leitor para isso usaremos a classe Escanner mas não vai ser uma variavel e sim um objeto
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeDigitado = entrada.nextLine();

        System.out.println("O nome digitado foi: " + nomeDigitado + " ;)");
        
        System.out.print("Digite sua Idade: ");
        Integer idadeDigitado = entrada.nextInt();
        
        System.out.print("Digite sua Altura: ");
        Double alturaDigitada = entrada.nextDouble();
        
        System.out.println("Idade digitada " + idadeDigitado);
        System.out.println("Altura digitada " + alturaDigitada);
    }
}
