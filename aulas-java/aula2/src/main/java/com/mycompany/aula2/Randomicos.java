
package com.mycompany.aula2;

import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    
    public static void main(String[] args){
        
       Integer numeroGerado = 
        ThreadLocalRandom.current().nextInt(0, 101);
        
        System.out.println("Numero gerado: " + 
                numeroGerado);
    }
}
