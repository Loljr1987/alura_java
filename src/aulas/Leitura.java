package aulas;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme predileto?: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?: ");

        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação pro filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);


    }
}
