import java.util.Scanner;

public class Main1049 {
	public static void main(String[] args) {
		
		String classe1;
		String classe2;
		String classe3;
		String resultado = "";
		
		Scanner input = new Scanner(System.in);
		
		classe1 = input.next();
		classe2 = input.next();
		classe3 = input.next();
		
		if (classe1.equalsIgnoreCase("vertebrado")){
			if(classe2.equalsIgnoreCase("ave")){
				if(classe3.equalsIgnoreCase("carnivoro")){
					resultado = "aguia";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("vertebrado")){
			if(classe2.equalsIgnoreCase("ave")){
				if(classe3.equalsIgnoreCase("onivoro")){
					resultado = "pomba";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("vertebrado")){
			if(classe2.equalsIgnoreCase("mamifero")){
				if(classe3.equalsIgnoreCase("onivoro")){
					resultado = "homem";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("vertebrado")){
			if(classe2.equalsIgnoreCase("mamifero")){
				if(classe3.equalsIgnoreCase("herbivoro")){
					resultado = "vaca";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("invertebrado")){
			if(classe2.equalsIgnoreCase("inseto")){
				if(classe3.equalsIgnoreCase("hematofago")){
					resultado = "pulga";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("invertebrado")){
			if(classe2.equalsIgnoreCase("inseto")){
				if(classe3.equalsIgnoreCase("herbivoro")){
					resultado = "lagarta";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("invertebrado")){
			if(classe2.equalsIgnoreCase("anelideo")){
				if(classe3.equalsIgnoreCase("hematofago")){
					resultado = "sanguessuga";
				}
			}
		}
		
		if (classe1.equalsIgnoreCase("invertebrado")){
			if(classe2.equalsIgnoreCase("anelideo")){
				if(classe3.equalsIgnoreCase("onivoro")){
					resultado = "minhoca";
				}
			}
		}
		
		System.out.println(resultado);
		
	}

}
