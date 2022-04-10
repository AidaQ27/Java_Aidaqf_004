package ud05;
import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre = sc.nextLine();
		sc.close();
		
		System.out.println("Bienvenid@ " +  nombre.toUpperCase());
		
		}

}
