/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe;

/**
 *
 * @author lucka
 */
public class ValorvsReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 2;
        double b = a; // ATRIBUIÇÃO POR VALOR.
        
        a++;
        b--;
        
        System.out.println(a + " " + b);
        
        Data d1 = new Data(1, "Dezembro", 2023);
        Data d2 = d1; // ATRIBUIÇÃO POR REFERÊNCIA.
        
        d1.dia = 9;
        d2.mes = "Fevereiro";
        
        d1.ano = 2025;
        
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        
    }
    
}
