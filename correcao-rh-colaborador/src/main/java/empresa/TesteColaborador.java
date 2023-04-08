/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author lucka
 */
public class TesteColaborador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador("Lucas Silva", "Dev Java junior", 3000.0);
        
        Colaborador colab02 = new Colaborador("Erick Benficas", "DBA junior", 5000.0);
        
        Colaborador colab03 = new Colaborador("Maria de Lurdes", "Dev Sênior");
                        
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colab01);
        System.out.println(colab02);
        
        rh.reajustarSalario(colab02, 500.0);
        
        System.out.println(colab01);
        System.out.println(colab02);

        rh.promoverColaborador(colab01, "Desenvolvedor Java Pleno", 8000.0);
        rh.promoverColaborador(colab02, "DBA Pleno", 3000.0);
        
        System.out.println(colab01);
        System.out.println(colab02);
        
        System.out.println(rh);        
    }

    public TesteColaborador() {
    }
    
}
