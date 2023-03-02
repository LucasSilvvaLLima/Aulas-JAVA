/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade02.ac01;

/**
 *
 * @author lucka
 */
public class Idade {

    void classificaIdade(Integer idade) {
        Boolean validaBebe = idade >= 0 && idade <= 2;
        Boolean validaCrianca = idade > 2 && idade <= 11;
        Boolean validaAdolescente = idade > 11 && idade <= 19;
        Boolean validaJovem = idade > 20 && idade <= 30;
        Boolean validaAdulto = idade > 30 && idade <= 60;

        if (validaBebe) {
            System.out.println("Bebê");
        } else if (validaCrianca) {
            System.out.println("Criança");
        } else if (validaAdolescente) {
            System.out.println("Adolescente");
        } else if (validaJovem) {
            System.out.println("Jovem");
        } else if (validaAdulto) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");

        }
    }
}
