package trabnovotres;

import java.util.Scanner;

public class trabnovotres {

	public static void main(String[] args) {
		
		double anoNasc, anoAtual, idadeAtual, idadeDoisseis;
		double AnoDoisseis = 2016;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o seu ano de nascimento:");
		anoNasc = ler.nextDouble();
		System.out.println("Informe o ano atual:");
		anoAtual = ler.nextDouble();
		
		idadeAtual = anoAtual - anoNasc;
		idadeDoisseis = AnoDoisseis - anoNasc;
		
		System.out.println("A sua idade atual é:"+ idadeAtual);
		System.out.println("A sua idade em 2016 é:"+ idadeDoisseis);

	}

}
