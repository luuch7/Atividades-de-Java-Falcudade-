package atdois;

import java.util.Scanner;

public class atdois {

	public static void main(String[] args) {
		
		int num, add;
		int quantAdd = 10;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		num = ler.nextInt();
		
		if (num > 0) {
			System.out.println("Número Maior que Zero");
		}
		else {
			add = num + quantAdd;
			System.out.println("Resultado "+ add);
		}

	}

}
