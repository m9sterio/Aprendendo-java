package Entidade;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Quantos valores vai ter cada vetor?");
		num = sc.nextInt();

		int[] vet1 = new int[num];

		int[] vet2 = new int[num];

		int[] vet3 = new int[num];

		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < vet1.length; i++) {

			vet1[i] = sc.nextInt();

		}

		System.out.println("Digite os valores do vetor B: ");

		for (int i = 0; i < vet1.length; i++) {

			vet2[i] = sc.nextInt();

		}
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < vet1.length; i++) {

			vet3[i] = vet1[i] + vet2[i];
			System.out.println(vet3[i]);

		}

	}

}
