package PacoteJava11_09;

import java.util.Random;
import java.util.Locale;
import java.util.Scanner;

public class Matriz_3x3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
	 
	 
		        Random gerador = new Random ();	
		        
		        final int LINHA=3;
				final int COLUNA=3; 
				int matriz[][] = new int [LINHA][COLUNA];
				
	 
				
				
				
				int linha,coluna, valorDigitado = 0, soma = 0, total = 0;
				for(linha=0; linha<LINHA; linha++)
				{
					System.out.printf(" | ");
					
					for (coluna=0; coluna<COLUNA; coluna++)
					{
						valorDigitado = gerador.nextInt(3)+1;
						matriz[linha][coluna] = valorDigitado;
						 cvb bn  
					 
					
						System.out.print(matriz[linha][coluna]);
						System.out.print(" | ");
					 
						total = total + matriz[linha][coluna];
									 
						if (linha==coluna)
						{
							soma = soma + matriz[linha][coluna];
						}
						
					}
					System.out.print("\n");
				}
				System.out.printf("Soma da diagonal principal é : %d", soma);
				
			}
		 
	}
			
		 