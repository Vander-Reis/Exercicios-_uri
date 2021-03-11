import java.util.Scanner;

public class Main1144 {
	
    public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*i*i));
			System.out.println(i + " " + ((i*i)+1) + " " + ((i*i*i)+1));
		}
    }
	
}
