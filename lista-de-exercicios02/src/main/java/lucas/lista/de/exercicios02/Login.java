/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.de.exercicios02;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String login = "admin", senha = "#SPtech2022";

        System.out.print("Digite seu nome: ");
        String nomeDigitado = entrada.nextLine();
        System.out.print("Digite sua senha: ");
        String senhaDigitado = entrada.nextLine();

        while (!login.equals(nomeDigitado) || !senha.equals(senhaDigitado)) {
            System.out.println("Login e/ou senha inválidos");
            System.out.print("Digite seu nome: ");
            nomeDigitado = entrada.nextLine();
            System.out.print("Digite sua senha: ");
            senhaDigitado = entrada.nextLine();
        }
        
        System.out.println("Login realizado com sucesso");

    }

}
