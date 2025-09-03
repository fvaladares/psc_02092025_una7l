import java.util.Scanner;

public class Exercicio02 {

    public void executar(Scanner input) {
        double valorReal;
        double valorDolar = 4.95; // declaração e inicialização de variável
        double valorConvertido;

        System.out.println("Coversor de Real para Dolar");

        System.out.println();
        System.out.print("Informe o valor R$ ");

        valorReal = input.nextDouble();
        if (valorReal > 0) {
            valorConvertido = valorReal * valorDolar;

            System.out.println();

            System.out.printf("R$%.2f = US$%.2f", valorReal, valorConvertido);

            System.out.println();
        } else {
            System.out.println("Você deve informar um valor positivo não nulo.");
        }
    }
}
