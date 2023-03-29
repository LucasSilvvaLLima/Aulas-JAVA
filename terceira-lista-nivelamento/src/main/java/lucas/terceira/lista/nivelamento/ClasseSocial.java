/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lucas.terceira.lista.nivelamento;

/**
 *
 * @author lucka
 */
public class ClasseSocial {

    Double qtdSalariosMinimo(Double salario) {
        Double salarioMinimo = 1045.00;
        Double qtdSalariosMinimo = salario / salarioMinimo;
        return qtdSalariosMinimo;
    }

    String classeSocialUsuario(Double salario) {
        Double qtdSalarioMinimo = qtdSalariosMinimo(salario);
        Boolean classeE = qtdSalarioMinimo <= 2;
        Boolean classeD = qtdSalarioMinimo > 2 && qtdSalarioMinimo <= 4;
        Boolean classeC = qtdSalarioMinimo > 4 && qtdSalarioMinimo <= 10;
        Boolean classeB = qtdSalarioMinimo > 10 && qtdSalarioMinimo <= 20;
        String classeSocial = "";
        if (classeE) {
            classeSocial = "Você pertence a classe social: E.";
        } else if (classeD) {
            classeSocial = "Você pertence a classe social: D";
        } else if (classeC) {
            classeSocial = "Você pertence a classe social: C";
        } else if (classeB) {
            classeSocial = "Você pertence a classe social: B";
        } else {
            classeSocial = "Você pertence a classe social: A";
        }
        return classeSocial;
    }
}
