//Exercicio 1, dia 2: Escreva um algoritmo que armazene o valor 99 em uma vari�vel Y e o valor 11 em uma vari�vel Z. A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o valor que est� em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas vari�veis.

package com.campinastech;

public class ExercicioUm {  
	public static void main(String args[]) { 
	int y = 99;
    int z = 11;
    
    System.out.println("o valor �nicial de Y � : " + y);
    System.out.println("o valor �nicial de Z � : " + z);
    
    int x = 0;
    x = y;
    y = z;
    z = x;
    
    System.out.println("o valor final de Y � : " + y);
    System.out.println("o valor final de Z � : " + z);
  } 
}