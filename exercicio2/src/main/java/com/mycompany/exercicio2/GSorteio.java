/*
Crie uma classe chamada “Sorteio” que: 

Solicite um número de 1 a 100.

Realize 200 sorteios. 

Ao final, exibir:

Quando o número foi sorteado (pela 1ª vez, apresente o número do sorteio).
Quantos números pares foram sorteados.
Quantos números ímpares foram sorteados.
 */
package com.mycompany.exercicio2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GSorteio {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número de 1 a 100: ");
        Integer numeroDigitado = leitor.nextInt();
        
        Integer numero = 0;
        Integer numeroPar = 0;
        Integer numeroImpar = 0;
            
            for (int i = 0; i < 201; i++) {
                numero = ThreadLocalRandom.current().nextInt(1, 101);
                
                if (i == numeroDigitado) {
                    System.out.println("num sorteado " + numero);
                    
                    for (int j = 1; j <= numero; j++) {
                        if ( (j % 2) == 0) {
                        ++numeroPar;
                    }else {
                            ++numeroImpar;
                        }
                    }
                }
            }
        
        System.out.println(numeroPar);
        System.out.println(numeroImpar);
        
    }
}
