import java.util.Scanner;

public class Main1010 {
	public static void main(String[] args){
		int cod1;
		int numP1;
		double valor1;
		int cod2;
		int numP2;
		double valor2;
		double total;
		
		Scanner input = new Scanner(System.in);
		
		cod1 = input.nextInt();
		numP1 = input.nextInt();
		valor1 = input.nextDouble();
		cod2 = input.nextInt();
		numP2 = input.nextInt();
		valor2 = input.nextDouble();
		
		total = (numP1 * valor1) + (numP2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
	}
}
