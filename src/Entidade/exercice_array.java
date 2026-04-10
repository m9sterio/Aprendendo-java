package Entidade;

import java.util.Scanner;
import estado.Pessoa;

public class exercice_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double media_altura = 0;
		int total_pessoas;
		String nome_idade;
		int porcentagem_idade = 0;

		System.out.println("Quantas pessoas serão digitadas?");
		total_pessoas = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[total_pessoas];

		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.println("dados da " + i + " pessoa");
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Pessoa(nome, idade, altura);
		}

		for (int i = 0; i < pessoa.length; i++) {

			media_altura += (pessoa[i].getAltura());

		}
		System.out.printf("A media das alturas é:%.2f",media_altura / total_pessoas);
		
		System.out.println("\n Pessoas com menos de 16 anos:");

		for (int i = 0; i < pessoa.length; i++) {

			if (pessoa[i].getIdade() < 16) {

				porcentagem_idade ++;

			}
		}
		porcentagem_idade = (porcentagem_idade * 100) / total_pessoas;
		System.out.println(porcentagem_idade+"%");

		for (int i = 0; i < pessoa.length; i++) {

			if (pessoa[i].getIdade() < 16) {

				System.out.println(pessoa[i].getNome());

			}

		}

		sc.close();

	}

}
