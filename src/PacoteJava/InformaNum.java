package PacoteJava;

import java.util.Locale;
import java.util.Scanner;

public class InformaNum {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
		
		int num; 
		
		for(num=1000; num<=1999; num++) {
			
			if (num%11==5) {
				
		        System.out.printf("\nResto: %d",num);
		        
			}
		        else {
		        	
		        	
		        	System.out.println("\nNão existe resto = 5 !");
		        	
		        }
		        
		        
			}


		
		ler.close();
	}
	
	
}
