import java.util.Scanner;

public class Main1143 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vezes = input.nextInt();
		
		int quadrado = 0;
		int cubo = 0;
		
		
		for (int i = 1; i <= vezes; i++) {
			quadrado  = 0;
			cubo = 0;
			
			quadrado = i * i; 
			cubo = i * i * i;
			
			System.out.println(i + " " + quadrado + " " + cubo);
			
		}
	}
}
