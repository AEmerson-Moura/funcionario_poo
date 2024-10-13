package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do Funcionario: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Taxa: ");
		double tax = sc.nextDouble();
		
		sc.close();
	}

}
