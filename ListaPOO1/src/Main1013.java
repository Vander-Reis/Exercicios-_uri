import java.util.Scanner;

public class Main1013 {
	public static void main(String[] args) {
		
		int a, b, c, d, Maior;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		d = (a + b + Math.abs(a-b)) / 2 ;
		Maior = (d + c + Math.abs(d-c)) / 2;
		
		System.out.printf(Maior + " eh o maior\n");
	}

}
