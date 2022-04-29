package tndois;

import java.util.Scanner;

public abstract class tnndois {

	public static void main(String[] args) {
		
		double quiloPrato, valorPag;
		double quiloRef = 12;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o peso do prato:");
		quiloPrato = ler.nextDouble();
		
		valorPag = quiloPrato * quiloRef;
		
		System.out.println("O valor a ser pago é:"+ valorPag);

	}

}
