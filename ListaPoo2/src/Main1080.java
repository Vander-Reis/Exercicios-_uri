import java.util.Scanner;

public class Main1080 {
	public static void main(String[] args) {
		
		int num;
		int pos = 0;
		int maior = 0;
		int maiorNum = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			num = input.nextInt();
			
			if (num > maior) {
				maior = num;
				pos = i;
				maiorNum = num;
			}
		}
		
		System.out.println(maiorNum);
		System.out.println(pos);
	}
}
