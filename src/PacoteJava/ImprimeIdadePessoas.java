package PacoteJava;

import java.util.Locale;
import java.util.Scanner;

public class ImprimeIdadePessoas {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner (System.in);
		
		
		int idade=0,aux=0,aux2=0;
		
		System.out.println("Digite sua idade:");
		idade=ler.nextInt();
		
	
		while(idade!=-99) {
			
			
			if(idade<=20) {
				
				aux=idade++;
				
				
		 
		    if(idade >50) {
				
				aux2=idade++;
				
			}
			
					 
			}
			
			System.out.printf("%d",aux,"\nTem menos de 21 anos ");
			System.out.printf("%d",aux2,"\nTem mais de 50 anos");
			
		}
		
		
		
		ler.close();
	}

}
