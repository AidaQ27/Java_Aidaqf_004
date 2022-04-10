package ud05;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		// Mientras el numero 0 sea inferior a 100, se imprime y se incrementa en 1.
		while (num<=99) {
			if(num%2==0 || num%3==0) {
				System.out.println(num);
			}
		num++;
		}
	}
}



