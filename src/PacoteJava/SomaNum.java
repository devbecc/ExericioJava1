package PacoteJava;

import java.util.Locale;

import java.util.Scanner;

public class SomaNum {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner ler = new Scanner(System.in);
		
		
		int somar=0,contar=somar;
		int num=0,aux=0;
		
		do { 
			
			System.out.println("Digite um n�mero");
			num=ler.nextInt();
			
			 if(num!=0) {
				 
				 contar+=1;
				 somar+=num;
			 }
			
			} while(num>0);
		
		 aux=somar/contar;
		 
		  System.out.printf("\nA Soma dos n�meros inteiros: %d", somar);
		  System.out.printf("\n M�dia: %d", aux);
		
		
	}

}
