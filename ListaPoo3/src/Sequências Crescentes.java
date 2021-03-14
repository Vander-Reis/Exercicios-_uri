import java.util.Scanner;

public class Main1146 {
	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		while (num != 0) {
			for(int i = 1; i <= num; i++) {
				if (i == num) System.out.print(i + "\n");
	    		else System.out.print(i + " ");
				
			}
			num = input.nextInt();
		}
		
	}

}
