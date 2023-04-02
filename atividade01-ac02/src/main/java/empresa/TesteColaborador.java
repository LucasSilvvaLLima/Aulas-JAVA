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
//        colab01.setNome("Lucas Silva");
//        colab01.setCargo("Dev Java junior");
//        colab01.setSalario(3000.0);

        Colaborador colab02 = new Colaborador("Erick Benficas", "DBA junior", 5000.0);
//        colab02.setNome("Erick Benficas");
//        colab02.setCargo("DBA junior");
//        colab02.setSalario(5000.0);

        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(String.format("Colaborador: %s; Cargo: %s; Salário: %.2f", colab01.getNome(), colab01.getCargo(), colab01.getSalario()));
        System.out.println(String.format("Colaborador: %s; Cargo: %s; Salário: %.2f\n", colab02.getNome(), colab02.getCargo(), colab02.getSalario()));
        
        rh.promoverColaborador(colab01, "Desenvolvedor Java Pleno", 8000.0);
        rh.promoverColaborador(colab02, "DBA Pleno", 3000.0);
        System.out.println("");
        
        rh.reajustarSalario(colab01, 10000.0);
        
        System.out.println(String.format("Colaborador: %s; Cargo: %s; Salário: %.2f", colab01.getNome(), colab01.getCargo(), colab01.getSalario()));
        System.out.println(String.format("Colaborador: %s; Cargo: %s; Salário: %.2f\n", colab02.getNome(), colab02.getCargo(), colab02.getSalario()));
        
        System.out.println(String.format("Total de Promoções: %d", rh.getTotalPromocoes()));
        System.out.println(String.format("Total de Reajuste Salarial: %d", rh.getTotalReajusteSalarial()));
    }

}
