//Exerc�cio 1, dia 3: Escreva um algoritmo que leia um n�mero inteiro e diga se ele � par ou �mpar.

package com.campinastech;

import java.util.Scanner;

public class ExercicioCinco {

public static void main(String args[]) {
    
	Scanner entrada = new Scanner(System.in);
    
	System.out.println("Digite um n�mero para saber se � par ou �mpar:");
    int numero = entrada.nextInt();

    if (numero % 2 == 0) {
        System.out.println("O n�mero " + numero + " � par!");
    } else {
        System.out.println("O n�mero " + numero + " � �mpar!");
    } 
    entrada.close();
	}
}




