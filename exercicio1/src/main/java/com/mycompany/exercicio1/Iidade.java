/*
Crie uma classe Java chamada “Idade” que: 

Seja executável. 
Solicite que o usuário digite o seu nome. 
Em seguida, o programa deverá exibir a mensagem: 
“Olá, Fulano! Qual o ano de seu nascimento?”.

Depois, o programa deverá exibir: 
“Em 2030 você terá 25 anos” 
(sendo "Fulano" o nome digitado pelo usuário e "xx" a idade do usuário).

Exemplo:
Qual é o seu nome?
Maria

Olá, Maria! Qual o ano de seu nascimento?
1995

Em 2030 você terá 35 anos.
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class Iidade {
    
    public static void main(String[] args) {
        Scanner leitorNome = new Scanner(System.in);
        Scanner leitorAno = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = leitorNome.nextLine();
        
        System.out.println("Olá, " + nome +"! Qual o ano de seu nascimento?");
        Integer ano = leitorAno.nextInt();
        
        Integer somaAno = 2030 - ano;
        
        System.out.println("Em 2030 você terá " + somaAno);
        
    }
}
