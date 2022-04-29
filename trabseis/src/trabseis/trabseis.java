package trabseis;

import java.util.Scanner;

public class trabseis {

	public static void main(String[] args) {
		
		double quantPao, quantBroa, valTotal, quantGuard;
		double valPao = 0.12;
		double valBroa = 1.5;
		double valGuard = 0.1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pães vendidos:");
		quantPao = ler.nextDouble();
		System.out.println("Informe a quantidade de broa vendida:");
		quantBroa = ler.nextDouble();
		
		valTotal = (quantPao * valPao) + (quantBroa * valBroa);
		quantGuard = (valGuard * valTotal);
		
		System.out.println("O valor ganho é:"+ valTotal);
		System.out.println("O valor a a ser guardado é:"+ quantGuard);

	}

}
