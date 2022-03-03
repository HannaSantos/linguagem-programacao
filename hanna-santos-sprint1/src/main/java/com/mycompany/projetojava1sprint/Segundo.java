package com.mycompany.projetojava1sprint;

import java.util.Scanner;

public class Segundo {

    void conhecaPlanetas() {

        System.out.println("\n\n"
                + "               ~ Eu sou um E.T. Bilu\n"
                + "                 bora conhecer o seu sitema solar!\n"
                + "┈┈┈╲┈┈┈┈╱    ___ Escolha uns desse planetas,\n"
                + "┈┈┈╱ ▔▔ ╲   /    que mostra na tela:\n"
                + "┈┈┃┈▇┈┈▇┈┃ /\n"
                + "╭╮┣━━━━━━┫╭╮\n"
                + "┃┃┃┈┈┈┈┈┈┃┃┃\n"
                + "╰╯┃┈┈┈┈┈┈┃╰╯\n"
                + "┈┈╰┓┏━━┓┏╯\n"
                + "┈┈┈╰╯┈┈╰╯\n\n"
        );

        planeta();

    }

    void planeta() {

        Java java = new Java();
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("\n0. Para voltar ao menu\n"
                + "1. Mercúrio\n"
                + "2. Vênus\n"
                + "3. Terra\n"
                + "-".repeat(72));
        Integer numeroEscolhido = leitorNumero.nextInt();

        if (numeroEscolhido >= 4) {

            System.out.println("\n~ Poxa cara, escolha o número válido!");
            planeta();

        }if(numeroEscolhido.equals(0)){
            
            System.out.println("-".repeat(72));
            java.menu();
            
        }
        if (numeroEscolhido.equals(1)) {

            System.out.println("\n"
                    + "      ____ Mercúrio\n"
                    + "               ~ O planeta mais próximo do Sol.\n"
                    + "                 Ele é capaz de refletir cerca de 12% da\n"
                    + "┈┈┈╲┈┈┈┈╱    ___luz solar,sendo um dos astros mais brilhantes\n"
                    + "┈┈┈╱ ▔▔ ╲   /   vistos da Terra. Sua superfície é repleta\n"
                    + "┈┈┃┈▇┈┈▇┈┃ /    de crateras, enquanto seu núcleo é\n"
                    + "╭╮┣━━━━━━┫╭╮    rico em ferro, A temperatura do planeta\n"
                    + "┃┃┃┈┈┈┈┈┈┃┃┃    durante o dia atinge 430ºC\n"
                    + "╰╯┃┈┈┈┈┈┈┃╰╯    CREDOOO, nunca vou por lá, se na terra\n"
                    + "┈┈╰┓┏━━┓┏╯      é calor imagina lá, seloko heim... :(\n"
                    + "┈┈┈╰╯┈┈╰╯\n\n");
            
            planeta();

        }
        if(numeroEscolhido.equals(2)){
            
            System.out.println("\n"
                    + "      ____ Vênus\n"
                    + "               ~Conhecido também como Estrela D'alva,\n"
                    + "                por ser uns dos astros mais brilhantes no céu.\n"
                    + "┈┈┈╲┈┈┈┈╱    ___Possui uma atmosfera 92 vezes mais densa\n"
                    + "┈┈┈╱ ▔▔ ╲   /   que a atmosfera terrestre, estando o planeta\n"
                    + "┈┈┃┈▇┈┈▇┈┃ /    quase sempre envolto por nuvens\n"
                    + "╭╮┣━━━━━━┫╭╮    HMM, Ainda acho muito calor,\n"
                    + "┃┃┃┈┈┈┈┈┈┃┃┃    será que da pra viajar?\n"
                    + "╰╯┃┈┈┈┈┈┈┃╰╯\n"
                    + "┈┈╰┓┏━━┓┏╯\n"
                    + "┈┈┈╰╯┈┈╰╯\n\n");
            
            planeta();
            
        }
        if (numeroEscolhido.equals(3)) {
            
            System.out.println("\n"
                    + "      ____ Terra\n"
                    + "               ~AAh o planeta que mais se difere dos demais,\n"
                    + "                que permitem a existência de vida.\n"
                    + "┈┈┈╲┈┈┈┈╱    ___A atmosfera terrestre é atualmente\n"
                    + "┈┈┈╱ ▔▔ ╲   /   composta por gases como nitrôgenio,\n"
                    + "┈┈┃┈▇┈┈▇┈┃ /    oxigênio, gás carbônico e vapor d'água.\n"
                    + "╭╮┣━━━━━━┫╭╮    Possui um satélite natural, a Lua, \n"
                    + "┃┃┃┈┈┈┈┈┈┃┃┃    com rotação sincronizada à da Terra.\n"
                    + "╰╯┃┈┈┈┈┈┈┃╰╯    Já passei por lá, e os humanos enloqueceu\n"
                    + "┈┈╰┓┏━━┓┏╯      Apareci até na TV ! hahaha \n"
                    + "┈┈┈╰╯┈┈╰╯\n\n");
            
            planeta();
            
        }

    }

}
