import java.util.Scanner;

public class Main1154 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double idades = input.nextDouble();
		double total = 0;
		double media = 0;
		int vezes = 0;
		
		while(idades  > 0) {
			vezes++;
			total = total + idades;
			
			idades = input.nextDouble();
		}
		media = (total / vezes);
		System.out.printf("%.2f\n", media);
	}
}
