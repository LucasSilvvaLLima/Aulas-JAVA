/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author lucka
 */
public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        double precoFinal = preco * (1 - desconto);

        return precoFinal;
    }
}
