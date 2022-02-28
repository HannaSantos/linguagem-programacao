/*
Escreva o método classificaIdade (que não retorna nada) que recebe uma 
idade e imprime uma mensagem conforme a faixa etária à qual pertence a 
idade conforme regra abaixo:

0 a 2 anos - “Bebê”
3 a 11 anos - “Criança”
12 a 19 anos - “Adolescente”
20 a 30 anos - “Jovem”
31 a 60 anos - “Adulto”
acima de 60 anos - “Idoso”.

Escreva o método main que solicita que o usuário digite a sua idade, 
e que chama esse método, para testá-lo.
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

public class CClassificacao {
    
    public static void main(String[] args) {
        
        Java java = new Java();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Solicita a sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
        java.classificaIdade(idadeDigitada);
    }
    
}
