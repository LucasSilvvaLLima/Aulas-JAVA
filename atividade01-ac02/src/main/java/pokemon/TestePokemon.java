/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

/**
 *
 * @author lucka
 */
public class TestePokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pokemon pokemon01 = new Pokemon("Pikachu", "Eletrico", 10.0);
//        pokemon01.setNome("Pikachu");
//        pokemon01.setForca(10.0);
//        pokemon01.setTipo("Eletrico");

        Pokemon pokemon02 = new Pokemon("Charmander", "Fogo", 8.0);
//        pokemon02.setNome("Charmander");
//        pokemon02.setForca(8.0);
//        pokemon02.setTipo("Fogo");
//        
        TreinadorPokemon treinador01 = new TreinadorPokemon("Ashy");
//        treinador01.setNome("Lucas");

        treinador01.treinarPokemon(pokemon01);
        treinador01.treinarPokemon(pokemon01);
        treinador01.treinarPokemon(pokemon01);
        treinador01.treinarPokemon(pokemon01);
        treinador01.treinarPokemon(pokemon01);

        treinador01.treinarPokemon(pokemon02);
        treinador01.treinarPokemon(pokemon02);

        System.out.println(String.format("Pokemon: %s \nForça: %.2f \nTipo: %s \nDoces: %d \n",
                pokemon01.getNome(), pokemon01.getForca(), pokemon01.getTipo(), pokemon01.getDoce()));

        treinador01.evoluirPokemon(pokemon01, "Raichu");

        System.out.println(String.format("Pokemon: %s \nForça: %.2f \nTipo: %s \nDoces: %d \n",
                pokemon01.getNome(), pokemon01.getForca(), pokemon01.getTipo(), pokemon01.getDoce()));

        System.out.println(String.format("Pokemon: %s \nForça: %.2f \nTipo: %s \nDoces: %d \n",
                pokemon02.getNome(), pokemon02.getForca(), pokemon02.getTipo(), pokemon02.getDoce()));

        treinador01.evoluirPokemon(pokemon02, "Charmilion");

        System.out.println(String.format("Status Treinador:\n"
                + "Nome: %s \nNivel: %d", treinador01.getNome(), treinador01.getNivel()));
    }

}
