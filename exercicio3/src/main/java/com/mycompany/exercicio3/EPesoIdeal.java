/*
Escreva o método calculaPesoIdeal, que recebe o sexo (caractere ‘M’ ou ‘F’) 
e a altura de uma pessoa (em metros). 

Este método deverá calcular e exibir o peso ideal dessa pessoa. 

Escreva também o método main, que solicita que o usuário digite os 
valores correspondentes a pessoas diferentes e chame o método calculaPesoIdeal 
para exibir o peso ideal de cada uma delas. 

A fórmula para calcular o peso ideal é:

Para mulheres: (62.1 * altura) – 44.7
Para homens: (72.7 * altura) - 58
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

public class EPesoIdeal {
     
    public static void main(String[] args) {
        
        Java2 java = new Java2();
        
        Scanner leitorGenero = new Scanner(System.in);
        Scanner leitorAltura = new Scanner(System.in);
        
        System.out.println("Informe seu genero: ");
        String generoDigitado = leitorGenero.nextLine();
        
        System.out.println("Informe sua altura: ");
        Double alturaDigitado = leitorAltura.nextDouble();
        
        java.calculaPesoIdeal(generoDigitado, alturaDigitado);
        
    }
    
}
