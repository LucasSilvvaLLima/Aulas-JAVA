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
public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu login: ");
        String loginUsuario = entrada.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaUsuario = entrada.nextLine();

        System.out.println("Quantas vezes é permitido errar a senha: ");
        Integer qtdeErro = entrada.nextInt();

        System.out.println("Seu login é " + loginUsuario + " e sua senha é "
                + senhaUsuario + " Você tem " + qtdeErro
                + " tentativas antes de ser bloqueado");
    }

}
