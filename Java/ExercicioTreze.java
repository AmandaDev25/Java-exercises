// Exerc�cio 3, dia 4: Construa um algoritmo usando uma estrutura de repeti��o que calcule o fatorial de um n�mero.

package com.campinastech;

import java.util.Scanner;

public class ExercicioTreze {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o n�mero que voc� deseja saber o fatorial: ");
    int numero = entrada.nextInt();
    int resultado = 1;

    while (numero > 1) {
        resultado = resultado * numero;
        numero--;
    }

    System.out.println(resultado);

    entrada.close();
  }
}