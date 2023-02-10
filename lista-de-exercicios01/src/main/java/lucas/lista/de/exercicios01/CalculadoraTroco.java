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
public class CalculadoraTroco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quanto vale o produto: ");
        Double valorProduto = entrada.nextDouble();
        
        System.out.println("Qauntos foram vendidos: ");
        Double qtdeVendida = entrada.nextDouble();
        
        System.out.println("Quanto de dinheiro o cliente deu: ");
        Double valorCliente = entrada.nextDouble();
        
        Double valorCompra = valorProduto * qtdeVendida;
        
        Double troco = valorCliente - valorCompra;
        
        System.out.println("Seu troco será de R$" + troco);
    }
    
}
