import java.util.Scanner;

public class Main1133 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int resultado = 0;
		
		if (x < y) {
			for(int i = x; i < y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					resultado=+i;
					System.out.println(resultado);
				}
			}
		}
		else {
			for (int i = y; i < x; i++) {
				if(i % 5 == 2 || i % 5 == 3) {
					resultado=+i;
					System.out.println(resultado);
				}
			}
		}
			
		
	}
}
