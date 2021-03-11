import java.util.Scanner;

public class Main1067 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		num = input.nextInt();
		
		for(int i = 1; i <= num; i+=2){
			System.out.println(i);
		}
	}
}
