import java.util.Scanner;

public class Main1072 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int in = 0, out = 0;
		
		for(int i = 1; i <= num; i++) {
			int casos = input.nextInt();
				if(casos >= 10 && casos <= 20) {
					in++;
				}
				else {
					out++;
				}
		}
		System.out.println(in +" in");
		System.out.println(out +" out");
	}
}
