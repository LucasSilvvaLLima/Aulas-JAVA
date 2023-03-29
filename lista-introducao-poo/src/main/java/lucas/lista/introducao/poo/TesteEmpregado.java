/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucas.lista.introducao.poo;

/**
 *
 * @author lucka
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado funcionario01 = new Empregado();

        funcionario01.nome = "João";
        funcionario01.cargo = "Analista de Sistemas";
        funcionario01.salario = 54000.0;
        funcionario01.reajustarSalario(15.0);

        System.out.println("------------------------------------------");
        Empregado funcionario02 = new Empregado();
        funcionario02.nome = "Lucas";
        funcionario02.cargo = "Desenvolvedor back-end";
        funcionario02.salario = 10000.0;
        funcionario02.reajustarSalario(5.0);
        

    }

}
