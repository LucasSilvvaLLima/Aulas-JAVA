/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controle.estimativa;

/**
 *
 * @author lucka
 */
public class TesteAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atividade at1 = new Atividade("Inglês", "Luzia", 5);
        Atividade at2 = new Atividade("Matematica", "Carlos", 3);
        Atividade at3 = new Atividade("POO", "Lucas", 6);
        
        System.out.println(at1); 
        System.out.println(at2); 
        System.out.println(at3); 
        
        at1.terminarAtividade(8);
        at2.terminarAtividade(1);
        at3.terminarAtividade(6);
        
        at1.exibirRelatorio();
        at2.exibirRelatorio();
        at3.exibirRelatorio();
        
        System.out.println(at1); 
        System.out.println(at2); 
        System.out.println(at3); 
    }
    
}
