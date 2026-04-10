package Entidade;

import java.util.Scanner;

import estado.Banco;

public class conta_bancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number:");
		int account_number = sc.nextInt();
		
		System.out.println("Enter account holder:");
		String account_name = sc.next();
		
		Banco  banco = new Banco(account_number,account_name);
		
		System.out.println("Is there na initial deposit value (y/n)");
		 String validar = sc.next();
		
		switch (validar) {
		
		case "y":
			System.out.println("Enter initial deposit value : ");
			double saldo = sc.nextDouble();
			banco.setSaldo_name(saldo);
			break;
		}
		
		System.out.println(banco);
		
		System.out.println("Enter a deposit value:");
		double deposito = sc.nextDouble();
		banco.Deposit(deposito);
		
		System.out.println("Updated account data:\n"+banco);
		
		System.out.println("Enter a withdraw value:");
		double saque = sc.nextDouble();
		banco.saque(saque);
		
		System.out.println("Updated account data:\n"+banco);
		
		
		sc.close();
	}
		

}
