package atvcinco;

import java.util.Scanner;

public class atvcinco {

	public static void main(String[] args) {
		
		double quantCadeira, valPagA, valPagB;
		double valCadeiraA = 45;
		double valCadeiraB = 40;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de cadeiras a ser comprada:");
		quantCadeira = ler.nextDouble();
		
		if (quantCadeira <= 50) {
			valPagA = quantCadeira * valCadeiraA;
			System.out.println("O valor a ser pago é:"+ valPagA);
		}
		else {
			valPagB = quantCadeira * valCadeiraB;
			System.out.println("O valor a ser pago é:"+ valPagB);
		}

	}

}
