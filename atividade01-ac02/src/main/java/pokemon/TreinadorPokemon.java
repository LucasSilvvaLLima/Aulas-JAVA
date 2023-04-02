/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lucka
 */
public class TreinadorPokemon {
    private String nome;
    private Integer nivel = 0;

    public TreinadorPokemon(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoce(pokemon.getDoce() + 10);
        nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if(pokemon.getDoce() >= 50){
            System.out.println(String.format("Pokémon %s evoluiu para -> %s",
                    pokemon.getNome(), nomeEvolucao));
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoce(pokemon.getDoce() - 50);
            nivel += 10;
        }else{
            System.out.println("Não foi possível realizar operação");
        }
    }
}
