import java.util.Scanner;

public class Main1014 {
	public static void main(String[] args) {
		int x; // o x será a variavel do km
		double y; // y representa o combustivel gasto
		double total;
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextDouble();
		
		total = (x / y);
		
		System.out.printf("%.3f %s\n",total , "km/l");
	}
}
