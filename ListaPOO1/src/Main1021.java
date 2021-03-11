import java.util.Scanner;

public class Main1021 {
	public static void main(String[] args){
		
		double dinheiro;
		double valor, centavos;
		double nota100, nota50, nota20, nota10, nota5, nota2;
		double moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;
		
		Scanner input = new Scanner(System.in);
		
		dinheiro = input.nextDouble();
		
		if (dinheiro > 0 && dinheiro < 1000000.00) {
			
		
			valor = dinheiro;
			centavos = valor*100;
			
			nota100 = valor / 100;
			valor %= 100;
			nota50 = valor / 50;
			valor %= 50;
			nota20 = valor / 20;
			valor %= 20;
			nota10 = valor / 10;
			valor %= 10;
			nota5 = valor / 5;
			valor %= 5;
			nota2 = valor / 2;
			valor %= 2;
			
			centavos %= 100;
			
			moeda1 = valor/1;
			valor %= 1;
			moeda50 = centavos/ 50;
			centavos %= 50;
			moeda25 = centavos / 25;
			centavos %= 25;
			moeda10 = centavos / 10;
			centavos %= 10;
			moeda5 = centavos / 5;
			centavos %= 5;
			moeda01 = centavos;
			
			System.out.println("NOTAS:");
			
	        System.out.println((int)nota100 + " nota(s) de R$ 100.00");
	        System.out.println((int)nota50 + " nota(s) de R$ 50.00");
	        System.out.println((int)nota20 + " nota(s) de R$ 20.00");
	        System.out.println((int)nota10 + " nota(s) de R$ 10.00");
	        System.out.println((int)nota5 + " nota(s) de R$ 5.00");
	        System.out.println((int)nota2 + " nota(s) de R$ 2.00");
	        
	        System.out.println("MOEDAS:");
	        
	        System.out.println((int)moeda1 + " moeda(s) de R$ 1.00");
	        System.out.println((int)moeda50 + " moeda(s) de R$ 0.50");
	        System.out.println((int)moeda25 + " moeda(s) de R$ 0.25");
	        System.out.println((int)moeda10 + " moeda(s) de R$ 0.10");
	        System.out.println((int)moeda5 + " moeda(s) de R$ 0.05");
	        System.out.println((int)moeda01 + " moeda(s) de R$ 0.01");
		}
		
		else {
			System.out.println("Número inválido!!!!");
		}
      
	}

}
