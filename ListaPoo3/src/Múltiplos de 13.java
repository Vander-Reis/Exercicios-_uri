import java.util.Scanner;

public class Main1132 {
	public static void main(String[] args)  {
		// variaveis
		
		int x, y;
		int soma = 0;
		
		// inicialização 
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		
		// operações 
		
		if (x > y) {
			for(int i = y; i <= x; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		}
		else {
			for(int i = x; i <= y; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
	}
}
