/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.primeiro.projeto.encapsulamento;

/**
 *
 * @author lucka
 */
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria();
        conta01.setNomeTitular("Xampson");

        ContaBancaria conta02 = new ContaBancaria();
        conta02.setNomeTitular("Lucas");

        conta01.depositar(100.0);
        conta02.sacar(10.0);
        conta02.depositar(20.0);
        conta02.sacar(2.0);

        System.out.println("C1: " + conta01.getSaldo());
        System.out.println("C2: " + conta02.getSaldo());

        String nomeConta01 = conta01.getNomeTitular();;
        
    }
}
