package njavaum;

import java.util.Scanner;

public class njavaum {

	public static void main(String[] args) {
		
		int nUm, nDois;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		nUm = ler.nextInt();
		System.out.println("Informe um n�mero:");
		nDois = ler.nextInt();
		
		if (nUm > nDois) {
			System.out.println(nUm + " � maior!");
			}
		if (nDois > nUm) {
			System.out.println(nDois + "� maior!");
		}
		else {
			System.out.println("N�meros iguais!");
		}
		

	}

}
