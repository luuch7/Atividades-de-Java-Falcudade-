package atoito;

import java.util.Scanner;

public class atoito {

	public static void main(String[] args) {
		
		double notaUm, notaDois, notaTres, notaQuatro, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		notaUm = ler.nextDouble();
		System.out.println("Informe a segunda nota:");
		notaDois = ler.nextDouble();
		System.out.println("Informe a terceira nota:");
		notaTres = ler.nextDouble();
		System.out.println("informe a quarta nota:");
		notaQuatro = ler.nextDouble();
		
		media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		
		if (media < 6 ) {
			if (media < 3 ) {
				System.out.println("A sua nota é"+ media + ", e você está de reprovado");
			}
			else {
				System.out.println("A sua nota é"+ media + ", e você esta recuperação");
			}
		}
		else {
					System.out.println("A sua nota é:"+ media + ", e você está aprovado");
		}
	

	}

}
