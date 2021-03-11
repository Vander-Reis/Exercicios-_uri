import java.util.Scanner;

public class Main1018 {
	public static void main(String[] args){
		
		int valor, n;
		int n100, n50, n20, n10, n5, n2, n1; // variaveis para os valores;
		
		Scanner input = new Scanner(System.in);
		
		valor = input.nextInt();
		
		if (valor > 0 && valor < 1000000) { 
		
		n = valor; // aqui eu criei um n para armazenar o valor;
		
		n100 = n / 100;
		n %= 100; // n pega o restante da divisão;
		n50 = n / 50;
		n %= 50;	
		n20 = n / 20;
		n %= 20;
		n10 = n / 10;
		n %= 10;
		n5 = n / 5;
		n %= 5;
		n2 = n / 2;
		n %= 2;
		n1 = n;
		
		System.out.println(valor);
		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");
		
		}
		
		else {
			System.out.println("Você inseriu um número < 0 ou > 1000000!");
		}
	}

}
