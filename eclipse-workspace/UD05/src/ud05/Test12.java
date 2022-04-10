package ud05;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las variables
		 String password = "java";
		 int num = 0;
		 // Inicializamos el scanner
		 Scanner sc = new Scanner(System.in);

		 // Creamos la estructura repititiva do
		 do {
			 System.out.println("Introduce la contraseña:  ");
			 String pass = sc.nextLine();
			 // verificamos que sean iguales
			 if(password.equals(pass)) {
				 System.out.println("Enhorabuena");
				 num=4;
			}
			 // Incrementamos los intentos
			num++;
		// mientras los intentos sean menor que 3 sigue	
		 }while(num<3 );
				 
		 sc.close();
	 
	
	}

}
