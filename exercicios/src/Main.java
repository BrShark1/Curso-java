import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o codigo do item:");
		int I = sc.nextInt();
		if (I == 0) {
			System.out.println("Este item n�o existe!");
			System.exit(0);
		}
		System.out.println("Qual a quantidade do item escolhido:");
		int Q = sc.nextInt();
		double total = 0;
		
		if (I == 1) {
			total = Q * 4.0;
		}

		else if (I == 2) {
			total = Q * 4.5;
		} else if (I == 3) {
			total = Q * 5.0;
		} else if (I == 4) {
			total = Q * 2.0;
		} else if (I == 5) {
			total = Q * 1.5;
		}
		

		System.out.printf("Total a pagar: R$ %.2f", total);
		sc.close();

	}

}

