import java.util.Scanner;

public class Main1009 {
	public static void main(String[] args){
		String nome;
		double sInicial;
		double sFinal;
		double total;
		
		Scanner entrada = new Scanner(System.in);
		
		nome = entrada.next();
		sInicial = entrada.nextDouble();
		sFinal = entrada.nextDouble();
		
		total = (sFinal * 0.15) + sInicial;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
	}
}
