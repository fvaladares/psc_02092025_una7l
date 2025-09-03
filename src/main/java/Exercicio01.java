import java.util.Scanner;

public class Exercicio01 {
    public void executar(Scanner input) {
        int x;
        int y;
        int resto;

        System.out.println("Programa para calcular o resto da" +
                " divisão de inteiros");
        System.out.println();

        System.out.print("Informe o primeiro número: ");
        x = input.nextInt();

        System.out.println();
        System.out.print("Informe o segundo número: ");
        y = input.nextInt();

        //calculando o resto da divisão de inteiros
        resto = x % y;
        System.out.println();
        System.out.println("O resto da divisão de  " + x
                + " por " + y + " é " + resto);
    }
}
