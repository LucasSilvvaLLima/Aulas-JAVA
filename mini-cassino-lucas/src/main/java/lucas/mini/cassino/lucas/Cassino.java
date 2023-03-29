/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.mini.cassino.lucas;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lucka
 */
public class Cassino {

    Double saldo = 0.0;

    void exibirMenuFormatado() {
        System.out.println("Escolha uma opção do menu:\n"
                + " 1 - Depositar\n"
                + " 2 - Sacar\n"
                + " 3 - Jogar 21\n"
                + " 0 - SAIR");
    }

    void exibirErroDeSaqueValorAlto() {
        System.out.println("Valor maior que o disponivel para saque"
                + "\nSeu saldo disponivel é de R$" + saldo);
    }

    void exibirSaqueSaldo() {
        System.out.println("Saque realizado com sucesso "
                + "\nSeu saldo atual é R$" + saldo);
    }

    Double depositarSaldo(Double valorDepositado) {
        saldo += valorDepositado;
        return saldo;
    }

    Double sacarSaldo(Double valorSacado) {
        if (valorSacado > saldo || saldo == 0.0) {
            exibirErroDeSaqueValorAlto();
            valorSacado = 0.0;
        } else {
            saldo -= valorSacado;
            exibirSaqueSaldo();
        }
        return valorSacado;
    }

    Integer banca() {
        Integer maoMesa = ThreadLocalRandom.current().nextInt(16, 22);
        return maoMesa;
    }

    Double perdeuMao(Double aposta) {
        saldo -= aposta;
        return saldo;
    }
}
