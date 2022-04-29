package njavatres;

import java.util.Scanner;

public class njavatres {

	public static void main(String[] args) {
		
		int antecedentes, idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		idade = ler.nextInt();
		System.out.println("Informe os seus antecedentes criminais. Se tiver dígite 1 e se não tiver 0:");
		antecedentes = ler.nextInt();
		
		if (idade > 18 && antecedentes <= 0) {
			System.out.println("Você poderá concorrer no concurso públuco!");
		}
		else {
			System.out.println("Você não poderá concorrer no concurso!");
		}

	}

}
