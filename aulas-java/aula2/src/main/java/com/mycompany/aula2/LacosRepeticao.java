package com.mycompany.aula2;

public class LacosRepeticao {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Numero, %d", i));
        }
        
        for (int i = 0; i > 0; i--) {
            System.out.println(String.format("Numero, %d", i));
        }

    }

}
