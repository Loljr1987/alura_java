package Desafios;

import java.util.Random;

import java.util.Scanner;


public class Primeiro {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
            int tentativas = 0;
            int numeroDigitado = 0;

            while (tentativas < 5) {
                System.out.print("Digite um número entre 0 e 100: ");
                numeroDigitado = leitor.nextInt();
                tentativas++;

                if (numeroDigitado == numeroGerado) {
                    System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                    break; // interrompe o loop while
                } else if (numeroDigitado < numeroGerado) {
                    System.out.println("Tá frio...");
                } else {
                    System.out.println("Tá esquentando...");
                }
            }

            if (tentativas == 5 && numeroDigitado != numeroGerado) {
                System.out.println("Tu não conseguiu acertar o número nas primeiras 5 tentativas. O número era: "
                        + numeroGerado);
            }
        }
    }
