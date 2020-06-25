package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		int votoSim = 0;
		int votoNao = 0;
		int contadorSul = 0;
		int contadorSudeste = 0;
		int contadorCentroOeste = 0;
		int contadorNorte = 0;
		int contadorNordeste = 0;
	
	
			for (int i = 0; i < 100; i++) {
			
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("1-Sim, 2-Não");
			
			int votos = leitura.nextInt();
			
			if ( votos == 1) {
				votoSim++;
			}
			
			else { 
				votoNao++;				
			}
			
			
			System.out.println("Qual região do Brasil você mora?");
			System.out.println("1-Sul, 2- Sudeste, 3-Centro-Oeste, 4- Norte, 5- Nordeste");
			
			int regiao = leitura.nextInt();
			
			if (regiao == 1) {
				contadorSul++;
							
			}
			
			else if (regiao == 2 ) {
				contadorSudeste++;
				
			}
			
			else if (regiao == 3) {
				contadorCentroOeste++;
				
			}
			
			else if (regiao == 4) {
				contadorNorte++;
				
			}
			
			else { 
				contadorNordeste++;
			}
									
			
		}
		
		System.out.println("Votos sim: " + votoSim);
	    System.out.println("Votos não: " + votoNao);
	    System.out.println("Sul: " + contadorSul);
	    System.out.println("Sudeste: " + contadorSudeste);
	    System.out.println("Centro-Oeste: " + contadorCentroOeste);
	    System.out.println("Norte: " + contadorNorte);
	    System.out.println("Nordeste: " + contadorNordeste);
		  				
		leitura.close();
	}

}
