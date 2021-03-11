import java.util.Scanner;

public class Main1046 {
	public static void main(String[] args){
		
		int tInicial, tFinal, resultado;
		
		Scanner input = new Scanner(System.in);
		
		tInicial = input.nextInt();
		tFinal = input.nextInt();
		
		if (tInicial == 0 && tFinal == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		else if (tFinal > tInicial ) {
			resultado = tFinal - tInicial;
			System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
		}
		
		else {
			resultado = 24 - (tInicial - tFinal);
			System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
		}
		
	}

}
