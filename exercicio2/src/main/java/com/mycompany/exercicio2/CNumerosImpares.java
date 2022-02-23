/*
Crie uma classe chamada “NúmerosImpares” que: 

Usando “for”, exiba todos os números ímpares entre 0 e 90.
 */
package com.mycompany.exercicio2;

public class CNumerosImpares {
   
    public static void main(String[] args) {
        
        System.out.println("Números Impares: ");
        
        for (int i = 0; i < 90; i++) {
           
            if (i % 2 != 0) {
                System.out.println(i);
            }
           
        }
    }
}
