import java.util.Scanner;

public class Main1048 {
	public static void main(String[] args) {
		
		double salario;
		double total = 0;
		double reajuste = 0;
		String percentual = "";
		
		Scanner input = new Scanner(System.in);
		
		salario = input.nextDouble();
		
		if (salario >= 0 && salario <= 400){
			total = (salario * 0.15) + salario;
			reajuste = (salario * 0.15);
			percentual = "15 %";
		}
		
		else if (salario >= 400.01 && salario <= 800) {
			total = (salario * 0.12) + salario;
			reajuste = (salario * 0.12);
			percentual = "12 %";
		}
		
		else if (salario >= 800.01 && salario <= 1200) {
			total = (salario * 0.10) + salario;
			reajuste = (salario * 0.10);
			percentual = "10 %";
		}
		
		else if (salario >= 1200.01 && salario <= 2000) {
			total = (salario * 0.07) + salario;
			reajuste = (salario * 0.07);
			percentual = "7 %";
		}
		
		else if (salario > 2000) {
			total = (salario * 0.04) + salario;
			reajuste = (salario * 0.04);
			percentual = "4 %";
		}
		
		System.out.printf("Novo salario: %.2f\n", total);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + percentual);
		
		
	}
}
