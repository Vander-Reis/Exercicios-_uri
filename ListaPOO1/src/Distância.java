import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args) {
    	
    	int km;
    	int total;
    		
        Scanner input = new Scanner(System.in);
        
        km = input.nextInt();
        
        total = (km * 60)/ 30;
        
        System.out.printf("%d Minutos \n", total);
        
    }
}
