package lucas.segundo.projeto.nivelamento;

public class Interpolacao {

    public static void main(String[] args) {
        String nome = "Xampson";
        Integer idade = 42;
        Double altura = 1.75;
        
        String frase = String.format("Meu nome %s, tenho %d anos e %.2f de altura", nome, idade, altura);
        
        System.out.println(frase);
    }
    
}
