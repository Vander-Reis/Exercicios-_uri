import java.util.Scanner;

public class Main1029 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double A, B, C;
		
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		if (Math.abs(B - C) < A && (A < B + C) && Math.abs(A - C) < B && (B < A + C) && Math.abs(A - B) < C && (C < A + B)){
			System.out.println("Perimetro = " + (A + B + C));
		}
		else {
	
		    System.out.println("Area = " + (((A + B) * C)/2));
		}
	}
}
