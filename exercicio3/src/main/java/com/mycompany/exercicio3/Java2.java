package com.mycompany.exercicio3;

public class Java2 {
    //método D desconto progressivo

    void calcularDesconto(Double valorProduto, Integer quatidadeProduto) {
        Double valorTotal = valorProduto * quatidadeProduto;

        if (quatidadeProduto.equals(1)) {
            Double valorDez = (valorTotal * 0.1);
            Double totalDez = valorTotal - valorDez;
            System.out.println("\nValor com desconto: " + totalDez);
        }
        if (quatidadeProduto.equals(2)) {
            Double valorVinte = (valorTotal * 0.2);
            Double totalVinte = valorTotal - valorVinte;
            System.out.println("\nValor com desconto: " + totalVinte);
        }
        if (quatidadeProduto >= 3) {
            Double valorTrinta = (valorTotal * 0.3);
            Double totalTrinta = valorTotal - valorTrinta;
            System.out.println("\nValor com desconto: " + totalTrinta);
        }
    }

    Double exibirNotaFiscal(Double valorProduto, Integer quatidadeProduto) {
        System.out.println("valor do produto: " + valorProduto
                + "\nQuatidade: " + quatidadeProduto
                + "\n"
                + "-".repeat(30));
        return valorProduto;
    }

    //método E Peso Ideal
    void calculaPesoIdeal(String genero, Double altura) {
        Double totalPesoFeminino = (62.1 * altura) - 44.7;
        Double totalPesoMasculino = (72.7 * altura) - 58;

        if (genero == null) {
            System.out.println("Incorreto, informe "
                    + "\n F - feminino ou"
                    + "\n M - masculino");
        } else {
            switch (genero) {
                case "F":
                    System.out.println(String.format("Seu peso ideal é: %.2f",
                            totalPesoFeminino));
                    break;
                case "M":
                    System.out.println(String.format("Seu peso ideal é: %.2f",
                            totalPesoMasculino));
                    break;
                default:
                    System.out.println("Informe dados valido");
                    break;
            }
        }
    }

    //método F Valor Primo
    void verificarPrimo(Integer verificarValor) {

        for (int i = verificarValor; i <= 100; i++) {
            if (primo(i)) {
                System.out.println(i + " é primo.");
            }
        }
    }

    private static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}
