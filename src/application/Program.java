package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do Funcionário: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário Bruto R$: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Taxa R$:");
		double tax = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary, tax);
		
		System.out.println("Dados do Funcionario: " + emp);
		
		System.out.print("Aumente em porcentagem o salário do Funcionário: ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println("Atualizando dados " +emp);
		
		sc.close();
	}

}
