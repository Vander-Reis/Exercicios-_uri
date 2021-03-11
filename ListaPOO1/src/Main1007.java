import java.util.Scanner;

public class Main1007 {
	public static void main(String[] args){
		
		int A, B, C, D, dif;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		dif = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d\n", dif);
	}
}
