package njavaquatro;

import java.util.Scanner;

public class njavaquatro {

	public static void main(String[] args) {
		
		int nume;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		nume = ler.nextInt();
		
		if (nume >= 100 || nume >=200) {
			System.out.println("O n�mero "+ nume + " est� entre 100 e 200!");
		}
		else {
			System.out.println("O n�mero "+ nume + " n�o est� entre 100 e 200!");
		}

	}

}
