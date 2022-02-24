/*
 Crie uma classe chamada “ContadorVariado” que: 

Usando for, começe exibindo o valor 0.15 e depois 0.30, 
depois 0.45, depois 0.60... ou seja, aumente de 0.15 em 0.15 a 
cada iteração até que o último número seja menor que 5. 

Use interpolação p/ exibir o número com 2 casas decimais
 */
package com.mycompany.exercicio2;

public class IContadorVariado {

    public static void main(String[] args) {

        for (double i = 0; i < 5; i += 0.15) {
            System.out.println(String.format("%.2f", i));

        }

    }

}
