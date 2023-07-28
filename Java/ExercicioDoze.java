/*Exerc�cio 2, dia 4: Construa um algoritmo que leia 10 valores inteiros e positivos e:
Encontre o maior valor
Encontre o menor valor
Calcule a m�dia dos n�meros lidos Esse exerc�cio foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.*/

//FOR

package com.campinastech;

import java.util.Scanner;

public class ExercicioDoze {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int soma = 0;

    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;

    for (int i = 1; i <= 10; i++) {
        System.out.printf("Digite o " + i + "� n�mero: ");
        int valor = entrada.nextInt();

        if (valor > maior) {
            maior = valor;
        }

        if (valor < menor) {
            menor = valor;
        }

        soma += valor;
    }

    System.out.println("O maior n�mero �: " + maior);
    System.out.println("O menor n�mero �: " + menor);
    System.out.print("A m�dia dos valores �: " + soma / 10);

    entrada.close();
	}
}