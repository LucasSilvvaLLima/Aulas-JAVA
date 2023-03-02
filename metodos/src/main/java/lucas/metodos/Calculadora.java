package lucas.metodos;

public class Calculadora {

    // evitar colocar print do retorno dentro do próprio método
    // isso pode fazer eu esquecer de usar o retorno aonde vc chamou ele.
    Integer somar(Integer numero1, Integer numero2) {
        Integer resultado = numero1 + numero2;
        return resultado;
    }

    Integer subtrair(Integer numero1, Integer numero2) {
        Integer resultado = numero1 - numero2;
        return resultado;
    }

    Integer multplicar(Integer numero1, Integer numero2) {
        Integer resultado = numero1 * numero2;
        return resultado;
    }

    Double dividir(Double numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        return resultado;
    }

    Boolean isPar(Double numeroVerificar) {

        Boolean isPar = numeroVerificar % 2 == 0;
        return isPar;

//        assim tbm funciona
//        return numeroVerificar % 2 == 0;
    }
    
    Integer somar(Integer numero1, Integer numero2, Integer numero3){
        Integer resultado = numero1 + numero2 + numero3;
        return resultado;
    }
    
    
}
