package trabsete;

import java.util.Scanner;

public class trabsete {

	public static void main(String[] args) {
		
		double salario, comicao, carroVend, valTotalVendas, salFinal;
		double valVendas = 0.05;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o seu salário fixo:");
		salario = ler.nextDouble();
		System.out.println("Informe o valor da sua comissão fixa por carros vendidos:");
		comicao = ler.nextDouble();
		System.out.println("Informe a quantidade de carros vendidos:");
		carroVend = ler.nextDouble();
		System.out.println("Informe o valor total de suas vendas:");
		valTotalVendas = ler.nextDouble();
		
		salFinal = (valVendas * valTotalVendas) + salario + (comicao * carroVend);
		System.out.println("O seu salario final é:"+ salFinal);

	}

}
