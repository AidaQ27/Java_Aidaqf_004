package ud05;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.1415926535898;
		double radio_elevado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Se pide el radio por teclado
		System.out.print("Introduce el radio: ");
		String radio = sc.nextLine();
		
		// Pasamos el String  a double
		double radio2=Double.parseDouble(radio);
		sc.close();
		
		// Calculamos el radio elevado con Math.Pow
		radio_elevado = (Math.pow(radio2, 2));
		
		System.out.println(pi*radio_elevado);
		
		
	}

}
