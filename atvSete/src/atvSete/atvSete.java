package atvSete;

import java.util.Scanner;

public class atvSete {

	public static void main(String[] args) {
		
		double valProd, desc;
		double valDesc = 0.1;
		int pag;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o valor do produto:");
		valProd = ler.nextDouble();
		System.out.println("Informe a forma de pagamento, considerando 0 como � vista e 1 como � prazo:" );
		pag = ler.nextInt();
		
		if (pag == 0) {
			desc = valProd - (valDesc * valProd);
			System.out.println("O valor com desconto �:"+ desc);
		}
		else {
			System.out.println("O valor de "+ valProd + " n�o sofre altera��o � prazo.");
		}

	}

}
