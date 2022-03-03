package com.mycompany.projetojava1sprint;

import java.util.Scanner;

public class JogoForca {

    void jogo() {

        System.out.println("\n"
                + "┈┈┈╲┈┈┈┈╱    \n"
                + "┈┈┈╱ ▔▔ ╲  ╭╮    ~ Vamooos jogaaaaar joga da forcaaa...\n"
                + "┈┈┃┈▇┈┈▇┈┃ ┃┃      Bom, eu quero que vc adivinhe\n"
                + "╭╮┣━━━━━━┫╱╱       o planeta que não foi batizado\n"
                + "┃┃┃┈┈┈┈┈┈┃▔        com nome de Deuses...\n"
                + "╰╯┃┈┈┈┈┈┈┃         Essa é facil vai, \n"
                + "┈┈╰┓┏━━┓┏╯         até virei um astro por lá hahahah :)\n"
                + "┈┈┈╰╯┈┈╰╯\n\n"
        );

        resultados();

    }

    static String palavra[] = {"t", "e", "r", "r", "a"};

    void resultados() {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorOpcao = new Scanner(System.in);
        
        Java java = new Java();

        int forca = 1, vencer = 0, perder = 0, contador = 0;

        String letraEscolhida, letrasDigitadas[] = new String[100];

        while (forca == 1) {

            System.out.println("Digite uma letra: ");
            letraEscolhida = leitor.next();

            letrasDigitadas[contador] = letraEscolhida;
            contador++;

            if (!letraEscolhida.equals("t")
                    && !letraEscolhida.equals("e")
                    && !letraEscolhida.equals("r")
                    && !letraEscolhida.equals("r")
                    && !letraEscolhida.equals("a")) {

                System.out.println("\n~ Ixi, Letra errada!\n"
                        + "-".repeat(72));
                perder++;

                if (perder == 5) {

                    System.out.println("\n~ AAAA, Acabou a chance :(\n"
                            + "Quer tentar novamente?\n"
                            + "0. Sim\n"
                            + "(Qualquer número). Não\n"
                            + "-".repeat(72));
                    Integer opcaoSelecionada = leitorOpcao.nextInt();
                    
                    if (opcaoSelecionada.equals(0)) {
                        jogo();
                    }else{
                        java.menu();
                    }

                }
            } else {

                System.out.println("\n~ Letra correta! :D\n"
                        + "-".repeat(72));
                vencer++;

                if (vencer == 5) {

                    System.out.println("\n~ Viu, não era tão dificil hahah <3\n");
                    java.menu();

                }
            }
        }

    }

}
