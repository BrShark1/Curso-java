package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employe employe = new Employe();
		
		System.out.print("Digite o nome do Funcionario: ");
		employe.name = sc.next();
		System.out.print("Digite o salario bruto: ");
		employe.grossSalary = sc.nextDouble();
		System.out.print("Qual o valor total da taxa paga pelo funcionario:");
		employe.tax = sc.nextDouble();

		System.out.printf("Funcionario: " + employe);
		System.out.println();
		System.out.print("Qual o valor da porcentagem do aumento salarial do funcionario:");
		double percentage = sc.nextDouble();
		employe.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employe);
		sc.close();
		
	}

}
