//Você deve fazer um programa que leia um valor qualquer e apresente 
//uma mensagem dizendo em qual dos seguintes intervalos 
//([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
//Obviamente se o valor não estiver em nenhum 
//destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;

public class Main1024 {
	public static void main(String[] args){
		
		double ponto;
		
		Scanner input = new Scanner(System.in);
		
		ponto = input.nextDouble();
		
		if (ponto >= 0 && ponto <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (ponto > 25 && ponto <= 50 ){
			System.out.println("Intervalo (25,50]");
		}
		
		else if (ponto > 50 && ponto <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		
		else if (ponto > 75 && ponto <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
	}
}
