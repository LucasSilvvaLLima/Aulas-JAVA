package lucas.segundo.projeto.nivelamento;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
//        O usuario digita um número e eu mostro o dia da semana equivalente
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um n°");
        Integer diaSemana = entrada.nextInt();
        
        switch (diaSemana) {
            case 1:
                System.out.println("Segundou!");
                break;
            case 2:
                System.out.println("Terçou");
                break;
            case 3:
                System.out.println("Quartou");
                break;
            case 4:
                System.out.println("Quintou");
                break;
            case 5:
                System.out.println("Sextou");
            default:
                System.out.println("Dia inválido");
        }
    }

}
