package atvSeis;

import java.util.Scanner;

public class atvSeis {

	public static void main(String[] args) {
		
		int nume, calcu, add;
		int mult = 10;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		nume = ler.nextInt();
		
		calcu = nume * mult;
		
		if (calcu == 100) {
			System.out.println("Valor"+ calcu);
		}
		else {
			add = calcu + 10;
			System.out.println("Novo Valor:"+ add);
		}

	}

}
