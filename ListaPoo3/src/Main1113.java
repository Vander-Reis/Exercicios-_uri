import java.util.Scanner;

public class Main1113 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (x != y) {
			x = input.nextInt();
			y = input.nextInt();
			
			if (x > y) {
				System.out.println("Decrescente");
			} 
			
			else if (y > x) {
				System.out.println("Crescente");
			}
		}
	}

}
