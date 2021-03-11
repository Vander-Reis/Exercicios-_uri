import java.util.Scanner;

public class Main1134 {
	public static void main(String[] args) {
		
		int escolha = 0;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (escolha != 4) {
			escolha = input.nextInt();
			
			while(escolha < 1 || escolha > 4) {
				escolha = input.nextInt();
			}
			
			switch(escolha){
				case 1: alcool ++;
				break;
				case 2: gasolina ++;
				break;
				case 3: diesel ++;
				break;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
	}
}
