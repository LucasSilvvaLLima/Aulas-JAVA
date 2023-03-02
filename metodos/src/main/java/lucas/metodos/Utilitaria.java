/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.metodos;

/**
 *
 * @author lucka
 */
public class Utilitaria {
    // Um método possui:
    // Retorno: esse é void
    // Nome: exibirLinha
    // Argumentos: não tem nada dentro do ()
    // Corpo: É tudo dentro das {}

    void exibirLinha() {
        System.out.println("*--------*--------*");
    }

    // Método com argumento
    void exibirNome(String nomeExibir) {
        System.out.println("Meu nome é " + nomeExibir);
    }

    void exibirNomeFormatado(String nomeExibirFormatado) {
        exibirLinha();
        exibirNome(nomeExibirFormatado);
        exibirLinha();
        System.out.println("\n");
    }
}
