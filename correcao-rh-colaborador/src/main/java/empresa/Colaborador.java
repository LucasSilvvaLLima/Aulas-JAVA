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
public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    // Construtor:
    // SEMPRE public
    // NUNCA possui retorno especificado
    public Colaborador(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Colaborador(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String fraseFormatada = String.format("Colaborador: \n"
                + "nome: %s; \n"
                + "Cargo: %s;\n"
                + "Salário: %.2f \n", nome, cargo, salario);
        return fraseFormatada;
    }
    
    
}
