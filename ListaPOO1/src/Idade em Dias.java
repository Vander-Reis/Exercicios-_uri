import java.util.Scanner;

public class Main1020 {
	public static void main(String[] args) {
		
		int idade, valor;
		int ano, mes, dia;
		
		Scanner input = new Scanner(System.in);
		
		idade = input.nextInt();
		
		valor = idade;
		
		ano = valor/ 365;
		valor %= 365;
		mes = valor/30;
		valor %= 30;
		dia = valor;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	
	}

}
