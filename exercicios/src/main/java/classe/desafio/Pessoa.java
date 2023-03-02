/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.desafio;

/**
 *
 * @author lucka
 */
public class Pessoa {
    String nome;
    double peso;
    
    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    double comer(double peso){
        
        this.peso += peso;
        return peso;
    }
}
