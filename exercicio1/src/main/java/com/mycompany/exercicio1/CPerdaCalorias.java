/*
Chicó começou a se exercitar e deseja saber quantas calorias vai perder nos exercícios.
Crie uma classe Java que:
Seja executável

Solicite ao usuário o tempo, em minutos (valor inteiro) 
que ele passou se aquecendo.

Solicite ao usuário o tempo em minutos (valor inteiro) 
que ele fez exercícios aeróbicos (correr, andar, pedalar etc).

Solicite ao usuário o tempo em minutos (valor inteiro) 
que ele fez exercícios de musculação.

Calcule quantas calorias o Jorge perdeu, sendo que: 
*cada minuto de aquecimento faz perder 12 calorias * 
*cada minuto de ex aeróbico faz perder 20 calorias * 
*cada minuto de musculação faz perder 25 calorias *

Exiba, usando interpolação e apenas valores numéricos inteiros, 
uma frase como esta: 
"Olá, Jorge. Você fez um total de X minutos de exercícios e 
perdeu cerca de Y calorias".
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class CPerdaCalorias {

    public static void main(String[] args) {

        Scanner leitorAquecimento = new Scanner(System.in);
        Scanner leitorAerobico = new Scanner(System.in);
        Scanner leitorMusculacao = new Scanner(System.in);

        System.out.println("Informe quanto minutos você passou se aquecendo: ");
        Integer aquecimento = leitorAquecimento.nextInt();

        System.out.println("Informe quanto minutos você passou no aeróbico: ");
        Integer aerobico = leitorAerobico.nextInt();

        System.out.println("Informe quanto minutos você passou "
                + "fazendo musculação: ");
        Integer musculacao = leitorMusculacao.nextInt();

        Integer minutoAquecimento = 12 * aquecimento;
        Integer minutoAerobico = 20 * aerobico;
        Integer minutoMusculacao = 25 * musculacao;

        Integer totalMinuto = aquecimento + aerobico + musculacao;
        Integer totalCaloria = minutoAquecimento + minutoAerobico + 
                               minutoMusculacao;

        System.out.println("Olá, Jorge. Você fez um total de " + totalMinuto
                + " minutos de exercícios e perdeu cerca de " + totalCaloria
                + " calorias");

    }

}
