package PacoteJava;

import java.util.Locale;
import java.util.Scanner;


public class NumeroMaior {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in);
       		
       		
       		int num1,num2,num3;
       		
       		System.out.println("Digite o primeiro n�mero:");
       		num1=ler.nextInt();
       		
       		
       		System.out.println("Digite o segundo n�mero :");
       		num2=ler.nextInt();
       		
       		
       		System.out.println("Digite o terceiro n�mero : ");
       		num3=ler.nextInt();
       		
       		if(num1>num2 && num1>num3) {
       			
       			System.out.printf(" O primeiro n�mero digitado � o maior %d" ,num1 );
       		}
       			
       		
       		if(num2>num1 && num2>num3) {
           			
       		System.out.printf(" O segundo n�mero digitado � o maior %d" ,num2 );
       		
       		}
           	
           	
           	if(num3>num1 && num3>num2) {
       			
               	System.out.printf(" O terceiro n�mero digitado � o maior:  %d" ,num3 );	
       			
           	}
       		
        	ler.close();
           	
       		}
 
       		
       	

       		}
       		