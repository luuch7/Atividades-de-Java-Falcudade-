package trabnove;

import java.util.Scanner;

public class trabnove {

	public static void main(String[] args) {
		
		double valProd, valFinal, descont, valSemDesc;
		double frete = 2.56;
		double impost = 0.15;
		String codProd;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o código do produto:");
		codProd = ler.nextLine();
		System.out.println("Informe o valor do produto:");
		valProd = ler.nextDouble();
		System.out.println("Informe o desconto do produto:");
		descont = ler.nextDouble();
		
		valSemDesc = ((valProd + (impost * valProd)) + frete);
		valFinal = valSemDesc - (valSemDesc * (descont/100));
		
		System.out.println("O valor final do produto "+ codProd + " é:"+ valFinal);

	}

}
