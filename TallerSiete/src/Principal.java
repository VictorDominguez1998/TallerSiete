import java.util.Scanner;

public class Principal {
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		CifrasdeunNumeroEntero cifras = new CifrasdeunNumeroEntero();
		TallerSiete bisi = new TallerSiete();
		
		System.out.println("que desea hacer ?" + "\n" + "1. si desea conocer el año bisiesto" + "\n" + "2. si quiere conocer la cantidad de digitos ");
		int ele = sc.nextInt();
		
		if(ele == 1 ) {
			bisi.bisiesto();
		}
		else {
			cifras.menu();
		}
		
		
		

	}
	

}
