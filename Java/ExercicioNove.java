//Exerc�cio 5, dia 3: Escreva um algoritmo em Java que seja capaz de fazer as seguintes opera��es matem�ticas (adi��o, subtra��o, multiplica��o e divis�o). Todas as opera��es ser�o entre dois valores. No come�o do algoritmo pergunte ao usu�rio qual opera��o ele deseja fazer e quais s�o os valores.
// a, s, m, d

package com.campinastech;

import java.util.Scanner;

public class ExercicioNove {

public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

  System.out.println("Digite uma opera��o: a > adi��o, s > subtra��o, m > multiplica��o, ou d > divis�o:");
  String operacao = entrada.next();

  System.out.println("Digite um n�mero:");
  int valor1 = entrada.nextInt();

  System.out.println("Digite outro n�mero:");
  int valor2 = entrada.nextInt();


  switch(operacao) {
    case "a":
      int soma = valor1 + valor2;
      System.out.println("A soma entre os n�meros �: " + soma);
      break;
    case "s":
      int subtracao = valor1 - valor2;
      System.out.println("A subtra��o entre os n�meros �: " + subtracao);
      break;
    case "m":
      int multiplicacao = valor1 * valor2;
      System.out.println("A multiplica��o entre os n�meros �: " + multiplicacao);
      break;
    case "d":
      if (valor2 == 0) {
        System.out.println("N�o se pode dividir por 0");
      } else {
        double divisao = valor1 / (double) valor2;
        System.out.println("A divis�o entre os n�meros �: " + divisao);
      }
      break;
    default:
      System.out.println("Opera��o n�o encontrada");
  	}
  	entrada.close();
	}
}