package njavatres;

import java.util.Scanner;

public class njavatres {

	public static void main(String[] args) {
		
		int antecedentes, idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		idade = ler.nextInt();
		System.out.println("Informe os seus antecedentes criminais. Se tiver d�gite 1 e se n�o tiver 0:");
		antecedentes = ler.nextInt();
		
		if (idade > 18 && antecedentes <= 0) {
			System.out.println("Voc� poder� concorrer no concurso p�bluco!");
		}
		else {
			System.out.println("Voc� n�o poder� concorrer no concurso!");
		}

	}

}
