//Exerc�cio 6, dia 3: Fa�a a implementa��o do Jogo Pedra, Papel e Tesoura (Jokemp�). O algoritmo dever� perguntar qual � a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e dever� fazer o mesmo para o jogador 2. No final da execu��o o algoritmo dever� dizer qual � o jogador vencedor ou se houve empate.

package com.campinastech;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
	        
	Scanner entrada = new Scanner(System.in);
	        
	System.out.println("Bem vindo ao jogo de pedra, papel e tesoura!\n");       
	
	System.out.println("Digite o nome do primeiro jogador: \n");
	String nome1 = entrada.nextLine();
	        
	System.out.println("Agora digite o nome do segundo jogador: \n");        
	String nome2 = entrada.nextLine();
	        
	System.out.println(nome1 + ", Digite 'r' para pedra, 'p' para papel ou 's' para tesoura: \n");
	String jogada1 = entrada.nextLine();    
	System.out.println("Agora sua vez " + nome2 + " digite 'r' para pedra, 'p' para papel ou 's' para tesoura: \n");
	String jogada2 = entrada.nextLine();
	
	String resultado = jogada1+jogada2;
	        
    switch(resultado){
    case "rr":            
	System.out.println("Empatou! tente outra vez.");  
	break;
	case "rp":
	System.out.println(nome2 + " venceu!");
	break;
	case "rs":
	System.out.println(nome1 + " venceu!");  
	break;
	case "pr":
	System.out.println(nome1 + " venceu!");  
	break;
	case "pp":      
	System.out.println("Empatou! tente outra vez.");
	break;
	case "ps":      
	System.out.println(nome2 + " venceu!");  
	break;
	case "sr":
	System.out.println(nome2 + " venceu!");  
	break;
	case "sp":
	System.out.println(nome1 + " venceu!");
	break;
	case "ss":
	System.out.println("Empatou! tente outra vez.");
	break;
	} 
	entrada.close();    
	}
}