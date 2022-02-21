/*
Crie uma classe Java chamada “Calculadora” que: 

Seja executável (possui o método main).
Solicite um número para o usuário(número real).
Solicite outro número para o usuário(número real).

Calcule e exiba a soma dos dois números digitados.
Calcule e exiba a subtração do primeiro número pelo segundo.
Calcule e exiba a multiplicação do primeiro número pelo segundo.
Calcule e exiba a divisão do primeiro número pelo segundo. 

Exemplo:  
Digite um número: 10
Digite outro número: 4

Resultado da soma: 14.0
Resultado da subtração: 6.0
Resultado da multiplicação: 40.0
Resultado da divisão: 2.5
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class ECalculadora {

    public static void main(String[] args) {

        Scanner leitorPrimeiroNumero = new Scanner(System.in);
        Scanner leitorSegundoNumero = new Scanner(System.in);

        System.out.println("Selecione um número: ");
        Double primeiroNumero = leitorPrimeiroNumero.nextDouble();

        System.out.println("Selecione mais um número: ");
        Double segundoNumero = leitorSegundoNumero.nextDouble();

        Double soma = primeiroNumero + segundoNumero;
        Double subtracao = primeiroNumero - segundoNumero;
        Double multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = primeiroNumero / segundoNumero;

        System.out.println("Resultado da soma: " + soma
                + "\nResultado da subtração: " + subtracao
                + "\nResultado da multiplicação: " + multiplicacao
                + "\nResultado da divisão: " + divisao);

    }

}
