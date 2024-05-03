package aulas;

import java.util.Scanner;

public class NewLoop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Deixe sua avaliação ou digite -1 pra encerrrar. ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            totalDeNotas++;
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
        }
    }
