import java.util.Scanner;

public class Main1153 {
	public static void main(String[] args) {
		
		int num;
		int fatorial = 1;
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		for(int i = 1; i <= num; i++){
			fatorial *= i;
			
		}
		System.out.println(fatorial);
	}

}
