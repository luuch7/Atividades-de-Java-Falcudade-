package atvum;

import java.util.Scanner;

public class atvum {

	public static void main(String[] args) {
		
		int nUm, nDois;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		nUm = ler.nextInt();
		System.out.println("Informe o segundo n�mero:");
		nDois = ler.nextInt();
		
		if (nUm < nDois) {
			System.out.println("O n�mero "+ nDois + " � maior que "+ nUm);
		}
		else {
			System.out.println("O n�mero "+ nUm + " � maior que"+ nDois);
		}

	}

}
