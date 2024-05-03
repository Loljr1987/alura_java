package aulas;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos mais curtidos!");
        } else {
            System.out.println("Filme retrô que deve ser assistido");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Precisa pagar a locação!");
        }
    }
}
