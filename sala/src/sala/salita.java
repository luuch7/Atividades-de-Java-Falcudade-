package sala;

import java.util.Scanner;

public class salita {

	public static void main(String[] args) {
		
		double valor;
		String variavel;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor");
		valor = ler.nextDouble();
		System.out.println("Escreva C para mostrar o valor");
		variavel = ler.nextLine();
		
		if (variavel.equals(C)) {
			System.out.println("Numero"+ valor);
		}
		
		else {
			System.out.println("Você é adotado");
		}

	}

}
