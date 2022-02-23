/*
Elaborar um programa java que simule a autenticação de um usuário em um sistema. 
Solicite o nome de usuário e senha.

Enquanto o nome for diferente de “admin” e a senha for 
diferente de “#Bandtec” exiba: “Login e/ou senha inválidos” e 
solicite novamente.

Caso o usuário digite os campos corretamente, 
exiba: “Login realizado com sucesso”
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

public class BAutenticacao {

    public static void main(String[] args) {

        Scanner leitorUsuario = new Scanner(System.in);
        Scanner leitorSenha = new Scanner(System.in);
        
        String usuarioPadrao = "hanna";
        String senhaPadrao = "euFui";

        System.out.println("Entre com seu usuario: ");
        String usuario = leitorUsuario.nextLine();

        System.out.println("Entre com sua senha: ");
        String senha = leitorSenha.nextLine();
        
        while (senha.equals(senhaPadrao) && usuario.equals(usuarioPadrao)) {            
           System.out.println(usuario + " opa, bem vindo ao acesso");
            senha = leitorSenha.nextLine();
        }
        System.out.println("Pô cara, "
                    + "a senha ou usuario ta errado, tenta novamente: ");

    }

}

