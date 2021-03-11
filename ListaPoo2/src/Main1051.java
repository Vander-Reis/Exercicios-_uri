import java.util.Scanner;

public class Main1051 {
	public static void main(String[] args) {
		
		double salario;
		double imposto = 0;
		
		Scanner input = new Scanner(System.in);
		
		salario = input.nextDouble();
		
		if (salario >= 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		
		else if (salario > 2000.01 && salario <= 3000) {
			imposto = ((salario - 2000) * 0.08);
			System.out.printf("R$ %.2f\n", imposto);
		}
		
		else if (salario > 3000.01 && salario <= 4500) {
			imposto = ((salario - 3000) * 0.18 + 80);
			System.out.printf("R$ %.2f\n", imposto);
		}
		
		else if (salario > 4500) {
			imposto = ((salario - 4500) * 0.28 + 350);
			System.out.printf("R$ %.2f\n", imposto);
		}
			
	}
}
