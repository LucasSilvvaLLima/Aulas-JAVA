package lucas.lista.de.exercicios02;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class Votacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer mussarela = 0, calabresa = 0, quatroQueijo = 0;
        System.out.println("Pesquisa PIZZA FAVORITA:");
        System.out.println("Digite 5 p/ Mussarela; "
                + "\nDigite 25 p/ Calabresa; "
                + "\nDigite 50 p/ Quatro Queijos;\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print(String.format("Voto do %d aluno: ", i));
            Integer voto = entrada.nextInt();

            switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijo++;
            }
        }
        
        String maisVotado = "";
        
        if(mussarela > calabresa && mussarela > quatroQueijo){
            maisVotado =  "Mussarela";
        }else if(calabresa > mussarela && calabresa > quatroQueijo){
            maisVotado = "Calabresa";
        }else if(quatroQueijo > mussarela && quatroQueijo > calabresa){
            maisVotado = "Quatro Queijos";
        }else{
            maisVotado = "¨Ouve um empate na votação¨";
        }
        String frase = String.format("\nVotos Calabresa: %d \n"
                + "Votos Mussarela: %d \n"
                + "Votos Quatro Queijos: %d \n"
                + "Sabor mais votado: %s", calabresa, mussarela, quatroQueijo, maisVotado);
        
        System.out.println(frase);
    }

}
