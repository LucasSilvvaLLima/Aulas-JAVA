/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.primeiro.projeto.nivelamento;

/**
 *
 * @author lucka
 */
public class Condicao {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        if(numero01 > numero02){
            System.out.println("É maior");
        }else if(numero02 > numero01){
            System.out.println("É menor");
        }else{
            System.out.println("É igual");
        }
        
        Boolean bloqueado = false;
        
        if (bloqueado) {
            System.out.println("Ta bloqueado");
        } else {
            System.out.println("Ta desbloqueado");
        }
        
        String nome01 = "Xampson";
        String nome02 = "XampsON";
        
//        SENsitive case
        if(nome01.equals(nome02)){
            System.out.println("Nome Igual");
        }else{
            System.out.println("Nome Diferente");
        }
        
//        INsensitive case
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("Nome Igual");
        }else{
            System.out.println("Nome Diferente");
        }
    }
    
}
