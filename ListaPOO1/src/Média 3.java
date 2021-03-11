import java.util.Scanner;

public class Main1026 {
	public static void main(String[] args) {
		
		double N1, N2, N3, N4;
		double media, mediaFinal;
		double exame;
		
		Scanner input = new Scanner(System.in);
		
		N1 = input.nextDouble();
		N2 = input.nextDouble();
		N3 = input.nextDouble();
		N4 = input.nextDouble();
		
		media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
		System.out.printf("Media: %.1f\n", media-0.005);
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		
		else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
			
		else{
			System.out.println("Aluno em exame.");
			exame = input.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", exame);
			mediaFinal = (media + exame) / 2;
			
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", mediaFinal-0.005);
		}
		
		
	}
	
}
