package ud05;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce en numero de ventas:  ");
		
		int num = sc.nextInt();
		int op = 0;
	
		// Dar valor tantas veces como se pide en el terminal
		for (int i = 0; i < num; i++) {
			
			System.out.println("Introduce el precio del articulo " + i + ":");
			// Vamos acumulando a la variable 'op'
			op = op+sc.nextInt();
			
		}
		
		System.out.println("Total de ventas: " + op);
		
		sc.close();
		
	
			

	}

}
