package Entidade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import estado.Funcionario;

public class Empressa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de funcionario: ");
		int quant_func = sc.nextInt();
		List<Funcionario> func = new ArrayList<>();

		for (int i = 0; i < quant_func; i++) {
			System.out.printf("\nFuncionario #" + (i + 1) + "\n");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();

			func.add(new Funcionario(id, nome, salario));

		}
		System.out.println("Digite o id do funcionario que ira receber o acressimo: ");
		int procuar_id = sc.nextInt();
		boolean acertou = false;

		for (Funcionario estudante_atual : func) {

			if (estudante_atual.getId() == procuar_id) {

				System.out.println("Digite a porcentagem de aumento: ");
				double porcentagem = sc.nextDouble();
				double total = (estudante_atual.getSalario() * porcentagem) / 100;
				double total1 = total + estudante_atual.getSalario();
				estudante_atual.setSalario(total1);
				acertou = true;
				break;

			}

		}
		if (acertou == false) {
			System.out.println("id não encontrado");
		}
		System.out.println(func);

	}

}
