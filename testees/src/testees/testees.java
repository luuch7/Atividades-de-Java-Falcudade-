package testees;

import java.util.Scanner;

public class testees {

	public static void main(String[] args) {
		
		int n;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		n = ler.nextInt();
		
		if (n%2 == 0) {
			System.out.println("Numero "+ n + " � par!");
		}
		else {
			System.out.println("Numero "+ n + " � impar!");
		}

	}

}
