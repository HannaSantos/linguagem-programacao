/*
Crie uma classe Java chamada "CalculoMedia" que:

Seja executável
Solicite o nome e duas notas ao usuário.
As notas são números reais.
Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA"
Use Interpolação com 1 casa decimal para a média.
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class HCalculoMedia {

    public static void main(String[] args) {

        Scanner leitorNome = new Scanner(System.in);
        Scanner leitorNotaUm = new Scanner(System.in);
        Scanner leitorNotaDois = new Scanner(System.in);
        Scanner leitorNotaTres = new Scanner(System.in);
        
        System.out.println("Infome seu nome: ");
        String nome = leitorNome.nextLine();
        
        System.out.println("Informe sua primeira nota: ");
        Double notaUm = leitorNotaUm.nextDouble();
        
        System.out.println("Informe sua segunda nota: ");
        Double notaDois = leitorNotaDois.nextDouble();
        
        System.out.println("Informe sua terceira nota: ");
        Double notaTres = leitorNotaTres.nextDouble();
        
        Double somaNotas = notaUm + notaDois + notaTres;
        Double totalNotas = somaNotas / 3;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.2f",
                 nome, totalNotas));

    }
}
