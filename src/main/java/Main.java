import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Exercicio01 exercicio01 = new Exercicio01();
        Exercicio02 exercicio02 = new Exercicio02();

        exercicio01.executar(input);
        exercicio02.executar(input);
    }
}



