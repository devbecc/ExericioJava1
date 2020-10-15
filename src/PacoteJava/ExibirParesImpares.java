package PacoteJava;
import java.util.Locale;
import java.util.Scanner; 


public class ExibirParesImpares {

	
	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner (System.in);
		
		
	 
		
		int num,par=0,impar=0;
		
		for (num=0; num<=10; num++) {
			
			   System.out.println("\nDigite o número");
	            num = ler.nextInt();
			
		
			if ((num%2)== 0) {
				
				par=par+1;
				  
			
			}
			
			else if ((num % 2) == 1){
				
                impar++;
				 
			 
			}
			
			
			}
		
		System.out.printf("\nQtde de Par: %d",par);
		
		System.out.printf("\nQtde de ímpar: %d",impar);
		
		
		}

	}

