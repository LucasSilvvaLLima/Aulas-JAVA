/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package classe;

/**
 *
 * @author lucka
 */
public class ProdutoTeste {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4000);

        var p2 = new Produto();
        p2.nome = "Controle";
        p2.preco = 100;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.printf("Preço com desconto de %.2f desconto no %s = %.2f", (Produto.desconto * 100), p1.nome, precoFinal1);
        System.out.printf("\nPreço com desconto de %.2f desconto no %s = %.2f", (Produto.desconto * 100), p2.nome, precoFinal2);
        System.out.printf("\nMédia do carrinho = R$%.2f", mediaCarrinho);
        
    }
}
