import java.util.Scanner;

public class Main1116 {
	public static void main(String[] args) {
		
		// variaveis
		double x, y;
		int vezes;
		
		
		//inicialização
		
		Scanner input = new Scanner(System.in);
		
		vezes = input.nextInt();
		
		// operações
		
		for(int i = 1; i <= vezes; i++ ) {
			x = input.nextDouble();
			y = input.nextDouble();
			double resultado = 0;
			if(y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				resultado = x / y;
				System.out.printf("%.2f\n",resultado);
			}
			
		}
	}
}
