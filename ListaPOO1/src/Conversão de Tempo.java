import java.util.Scanner;

public class Main1019 {
	public static void main(String[] args){
		
		int valor;
		int horas;
		int minutos;
		int segundos;
		
		Scanner input = new Scanner(System.in);
		
		valor = input.nextInt();
		
		horas = (valor / 3600);
		minutos = (valor % 3600) / 60;
		segundos = (valor % 3600) % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		
	}
}
