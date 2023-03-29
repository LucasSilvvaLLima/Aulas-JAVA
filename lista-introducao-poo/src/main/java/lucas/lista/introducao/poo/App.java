/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.introducao.poo;

/**
 *
 * @author lucka
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bolo bolo01 = new Bolo();
        bolo01.sabor = "Chocolate";
        bolo01.valor = 50.0;

        bolo01.comprarBolo(30);
        bolo01.comprarBolo(50);
        bolo01.comprarBolo(30);
        bolo01.exibirRelatorio();

        System.out.println("---------------------------------------------------------------");

        Bolo bolo02 = new Bolo();
        bolo02.sabor = "Morango";
        bolo02.valor = 25.0;

        bolo02.comprarBolo(10);
        bolo02.comprarBolo(30);
        bolo02.exibirRelatorio();

        System.out.println("---------------------------------------------------------------");

        Bolo bolo03 = new Bolo();
        bolo03.sabor = "Baunilha";
        bolo03.valor = 10.0;

        bolo03.comprarBolo(90);
        bolo03.comprarBolo(20);
        bolo03.exibirRelatorio();

    }

}
