package Entidade;

import java.util.Scanner;

import estado.Alunos;

public class Aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int numeros_aluno = sc.nextInt();
		
		
		Alunos[] aluno = new Alunos[numeros_aluno];
		
		for (int i=0;i<aluno.length;i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:\n");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			aluno[i]= new Alunos(nome,nota1,nota2);
			
		}
		System.out.println("Alunos aprovados:");
		for (int i=0;i<aluno.length;i++) {
			if ((aluno[i].getNota1() + aluno[i].getNota2())/2 >= 6 ) {
				
				System.out.println(aluno[i].getNome());
			}
		}
		sc.close();
	}

}
