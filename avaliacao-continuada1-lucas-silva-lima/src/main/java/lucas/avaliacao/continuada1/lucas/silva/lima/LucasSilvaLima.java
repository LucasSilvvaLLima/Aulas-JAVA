/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lucas.avaliacao.continuada1.lucas.silva.lima;

import java.util.Scanner;

/**
 *
 * @author lucka
 */
public class LucasSilvaLima {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer opcaoMenu = 0;
        Double valorDepositado = 0.0, saldoBancario = 0.0, valorDoSaque = 0.0;
        Double simulacaoFinanceira = 0.0;
        do {
            System.out.println(""
                    + "--------------------------------------\n"
                    + "|    SPtech  Investimentos           |\n"
                    + "--------------------------------------\n"
                    + "|    Olá, o que deseja fazer:        |\n"
                    + "--------------------------------------\n"
                    + "| 1 - Depositar                      |\n"
                    + "| 2 - Sacar                          |\n"
                    + "| 3 - Simular Rendimentos            |\n"
                    + "| 0 - Sair                           |\n"
                    + "--------------------------------------");
            opcaoMenu = entrada.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Insira o valor que sera depositado na sua conta:");
                    valorDepositado = entrada.nextDouble();
                    while (valorDepositado < 0) {
                        System.out.println("VALOR INVALIDO, INSIRA UM VALOR POSITIVO");
                        valorDepositado = entrada.nextDouble();
                    }
                    saldoBancario += valorDepositado;
                    System.out.println(String.format("Depósito realizado - Saldo atual: R$%.2f\n", saldoBancario));
                    break;
                case 2:
                    System.out.println("Digite o valor do Saque:");
                    valorDoSaque = entrada.nextDouble();
                    while (valorDoSaque > saldoBancario || valorDoSaque < 0) {
                        if (valorDoSaque > saldoBancario) {
                            System.out.println(String.format("Saldo indisponivel, o seu saldo atual é de %.2f", saldoBancario));
                            valorDoSaque = entrada.nextDouble();
                        } else {
                            System.out.println("VALOR INVALIDO, INSIRA UM VALOR POSITIVO");
                            valorDoSaque = entrada.nextDouble();
                        }
                    }
                    saldoBancario -= valorDoSaque;
                    System.out.println(String.format("Saque realizado - Saldo atual: R$%.2f\n", saldoBancario));
                    break;
                case 3:
                    if (saldoBancario == 0.0) {
                        System.out.println("Saldo Zerado, opção inválida.");
                    } else {
                        simulacaoFinanceira = saldoBancario;
                        System.out.println(String.format("Saldo atual: R$%.2f", saldoBancario));
                        for (int i = 1; i <= 12; i++) {
                            simulacaoFinanceira *= 1.1;
                            System.out.println(String.format(""
                                    + "--------------------------------------\n"
                                    + "| Mês %d | Saldo: R$%.2f             |\n"
                                    + "--------------------------------------\n", i, simulacaoFinanceira));
                        }
                    }
                    break;
                default:
//                    if (opcaoMenu > 3) {
                        System.out.println("Opção invalida");
//                    }
            }
        } while (!opcaoMenu.equals(0));
        System.out.println("SPtech Investimentos FINALIZADO COM SUCESSO");
    }
}
