package com.mycompany.aula2;

import java.util.Scanner;

public class NovaCondicao {

    public static void main(String[] args) {

        //jeito padrão de inicial um objeto
        //Scanner
        //Serve para ler nesse caso, o que é
        //digitado no console.
        Scanner leitor = new Scanner(System.in);

        /*
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();
        // leitor vai pegar o que está no console e
        //e trazer pra mim.

        
        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingou...");
                break;
            case 2:
                System.out.println("Segundou...");
                break;
            case 3:
                System.out.println("Terçou...");
                break;
            case 4:
                System.out.println("Quarta...");
                break;
            default:
                System.out.println("numero errado...");
        }
         */
        //switch, pode ser substituido do else if, 
        //trazendo mais visuabilidade ao codigo
        //case roda, break quebra a leitura e vai para o proximo.
        System.out.println("Entre com um número: ");
        Integer numeroEscolhido = leitor.nextInt();

        switch (numeroEscolhido) {
            case 1:
                System.out.println("Ganhou um Iphone 13");
                break;
            case 2:
                System.out.println("Ganhou um ps5");
                break;
            case 3:
                System.out.println("Ganhou um Monza");
                break;
            default:
                System.out.println("Ganhou nada........ :(");

        }

    }

}
