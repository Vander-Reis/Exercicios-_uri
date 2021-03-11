import java.util.Scanner;

public class Main1022 {
	public static void main(String[] args){
		
		int A, B, C, D;
		int SomaCD, SomaAB;
		Scanner input = new Scanner(System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		SomaCD = C + D;
		SomaAB = A + B;
		
		if(B > C && D > A && SomaCD > SomaAB && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		
		else {
			System.out.println("Valores nao aceitos");
		}
	}

}
