/*
Um supermercado criou promoção onde comprando 
1 produto o desconto será de 10%, 
2 produtos 20% e 
3 ou mais produtos 30%. 

Para implementar o calculo da promoção no sistema de caixa, crie uma 
classe chamada “DescontoProgressivo”, que:

Solite o valor unitário de um determinado produto e a quantidade .

Contenha um método chamado calcularDesconto, que recebe o valor e 
quantidade, e retorna o valor final com desconto.

Contenha um método chamado exibirNotaFiscal, que possui o seguinte retorno. 

Exemplo de saída no console:

"Bem vindo ao sistema de desconto progressivo!

Digite o valor unitário do produto:
20
Digite a quantidade:
2

valor do produto R$ 20
Quatidade: 2

Valor com desconto: R$ 32,00"
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

public class DDescontoProgressivo {
    
    public static void main(String[] args) {
        
        Java2 java = new Java2();
        
        Scanner leitorValor = new Scanner(System.in);
        Scanner leitorQtd = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema de desconto progressivo!");
        
        System.out.println("Digite o valor unitario do produto: ");
        Double valorDigitado = leitorValor.nextDouble();
        
        System.out.println("Digite a quantidade de produto: ");
        Integer quatidadeDigitada = leitorQtd.nextInt();
        
        java.exibirNotaFiscal(valorDigitado, quatidadeDigitada);
        java.calcularDesconto(valorDigitado, quatidadeDigitada);
        
    }
    
}
