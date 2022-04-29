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
		
		System.out.println("Você tem antecedentes criminais? responda com sim ou não:");
		antecedentes = ler.nextLine();
		
		if (idade >= 18 && sexo.equals("m") && antecedentes.equals("nao")) {
			System.out.println("Você pode exercer o serviço militar obrigatório!");
		}
		else {
			System.out.println("Você não poderá exercer o serviço militar obrigatório, parabéns!");
		}
		

	}

}
