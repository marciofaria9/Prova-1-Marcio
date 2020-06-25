package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int contadorNegativo = 0;
		
		
		do { 
			System.out.println("Digite um número:");
			float numero = leitura.nextFloat();
			
			if (numero < 0) {
				contadorNegativo++;
			}
			
				else if ( numero == 0) {
					break;
					
			}
									
			
   		} while (true);
		
		System.out.println("Foram digitados " + contadorNegativo + " números negativos!");
				
							
		leitura.close();
	}

}
