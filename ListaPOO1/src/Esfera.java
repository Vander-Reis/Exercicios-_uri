import java.util.Scanner;

public class Main1011 {
	public static void main(String[] args){
		
		double pi = 3.14159;
		double raio;
		double volume;
		
		Scanner input = new Scanner(System.in);
		
		raio = input.nextDouble();
		
		volume = ((4/3.0)* pi * (raio * raio * raio));
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}
