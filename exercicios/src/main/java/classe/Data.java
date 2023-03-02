/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author lucka
 */
public class Data {

    int dia;
    String mes;
    int ano;
    String diaFormatado = "";
    String dataFormatada = "";

    Data() {
//        OBJETO ATUAL 
//        dia = 1;
//        mes = "Janeiro";
//        ano = 1970;
//        THIS() É USADO PARA CHAMAR UM CONSTRUTOR DENTRO DE OUTRO CONSTRUTOR.
          this(1, "Janeiro", 1970);
    }

    Data(int dia, String mes, int ano) {
//     ESSE THIS ESTA SENDO USADO PARA REFERENCIAR O OBJETO ATUAL 
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        if (dia <= 9) {
            diaFormatado = "0" + dia;
            dataFormatada = diaFormatado + "/" + mes + "/" + ano;
        } else {
            dataFormatada = dia + "/" + mes + "/" + ano;
        }
        return dataFormatada;
    }
}