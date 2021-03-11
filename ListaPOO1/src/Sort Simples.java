import java.util.Scanner;

public class Main1028 {
	public static void main(String[] args) {
		int A, B, C;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		if (A < B && B < C) {
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		}
		
		else if (A < C && C < B) {
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
		}
		
		else if (B < A && A < C) {
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		}
		
		else if (B < C && C < A) {
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		}
		
		else if (C < A && A < B) {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		}
		
		else if (C < A && B < A) {
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		}
		
		System.out.println("\n" + A);
		System.out.println(B);
		System.out.println(C);
	}

}
