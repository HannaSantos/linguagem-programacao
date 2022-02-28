/*
Crie uma classe Java e escreva um método chamado calcularMedia, 
que recebe duas notas e retorna a média das notas, como é calculada a 
média da Faculdade Bandtec (nota1 * 0.4 + nota2 * 0.6). 

No método main, solicite que o usuário digite 2 notas, chame o método 
calcularMedia passando as notas digitadas como argumento e exiba o valor 
retornado pelo método. 
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

public class ACalculoMedia {
    
    public static void main(String[] args) {
        
        Java java = new Java();
        
        Scanner leitorNota1 = new Scanner(System.in);
        Scanner leitorNota2 = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
        Double nota1Digitada = leitorNota1.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        Double nota2Digitada = leitorNota2.nextDouble();
        
        java.calcularMedia(nota1Digitada, nota2Digitada);
        
    }
    
}
