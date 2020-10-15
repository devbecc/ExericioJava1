package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in); 

		Aluno aluno = new Aluno();
       
		int x;
		double criterio;
		
		
		System.out.println("Sistema de controle escola  em java - poo ");
		
         
        System.out.print("Digite seu nome: ");
		aluno.nomeAluno=tec.next().toUpperCase();
        
        System.out.println("Qual sexo do Aluno? ");
        aluno.sexoAluno=tec.next().toUpperCase().charAt(0);
       
        System.out.print("Digite o ano de Nascimento : ");
        aluno.anoNascimentoAluno=tec.nextInt();
        
        
        System.out.println("Digite o critério ");
        criterio=tec.nextDouble();
        
        for(x=0; x<4; x++) {
        	
        	
            System.out.println("\nDigite a nota: ");
            aluno.notas[x]=tec.nextDouble();
    		
            }
            
        
        
        aluno.mostra();
        aluno.mostraIdade();
        aluno.notaAluno();
        aluno.aprovaOuReprova(criterio);
      
       
        tec.close();
	}

}
