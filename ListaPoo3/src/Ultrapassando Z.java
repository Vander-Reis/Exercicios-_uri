import java.util.Scanner;
class Main1150{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), z = input.nextInt(), cont = 0, soma = 0;
        while(z<=x)
        	z = input.nextInt();
        for(int i = 0; soma < z; i++){
        	soma += x+i;
    		cont++;
        }
    	System.out.println(cont);
    }
}
