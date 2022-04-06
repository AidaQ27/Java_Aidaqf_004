package ud04;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12;
		int b = 10;
		int c = 15;
		int d = 24;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println(" B toma el valor de C: " + b);
		System.out.println(" C toma el valor de A: " + c);
		System.out.println(" A toma el valor de D: " + a);
		System.out.println(" D toma el valor de B: " + d);
		
		
	}

}
