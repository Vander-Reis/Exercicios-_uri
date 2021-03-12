import java.util.Scanner;

public class Main1073 {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int valor;
		int quadrado;
		
		valor = input.nextInt();
		
		for(int i = 1; i <= valor; i++){
			if(i % 2 == 0) {
				quadrado  = i * i;
				System.out.println(i + "^2" + " = " + quadrado);
			}
			
		}
	}
}
