import java.util.Scanner;

public class Main1047 {
	public static void main(String[] args) {
		
		int tInicio;
		int mInicio;
		int tFinal;
		int mFinal;
		int totalHora;
		int totalMinuto;
		
		Scanner input = new Scanner(System.in);
		
		tInicio = input.nextInt();
		mInicio = input.nextInt();
		tFinal = input.nextInt();
		mFinal = input.nextInt();
		
		totalHora = (tFinal - tInicio);
		totalMinuto = (mFinal - mInicio);
		
		if(tInicio == tFinal && mInicio == mFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else {
			if (tInicio > tFinal) {
				totalHora = 24 - tInicio + tFinal;
            } else if (tInicio < tFinal) {
            	totalHora = 24 - (24 - tFinal + tInicio);
            }
            if (mInicio > mFinal) {
            	totalMinuto = 60 + mFinal - mInicio;
                if (tInicio == tFinal) {
                	totalHora = 24 + totalHora - 1;
                } else {
                	totalHora = totalHora - 1;
                }
            } else {
            	totalMinuto = mFinal - mInicio;
            }
		
	        System.out.println("O JOGO DUROU " + totalHora + " HORA(S) E " + totalMinuto + " MINUTO(S)");
		}
	}
}
