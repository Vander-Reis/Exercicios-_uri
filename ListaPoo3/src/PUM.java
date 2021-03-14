import java.util.Scanner;

public class Main1142 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vezes = input.nextInt();
		int contagem = 0;
		
		for(int i = 1; i <= vezes; i++) {
			for (int j  = 1; j <= 3; j++) {
				contagem++;
				System.out.print(contagem + " ");
			}
			System.out.println("PUM");
			contagem++;
		}
	}
}
