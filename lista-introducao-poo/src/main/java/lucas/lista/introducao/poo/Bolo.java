/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lucas.lista.introducao.poo;

/**
 *
 * @author lucka
 */
public class Bolo {

    // ATRIBUTOS
    String sabor;
    Double valor;
    Integer maxDiario = 100;
    Integer qtdVendida = 0;

    void comprarBolo(Integer numeroDeBolos) {
        maxDiario -= numeroDeBolos;
        if (maxDiario < 0) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            qtdVendida += numeroDeBolos;
            System.out.println(String.format("Sua compra de %d  bolos de %s foi aprovado com sucesso.", numeroDeBolos, sabor));
        }
    }

    void exibirRelatorio() {
        if (qtdVendida <= 100) {
            System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, qtdVendida, (qtdVendida * valor)));
        }
    }
}
