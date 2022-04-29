package trabdez;

import java.util.Scanner;

public class trabdez {

	public static void main(String[] args) {
		
		double valHora, quantHra, numMenorIdd, numHraExtra, salBrut, salLiq;
		double valHraExtra = 45.38;
		double desqInss = 0.08;
		double valMenorIdd = 13.89;
		String cod;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu código:");
		cod = ler.nextLine();
		System.out.println("Informe a quantidade de horas trabalhadas:");
		quantHra = ler.nextDouble();
		System.out.println("Informe o valor da hora trabalhada:");
		valHora = ler.nextDouble();
		System.out.println("Informe a quantidade de horas extras trabalhadas:");
		numHraExtra = ler.nextDouble();
		System.out.println("Informe a quantidade de menores de 18 anos dependente:");
		numMenorIdd = ler.nextDouble();
		
		salBrut = (quantHra * valHora) + (numHraExtra * valHraExtra) + (numMenorIdd * valMenorIdd);
		salLiq = salBrut - (desqInss * salBrut);
		
		System.out.println("O salario bruto de "+ cod + " é:"+ salBrut);
		System.out.println("O salario líquido de "+ cod + " é:"+ salLiq);

	}

}
