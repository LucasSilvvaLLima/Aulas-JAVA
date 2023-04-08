/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author lucka
 * Ordem de organização e desenvolvimento de código
 * 1. Atributos
 * 2. Construtor
 * 3. Metodos / Comportamentos
 * 4. Métodos Get - Set
 * 5. Método toString
 */
public class RecursosHumanos {

    private Integer totalPromocoes;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromocoes = 0;
        this.totalSalariosReajustados = 0;
    }
    
    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        if (valorReajuste > 0.0) {
            colab.setSalario(colab.getSalario() + valorReajuste);
            totalSalariosReajustados++;
            System.out.println(String.format("O colaborador %s teve um reajuste em seu salário e agora recebe %.2f \n", colab.getNome(), colab.getSalario()));

        } else {
            System.out.println("Valor Invalido \n");
        }
    }

    public void promoverColaborador(Colaborador colab, String cargo, Double novoSalario) {
        if (novoSalario > colab.getSalario()) {
            colab.setCargo(cargo);
            colab.setSalario(novoSalario);
            totalPromocoes++;
            System.out.println(String.format("O colaborador %s foi promovida para %s e recebera %.2f \n", colab.getNome(), cargo, novoSalario));
        } else {
            System.out.println("operação inválida \n");
        }
    }

    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("Recursos Humanos \n"
                + "Total de Promoções: %d\n"
                + "Total de Reajustes: %d", totalPromocoes, totalSalariosReajustados);
        
        return fraseFormatada;
    }
    
    

}
