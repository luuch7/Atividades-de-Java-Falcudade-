package atvquat;

import java.util.Scanner;

public class atvquat {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		idade = ler.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		}
		else {
			System.out.println("Voc� n�o � maior de idade");
		}

	}

}
