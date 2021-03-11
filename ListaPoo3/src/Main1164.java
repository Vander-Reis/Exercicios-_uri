import java.util.Scanner;

public class Main1164 {
	public static void main(String[] args ){
		
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
        int X, soma;
        for (int i = 0; i < N; i++) {
        	soma = 0;
        	X = leitor.nextInt();
        	for (int j = 1; j < X; j++) {
        		if (X % j == 0) soma += j;
        	}
        	if (soma == X) System.out.println(X + " eh perfeito");
        	else System.out.println(X + " nao eh perfeito");
        }
	}
}
