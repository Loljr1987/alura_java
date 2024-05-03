package Desafios;

import java.util.Scanner;

public class Terceiro {

    public static void main(String[] args) {

        String nome = "Lucivaldo Junior";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("\n*************************************");

        String menu = """
                ** Digite a opção desejada **
                1 - Consultar saldo.
                2 - Transferir valor.
                3 - Depositar valor.
                4 - Sair.
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual: " + saldo);
            } else if (opcao == 2 ){
                System.out.println("Qual valor deseja tranferir?: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não hja saldo suficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo Atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
