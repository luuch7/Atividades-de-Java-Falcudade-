package atvquat;

import java.util.Scanner;

public class atvquat {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		idade = ler.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		}
		else {
			System.out.println("Você não é maior de idade");
		}

	}

}
