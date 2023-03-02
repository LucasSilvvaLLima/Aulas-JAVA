/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade02.ac01;

/**
 *
 * @author lucka
 */
public class DescontoProgressivo {

    Double calcularDesconto(Double valor, Integer qtdeProduto) {
        Double valorFinal = 0.0;
        if (qtdeProduto == 1) {
            valorFinal = valor * 0.9;
        } else if (qtdeProduto == 2) {
            valorFinal = valor * 0.8;
        } else {
            valorFinal = valor * 0.7;
        }

        valorFinal *= qtdeProduto;

        return valorFinal;
    }
    
    void notaFiscal(Double valor, Integer qtdeProduto){
        System.out.println(String.format(
                "#------------------------------#"
                + "\nValor do Produto:  R$%.2f "
                + "\nQuantidade: %d \n"
                + "#------------------------------#"
                + "\nValor com desconto:  R$%.2f",
                valor, qtdeProduto, calcularDesconto(valor, qtdeProduto)));
    }
}
