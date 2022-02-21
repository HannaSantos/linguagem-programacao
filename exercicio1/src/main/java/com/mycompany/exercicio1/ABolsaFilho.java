//No país “Quisito” existe um benefício social chamado "Bolsa Filhos".
//Crie uma classe Java que:
//Solicite ao usuário quantos filhos de 0 a 3 anos possui.
//Solicite ao usuário quantos filhos de 4 a 16 anos possui.
//Solicite ao usuário quantos filhos de 17 a 18 anos possui.

//Calcule o valor da Bolsa, sendo que o governo paga:
//* R$25,12 por filhos com menos de 4 anos 
//* R$15,88 por filhos entre 4 e 16 anos 
//* R$12,44 por filhos entre 17 e 18 anos

//Exiba uma frase como esta: 
//"Você tem um total de T filhos e vai receber R$B de bolsa" 
//Use interpolação com 2 casas decimais para o valor da bolsa

package com.mycompany.exercicio1;

import java.util.Scanner;

public class ABolsaFilho {

    public static void main(String[] args) {

        Scanner leitorMenorQuatro = new Scanner(System.in);
        Scanner leitorMenorDezesseis = new Scanner(System.in);
        Scanner leitorMenorDezoito = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos possui?");
        Integer zeroATres = leitorMenorQuatro.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos possui?");
        Integer quatroADezesseis = leitorMenorDezesseis.nextInt();

        System.out.println("Quantos filhos de 17 e 18 anos possui?");
        Integer dezesseteADezoito = leitorMenorDezoito.nextInt();

        Double menorQuatro = 25.12 * zeroATres;
        Double menorDezesseis = 15.88 * quatroADezesseis;
        Double menorDezoito = 12.44 * dezesseteADezoito;

        Integer totalFilho = zeroATres + quatroADezesseis + dezesseteADezoito;

        Double totalValor = menorDezesseis + menorDezoito + menorQuatro;

        System.out.println(String.format("Você tem um total de %d "
                + "filhos e vai receber R$%.2f de bolsa",
                totalFilho, totalValor));

    }

}
