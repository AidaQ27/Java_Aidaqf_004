package ud05;

import javax.swing.JOptionPane;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String numero1 = JOptionPane.showInputDialog("Introduce el primer numero: ");
		//double num1=Double.parseDouble(numero1);
		
		//Pedimos los inputs por consola y a la vez los convertimos en 'double' y 'string'
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero: "));
		
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		
		String simbolo = JOptionPane.showInputDialog("Introduce el simbolo aritmetico: ");
		
		
		// Entonces escogemos el simbolo que nos entra por consola, se calcula, y se muestra
		switch (simbolo) {
			case "+":
				JOptionPane.showMessageDialog(null, "La suma es : " + (numero1+numero2));
				break;
			case "-":
				JOptionPane.showMessageDialog(null, "La resta es : " + (numero1-numero2));
				break;
			case "*":
				JOptionPane.showMessageDialog(null, "La multiplicación es : " + (numero1*numero2));
				break;
			case "/":
				JOptionPane.showMessageDialog(null, "La división es : " + (numero1/numero2));
				break;
			case "^":
				JOptionPane.showMessageDialog(null, "La exponenciación es : " + Math.pow(numero1, numero2));
				break;
			case "%":
				JOptionPane.showMessageDialog(null, "El resto es : " + (numero1%numero2));
				break;
			
			default:
				System.out.println("El valor aritmetico introducido no es correcto");
			
		}
	}
	
}
