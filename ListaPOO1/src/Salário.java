import java.util.Scanner;

public class Main1008 {
	public static void main(String[] args) {
		int num, valor;
		double horas, total;
		
		Scanner entrada = new Scanner(System.in);
		
		num = entrada.nextInt();
		valor = entrada.nextInt();
		horas = entrada.nextDouble();
		
		total = (valor * horas);
		
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f\n", total);
	}
}
