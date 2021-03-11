import java.util.Scanner;

public class Main1017 {
	public static void main(String[] args){
		
		double tempoGasto;
		double velocidade;
		double total;
		
		Scanner input = new Scanner(System.in);
		
		tempoGasto = input.nextDouble();
		velocidade = input.nextDouble();
		
		total = (tempoGasto * velocidade) / 12;
		
		System.out.printf("%.3f\n",total);
		
		
		
	}
}
