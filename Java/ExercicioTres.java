//Exerc�cio 3, dia 2: Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.

package com.campinastech;

import java.util.Scanner;

public class ExercicioTres {
	
public static void main(String args[]) {
	        
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a base do ret�ngulo:");
    int base = entrada.nextInt();

    System.out.println("Digite a altura do ret�ngulo");
    int altura = entrada.nextInt();
    int area = base * altura;
    System.out.println("A �rea do ret�ngulo �: " + area);

    entrada.close();
    }
}
