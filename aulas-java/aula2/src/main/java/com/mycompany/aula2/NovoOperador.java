package com.mycompany.aula2;

public class NovoOperador {
    
    public static void main(String[] args) {
        
        String name = "Hanna Santos";
        Boolean isTatuadora = true;
        
       String resultado;
        
        if (isTatuadora) {
              resultado = "É tatuadora";
        } else {
            resultado = "Não é tatuadora";
        }
        
        resultado = isTatuadora ? "sim" : "não";
            // use esse ao invés do if e else,
            // funciona do mesmo jeito
    }
    
}
