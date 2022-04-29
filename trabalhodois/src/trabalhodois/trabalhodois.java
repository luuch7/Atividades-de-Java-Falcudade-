package trabalhodois;

import java.util.Scanner;

public class trabalhodois {

	public static void main(String[] args) {
		
		String nomeDisciplina;
		int RA;
		double notaUm, notaDois, notaTres, notaQuatro, resultMedia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome da disciplina:");
		nomeDisciplina = ler.nextLine();
		System.out.println("Informe o seu RA:");
		RA = ler.nextInt();
		System.out.println("Informe a sua primeira nota:");
		notaUm = ler.nextDouble();
		System.out.println("Informe a sua segunda nota:");
		notaDois = ler.nextDouble();
		System.out.println("Informe a sua terceira nota:");
		notaTres = ler.nextDouble();
		System.out.println("Informe a sua quarta nota:");
		notaQuatro = ler.nextDouble();
		
		resultMedia = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		
		System.out.println("O seu RA é:"+ RA);
		System.out.println("A sua média em " + nomeDisciplina + " é" + resultMedia );
		
		

	}

}
