import java.util.Scanner;
public class TallerSiete {


	public void bisiesto() {
		Scanner dig = new Scanner(System.in);
		int anio = 0;
		
		System.out.println("Ingresa porfavor el año: ");
		anio = dig.nextInt();
		{
		if ((anio % 4 == 0) && ((anio % 100!=0)|| (anio % 400 == 0))) {
			System.out.println("El año es bisiesto");
	    }else {
				System.out.println("el año no es bisiesto");
		
	    }
        }
		
	}
	
	
	
}
	
	
	
