package com.mycompany.exercicio2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha um número de 0 a 10: ");
        Integer numeroEscolhido = leitor.nextInt();
        Integer numeroGerado = ThreadLocalRandom.current().nextInt(0, 11);

        Integer contador = 1;

        while (numeroEscolhido != numeroGerado) {
            System.out.println("Errou digite outro");
            numeroEscolhido = leitor.nextInt();
            contador++;
        }

        switch (contador) {
            case 4:
                System.out.println("Você é MUITO sortudo, "
                        + contador + " Tentativas");
                break;
            case 5:
                System.out.println("Você é sortudo, "
                        + contador + " Tentativas");
                break;
            case 6:
                System.out.println("Você é sortudo, "
                        + contador + " Tentativas");
                break;
            case 7:
                System.out.println("Você é sortudo, "
                        + contador + " Tentativas");
                break;
            case 8:
                System.out.println("Você é sortudo, "
                        + contador + " Tentativas");
                break;
            case 9:
                System.out.println("Você é sortudo, "
                        + contador + " Tentativas");
                break;
            case 10:
                System.out.println("Você é sortudo, "
                        + contador + " Tentativas");
                break;
            default:
                System.out.println("É melhor você parar de apostar e ir");

        }
    }

}
