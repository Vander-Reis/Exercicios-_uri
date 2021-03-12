import java.util.Scanner;

public class Main1060 {
	public static void main(String[] args){
	
		double valores;
		int vezes;
		int positivos = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(vezes = 1; vezes <= 6; vezes ++) {
			valores = input.nextDouble();
			
			if (valores > 0) {
				positivos += 1;
			}
		}
		
		System.out.println(positivos + " valores positivos");
	}

}
