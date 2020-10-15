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
				
				
			System.out.printf("O nome do Aluno é %s e é  %s",nomeAluno,sexoAluno+"asculino");
			
			} 
			
			else if(sexoAluno=='F')
			
			{
				
		    System.out.printf("\nO nome da Aluna é %s e é do sexo  %s",nomeAluno,sexoAluno+"eminino");
				
				
			}
			
		  	
		    }
		
		    public void mostraIdade(){
			
			System.out.printf("\nA sua idade é %d",(2020-this.anoNascimentoAluno));
			
		}
		    
		    public void  notaAluno () {
		    	
		    	  for(int x=0; x<=4; x++) {
		    		  
		    		  
		    		  media=media+notas[x];
		    	  }
		     
		    	
		    	      media=media/4;
		    	  
		    }
		    	
		    	
		    public void aprovaOuReprova(double criterio) {
		    	
		    	System.out.printf("\nA média foi de %d:" ,media);
		    	System.out.printf("\nO crtério da escola foi de %d: ",criterio);
		    	
		   
		    	
		    	if (media>criterio) {
		    		
		    		System.out.println("\nVocê Foi aprovado! ");
		    		
		    		
		    		
		    	}
		    	
		    	else {
		    		
		    		System.out.println("\nVocê foi reprovado! ");
		    	}
		    	
		    	
		    	
		    }
		    	
		    	
		    
	

}
