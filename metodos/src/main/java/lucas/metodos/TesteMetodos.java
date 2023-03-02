package lucas.metodos;

public class TesteMetodos {

    public static void main(String[] args) {
        
        // Para utilizar os metodos das nossas classes precisamos criar objetos ou seja fazer uma instância.
        
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        
        
        String nome1 = "Xampson";
        String nome2 = "Lorena"; 
        
        util.exibirNomeFormatado(nome2);
        util.exibirNomeFormatado("Xampson");

        Integer resultadoSoma = calc.somar(10, 32);
        System.out.println("Soma: 10 + 32 = " + resultadoSoma);
 
        Integer resultadoSubtracao = calc.subtrair(10, 32);
        System.out.println("Subtração: 10 - 32 = " + resultadoSubtracao);
        
        Integer resultadoMultiplicar = calc.multplicar(10, 32);
        System.out.println("Multiplicação: 10 x 32 = " + resultadoMultiplicar);
        
        Double resultadoDividir = calc.dividir(10.0, 30.0);
        System.out.println(String.format("Divisão: 10 / 32 = %.3f", resultadoDividir));
        
    }
}
 