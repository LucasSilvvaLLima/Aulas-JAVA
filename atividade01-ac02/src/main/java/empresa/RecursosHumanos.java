/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author lucka
 */
public class RecursosHumanos {

    private Integer totalPromocoes = 0;
    private Integer totalReajusteSalarial = 0;

    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalReajusteSalarial() {
        return totalReajusteSalarial;
    }

    public void reajustarSalario( Colaborador colab, Double valorReajuste) {
        colab.setSalario(valorReajuste);
        totalReajusteSalarial++;
        System.out.println(String.format("O colaborador %s teve um reajuste em seu salário e agora recebe %.2f \n", colab.getNome(),valorReajuste));
    }

    public void promoverColaborador(Colaborador colab, String cargo, Double novoSalario) {
        if (novoSalario > colab.getSalario()) {
            System.out.println(String.format("O colaborador %s foi promovida para %s e recebera %.2f", colab.getNome(), cargo, novoSalario));
            colab.setCargo(cargo);
            colab.setSalario(novoSalario);
            totalPromocoes++;
        }else{
            System.out.println("operação inválida");
        }
    }
}
