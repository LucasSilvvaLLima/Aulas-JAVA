/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.primeiro.projeto.poo;

/**
 *
 * @author lucka
 */
public class TesteBilhete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Xampson";
        bilhete01.possuiMeiaEntrada = true;
        bilhete01.saldo = 0.0;
        
        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Wilian";
        bilhete02.possuiMeiaEntrada = false;
        bilhete02.saldo = 0.0;
        
        bilhete01.usar();
        bilhete01.recarregar(100.0);
        bilhete01.usar();
        System.out.println("--------------------");
        bilhete02.recarregar(3.50);
        bilhete02.usar();
        bilhete02.recarregar(10.0);
        bilhete02.usar();
    }
    
}
