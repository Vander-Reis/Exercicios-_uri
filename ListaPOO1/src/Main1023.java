//Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação 
//de Bhaskara. Se não for possível calcular as raízes, mostre 
//a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 
//ou raiz de numero negativo.

import java.util.Scanner;

public class Main1023 {
	public static void main(String[] args) {
		
		double A, B, C;
		double Delta, X1, X2;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
			if(A == 0) {
				System.out.println("Impossivel calcular");
		}
		else {
			B = input.nextDouble();
			C = input.nextDouble();
			
			Delta = ((B * B) - 4 * A * C);
			
			if (Delta < 0) {
				System.out.println("Impossivel calcular");
			}
			
			else if (Delta == 0) {
				
				X1 = (-B + Math.sqrt(Delta))/(2 * A);
				
				System.out.println("Delta = 0, Possui 2 valores iguais: " + X1);
				
			}
			else {
				X1 = (-B + Math.sqrt(Delta))/(2 * A);
				X2 = (-B - Math.sqrt(Delta))/(2 * A);
				
				System.out.printf("R1 = %.5f\n", X1);
				System.out.printf("R2 = %.5f\n", X2);
				
			}
		}
			
	}
}
