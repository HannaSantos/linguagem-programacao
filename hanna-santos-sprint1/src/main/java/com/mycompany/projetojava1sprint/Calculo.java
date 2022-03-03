package com.mycompany.projetojava1sprint;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculo {

    void menuCalculo() {
        
        Java java = new Java();
        
        DecimalFormat decimalFormat = new DecimalFormat("#,###.###");

        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("\nO ano-luz é uma unidade de distância "
                + "utilizada na astronomia. "
                + "\nUm ano-luz é a distância que a luz percorre, "
                + "no vácuo, durante um ano.\n"
                + "\nVamos calcular uma viagem?"
                + "\nEntre com um valor de 3 a 10: ");
        Integer anoNumero = leitorNumero.nextInt();

        //numero de segundo por ano
        Integer valorSegundoAno = anoNumero * 31556952;
        // velocidade da luz no vácuo
        Double valorQuilometro = valorSegundoAno * 299792.458;
        
        String numberFormatado = decimalFormat.format(valorQuilometro);

        if (anoNumero >= 11) {

            System.out.println("-".repeat(72)
                    + "\nEsse valor é extremamente longe,"
                    + "\nnem a nasa explorou ainda ='(\n"
                            + "-".repeat(72));
            menuCalculo();

        }
        if (anoNumero <= 2) {

            System.out.println("-".repeat(72)
                    + "\nEsse valor é muito perto da terra,"
                    + "\nnão tem muita coisa interresante :T\n"
                            + "-".repeat(72));
            menuCalculo();

        } else {

            System.out.println(String.format("-".repeat(72)
                    + "\n%s trilhões de quilômetros, "
                    + "longe heim\n"
                    + "-".repeat(72),
                    numberFormatado));
            java.menu();

        }

    }

}
