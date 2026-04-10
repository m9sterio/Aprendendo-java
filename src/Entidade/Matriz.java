package Entidade;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int esquerda =0;
		int direita =0;
		int baixo=0;
		int cima=0;

		int[][] vetor = new int[M][N];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {

				vetor[i][j] = sc.nextInt();

			}
		}
		int num = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				
				if (vetor[i][j] == num) {
					System.out.println("posição da matriz: "+ i + "," + j);
					if (j > 0) {
					esquerda = vetor[i][j-1];
					System.out.println("esquerda: "+esquerda);
					}
					if (j < vetor[i].length -1) {
					direita = vetor[i][j+1];
					System.out.println("direita: "+direita);
					}
					if (i <vetor.length -1) {
					baixo = vetor[i+1][j];
					System.out.println("baio: "+baixo);
					}
					if (i >0) {
					cima = vetor[i-1][j];
					System.out.println("cima: "+cima);
					}
					
				}
				
			}
		}
	}

}
