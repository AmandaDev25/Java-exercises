//Exerc�cio 4, dia 2: Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos.Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores.

package com.campinastech;

import java.util.Scanner;

public class ExercicioQuatro {
	
public static double percentual(double eleitores, double total) {

    double percentual = total * 100 / eleitores;
    return percentual;

}

public static void main(String args[]) {

	Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o total de votos");
    int votos = entrada.nextInt();
    System.out.println("Digite o total de votos em branco");
    int brancos = entrada.nextInt();
    System.out.println("Digite o total de votos nulos");
    int nulos = entrada.nextInt();
    System.out.println("Digite o total de votos validos");
    int validos = entrada.nextInt();

    System.out.println("A quantidade total de votos �: " + votos);
    System.out.println("A quantidade total de votos em branco �: " + brancos);
    System.out.println("A quantidade total de votos nulos �: " + nulos);
    System.out.println("A quantidade total de votos validos �: " + validos);

    double pbrancos = votos * 100 / brancos;
    double pnulos = votos * 100 / nulos;
    double pvalidos = votos * 100 / validos;
    
    System.out.println("O percentual total de votos em branco �: " + pbrancos + "%");
    System.out.println("O percentual total de votos nulos �: " + pnulos + "%");
    System.out.println("O percentual total de votos validos �: " + pvalidos + "%");

    entrada.close();
    }
}