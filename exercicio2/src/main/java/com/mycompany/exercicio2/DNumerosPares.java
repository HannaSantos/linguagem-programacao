/*
 Crie uma classe chamada “NúmerosPares” que: 

Exiba todos os números pares de 0 a 40 usando while
 */
package com.mycompany.exercicio2;

public class DNumerosPares {

    public static void main(String[] args) {
        
        Integer contador = 0;
        
        System.out.println("Numeros pares: ");
        
        while (contador < 40) {
            contador ++;
            
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
        
    }
}
