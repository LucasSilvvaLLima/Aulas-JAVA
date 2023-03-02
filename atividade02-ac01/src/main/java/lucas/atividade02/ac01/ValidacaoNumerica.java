/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade02.ac01;

/**
 *
 * @author lucka
 */
public class ValidacaoNumerica {
    void verificarPrimo(Integer numero){
        Integer contador = 0;
        
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contador++;
            }
        }
        
        String validaPrimo = contador <= 2 ? String.format("%d É um número primo", numero): String.format("%d NÃO é um número primo", numero);
        
        System.out.println(validaPrimo);
    }
}
