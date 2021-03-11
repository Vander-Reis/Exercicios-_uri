import java.util.Scanner;

public class Main1005 {
	public static void main(String[] args){
		double nota1; 
		double nota2;
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		
		media = ((nota1 * 3.5) + (nota2 * 7.5))/11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
	}

}
