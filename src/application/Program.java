package application;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter cliente data: ");
		 
		 System.out.print("Name: ");
		 String name = sc.nextLine();
		 System.out.print("Email: ");
		 String email = sc.nextLine();
		 System.out.println("Birthdate (DD/MM/YYYY): ");
		 String dataDigiita = sc.next();
		 Date date = sfd.parse(dataDigiita);
		 
		 
		 
		
	}

}
