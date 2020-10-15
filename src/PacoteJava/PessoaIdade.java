
package PacoteJava;

import java.util.Scanner;

import java.util.Locale;

public class PessoaIdade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner (System.in);
	 

		int Pessoa1,Pessoa2,Pessoa3;
		
		System.out.println ("Pessoa 1 : ");
	    Pessoa1=ler.nextInt();
	    
		System.out.println ("Pessoa 2 : ");
	    Pessoa2=ler.nextInt();
	    
	    
		System.out.println ("Pessoa 3 : ");
	    Pessoa3=ler.nextInt();
	
	    
	          if (Pessoa1>=10 && Pessoa1<=14 ) {
	    	
	        	  System.out.printf("Pessoa 1 é da classe Infantil e tem : %d" ,Pessoa1 );
	    	
	    }
	    	
	    
	          	if (Pessoa1>=15 && Pessoa1<=17 ) {
	    	
	    	     System.out.printf("Pessoa 1 é da classe Juvenil e tem : %d" ,Pessoa1);
	    	
	    }
	          	
	    
	    	if (Pessoa1>=18 && Pessoa1<=25 ) {
	    	
	    	System.out.printf("Pessoa 1 é da classe Adulta e tem : %d",Pessoa1);
	    	
	    }
	    	
	    	   if (Pessoa2>=10 && Pessoa2<=14 ) {
	 	    	
	 	    	   System.out.printf("Pessoa 1 é da classe Infantil e tem : %d" ,Pessoa2);
	 	    	
	 	    }
	 	    	
	 	    
	 	       if (Pessoa2>=15 && Pessoa2<=17 ) {
	 	    	
	 	    	   System.out.printf(" \nPessoa 2 é da classe Juvenil e tem : %d" ,Pessoa2);
	 	    	
	 	    }
	  
	 	    
	 	    	if (Pessoa2>=18 && Pessoa2<=25 ) {
	 	    	
	 	    		System.out.printf("Pessoa 2 é da classe Adulta e tem : %d",Pessoa3);
	 	    	
	 	    }
	 	 	
	 
	 	    	 if (Pessoa3>=10 && Pessoa3<=14 ) {
	 	 	    	
	 	 	    	System.out.printf("Pessoa 3 é da classe Infantil e tem : %d" ,Pessoa3);
	 	 	    	
	 	 	    }
	 	 	    	
	 	 	    
	 	 	    if (Pessoa3>=15 && Pessoa3<=17 ) {
	 	 	    	
	 	 	    	System.out.printf(" \nPessoa 3 é da classe Juvenil e tem : %d" ,Pessoa3);
	 	 	    	
	 	 	    }
	 	  
	 	 	    
	 	 	    if (Pessoa3>=18 && Pessoa3<=25 ) {
	 	 	    	
	 	 	    	System.out.printf(" \nPessoa 3 é da classe Adulta e tem : %d",Pessoa3);
	 	 	    	
	 	 	    }
	 	 	 	
	    	
	    	
	    	
	    	
	    	
	    	ler.close();
	}

}