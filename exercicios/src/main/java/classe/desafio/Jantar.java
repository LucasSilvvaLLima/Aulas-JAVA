/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.desafio;

/**
 *
 * @author lucka
 */
public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.351);
        Comida c2 = new Comida("Frango", 0.625);
        
        Pessoa p1 = new Pessoa("Emilie", 55.7);
        System.out.println("A " + p1.nome + " esta pesando " + p1.peso);
        p1.comer(c1.peso);
        System.out.printf("Agora a %s esta pesando %.3f porque comeu %.3f kg de %s", p1.nome, p1.peso, c1.peso, c1.nome);
        
        Pessoa p2 = new Pessoa("Gustavo", 69.45);
        System.out.println("\n\nO " + p2.nome + " esta pesando " + p2.peso);
        p2.comer(c2.peso);
        System.out.printf("Agora o %s esta pesando %.3f porque comeu %.3f kg de %s", p2.nome, p2.peso, c2.peso, c2.nome);
        
    }
}
