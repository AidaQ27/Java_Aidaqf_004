package ud05;

import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Introducimos el numero por teclado
		System.out.println("Introduce un numero: ");
		String numero = sc.nextLine();
		
		// Parseamos en string a double
		double numero2=Double.parseDouble(numero);
		sc.close();
		
		// Aplicamos la condición 'if'-'else'
		if (numero2 % 2 == 0) {
			System.out.println("El numero " + numero2 + " es divisible entre 2");
		}else{
			System.out.println("El numero " + numero2 + " NO es divisible entre 2 ");
				
		}
	}
}
