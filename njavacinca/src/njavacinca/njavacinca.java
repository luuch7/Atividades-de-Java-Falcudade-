package njavacinca;

import java.util.Scanner;

public class njavacinca {

	public static void main(String[] args) {
		
		int  idade;
		String sexo;
		String antecedentes;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		idade = ler.nextInt();
		
		ler.nextLine();
		
		System.out.println("Informe qual o seu sexo? responda com M para masculino e F para feminino:");
		sexo = ler.nextLine();
		
		System.out.println("Voc� tem antecedentes criminais? responda com sim ou n�o:");
		antecedentes = ler.nextLine();
		
		if (idade >= 18 && sexo.equals("m") && antecedentes.equals("nao")) {
			System.out.println("Voc� pode exercer o servi�o militar obrigat�rio!");
		}
		else {
			System.out.println("Voc� n�o poder� exercer o servi�o militar obrigat�rio, parab�ns!");
		}
		

	}

}
