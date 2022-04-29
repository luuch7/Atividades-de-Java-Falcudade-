package njavaum;

import java.util.Scanner;

public class njavaum {

	public static void main(String[] args) {
		
		int nUm, nDois;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		nUm = ler.nextInt();
		System.out.println("Informe um número:");
		nDois = ler.nextInt();
		
		if (nUm > nDois) {
			System.out.println(nUm + " È maior!");
			}
		if (nDois > nUm) {
			System.out.println(nDois + "È maior!");
		}
		else {
			System.out.println("Números iguais!");
		}
		

	}

}
