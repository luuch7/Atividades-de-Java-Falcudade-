package njavadois;

import java.util.Scanner;

public class njavadois {

	public static void main(String[] args) {
		
		int nume;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		nume = ler.nextInt();
		
		if (nume > 0) {
			System.out.println("O número "+ nume + " é maior que zero!");
		}
		if (nume < 0) {
			System.out.println("O número "+ nume + " é menor que zero!");
		}
		else {
			System.out.println("Zero!");
		}

	}

}
