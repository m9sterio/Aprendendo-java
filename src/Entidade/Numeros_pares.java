package Entidade;

import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros;
		int par =0;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		numeros = sc.nextInt();
		
		int[] vet = new int[numeros];
		
		for (int i=0;i<vet.length;i++) {
			
			System.out.println("Digite um numero:");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.print("\nNUMEROS PARES:\n");
		for (int i=0;i<vet.length;i++) {
		
			if (vet[i]%2 == 0) {
				cont ++;
				System.out.print(vet[i]+ " ");
				
			}
		}
		System.out.printf("\n \n QUANTIDADE DE PARES = %d\n", cont);
		sc.close();
	}

}
