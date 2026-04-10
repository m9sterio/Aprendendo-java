package Entidade;

import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int	quant;
		int cont=0;
		String cont_nome = null;
		
		 System.out.println("Quantas pessoas voce vai digitar? ");
		 quant = sc.nextInt();
		 
		 
		 String[] vet_nome = new String[quant];
		 
		 int[] vet_idade= new int[quant];
		 
		 for (int i =0;i<vet_idade.length;i++) {
			 sc.nextLine();
			 System.out.println("Dados da "+(i+1)+"a pessoa: ");
			 System.out.print("Nome: ");
			 vet_nome[i] = sc.nextLine();
			 System.out.print("Idade: ");
			 vet_idade[i] = sc.nextInt();
			 
		 }
		 for (int i =0;i<vet_idade.length;i++) {
			 
			 if (cont < vet_idade[i]) {
				 cont = vet_idade[i];
				 cont_nome = vet_nome[i];
			 }
		 }
		 
		System.out.println("PESSOA MAIS VELHA: "+ cont_nome);	 
	}

}
