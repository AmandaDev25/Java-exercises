/*Exerc�cio 4, dia 3: Construa um algoritmo que leia 10 valores inteiros e positivos e:
Encontre o maior valor
Encontre o menor valor
Calcule a m�dia dos n�meros lidos*/

package com.campinastech;

import java.util.Scanner;

public class ExercicioOito {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int soma = 0;

    System.out.println("Insira o 1� n�mero:");
    int valor = entrada.nextInt();
    int menor = valor;
    int maior = valor;
    soma += valor;

    System.out.println("Insira o 2� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 3� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 4� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 5� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 6� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 7� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 8� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 9� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 10� n�mero:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("O maior valor �: " + maior);
    System.out.println("O menor valor �: " + menor);
    System.out.print("A m�dia �: " + soma / 10);

    entrada.close();
    }
}
