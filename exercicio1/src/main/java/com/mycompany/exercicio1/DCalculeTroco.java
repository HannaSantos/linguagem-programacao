/*
Crie uma classe  Java chamada “CalculadoraTroco” que:

Seja executável.
Solicite o valor unitário de um produto.
Solicite a quantidade vendida.
Solicite o valor pago pelo cliente.
Calcule e exiba o troco com a seguinte frase: 
"Seu troco será de R$ X", 
onde "X" é o valor a ser devolvido ao cliente.
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class DCalculeTroco {
    
    public static void main(String[] args) {
        
        Scanner leitorUnitario = new Scanner(System.in);
        Scanner leitorQuantidade = new Scanner(System.in);
        Scanner leitorPago = new Scanner(System.in);
        
        System.out.println("Valor unitário do produto: ");
        Double produto = leitorUnitario.nextDouble();
        
        System.out.println("Quatidade de produto: ");
        Integer quatidade = leitorQuantidade.nextInt();
        
        System.out.println("Valor pago: ");
        Double pago = leitorPago.nextDouble();
        
        Double valorTotal = produto * quatidade;
        Double valorTroco = pago - valorTotal;
        
        System.out.println("Seu troco será de R$" +
                            valorTroco);
       
    }
}
