package lucas.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

public class NumeroAleatorio {

    public static void main(String[] args) {
        
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Numero aleatório " + numeroAleatorio);
    }
    
}
