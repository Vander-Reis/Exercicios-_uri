import java.util.Scanner;

public class Main1074 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int casos = input.nextInt();
		
		for (int i = 1; i <= casos; i++) {
			int valores = input.nextInt();
			
			if(valores % 2 != 0 && valores < 0) {
				System.out.println("ODD NEGATIVE");
			}
			else if(valores == 0) {
				System.out.println("NULL");
			}
			else if (valores % 2 != 0 && valores > 0) {
				System.out.println("ODD POSITIVE");
			}
			else if (valores % 2 == 0 && valores < 0) {
				System.out.println("EVEN NEGATIVE");
			}
			
			else if (valores % 2 == 0 && valores > 0) {
				System.out.println("EVEN POSITIVE");
			}
			
		}
		
	}
}
