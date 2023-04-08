/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.petshop;

/**
 *
 * @author lucka
 */
public class PetShop {

    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    public void darBanho(Pet pet, Double valor) {
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);
        faturamentoTotal += valor;
        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
    }

    public void darBanho(Pet pet, Double valor, Double desconto) {
        Double valorComDesconto = valor - (valor * (desconto / 100));
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valorComDesconto);
        faturamentoTotal += valorComDesconto;
        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("PetShop: \n"
                + "Nome: %s \n"
                + "Faturamento Total: %.2f \n", nome, faturamentoTotal);
        
        return fraseFormatada;
    }

}
