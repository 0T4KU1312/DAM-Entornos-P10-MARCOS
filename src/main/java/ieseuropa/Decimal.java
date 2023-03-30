package main.java.ieseuropa;

public class Decimal {


	public static void calcularSoluciones(double a, double b, double c) {
		double discriminante = b * b - 4 * a * c;
		double x1, x2;

		if (discriminante > 0) {
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
		} else if (discriminante == 0) {
			x1 = -b / (2 * a);
			System.out.println("La solución doble es x1 = x2 = " + x1);
		} else {
			System.out.println("No hay solución real.");
		}
	}

	private static double eliminarDec(double num) {

		int numEntero = (int) num;
		return numEntero;
	}

	private static double numAlza(double num) {
		double redondeado = Math.ceil(num);
		return redondeado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcularSoluciones(1, -2, 1);

		double num = 5.5;
		System.out.println("Eliminando sus decimales es: " + eliminarDec(num));
		
		double num2 = 5.5;	
		System.out.println("El numero redondeado es: " + numAlza(num));
	}



}
