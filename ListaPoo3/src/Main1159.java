import java.util.Scanner;

public class Main1159 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int contadorY = 1, soma = 0, armazenaX = 0;
        while(true)
        {
                int x = entrada.nextInt();
                armazenaX = x;
                if(x % 2 == 0)
                    soma += x;
                else{
                    armazenaX = x + 1;
                    soma+= armazenaX;
                }
                while(contadorY < 5)
                {
                    armazenaX += 2;
                    soma += armazenaX;
                    contadorY++;
                }   
                if(x == 0)
                    break;
                System.out.println(soma);
                contadorY = 1;
                soma = 0;                
        }
    }
}