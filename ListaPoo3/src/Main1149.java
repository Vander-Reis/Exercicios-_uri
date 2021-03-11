import java.util.Scanner;

public class Main1149 {
	
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int N = leitor.nextInt();
        int soma = 0;
        while (N <= 0) {
        	N = leitor.nextInt();
        }
        for (int i = 1; i <= N; i++) {
        	soma += A;
        	A++;
        }
        System.out.println(soma);
    }
	
}