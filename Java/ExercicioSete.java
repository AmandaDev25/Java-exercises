//Exerc�cio 3, dia 3: Escreva um algoritmo em Java que leia dois n�meros inteiros e determine qual � o menor. Escreva um algoritmo que determina o maior tamb�m.

package com.campinastech;

import java.util.Scanner;

public class ExercicioSete {

    public static void main(String args[]) {
	        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o primeiro valor: ");
    int n1 = entrada.nextInt();

    System.out.println("Digite o segundo valor: ");
    int n2 = entrada.nextInt();
    
    if (n1 < n2) {
        System.out.println("O valor " + n1 + " � o menor e o " + n2 + " � o maior");
    } else if (n1 > n2) {
    	System.out.println("O valor " + n1 + " � o maior e o " + n2 + " � o menor");
    } else {
        System.out.println("Os valores digitados s�o iguais");
    }

    entrada.close();
    }
}
