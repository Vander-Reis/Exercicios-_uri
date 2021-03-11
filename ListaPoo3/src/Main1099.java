import java.util.Scanner;

public class Main1099 {
	
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	int X, Y, soma;
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		soma = 0;
    		X = leitor.nextInt();
    		Y = leitor.nextInt();
    		
    		if (Y > X) {
	    		for (int j = X+1; j < Y; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		} else {
	    		for (int j = Y+1; j < X; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		}
    		
    		System.out.println(soma);
    	}
    }
	
}