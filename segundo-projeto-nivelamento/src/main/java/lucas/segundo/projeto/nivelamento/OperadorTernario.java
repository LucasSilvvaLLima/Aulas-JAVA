package lucas.segundo.projeto.nivelamento;

public class OperadorTernario {

    public static void main(String[] args) {
        Boolean bloqueado = true;
        
        String frase;
        
//        if(bloqueado){
//            frase = "Bloqueado";
//        }else{
//            frase = "Desbloqueado";
//        }

        frase = bloqueado ? "Bloqueado" : "Desbloqueado";
//        TAMBÉM DA PRA USAR COM OUTROS TIPOS
//        CENARIO: Se o salário for maior que 1000.0
//          o bônus é de 0.15, se for menor que 1000.0
//          o bônus é de 0.10

        Double bonus = 0.0;
        Double salario = 1075.50;
        
        bonus = salario >= 1000.0 ? 0.15 : 0.10;
        System.out.println(String.format("O bônus é de %.2f", bonus));
    }
    
}
