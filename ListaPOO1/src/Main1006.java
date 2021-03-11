import java.util.Scanner;

public class Main1006 {
	public static void main(String [] args){
		
		double A;
		double B;
		double C;
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();
		
		media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f\n", media);
	}
}
