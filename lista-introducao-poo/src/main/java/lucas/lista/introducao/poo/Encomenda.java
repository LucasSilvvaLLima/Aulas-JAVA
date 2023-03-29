/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.lista.introducao.poo;

/**
 *
 * @author lucka
 */
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double frete = 0.0;

    Double calcularFrete() {
        switch (tamanho) {
            case "P":
                frete += valorEncomenda * 0.01;
                break;
            case "M":
                frete += valorEncomenda * 0.03;
                break;
            case "G":
                frete += valorEncomenda * 0.05;
                break;
            default:
                System.out.println("Tamanho inessistente");
        }

        if (distancia <= 50.0) {
            frete += 3.0;
        } else if (distancia <= 200) {
            frete += 5.0;
        } else {
            frete += 7.0;
        }

        return frete;
    }

    void emitirEtiqueta() {
        System.out.println(String.format("***** ETIQUETA PARA ENVIO ***** \n"
                + "Endereço do remetente: %s \n"
                + "Endereço do destinatário: %s \n"
                + "Tamanho: %s \n"
                + "--------------------------------------\n"
                + "Valor encomenda: R$ %.2f\n"
                + "Valor frete: R$ %.2f \n"
                + "--------------------------------------\n"
                + "Valor total: R$ %.2f",
                enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, frete, (valorEncomenda + frete)));
    }
}
