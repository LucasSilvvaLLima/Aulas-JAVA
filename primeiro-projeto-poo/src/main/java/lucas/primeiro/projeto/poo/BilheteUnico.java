package lucas.primeiro.projeto.poo;

public class BilheteUnico {

    // Atributos = Caracteristicas
    String nomeTitular;
    Double saldo;
    Boolean possuiMeiaEntrada;

    // Recarregar e exibe o valor recarregado e saldo
    void recarregar(Double valorRecarga) {
        if (valorRecarga > 0) {
            saldo += valorRecarga;
            System.out.println(String.format("%s, você recarregou R$%.2f e seu saldo agora é R$%.2f",
                    nomeTitular, valorRecarga, saldo));
        } else {
            System.out.println("Valor negativo");
        }
    }

    void usar() {
        if (possuiMeiaEntrada && saldo >= 2.20) {
            saldo -= 2.20;
        } else if (saldo >= 4.40) {
            saldo -= 4.40;
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo: " + saldo);
    }
}
