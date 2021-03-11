import java.util.Scanner;

public class Main1044 {
	public static void main(String[] args){
		
		// variaveis 
		
		int A, B;
		// entradas
		Scanner input = new Scanner(System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		
		// operações 
		
		if ((A % B == 0) || (B % A == 0)) {
			// saidas
			
			System.out.println("Sao Multiplos");
		}
		
		else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
