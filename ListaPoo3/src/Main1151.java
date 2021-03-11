import java.util.Scanner;

public class Main1151 {
    public static void main(String[] args){
    	
    	int num;
    	int proximo, anterior = 0, atual = 1;
    	
    	Scanner input = new Scanner(System.in);
    	
    	num = input.nextInt();
    	
    	for(int i = 1; i <= num; i++) {
    		
    		if(i == num ) {
    			System.out.println(anterior);
    		}
    		
    		else {
    			System.out.print(anterior + " ");
    			proximo = anterior + atual;
    			anterior = atual;
    			atual = proximo;
    		}
    	}
    	
    }
	
}