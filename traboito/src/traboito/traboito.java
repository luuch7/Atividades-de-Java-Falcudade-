package traboito;

import java.util.Scanner;

public class traboito {

	public static void main(String[] args) {
		
		double notaUm, notaDois, notaTres, mediaFinal;
		double pesoUm = 2;
		double pesoDois = 3;
		double pesoTres = 5;
		double somaPesos = 10;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da primeira nota:");
		notaUm = ler.nextDouble();
		System.out.println("Informe o valor da segunda nota:");
		notaDois = ler.nextDouble();
		System.out.println("Informe o valor da terceita nota:");
		notaTres = ler.nextDouble();
		
		mediaFinal = (notaUm * pesoUm) + (notaDois * pesoDois) + (notaTres * pesoTres) /  somaPesos;
		System.out.println("A sua média final é:"+ mediaFinal);

	}

}
