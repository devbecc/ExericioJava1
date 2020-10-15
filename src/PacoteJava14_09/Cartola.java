package PacoteJava14_09;

import java.util.Locale;
import java.util.Scanner;
 

public class Cartola {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner (System.in);
		
		String [] VTimes = new String [4];
		int [] Vpontos= new int [3];
		
		Vpontos[0]=0;
		Vpontos[1]=1;
		Vpontos[2]=2;
		
		VTimes[0]= "Corinthians";
		VTimes[1]= "Palmeiras";
		VTimes[2]= "SPFC";
		VTimes[3]="Santos";
		
		

		System.out.printf("\nO "  +VTimes[0]+ " fez " + Vpontos[1] + "x" + Vpontos[0]+  " Contra o " +VTimes[1]+ "!");
		System.out.printf("\nO "  +VTimes[2]+ " fez " +  Vpontos[2]+"x" +Vpontos[1]+ " Contra o " +VTimes[3]+ "!" );
		System.out.printf("\nO "  +VTimes[2]+ " fez " +  Vpontos[0]+"x" +Vpontos[3]+ " Contra o " +VTimes[0]+ "!" );
		
 
		 
 
		
		
		
		 
			
			
			
			
			
			
				
		tec.close();

	}
   
	
}
