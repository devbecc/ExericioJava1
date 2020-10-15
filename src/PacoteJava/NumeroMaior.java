package PacoteJava;

import java.util.Locale;
import java.util.Scanner;


public class NumeroMaior {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in);
       		
       		
       		int num1,num2,num3;
       		
       		System.out.println("Digite o primeiro número:");
       		num1=ler.nextInt();
       		
       		
       		System.out.println("Digite o segundo número :");
       		num2=ler.nextInt();
       		
       		
       		System.out.println("Digite o terceiro número : ");
       		num3=ler.nextInt();
       		
       		if(num1>num2 && num1>num3) {
       			
       			System.out.printf(" O primeiro número digitado é o maior %d" ,num1 );
       		}
       			
       		
       		if(num2>num1 && num2>num3) {
           			
       		System.out.printf(" O segundo número digitado é o maior %d" ,num2 );
       		
       		}
           	
           	
           	if(num3>num1 && num3>num2) {
       			
               	System.out.printf(" O terceiro número digitado é o maior:  %d" ,num3 );	
       			
           	}
       		
        	ler.close();
           	
       		}
 
       		
       	

       		}
       		