/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe;

/**
 *
 * @author lucka
 */
public class AriaCircTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AreaCirc a1 = new AreaCirc(10);
//        a1.pi = 10;
        
        AreaCirc a2 = new AreaCirc(5);
//        a2.pi = 5;
        
//        AreaCirc.PI = 3;
        
        System.out.println(a1.area());
        System.out.println(a2.area());
    }

}
