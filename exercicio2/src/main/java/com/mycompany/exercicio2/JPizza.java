/*
 Foi feita uma pesquisa para saber qual o sabor de pizza 
favorito entre os alunos da Faculdade. 

Para votar no sabor mussarela, deve-se digitar o valor 5, 
Para votar no sabor calabresa, deve-se digitar o valor 25, 
Para votar no sabor quatro queijos, deve- se digitar o valor 50. 

Elabore um programa em Java que leia os votos de 10 
alunos diferentes (sem usar vetor) e exiba:

Quantos votos obteve cada sabor.
Qual o sabor favorito segundo a pesquisa.
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

public class JPizza {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("para mussarela 5, para calabresa 25, e quatro"
                + "queijo 50,\n escolha um para votar");

        Integer contadorMussarela = 0;
        Integer contadorCalabresa = 0;
        Integer contadorQuatroQueijos = 0;

        Integer contador = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Escolha seu sabor: ");
            Integer voto = leitor.nextInt();

            if (voto != 5 && voto != 25 && voto != 50) {

                System.out.println("Porfavor insira o numero correto");
                break;
            } else {

                contador++;
                switch (voto) {
                    case 5:
                        contadorMussarela++;
                        break;
                    case 25:
                        contadorCalabresa++;
                        break;
                    case 50:
                        contadorQuatroQueijos++;
                        break;
                    default:
                        break;
                }

            }

        }

        System.out.println(String.format("Votos:"
                + "\n Mussarela - %d"
                + "\n Calabresa - %d"
                + "\n Quatro Queijos - %d \n",
                contadorMussarela, contadorCalabresa, contadorQuatroQueijos));

        if (contadorMussarela > contadorCalabresa && 
                contadorMussarela > contadorQuatroQueijos) {
            
            System.out.println("O sabor de pizza favorito é Mussarela!");
            
        } else if (contadorCalabresa > contadorMussarela && 
                contadorCalabresa > contadorQuatroQueijos) {
            
            System.out.println("O sabor de pizza favorito é Calabresa!");
            
        } else if (contadorQuatroQueijos > contadorMussarela && 
                contadorQuatroQueijos > contadorCalabresa) {
            
            System.out.println("O sabor de pizza favorito é Quatro Queijos!");
            
        }
    }

}
