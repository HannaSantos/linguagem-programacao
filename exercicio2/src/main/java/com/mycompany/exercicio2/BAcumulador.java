/*
 Criar uma classe chamada “Acumulador” que :

Leia vários números até ler o número 0 e calcule a soma dos números lidos.
     (Não é para usar vetor).

 */
package com.mycompany.exercicio2;

import java.util.Scanner;

public class BAcumulador {
    
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        
        Integer soma = 0;
        Integer numeroDigitado;
        
        do {            
        System.out.println("Insira um número:");
            numeroDigitado = leitor.nextInt();
            soma = soma + numeroDigitado;
            
        } while (numeroDigitado != 0);
        System.out.println(String.format("A soma dos números lidos é de: %d", 
                soma));
    }
    
}
