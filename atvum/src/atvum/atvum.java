package atvum;

import java.util.Scanner;

public class atvum {

	public static void main(String[] args) {
		
		int nUm, nDois;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		nUm = ler.nextInt();
		System.out.println("Informe o segundo número:");
		nDois = ler.nextInt();
		
		if (nUm < nDois) {
			System.out.println("O número "+ nDois + " é maior que "+ nUm);
		}
		else {
			System.out.println("O número "+ nUm + " é maior que"+ nDois);
		}

	}

}
