/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade02.ac01;

/**
 *
 * @author lucka
 */
public class CalculoNutricao {
    void calcularIMC(Double peso, Double altura){
        Double imc = peso / (altura * altura);
        
        System.out.println(String.format("O seu IMC é %.2f", imc));
    }
}
