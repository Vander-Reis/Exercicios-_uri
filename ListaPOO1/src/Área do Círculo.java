import java.util.Scanner;

public class Main1002 {
	public static void main(String[] args) {
		double raio;
		double area;
		double n = 3.14159;
	
		Scanner entrada = new Scanner(System.in);
	
		raio = entrada.nextDouble();
		
		area = n * (raio * raio);
		
		System.out.printf("A=%.4f\n", area);
	
	}
}
