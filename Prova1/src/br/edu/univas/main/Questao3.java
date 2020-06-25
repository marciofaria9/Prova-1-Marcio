package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		

		
		int numero = leitura.nextInt();
		
		if (numero % 5 == 4) {
			numero += 1;		
		}
		
		else if (numero % 5 == 3) {
			numero += 2;
		}
				
		
	System.out.println(numero);
	
				
		
		leitura.close();
		
		
	}
			
			
			

}
