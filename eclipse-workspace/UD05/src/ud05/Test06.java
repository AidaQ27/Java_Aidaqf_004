package ud05;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 0.21;
		
		Scanner sc = new Scanner(System.in);
		// Introducimos el precio de un producto
		System.out.println("Introduce el precio del producto: ");
		String precio = sc.nextLine();
		
		//Parseamos el string a double
		double precio2=Double.parseDouble(precio);
		sc.close();
		
		// Calculamos el precio total
		System.out.println("El precio con IVA incluido es : " + (precio2+precio2*IVA));
	
		
		
		

	}

}
