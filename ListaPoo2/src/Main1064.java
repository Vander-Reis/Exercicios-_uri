import java.util.Scanner;

public class Main1064 {
	public static void main(String[] args){
	
		double valores;
		double media = 0;
		double total = 0;
		int vezes;
		int positivos = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(vezes = 1; vezes <= 6; vezes ++) {
			valores = input.nextDouble();
			
			if (valores > 0) {
				positivos += 1;
				total += valores;
				media = (total/positivos);
			}
			
			
		}
		media = total / positivos;
		System.out.println(positivos + " valores positivos");
		System.out.printf("%.1f\n", media);
	}

}
