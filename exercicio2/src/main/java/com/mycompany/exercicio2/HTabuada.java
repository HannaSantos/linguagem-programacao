/*
 Crie uma classe chamada “Tabuada” que:

Solicite um número para o usuário.
Exiba a tabuada correspondente ao número digitado.
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

public class HTabuada {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escolha o número da tabuada: ");
        Integer numeroEscolhido = leitor.nextInt();
        
        for (int i = 0; i < 10; i++) {
            
           Integer resultado = numeroEscolhido * i;
           
            System.out.println(numeroEscolhido + "x" 
                              + i + " = " + resultado);
            
        }
    }
}
