/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lucas.mini.cassino.lucas;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lucka
 */
public class TesteCassino {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cassino objCassino = new Cassino();
        Integer opcao = 0;
        Integer pediuCarta = 0;
        Integer maoUsuario = 0;
        Integer maoBanca = 0;

        Double saldoAtual = 0.0;
        do {
            objCassino.exibirMenuFormatado();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor a ser depositado na sua conta:");
                    Double valor = entrada.nextDouble();
                    objCassino.depositarSaldo(valor);

                    System.out.println("Seu saldo para aposta agora é de " + objCassino.saldo);
                    break;
                case 2:
                    System.out.println("Insira o valor a ser sacado na sua conta");
                    Double valorSaque = entrada.nextDouble();
                    objCassino.sacarSaldo(valorSaque);
                    break;
                case 3:
                    System.out.println("Insira o valor da aposta: ");
                    Double aposta = entrada.nextDouble();
                    do {
                        System.out.println("Sua mão é " + maoUsuario);
                        System.out.println("Deseja pegar mais cartas?(Digite 1 para sim, ou qualquer tecla para sair)");
                        pediuCarta = entrada.nextInt();
                        Integer carta = ThreadLocalRandom.current().nextInt(1, 12);
                        System.out.println("Sua carta foi " + carta);
                        maoUsuario += carta;
                    } while (!pediuCarta.equals(1) || maoUsuario > 21);
                    maoBanca = objCassino.banca();
                    if (maoUsuario > 21 || maoBanca.equals(21)) {
                        saldoAtual = objCassino.perdeuMao(aposta);
                        System.out.println("Voce perdeu saldo atual " + saldoAtual);
                    }
                    break;
                case 0:
                    System.out.println("FIM");
                    break;
                default:
                    if (opcao > 3) {
                        System.out.println("Opção invalida");
                    }
            }
        } while (!opcao.equals(0));

    }
}
