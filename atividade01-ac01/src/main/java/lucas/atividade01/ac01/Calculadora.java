package lucas.atividade01.ac01;

import java.util.Scanner;

/**
 * @author lucka
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer operacaoDesejada = 0, primeiroValor = 0, segundoValor = 0, resultado = 0;
        Double primeiroValorDouble = 0.0, segundoValorDouble = 0.0, resultadoDouble = 0.0;
        String enunciado = "", tabuada = "";
        do {
            System.out.println("\n  Digite o número correspondente a operação desejada: \n"
                    + "1 - Soma \n"
                    + "2 - Multiplicação \n"
                    + "3 - Divisão \n"
                    + "4 - Subtração \n"
                    + "5 - Potência \n"
                    + "6 - Resto \n"
                    + "0 – Sair");
            operacaoDesejada = entrada.nextInt();

            switch (operacaoDesejada) {
                case 0:
                    break;
                case 1:
                    System.out.print("Digite um número inteiro p/ SOMAR: ");
                    enunciado = "%d + %d = %d";
                    primeiroValor = entrada.nextInt();
                    break;
                case 2:
                    System.out.print("Digite um número inteiro p/ MULTIPLICAR: ");
                    enunciado = "%d x %d = %d";
                    primeiroValor = entrada.nextInt();
                    break;
                case 3:
                    System.out.print("Digite um número inteiro p/ DIVIDIR: ");
                    enunciado = "%.2f / %.2f = %.2f";
                    primeiroValorDouble = entrada.nextDouble();
                    break;
                case 4:
                    System.out.print("Digite um número inteiro / SUBTRAIR: ");
                    enunciado = "%d - %d = %d";
                    primeiroValor = entrada.nextInt();
                    break;
                case 5:
                    System.out.print("Digite um número inteiro p/ obter a POTÊNCIA: ");
                    enunciado = "%d elevado a %d = %d";
                    primeiroValor = entrada.nextInt();
                    resultado = primeiroValor;
                    break;
                case 6:
                    System.out.print("Digite um número inteiro p/ obter o RESTO da divisão: ");
                    enunciado = "%d dividido por %d sobra %d";
                    primeiroValor = entrada.nextInt();
                    break;
                default:
                    System.out.println("\nOPÇÃO INVALIDA, TENTE NOVAMENTE");
            }
            
            if (operacaoDesejada.equals(0)) {
                System.out.println("Até logo!");
            } else if (operacaoDesejada <= 6) {

                for (int i = 1; i <= 10; i++) {
                    segundoValor = i;
                    segundoValorDouble = i + 0.0;
                    switch (operacaoDesejada) {
                        case 1:
                            resultado = primeiroValor + segundoValor;
                            break;
                        case 2:
                            resultado = primeiroValor * segundoValor;
                            break;
                        case 3:
                            resultadoDouble = primeiroValorDouble / segundoValorDouble;
                            break;
                        case 4:
                            resultado = primeiroValor - segundoValor;
                            break;
                        case 6:
                            resultado = primeiroValor % segundoValor;
                            break;
                        default:
                            break;
                    }
                    
                    if (!operacaoDesejada.equals(3)) {
                        tabuada = String.format(enunciado, primeiroValor, segundoValor, resultado);
                        resultado = primeiroValor * resultado;
                    } else {
                        tabuada = String.format(enunciado, primeiroValorDouble, segundoValorDouble, resultadoDouble);
                    }
                    System.out.println(tabuada);
                }
            }
        } while (!operacaoDesejada.equals(0));
    }
}
