package entidades;

public class Aluno {
	
	
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double notas[]= new double [4];
	public double media;
	
		
		
		public void mostra () {
			
			
			
			if (sexoAluno=='M') {
				
				
			System.out.printf("O nome do Aluno � %s e �  %s",nomeAluno,sexoAluno+"asculino");
			
			} 
			
			else if(sexoAluno=='F')
			
			{
				
		    System.out.printf("\nO nome da Aluna � %s e � do sexo  %s",nomeAluno,sexoAluno+"eminino");
				
				
			}
			
		  	
		    }
		
		    public void mostraIdade(){
			
			System.out.printf("\nA sua idade � %d",(2020-this.anoNascimentoAluno));
			
		}
		    
		    public void  notaAluno () {
		    	
		    	  for(int x=0; x<=4; x++) {
		    		  
		    		  
		    		  media=media+notas[x];
		    	  }
		     
		    	
		    	      media=media/4;
		    	  
		    }
		    	
		    	
		    public void aprovaOuReprova(double criterio) {
		    	
		    	System.out.printf("\nA m�dia foi de %d:" ,media);
		    	System.out.printf("\nO crt�rio da escola foi de %d: ",criterio);
		    	
		   
		    	
		    	if (media>criterio) {
		    		
		    		System.out.println("\nVoc� Foi aprovado! ");
		    		
		    		
		    		
		    	}
		    	
		    	else {
		    		
		    		System.out.println("\nVoc� foi reprovado! ");
		    	}
		    	
		    	
		    	
		    }
		    	
		    	
		    
	

}
