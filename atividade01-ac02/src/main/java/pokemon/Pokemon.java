/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lucka
 */
public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca = 1.0;
    private Integer doce = 0;

    public Pokemon(String nome, String tipo, Double forca){
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoce() {
        return doce;
    }

    public void setDoce(Integer doce) {
        this.doce = doce;
    }
    
    
}
