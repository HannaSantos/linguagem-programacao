package com.mycompany.exercicio3;

public class Java {

    // método A Calculo Media:
    void calcularMedia(Double nota1, Double nota2) {

        Double soma = (nota1 * 0.4 + nota2 * 0.6);
        System.out.println("Sua nota é: " + soma);
    }

    // método C Classificação:
    void classificaIdade(Integer idade) {
        if (idade <= 2) {
            System.out.println("Bebê");
        }
        if (idade >= 3 && idade <= 11) {
            System.out.println("Criança");
        }
        if (idade >= 12 && idade <= 19) {
            System.out.println("Adolecente");
        }
        if (idade >= 20 && idade <= 30) {
            System.out.println("Jovem");
        }
        if (idade >= 31 && idade <= 60) {
            System.out.println("Adulto");
        }
        if (idade >= 61) {
            System.out.println("Idoso");
        } 
    }

}
    