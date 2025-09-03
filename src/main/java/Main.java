import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double valorReal;
        double valorDolar = 4.95; // declaração e inicialização de variável
        double valorConvertido;

        Scanner in = new Scanner(System.in);

        System.out.println("Coversor de Real para Dolar");

        System.out.println();
        System.out.print("Informe o valor R$ ");

        valorReal = in.nextDouble();
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



