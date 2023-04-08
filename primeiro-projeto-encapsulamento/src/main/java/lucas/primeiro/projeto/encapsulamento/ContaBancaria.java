/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lucas.primeiro.projeto.encapsulamento;

/**
 *
 * @author lucka
 */
public class ContaBancaria {
//    ATRIBUTOS QUE REPRESENTAM AS CARACTERISTICAS

    private Double saldo = 0.0;
    private String nomeTitular;

//    MÉTODOS QUE REPRESENTAM NOSSOS COMPORTAMENTOS
    public void depositar(Double valorDeposito) {
        if (valorDeposito > 0.0) {
            saldo += valorDeposito;
            System.out.println("Deposito realizado com Sucesso");
        } else {
            System.out.println("Valor Digitado Invalido");
        }
    }

    public void sacar(Double valorSaque) {
        if (valorSaque <= saldo && valorSaque > 0.0) {
            saldo -= valorSaque;
            System.out.println("Saque Realizado");
        } else {
            System.out.println("Valor Digitado Invalido");
        }
    }
    
//    USAMOS "THIS.##" PARA APONTAR QUAL É O ATRIBUTO

    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    
}
