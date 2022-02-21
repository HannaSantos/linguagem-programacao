/*
Crie uma classe Java que ajude Chicó a saber quanto será seu salário líquido.
A classe deve ser executável

O programa solicita o salário bruto

O programa calcula o desconto do INSS, 
que é sempre de 10% sobre o bruto

O programa calcula o desconto de IR, 
que é sempre de 20% sobre o bruto

O programa pergunta quanto custa a condução 
diária só de ida da casa para o trabalho. 

O desconto de VT é sempre o que o usuário gasta. 
Assim, calcula-se assim: Valor de condução ida x 2 x 22.

Calcule o salário líquido, que é o bruto 
menos os descontos de INSS, IR e VT

Exiba, usando interpolação e com os valores numéricos com 2 casas decimais, 
uma frase como esta: 
"Seu salário bruto é R$A, tem um total de R$B em 
descontos e receberá um líquido de R$C"
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class FSalarioINSS {

    public static void main(String[] args) {

        Scanner leitorSalario = new Scanner(System.in);
        Scanner leitorConducao = new Scanner(System.in);

        System.out.println("Informe seu salário bruto: ");
        Double salario = leitorSalario.nextDouble();

        System.out.println("Informe o valor da condução: ");
        Double conducao = leitorConducao.nextDouble();

        Double inss = (salario * 10) / 100;
        Double ir = (salario * 20) / 100;
        Double vt = (conducao * 2) * 22;

        Double desconto = inss + ir + vt;
        Double liquido = salario - desconto;

        System.out.println("Seu salário bruto é R$ " + salario
                + "\n tem um total de R$ " + desconto
                + " em descontos \n  e receberá um líquido de R$"
                + liquido);
    }

}
