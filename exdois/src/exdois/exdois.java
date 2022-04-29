package exdois;

import java.util.Scanner;

public class exdois {

	public static void main(String[] args) {
		
		double media;
		int faltas;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a media do aluno:");
		media = ler.nextDouble();
		System.out.println("digite as faltas do aluno:");
		faltas = ler.nextInt();
		
		if (faltas <= 10) {
			if (media >= 6) {
				System.out.println("Aprovado!");
			}
			else {
				System.out.println("Reprovado por nota");
			}
		}
		else {
			System.out.println("Reprovado por falta");
		}

	}

}
