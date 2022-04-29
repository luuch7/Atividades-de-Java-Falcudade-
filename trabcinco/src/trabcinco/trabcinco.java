package trabcinco;

import java.util.Scanner;

public class trabcinco {

	public static void main(String[] args) {
		
		double anosFumand, numCigaDias, precoCartCiga, dinheiroGast, convertCig;
		double quantCart = 12;
		double ano = 360;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de anos fumando:");
		anosFumand = ler.nextDouble();
		System.out.println("Informe a quantidade de cigarros fumandos por dia:");
		numCigaDias = ler.nextDouble();
		System.out.println("Informe o valor da carteira de cigarro:");
		precoCartCiga = ler.nextDouble();
		
		convertCig = numCigaDias / quantCart;
		dinheiroGast = ((convertCig * ano) * anosFumand) * precoCartCiga;
		
		System.out.println("A quantidade de dinheiro gasto é:"+ dinheiroGast);
		

	}

}
