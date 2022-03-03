package com.mycompany.projetojava1sprint;

import java.util.Scanner;

public class Java {

    void menu() {

        Calculo menuUm = new Calculo();
        Segundo menuDois = new Segundo();
        Terceiro menuTres = new Terceiro();
        JogoForca menuJogo = new JogoForca();

        Scanner leitorMenu = new Scanner(System.in);

        System.out.println("1. Calcule uma viagem em anos de luz."
                + "\n2. Conheça cada planetas."
                + "\n3. Historia das constelações"
                + "\n4. Encerre\n"
                + "-".repeat(41)
                + "\n5. Jogo\n"
                + "-".repeat(72));

        Integer opcaoMenu = leitorMenu.nextInt();

        switch (opcaoMenu) {
            case 1:

                menuUm.menuCalculo();

                break;
            case 2:
                
                menuDois.conhecaPlanetas();
                
                break;
            case 3:
                
                menuTres.conhecaCostelacao();
                
                break;
            case 4:
                System.out.println("\n"
                        + "┈┈┈╲┈┈┈┈╱    \n"
                        + "┈┈┈╱ ▔▔ ╲  ╭╮    ~ AAAAh Já vai...\n"
                        + "┈┈┃┈▇┈┈▇┈┃ ┃┃      Bom, sentirei saudades\n"
                        + "╭╮┣━━━━━━┫╱╱       Até mais, nos encontramos\n"
                        + "┃┃┃┈┈┈┈┈┈┃▔        por ai em algum universo! <3\n"
                        + "╰╯┃┈┈┈┈┈┈┃\n"
                        + "┈┈╰┓┏━━┓┏╯\n"
                        + "┈┈┈╰╯┈┈╰╯\n\n"
                );
                break;
            case 5:
                
                menuJogo.jogo();
                
                break;
            default:

                System.out.println("-".repeat(72)
                        + "\n\nEi!Ei! "
                        + "\napenas a opção 1 a 5\n\n");
                menu();

        }

    }

}
