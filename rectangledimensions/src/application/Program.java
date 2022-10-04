package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dimensions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dimensions dimension = new Dimensions();
		
		System.out.print("Digite a largura do retangulo: ");
		dimension.width = sc.nextDouble();
		
		System.out.print("Digite a altura do retangulo: ");
		dimension.height = sc.nextDouble();
		
		
		System.out.println("Area = " + dimension.area(0));
		System.out.println("Perimetro = " + dimension.perimeter(0));
		System.out.println("Diagonal = " + dimension.diagonal(0));
		
		sc.close();

	}

}
