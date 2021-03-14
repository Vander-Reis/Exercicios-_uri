import java.util.Scanner;

public class Main1145 {
	
    public static void main(String[] args)  {
		Scanner leitor = new Scanner(System.in);
		int X = leitor.nextInt();
		int Y = leitor.nextInt();
		int cont = 1;
		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0) System.out.println("");
			else System.out.print(" ");

		}
    }
	
}
