package lucas.lista.de.exercicios02;
/**
 *
 * @author lucka
 */
public class ContadorVariado {
    public static void main(String[] args) {
        for(double i = 0.15; i < 5.0; i+= 0.15){
            System.out.println(String.format("%.2f;", i));
        }
    }    
}
