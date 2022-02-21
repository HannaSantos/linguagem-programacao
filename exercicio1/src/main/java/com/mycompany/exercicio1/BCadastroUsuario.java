/*
Crie uma classe Java chamada "CadastroUsuario" que:
Seja executável
Solicite o login do cliente
Solicite a senha do cliente

Solicite a quantidade de vezes que o usuário aceita 
errar a senha antes do bloqueio

Exiba uma frase como esta: 
"Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado" 
Use interpolação
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

public class BCadastroUsuario {
    
    public static void main(String[] args) {
         
        Scanner leitorLogin = new Scanner(System.in);
        Scanner leitorSenha = new Scanner(System.in);
        Scanner leitorTentativas = new Scanner(System.in);
        
        System.out.println("Digite seu Login:");
        String login = leitorLogin.nextLine();
        
        System.out.println("Informe uma senha: ");
        String senha = leitorSenha.nextLine();
        
        System.out.println("Solicite a quantidade de tentativa de acesso: ");
        Integer tentativas = leitorTentativas.nextInt();
        
        System.out.println("Seu login é " + login
                + " e sua senha é " + senha
                        + ". Você tem " + tentativas
                                + " tentativas antes de ser bloqueado");
    }
    
}
