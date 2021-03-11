import java.util.Scanner;

public class Main1015 {
	public static void main(String[] args) {
		
		float x1, y1;
		float x2, y2;
		double distancia;
		
		Scanner input = new Scanner(System.in);
		
		x1 = input.nextFloat();
		y1 = input.nextFloat();
		x2 = input.nextFloat();
		y2 = input.nextFloat();
		
		distancia = (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
		
		System.out.printf("%.4f\n",distancia);
	}
}
