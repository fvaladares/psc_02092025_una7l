import java.util.Scanner;

// E-mail do coordenador: marcelo.ventura@animaeducacao.com.br

public class Exercicio03 {

    /*
    TODO Nõa permita que a pessoa informe idade negativa ou \
     nula; Se isso acontecer, informe que os dados são inválidos.
     */
    public void executar(Scanner input) {
        int idadeEmAnos;
        int idadeEmMeses;
        int mesesPorAno = 12;

        System.out.println("PROGRAMA PARA CONVERTER " +
                "IDADE EM ANOS EM IDADE EM MESES");
        System.out.println();

        System.out.print("Informe sua idade em anos: ");
        idadeEmAnos = input.nextInt();

        idadeEmMeses = idadeEmAnos * mesesPorAno;

        System.out.println();

        // %d - Inteiro; %f - Ponto flutuante
        System.out.printf("Você tem %d meses de idade\n",
                idadeEmMeses);

        System.out.println("FIM DO PROGRAMA");
    }
}
