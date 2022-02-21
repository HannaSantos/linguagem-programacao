/*
Crie uma classe Java chamada “Elevador” que:

Seja executável.
Solicite ao usuário o limite de peso de um elevador (número real).
Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real).
Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real).
Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real). 
Ao final, exiba uma frase assim: 

"Entraram 3 pessoas no elevador, no qual cabem X pessoas.
O peso total no elevador é de Y, sendo que ele suporta Z".

(onde X é o 2º valor lido no programa, 
Z o 1º e Y é a soma dos pesos das 3 pessoas)
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class GElevador {

    public static void main(String[] args) {

        Scanner leitorPeso = new Scanner(System.in);
        Scanner leitorPessoa = new Scanner(System.in);
        Scanner leitorPesoUm = new Scanner(System.in);
        Scanner leitorPesoDois = new Scanner(System.in);
        Scanner leitorPesoTres = new Scanner(System.in);

        System.out.println("Informe o peso do limite do elevador: ");
        Double limitePeso = leitorPeso.nextDouble();

        System.out.println("Informe o limite de pessoas no elevador: ");
        Integer limitePessoa = leitorPessoa.nextInt();

        System.out.println("Informe o peso da primeira pessoa: ");
        Double primeiraPessoa = leitorPesoUm.nextDouble();

        System.out.println("Informe o peso da segunda pessoa: ");
        Double segundaPessoa = leitorPesoDois.nextDouble();

        System.out.println("Informe o peso da terceira pessoa: ");
        Double terceiraPessoa = leitorPesoTres.nextDouble();

        Double totalPeso = primeiraPessoa + segundaPessoa + terceiraPessoa;

        System.out.println("\nEntraram 3 pessoas no elevador, "
                + "\nno qual cabem " + limitePessoa + " pessoas."
                + "\nO peso total no elevador é de " + totalPeso + ", "
                + "\nsendo que ele suporta " + limitePeso);

    }
}
