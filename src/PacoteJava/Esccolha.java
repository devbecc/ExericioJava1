package PacoteJava;

import java.util.Locale;
import java.util.Scanner;


  public class Esccolha {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
	  Scanner ler = new Scanner(System.in);
   		 
   		
   		int opcao=0;
   	
		System.out.println("Digite 1 para Sexo feminino , 2 para masculino e 3 para outros: ");
		opcao=ler.nextInt();
		 
		
		System.out.print( (opcao==1)? "Sexo feminino":(opcao==2)? "Sexo Masculino ":(opcao==3)? "Voc� escolheu    Outros ":"Voc� digitou errado, tente novamente!" );
		
		
		ler.close();
	  	
	}
	
	
	

}