/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.petshop;

/**
 *
 * @author lucka
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitasAoPetShop;
    private Double valorGastoEmPetShop;
    
    public Pet(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitasAoPetShop = 0;
        this.valorGastoEmPetShop = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitasAoPetShop() {
        return qtdVisitasAoPetShop;
    }

    public void setQtdVisitasAoPetShop(Integer qtdVisitasAoPetShop) {
        this.qtdVisitasAoPetShop = qtdVisitasAoPetShop;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }


    
    @Override
    public String toString() {
        String fraseFormatada = String.format("Pet: \n"
                + "Nome: %s \n"
                + "Raça: %s \n"
                + "Quantidade de Visitas: %d \n"
                + "Valor Gasto pelo Pet: %.2f \n", nome, raca, qtdVisitasAoPetShop, valorGastoEmPetShop);
        
        return fraseFormatada;
    }
}
