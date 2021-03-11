import java.util.Scanner;

public class Main1012 {
	public static void main(String[] args){
		
		double A,B, C;
		double pi = 3.14159;
		double triangulo;
		double circulo;
		double trapezio;
		double quadrado;
		double retangulo;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		triangulo = (A * C) / 2;
		circulo = (pi * (C * C));
		trapezio = ((A + B) * C) / 2;
		quadrado = (B * B);
		retangulo = (A * B);
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
	}
}
