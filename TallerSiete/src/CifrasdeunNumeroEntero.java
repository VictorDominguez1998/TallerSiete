import java.util.Scanner;

public class CifrasdeunNumeroEntero {
	static int numero = 0;
	static int contador = 0;
	static int  numTem =0;
	static Scanner dig = new Scanner(System.in);
	
	
	
	public static void menu() {
		
		System.out.println("Digite un numero entero: ");
		numero = dig.nextInt();
		
		cifras(numero);
		
	}
		public static void cifras (int numero) {
			
			do {
				numero  = numero/10;
				
				contador ++;
				
			} while (numero != 0);
			
			System.out.println("la cantidad de digitos es : " + contador);
			contador = 0;
			
			
			System.out.println("Deseas digitar otro numero : " + "\n" + " 1 si la respuesta es si " + "\n" + "2. si la respuestra es dos");
			numTem = dig.nextInt();
			
			if (numTem == 1) {
				
				menu();
				
			}
			else {
				
			}
			
		}
		
		public void finalizar() {
			
			System.out.println("el programa ha rterminado");
		}
		
		
	
		
	}

