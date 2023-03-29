/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.lista.introducao.poo;

/**
 *
 * @author lucka
 */
public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double porcentageReajuste){
        salario *= 1 + (porcentageReajuste / 100);
        System.out.println(String.format("Funcionario: %s, cargo: %s, salario: %.2f", nome, cargo, salario));
    }
    
    
}
