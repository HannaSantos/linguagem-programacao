package com.mycompany.projetojava1sprint;

import java.util.Scanner;

public class Terceiro {

    void conhecaCostelacao() {

        System.out.println("\n"
                + " ~ Ue, vc denovo       ┈┈┈╲┈┈┈┈╱\n"
                + " AiAi, agora quer ╲___ ┈┈┈╱ ▔▔ ╲\n"
                + "conhecer as costelação ┈┈┃┈▇┈┈▇┈┃\n"
                + "vamos lá...            ╭╮┣━━━━━━┫╭╮\n"
                + "                       ┃┃┃┈┈┈┈┈┈┃┃┃\n"
        );

        costelacao();

    }

    void costelacao() {

        Java java = new Java();
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("\n0. Para voltar ao menu\n"
                + "1. Constelação de Órion\n"
                + "2. Constelação de Gift (escolha essa, é mais legal)\n"
                + "3. Constelação de Plêiades\n"
                + "-".repeat(72));
        Integer numeroEscolhido = leitorNumero.nextInt();

        if (numeroEscolhido >= 4) {

            System.out.println("\n~ Ixi mano, escolha o número válido!");
            costelacao();

        }
        if (numeroEscolhido.equals(0)) {

            System.out.println("-".repeat(72));
            java.menu();

        }
        if (numeroEscolhido.equals(1)) {

            System.out.println("\n"
                    + "Constelação de Órion\n"
                    + " ~Aqui no Brasil vemos claramente as Três Marias, ┈┈┈╲┈┈┈┈╱\n"
                    + "Ele era um gigante caçador, filho de Poseidon,╲___┈┈┈╱ ▔▔ ╲\n"
                    + "que deu de presente ao filho o poder              ┈┈┃┈▇┈┈▇┈┃\n"
                    + "de andar sob as águas.                            ╭╮┣━━━━━━┫╭╮\n"
                    + "Queria eu ter meu nome em uma costelação :(       ┃┃┃┈┈┈┈┈┈┃┃┃\n"
            );

            costelacao();

        }
        if (numeroEscolhido.equals(2)) {

            System.out.println("\n"
                    + "Constelação que não existe\n"
                    + " ~KKK essa não existe      ┈┈┈╲┈┈┈┈╱\n"
                    + "pode voltar, obrigada  ╲___┈┈┈╱ ▔▔ ╲\n"
                    + "por obedecer!              ┈┈┃┈▇┈┈▇┈┃\n"
                    + "<3 <3                      ╭╮┣━━━━━━┫╭╮\n"
                    + "                           ┃┃┃┈┈┈┈┈┈┃┃┃\n"
            );

            costelacao();

        }
        if (numeroEscolhido.equals(3)) {

            System.out.println("\n"
                    + "Constelação de Plêiades\n"
                    + "~Também filhas de Pleione e Atlas, Plêiades,   ┈┈┈╲┈┈┈┈╱\n"
                    + "eram sete irmãs por quem Órion também      ╲___┈┈┈╱ ▔▔ ╲\n"
                    + "se apaixonou.Por muitos anos o gigante as      ┈┈┃┈▇┈┈▇┈┃\n"
                    + "perseguiu e tentou conquistá-las a todo custo, ╭╮┣━━━━━━┫╭╮\n"
                    + "Zeus trasformou em pombas para que voasse longe┃┃┃┈┈┈┈┈┈┃┃┃\n"
                    + "Essas Historias dramaticas de Deuseeees!!"
            );

            costelacao();

        }
    }
}
