/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe;

/**
 *
 * @author lucka
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Data eventoSPtecher = new Data(26, "Janeiro", 2023);

        Data inicioFacu = new Data();

        System.out.printf("Data Evento das Empresas: %s", eventoSPtecher.obterDataFormatada());
        System.out.printf("\nData Inicio das aulas: %s", inicioFacu.obterDataFormatada());
    }
}
