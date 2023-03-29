/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.introducao.poo;

/**
 *
 * @author lucka
 */
public class TesteEncomenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encomenda encomenda01 = new Encomenda();
        
        encomenda01.enderecoDestinatario = " Rua Santos da Glória, 18";
        encomenda01.enderecoRemetente = ": Av Dr. Pedro, 255";
        encomenda01.tamanho = "G";
        encomenda01.distancia = 50.0;
        encomenda01.valorEncomenda = 100.0;
        
        encomenda01.calcularFrete();
        encomenda01.emitirEtiqueta();
    }
    
}
