package PacoteJava;
import java.util.*;
import java.util.Locale;


public class RaizQuadrada {

	
	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);	
		 Scanner ler = new Scanner (System.in);
		 
		
		 double numero, raiz , quadrado;
		 
		 System.out.println("Digite um numero: ");	
		 numero = ler.nextDouble();
		 
		 if(numero% 2 == 0)
		 {	 
		   raiz = Math.sqrt(numero);
		   System.out.printf("O numero digitado � %.2f par e sua raiz quadrada � : %.2f",numero,raiz);	 
		 }
		 
		 else
		 {
			quadrado = Math.pow(numero,2);
			System.out.printf("O n�mero digitado � %.2f impar e elevado ao quadrado � : %.2f ",numero,quadrado) ;
		 }
		
		
		
		
		 ler.close();
		 
		 
	}
	
}
