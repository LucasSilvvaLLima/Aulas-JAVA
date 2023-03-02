package lucas.atividade02.ac01;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucka
 */
public class TesteDescontoProgressivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DescontoProgressivo desc = new DescontoProgressivo();
        
        System.out.println("Bem-vindo ao sistema de desconnto progressivo!");
        
        System.out.println("Digite o valor do produto: ");
        Double valorProduto = entrada.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Integer qtdeProduto = entrada.nextInt();
        
        desc.notaFiscal(valorProduto, qtdeProduto);
    }
    
}
