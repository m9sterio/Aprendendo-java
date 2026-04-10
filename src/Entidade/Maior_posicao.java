package Entidade;

import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero;
		int cont = 0;
		int posi = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		numero = sc.nextInt();

		int[] vet = new int[numero];

		for (int i = 0; i < vet.length; i++) {

			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {

			if (vet[i] > cont) {

				cont = vet[i];
				posi++;
			}

		}
		System.out.println("MAIOR VALOR = " + cont + "\n POSICAO DO MAIOR VALOR: " + posi);

	}

}
