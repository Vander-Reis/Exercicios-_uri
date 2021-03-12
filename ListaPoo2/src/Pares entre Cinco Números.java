import java.util.Scanner;

public class Main1065 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int pares = 0;
		
		for (int i = 1; i <= 5; i++) {
			int valores = input.nextInt();
			
			if (valores % 2 == 0) {
				pares ++;
			}
		}
		
		System.out.println(pares + " valores pares");
	}
}
