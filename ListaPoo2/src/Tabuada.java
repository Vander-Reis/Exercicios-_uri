import java.util.Scanner;

public class Main1078 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int mult = 1;
		
		num = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			mult = num * i;
			
			System.out.println(i + " x " + num + " = " + mult);
		}
	}
}
