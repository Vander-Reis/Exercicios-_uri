import java.util.Scanner;

public class Main1114 {
	public static void main(String[] args) {
		
		int senha = 2002;
		int tentativa;
		
		Scanner input = new Scanner(System.in);
		
		tentativa = input.nextInt();
		
		while(tentativa != senha) {
			System.out.println("Senha Invalida");
			tentativa = input.nextInt();
		}
		System.out.println("Acesso Permitido");
	}
}
