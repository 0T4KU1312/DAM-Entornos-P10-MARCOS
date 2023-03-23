package main.java.ieseuropa;

public class RedondearAlza {

	private static double numAlza(double num) {
		double redondeado = Math.ceil(num);
		return redondeado;
	}
	
	public static void main(String[] args) {
		
		double num = 5.5;	
		System.out.println("El numero redondeado es: " + numAlza(num));
	}
}
