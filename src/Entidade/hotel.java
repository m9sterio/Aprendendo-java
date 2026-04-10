package Entidade;

import java.util.Scanner;

import estado.Estudantes;

public class hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String email;
		int numero_quarto;
		int posicao=0;
		
		System.out.println("How many roomswill berented?");
		int quarto = sc.nextInt();
		
		Estudantes[] estudantes = new Estudantes[quarto];
		
		for (int i =0;i<quarto;i++) {
			
			nome = sc.nextLine();
			email = sc.next();
			numero_quarto = sc.nextInt();
			
			Estudantes alunos = new Estudantes(nome,email,numero_quarto);
			
			estudantes[i] = alunos;
			
			
		}
		for (int i =0;i<quarto;i++) {
			posicao = estudantes[i].getQuarto();
			if (estudantes[i].getQuarto() != i) {
				
				estudantes[i].getQuarto();
				
			}
			
		}
		
				
	}

}
