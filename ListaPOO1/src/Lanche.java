import java.util.Scanner;

public class Main1025 {
	public static void main(String[] args){
		
		int codigo, quantidade;
		double total;
		
		Scanner input = new Scanner(System.in);
		
		// se for passar no uri não use o menu que eu criei abaixo, só apagar ele que da certo!!!!
		
		System.out.println("Codigo  |  Especificação   | Preço");
		System.out.println("1       |  Cachorro quente | R$ 4.00");
		System.out.println("2       |  X-Salada        | R$ 4.50");
		System.out.println("3       |  X-Bacon         | R$ 5.00");
		System.out.println("4       |  Torrada simples | R$ 2.00");
		System.out.println("5       |  Refrigerante    | R$ 1.50");
		
		codigo = input.nextInt();
		quantidade = input.nextInt();
		
		switch(codigo) {
			case 1:
				total = (quantidade * 4.00);
				System.out.printf("Total: R$ %.2f\n", total);
			break;
			
			case 2:
				total = (quantidade * 4.50);
				System.out.printf("Total: R$ %.2f\n", total);
			break;
			
			case 3:
				total = (quantidade * 5.00);
				System.out.printf("Total: R$ %.2f\n", total);
			break;
			
			case 4:
				total = (quantidade * 2.00);
				System.out.printf("Total: R$ %.2f\n", total);
			break;
			
			case 5:
				total = (quantidade * 1.50);
				System.out.printf("Total: R$ %.2f\n", total);
			break;
			
			default:
				System.out.println("Opção invalida");
		}
	}	
}
