package testess;

import java.util.Scanner;

public class testev {

	public static void main(String[] args) {
		
		int nUm, nDois, conta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		nUm = ler.nextInt();
		System.out.println("Informe um outro n�mero:");
		nDois = ler.nextInt();
		
		conta = nUm + nDois;
		System.out.println("A soma �:"+ conta);

	}

}
