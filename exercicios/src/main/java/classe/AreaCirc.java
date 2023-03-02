/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author lucka
 */
public class AreaCirc {

    double raio;
    static final double PI = 3.1415;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }
    
    double area(){
        return raio * PI * raio;
    }
}
