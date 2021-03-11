import java.util.Scanner;

public class Main1101 {
	public static void main(String[] args){
		
		int x, y, soma = 0;
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		
		while(x > 0 && y > 0) {
			
			if (x > y) {
				soma = 0;
				for(int i = y; i <= x; i++) {
					soma += i;
					System.out.print(i + " ");

				}
				System.out.printf("Sum=%d\n",soma);
				
			}
			
			else if(y > x) {
				soma = 0;
				for (int i = x; i <= y; i++) {
					soma += i;
					System.out.print(i + " ");
				}
				System.out.printf("Sum=%d\n",soma);
			}
			
			x = input.nextInt();
			y = input.nextInt();
		}
	}

}
