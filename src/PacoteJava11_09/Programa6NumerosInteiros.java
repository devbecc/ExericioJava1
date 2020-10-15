package PacoteJava11_09;

import java.util.Locale;
import java.util.Scanner;

public class Programa6NumerosInteiros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
		
	     int numero=0,x,soma=0,impares=0,pares=0;
	     
 
	     
	     for (x=0; x<5; x++) {
	    	 
         System.out.println("Entre com o número:");
		     numero=ler.nextInt();
		     
		    
		     
		  if (numero % 2 ==0) {
			  
	 
			  pares++;
			  
			  
		  }
		  
		  else if (numero %2 ==1 )	 {
			  
			 
			  impares++;
          }
	     
          }
	     
	     System.out.printf("\n Números digitados: %d" ,(+numero));
	     System.out.printf("\n Soma dos ímpares: %d" ,impares);	
	     System.out.printf("\n Soma dos Pares: %d" ,pares);	
	     
	     
	     ler.close();
	     
	     }
	
       
	}
	

