package atvtres;

import java.util.Scanner;

public class atvtres {

	public static void main(String[] args) {
		
		int nUm, nDois, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro N�mero:");
		nUm = ler.nextInt();
		System.out.println("Informe o segundo n�mero:");
		nDois = ler.nextInt();
		
		soma = nUm + nDois;
		
		if (soma > 10) {
			System.out.println("Soma Maior que 10");
			System.out.println("Resultado:"+ soma);
		}
		else {
			System.out.println("Computa��o");
		}

	}

}
