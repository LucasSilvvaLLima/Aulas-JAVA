/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package controle.estimativa;

/**
 *
 * @author lucka
 */
public class Atividade {

    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados) {
        if (diasUsados > 0) {
            this.diasUsados = diasUsados;
        } else {
            System.out.println("ERRO: VALOR INVALIDO");
        }
    }

    public void exibirRelatorio() {
        Integer diasRealmenteUsados = diasUsados - diasEstimados;
        Boolean atrasado = diasUsados > diasEstimados;
        Boolean adiantado = diasUsados < diasEstimados;
        String fraseFormatada;
        if (diasUsados == 0) {
            fraseFormatada = "****VALOR DE DIAS USADOS MENOR QUE 0****\n";
        } else if (atrasado) {
            fraseFormatada = String.format(""
                    + "Você estimou %d dias, mas a tarefa foi feita "
                    + "em %d dias (%d dias a mais que o estimado)."
                    + "Melhore a estimativa. \n", diasEstimados, diasUsados, diasRealmenteUsados);
        } else if (adiantado) {
            diasRealmenteUsados = diasEstimados - diasUsados;
            fraseFormatada = String.format(""
                    + "Você estimou %d dias, mas a tarefa foi feita "
                    + "em %d dias (%d dias a menos que o estimado)."
                    + "Parabéns.\n", diasEstimados, diasUsados, diasRealmenteUsados);
        } else {
            fraseFormatada = String.format(""
                    + "Você estimou %d dias, mas a tarefa foi feita "
                    + "em %d dias atendendo a estimativa com precisão\n",
                    diasEstimados, diasUsados);
        }

        System.out.println(fraseFormatada);
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    @Override
    public String toString() {
        String fraseFormatada = "";
        if (diasUsados > 0) {
            fraseFormatada = String.format("Atividade: \n"
                    + "Nome Atividade: %s \n"
                    + "Responsavel: %s \n"
                    + "Dias Estimados: %d \n"
                    + "Dias Usados: %d\n"
                    , nomeAtividade, responsavel, diasEstimados, diasUsados);
        }else{
            fraseFormatada = String.format("Atividade: \n"
                    + "Nome Atividade: %s \n"
                    + "Responsavel: %s \n"
                    + "Dias Estimados: %d \n"
                    + "Dias Usados: Atividade em andamento\n"
                    , nomeAtividade, responsavel, diasEstimados);
        }
        return fraseFormatada;
    }

}
