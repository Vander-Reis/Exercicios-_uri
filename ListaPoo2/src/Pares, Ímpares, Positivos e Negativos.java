import java.util.Scanner;

public class Main1066 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int par = 0, impar = 0, pos = 0, neg = 0;
		
		for(int i = 1; i <= 5; i++){
			int numeros = input.nextInt();
			
			if (numeros % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
			
			if (numeros > 0) {
				pos++;
			}
			
			else if (numeros < 0){
				neg++;
			}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
	}
}
