import java.util.Scanner;

public class Main1070 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int contagem = 0;
		
		while(contagem < 6) {
			if(num % 2 == 1) {
				System.out.println(num);
				contagem++;
			}
			num++;
		}
	}
}
