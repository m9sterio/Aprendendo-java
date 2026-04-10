package Entidade;

import java.util.Scanner;

public class dados_pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double menor_altura = 0;
		double maior_altura = 0;
		double media_mulheres = 0;
		int numero_homem = 0;
		int cont_mulheres =0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int pessoas = sc.nextInt();

		double[] altura = new double[pessoas];
		String[] sexo = new String[pessoas];

		for (int i = 0; i < pessoas; i++) {
			sc.nextLine();
			System.out.println("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			if (altura [i] !=0) {
				
				System.out.println("Genero da " + (i + 1) + "a pessoa");
				sexo[i] = sc.next();
			}
			else {
				
				System.out.println("Altura tem que ser diferente de 0");
				break;
			}


			
		}
		for (int i = 0; i < pessoas; i++) {

			if (altura[i] > maior_altura) {

				maior_altura = altura[i];

			} else  {

				menor_altura =  altura[i];
			}

		}
		for (int i = 0; i < pessoas; i++) {

			if (sexo[i].equals("M")) {
				numero_homem++;
			}

			 else if (sexo[i].equals("F")) {
				 
				 media_mulheres += altura[i];
				 cont_mulheres++;
			 }
			 else {
				 System.out.println("Só é permitido M (masculino) ou F (meninino)");
			 }
		}
		if (cont_mulheres >= 2) {
			
			media_mulheres = media_mulheres/cont_mulheres;
			
		}

		System.out.println("Menor altura =" + menor_altura);
		System.out.println("Maior altura =" + maior_altura);
		System.out.println("Media das alturas das mulheres = " + media_mulheres);
		System.out.println("Numero de homens " + numero_homem);

	}

}
